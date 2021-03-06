
package com.gcoders.wallpaper.hqwallpapersdaily.model.video;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TinyVideo {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("height")
    @Expose
    private Integer height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TinyVideo withUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public TinyVideo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public TinyVideo withSize(Integer size) {
        this.size = size;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public TinyVideo withHeight(Integer height) {
        this.height = height;
        return this;
    }

}
