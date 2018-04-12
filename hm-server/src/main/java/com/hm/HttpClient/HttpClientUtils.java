package com.hm.HttpClient;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CodingErrorAction;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.MessageConstraints;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

/**
 * 鑾峰彇杩滅▼璧勬簮宸ュ叿绫�
 *
 * @author Administrator
 */
public class HttpClientUtils {
    // 鏃ュ織绫�
    private static final Log logger = LogFactory.getLog(HttpClientUtils.class);

    private static String webroot_path = "";

    static {
        webroot_path = _getWebRootPath();
    }

    /**
     * httpclient4鑾峰彇杩滅▼璧勬簮
     */
    public String queryForRemote(String url) {
        return getResource(url);
    }

    private static final int MAX_ROUTE = 30;
    private static final int MAX_CONECTION = 50;
    private static final int SOCKET_TIMEOUT = 50000;
    private static final int CONN_TIMEOUT = 15000;
    private static final int KEEP_ALIVE = 300000;

    private PoolingHttpClientConnectionManager connManager = null;

    private RequestConfig requestConfig = null;

    private boolean isCloseIdleHttpClient = true;

    /**
     * 鏋勯�鏂规硶
     *
     * @param clientCAPath      瀹㈡埛绔痥ey璺緞
     * @param clientKeyPassword 瀹㈡埛绔痥ey瀵嗙爜
     * @param serverCAPath      鏈嶅姟绔痥ey璺緞
     * @param serverKeyPassword 鏈嶅姟绔痥ey瀵嗙爜
     */
    public HttpClientUtils(String clientCAPath, String clientKeyPassword, String serverCAPath, String serverKeyPassword) {
        this(clientCAPath, clientKeyPassword, serverCAPath, serverKeyPassword, true);
    }

    /**
     * 鏋勯�鏂规硶
     *
     * @param clientCAPath      瀹㈡埛绔痥ey璺緞
     * @param clientKeyPassword 瀹㈡埛绔痥ey瀵嗙爜
     * @param serverCAPath      鏈嶅姟绔痥ey璺緞
     * @param serverKeyPassword 鏈嶅姟绔痥ey瀵嗙爜
     * @param isSystemPath      鏄惁绯荤粺鏂囦欢璺緞锛岀粷瀵硅矾寰�true 鍖呰矾寰刦alse
     */
    public HttpClientUtils(String clientCAPath, String clientKeyPassword, String serverCAPath, String serverKeyPassword, boolean isSystemPath) {
        this(clientCAPath, clientKeyPassword, serverCAPath, serverKeyPassword, isSystemPath, true);
    }

    /**
     * 鏋勯�鏂规硶
     *
     * @param clientCAPath          瀹㈡埛绔痥ey璺緞
     * @param clientKeyPassword     瀹㈡埛绔痥ey瀵嗙爜
     * @param serverCAPath          鏈嶅姟绔痥ey璺緞
     * @param serverKeyPassword     鏈嶅姟绔痥ey瀵嗙爜
     * @param isSystemPath          鏄惁绯荤粺鏂囦欢璺緞锛岀粷瀵硅矾寰�true 鍖呰矾寰刦alse
     * @param isCloseIdleHttpClient
     */
    public HttpClientUtils(String clientCAPath, String clientKeyPassword, String serverCAPath, String serverKeyPassword, boolean isSystemPath, boolean isCloseIdleHttpClient) {
        try {
            this.isCloseIdleHttpClient = isCloseIdleHttpClient;

            createHttpClientManager(clientCAPath, clientKeyPassword, serverCAPath, serverKeyPassword, isSystemPath);

            this.requestConfig = RequestConfig.custom()
                    .setSocketTimeout(SOCKET_TIMEOUT)
                    .setConnectTimeout(CONN_TIMEOUT)
                    .setConnectionRequestTimeout(CONN_TIMEOUT).build();
        } catch (Exception e) {
            logger.error("create HttpClientUtils error", e);
            e.printStackTrace();
        }
    }

