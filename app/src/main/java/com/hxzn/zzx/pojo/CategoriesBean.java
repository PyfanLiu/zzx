package com.hxzn.zzx.pojo;

/**
 * Created by pf.
 * description:景点门票
 * 包名:cn.xiaohuodui.hark.model.pojo
 */

public class CategoriesBean {
    /**
     * title : 景点门票
     * link : harkhark://app/product/list?category_id=35
     * cover : null
     */

    private String title;
    private String link;
    private String cover;

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
        if (cover != null){

            return cover;
        }else {
            return "";
        }
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
