package com.hxzn.zzx.pojo;

/**
 * Created by pf.
 * description:
 * 包名:cn.xiaohuodui.hark.model.pojo
 */

public class BaseResult<T> {
    private int status;
    private String tip;
    private T cnt;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public T getCnt() {
        return cnt;
    }

    public void setCnt(T cnt) {
        this.cnt = cnt;
    }
}

