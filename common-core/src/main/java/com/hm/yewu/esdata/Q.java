package com.hm.yewu.esdata;

public class Q {
        private String q;
        private String nature;


    @Override
    public String toString() {
        return "Q{" +
                "q='" + q + '\'' +
                ", nature='" + nature + '\'' +
                '}';
    }

    public String getQ() {
            return q;
        }

        public void setQ(String q) {
            this.q = q;
        }

        public String getNature() {
            return nature;
        }

        public void setNature(String nature) {
            this.nature = nature;
        }
}
