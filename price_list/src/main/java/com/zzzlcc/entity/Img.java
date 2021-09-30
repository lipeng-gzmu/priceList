package com.zzzlcc.entity;

public class Img {
//    id	int
    private Integer id;
//    img_url	varchar
    private String imgUrl;
//    tid	int
    private Task task;

    public Img() {
    }

    public Img(Integer id, String imgUrl, Task task) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.task = task;
    }

    @Override
    public String toString() {
        return "Img{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", task=" + task +
                '}';
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

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
