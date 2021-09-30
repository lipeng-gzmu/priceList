package com.zzzlcc.entity;

import java.text.DateFormat;
import java.util.Date;

public class Task {
//    id	int
    private Integer id;
//    title	varchar
    private String title;
//    start_time	datetime
    private Date startTime;
//    end_time	datetime
    private Date endTime;
//    is_complete	int
    private int isComplete;
//    issue_id	int 发布者
    private User issue;
//    is_received	int
    private int isReceived;
//    describe	varchar
    private String describe;
//    award	varchar
    private String award;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", isComplete=" + isComplete +
                ", issue=" + issue +
                ", isReceived=" + isReceived +
                ", describe='" + describe + '\'' +
                ", award='" + award + '\'' +
                '}';
    }

    public Task() {
    }

    public Task(Integer id, String title, Date startTime, Date endTime, int isComplete, User issue, int isReceived, String describe, String award) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isComplete = isComplete;
        this.issue = issue;
        this.isReceived = isReceived;
        this.describe = describe;
        this.award = award;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(int isComplete) {
        this.isComplete = isComplete;
    }

    public User getIssue() {
        return issue;
    }

    public void setIssue(User issue) {
        this.issue = issue;
    }

    public int getIsReceived() {
        return isReceived;
    }

    public void setIsReceived(int isReceived) {
        this.isReceived = isReceived;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
