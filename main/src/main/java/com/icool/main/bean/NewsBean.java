package com.icool.main.bean;

/**
 * @author zhzy
 * @date 2018/4/20
 */
public class NewsBean {
    private String cover;
    private String title;
    private String summary;
    private long time;


    public NewsBean(String cover, String title, String summary, long time) {
        this.cover = cover;
        this.title = title;
        this.summary = summary;
        this.time = time;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