    /**
     * 鍒涘缓HttpClientManager
     *
     * @param clientCAPath
     * @param serverCAPath
     * @param isSystemPath 鏄惁绯荤粺鏂囦欢璺緞锛岀粷瀵硅矾寰�true 鍖呰矾寰刦alse
     * @throws Exception
     */
    private void createHttpClientManager(String clientCAPath, String clientKeyPassword, String serverCAPath, String serverKeyPassword, boolean isSystemPath) throws Exception {
        KeyStore trustKeyStore = KeyStore.getInstance("server_type");
        InputStream is_trust = null;

        KeyStore clientKeyStore = KeyStore.getInstance("client_type");
        InputStream is_client = null;

        if (isSystemPath) {
            is_client = new FileInputStream(clientCAPath);
            is_trust = new FileInputStream(serverCAPath);
        } else {
            is_client = this.getClass().getResourceAsStream(clientCAPath);
            is_trust = this.getClass().getResourceAsStream(serverCAPath);
        }

        try {
            if (clientKeyPassword == null) {
                clientKeyPassword = "";
            }
            if (serverKeyPassword == null) {
                serverKeyPassword = "";
            }

            trustKeyStore.load(is_trust, serverKeyPassword.toCharArray());
            clientKeyStore.load(is_client, clientKeyPassword.toCharArray());

            // SSL 鍙屽悜璁よ瘉涓婁笅鏂囩幆澧�
            SSLContext sslcontext = SSLContexts.custom()
                    .loadKeyMaterial(clientKeyStore, clientKeyPassword.toCharArray()) // 鍔犺浇瀹㈡埛绔俊浠昏瘉涔�
                    .loadTrustMaterial(trustKeyStore, new TrustSelfSignedStrategy()) // 鍔犺浇鏈嶅姟绔俊浠昏瘉涔�
                    .build();

            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[]{"TLSv1"}, null,
                    SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

            Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("http", PlainConnectionSocketFactory.INSTANCE).register("https", sslsf).build();

            MessageConstraints msgConstraints = MessageConstraints.custom().setMaxHeaderCount(200).setMaxLineLength(2000)
                    .build();

            ConnectionConfig connConfig = ConnectionConfig.custom().setMalformedInputAction(CodingErrorAction.IGNORE)
                    .setUnmappableInputAction(CodingErrorAction.IGNORE).setCharset(Consts.UTF_8)
                    .setMessageConstraints(msgConstraints).build();

            SocketConfig socketConfig = SocketConfig.custom().setTcpNoDelay(true).build();

            // 鍒涘缓HttpClient杩炴帴姹�
            connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
            connManager.setDefaultConnectionConfig(connConfig);
            connManager.setDefaultSocketConfig(socketConfig);
            connManager.setDefaultMaxPerRoute(MAX_ROUTE);
            connManager.setMaxTotal(MAX_CONECTION);
        } catch (Exception e) {
            logger.error("createHttpClientManager error:", e);
            throw new Exception(e);
        } finally {
            if (is_trust != null) {
                try {
                    is_trust.close();
                } catch (IOException e) {
                    logger.error("is_trust.close error:", e);
                }
            }

            if (is_client != null) {
                try {
                    is_client.close();
                } catch (IOException e) {
                    logger.error("is_client.close error:", e);
                }
            }
        }
    }

    /**
     * 鑾峰彇httpClient
     *
     * @return
     */
    public CloseableHttpClient getHttpClient() {
        CloseableHttpClient httpClient = null;

        if (connManager != null) {
            // 瀛樻椿鏃堕棿
            ConnectionKeepAliveStrategy keepAliveStrategy = new DefaultConnectionKeepAliveStrategy() {
                @Override
                public long getKeepAliveDuration(HttpResponse response, HttpContext content) {
                    long keepAlive = super.getKeepAliveDuration(response, content);
                    if (keepAlive == -1) {
                        keepAlive = KEEP_ALIVE;
                    }

                    return keepAlive;
                }
            };

            httpClient = HttpClients.custom()
                    .setKeepAliveStrategy(keepAliveStrategy)
                    .setConnectionManager(connManager)
                    .build();
        } else {
            logger.error("getHttpClient error: connManager is null");
        }

        return httpClient;
    }

    /**
     * httpclient甯﹁瘉涔﹁姹俬ttps璧勬簮
     *
     * @param url
     * @return
     */
    public String getResource(String url) {
        logger.debug("[HttpClientUtils] The request of POST is : " + url);

        CloseableHttpClient httpClient = getHttpClient();
        if (httpClient == null) {
            logger.error("[HttpClientUtils] The request of GET is error: httpClient is null");
            return null;
        }

        String content = null;

        HttpGet method = new HttpGet(url);
        method.setHeader("Content-Charset", "UTF-8");
        method.setHeader("Accept-Charset", "UTF-8");
        method.setConfig(this.requestConfig);

        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(method);

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                content = EntityUtils.toString(entity);
                EntityUtils.consume(entity);
            }

