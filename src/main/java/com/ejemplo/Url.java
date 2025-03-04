package com.ejemplo;

public class Url {
    String url;
    String url_short;

    public Url(String url, String url_short) {
        this.url = url;
        this.url_short = url_short;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl_short() {
        return url_short;
    }

    public void setUrl_short(String url_short) {
        this.url_short = url_short;
    }
}
