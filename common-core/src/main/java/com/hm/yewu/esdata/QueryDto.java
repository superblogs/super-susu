package com.hm.yewu.esdata;

public class QueryDto {
    private String q;
    private int page;
    private int pageSize = 10;
    private String sortBy;

    @Override
    public String toString() {
        return "QueryDto{" +
                "q='" + q + '\'' +
                ", page=" + page +
                ", pageSize=" + pageSize +
                ", sortBy='" + sortBy + '\'' +
                '}';
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

}
