package com.hxzn.zzx.pojo;

/**
 * Created by pf.
 * description:推荐景点
 * 包名:cn.xiaohuodui.hark.model.pojo
 */

public class SceneriesBean {
    /**
     * title : 凯恩斯
     * link : harkhark://app/search/list?keyword=凯恩斯&index=1
     * cover : http://travel.harkhark.com.au/uploads/2017/11/01/201711011514280000007117.jpg
     * summary : 海底总动员
     */

    private String title;
    private String link;
    private String cover;
    private String summary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
