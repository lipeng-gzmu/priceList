package com.zzzlcc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="imgs")
public class Img {
    //   id	int
    @Id
    @Column(name = "id")
    private Integer id;
    //    img_url	varchar
    @Column(name = "img_url")
    private String imgUrl;
    //    tid	int
    @Column(name = "tid")
    private Integer tid;

    public Img() {
    }

    public Img(Integer id, String imgUrl, Integer tid) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.tid = tid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}