            int httpStatus = response.getStatusLine().getStatusCode();
            if (httpStatus != HttpStatus.SC_OK) {
                throw new RuntimeException(String.format("Failed to execute get method '%s', caused by: it's response statuscode is %d!", url, httpStatus));
            }
        } catch (Exception e) {
            logger.error("getResource ERROR:", e);
            throw new RuntimeException(e);
        } finally {
            // 鍏抽棴鎵撳紑鐨勮繛鎺�
            closeHttpClient(method, response);
        }

        return content;
    }


    /**
     * httpclient甯﹁瘉涔﹁姹俬ttps璧勬簮
     *
     * @param url
     * @return
     */
    public String getPostResource(String url, Map<String, Object> params) {
        logger.debug("[HttpClientUtils] The request of POST is : " + url);

        CloseableHttpClient httpClient = getHttpClient();
        if (httpClient == null) {
            logger.error("[HttpClientUtils] The request of POST is error: httpClient is null");
            return null;
        }

        String content = null;

        HttpPost method = new HttpPost(url);
        method.setHeader("Content-Charset", "UTF-8");
        method.setHeader("Accept-Charset", "UTF-8");
        method.setConfig(this.requestConfig);

        CloseableHttpResponse response = null;
        try {
            // 缁勫悎鍙傛暟
            if (null != params && 0 < params.size()) {
                List<NameValuePair> nvps = new ArrayList<NameValuePair>(params.size());
                for (Map.Entry<String, Object> entry : params.entrySet()) {
                    Object val = entry.getValue();
                    String valStr = (val == null) ? "" : val.toString();
                    nvps.add(new BasicNameValuePair(entry.getKey(), valStr));
                }

                method.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));
            }

            response = httpClient.execute(method);

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                content = EntityUtils.toString(entity);
                EntityUtils.consume(entity);
            }

            int httpStatus = response.getStatusLine().getStatusCode();
            if (httpStatus != HttpStatus.SC_OK) {
                throw new RuntimeException(String.format("Failed to execute get method '%s', caused by: it's response statuscode is %d!", url, httpStatus));
            }
        } catch (Exception e) {
            logger.error("getResource ERROR:", e);
            throw new RuntimeException(e);
        } finally {
            // 鍏抽棴鎵撳紑鐨勮繛鎺�
            closeHttpClient(method, response);
        }

        return content;
    }

    /**
     * @param entity
     * @param reportUrl
     * @return
     */
    public boolean reportUserInfo(UrlEncodedFormEntity entity, String reportUrl) {
        CloseableHttpClient httpClient = getHttpClient();
        if (httpClient == null) {
            return false;
        }

        boolean result = false;

        HttpPost method = new HttpPost(reportUrl);
        method.setEntity(entity);
        method.setHeader("Content-Charset", "UTF-8");
        method.setHeader("Accept-Charset", "UTF-8");
        method.setConfig(this.requestConfig);

        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(method);
            int httpStatus = response.getStatusLine().getStatusCode();
            if (httpStatus == HttpStatus.SC_OK) {
                result = true;
            }
        } catch (Exception e) {
            logger.error("getResource ERROR:", e);
            throw new RuntimeException(e);
        } finally {
            // 鍏抽棴鎵撳紑鐨勮繛鎺�
            closeHttpClient(method, response);
        }

        return result;
    }

    /**
     * @return
     */
    private static final String _getWebRootPath() {
        String root = HttpClientUtils.class.getResource("/").getFile();
        try {
            root = new File(root).getParentFile().getParentFile().getCanonicalPath();
            root += File.separator;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return root;
    }

    /**
     * @param subPath
     * @return
     */
    public static String getWebRootPath(String subPath) {
        return webroot_path + subPath;
    }

    /**
     * 鍏抽棴鎵撳紑鐨勮繛鎺�
     *
     * @param response
     */
    private void closeHttpClient(HttpRequestBase httpReqeust, CloseableHttpResponse response) {
        if (null != httpReqeust) {
            try {
                httpReqeust.releaseConnection();
            } catch (Exception e) {
                logger.error("httpReqeust close error", e);
                e.printStackTrace();
            }
        }

        if (null != response) {
            try {
                response.close();
            } catch (Exception e) {
                logger.error("response close error", e);
                e.printStackTrace();
            }
        }

        if (null != connManager) {
            try {
                // 鍏抽棴杩囨湡杩炴帴
                connManager.closeExpiredConnections();

                if (isCloseIdleHttpClient) {// 鍏抽棴绌洪棽杩炴帴
                    connManager.closeIdleConnections(0, TimeUnit.MILLISECONDS);
                }
            } catch (Exception e) {
                logger.error("closeExpiredConnections close error", e);
                e.printStackTrace();
            }
        }
    }

    /**
     * 鍏抽棴httpClient杩炴帴姹�
     */
    public void closeHttpClientPool() {
        if (null != connManager) {
            try {
                // 鍏抽棴杩囨湡杩炴帴
                connManager.closeExpiredConnections();
                // 鍏抽棴绌洪棽杩炴帴
                connManager.closeIdleConnections(0, TimeUnit.MILLISECONDS);
                // 鍏抽棴杩炴帴绠＄悊鍣�
                connManager.shutdown();
                connManager = null;
            } catch (Exception e) {
                logger.error("connManager shutdown error", e);
                e.printStackTrace();
            }
        }
    }
}