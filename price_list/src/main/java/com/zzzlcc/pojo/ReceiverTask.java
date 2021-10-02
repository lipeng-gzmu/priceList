package com.zzzlcc.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="receiver_task")
public class ReceiverTask {
//    id	int
    @Id
    private Integer id;
//    user_id	int
    @Column(name="user_id")
    private Integer userId;
//    task_id	int
    @Column(name="task_id")
    private Integer taskId;

    public ReceiverTask() {
    }

    public ReceiverTask(Integer id, Integer userId, Integer taskId) {
        this.id = id;
        this.userId = userId;
        this.taskId = taskId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
}
