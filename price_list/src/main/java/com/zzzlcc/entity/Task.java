package com.zzzlcc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.DateFormat;
import java.util.Date;

@Table(name="tasks")
public class Task {
//    id	int
    @Id
    private Integer id;
//    title	varchar
    @Column(name="title")
    private String title;
//    start_time	datetime
    @Column(name="start_time")
    private Date startTime;
//    end_time	datetime
    @Column(name="end_time")
    private Date endTime;
//    is_complete	int
    @Column(name="is_complete")
    private int isComplete;
//    issue_id	int 发布者
    @Column(name = "issue_id")
    private Integer issueId;
//    is_received	int
    @Column(name="is_received")
    private int isReceived;
//    describe	varchar
    @Column(name = "describe")
    private String describe;
//    award	varchar
    @Column(name="award")
    private String award;

    public Task() {
    }

    public Task(Integer id, String title, Date startTime, Date endTime, int isComplete, Integer issueId, int isReceived, String describe, String award) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isComplete = isComplete;
        this.issueId = issueId;
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

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
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
