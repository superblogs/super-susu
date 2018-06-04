package com.hm.common.elasticsearch.es;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by huwenjian on 2017/9/24.
 */
public class EsBaseDto {
    private static final String TAG = "JavaTest._shards";
    private String took;
    private Boolean time_out;
    private Shards _shards;
    private Hits hits;


    public static String getTAG() {
        return TAG;
    }

    public String getTook() {
        return took;
    }

    public void setTook(String took) {
        this.took = took;
    }

    public Boolean getTime_out() {
        return time_out;
    }

    public void setTime_out(Boolean time_out) {
        this.time_out = time_out;
    }

    public Shards get_shards() {
        return _shards;
    }

    public void set_shards(Shards _shards) {
        this._shards = _shards;
    }

    public Hits getHits() {
        return hits;
    }

    public void setHits(Hits hits) {
        this.hits = hits;
    }

    public class Hits {

        private int total;
        private float max_score;

        private List<Hits_> hits = new ArrayList<>();


        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public float getMax_score() {
            return max_score;
        }

        public void setMax_score(float max_score) {
            this.max_score = max_score;
        }

        public List<Hits_> getHits() {
            return hits;
        }

        public void setHits(List<Hits_> hits) {
            this.hits = hits;
        }

        public class Hits_ {

            private String _index;
            private String _type;
            private String _id;
            private float _score;
            private String _source;

            public String get_index() {
                return _index;
            }

            public void set_index(String _index) {
                this._index = _index;
            }

            public String get_type() {
                return _type;
            }

            public void set_type(String _type) {
                this._type = _type;
            }

            public String get_id() {
                return _id;
            }

            public float get_score() {
                return _score;
            }

            public void set_score(float _score) {
                this._score = _score;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String get_source() {
                return _source;
            }

            public void set_source(String _source) {
                this._source = _source;
            }
        }
    }

    public class Shards {
        private int total;
        private int successful;
        private int failed;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getSuccessful() {
            return successful;
        }

        public void setSuccessful(int successful) {
            this.successful = successful;
        }

        public int getFailed() {
            return failed;
        }

        public void setFailed(int failed) {
            this.failed = failed;
        }

    }
}
