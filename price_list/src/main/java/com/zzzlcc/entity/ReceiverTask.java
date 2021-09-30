package com.zzzlcc.entity;

public class ReceiverTask {
//    id	int
    private Integer id;
//    user_id	int
    private User user;
//    task_id	int
    private Task task;

    @Override
    public String toString() {
        return "ReceiverTask{" +
                "id=" + id +
                ", user=" + user +
                ", task=" + task +
                '}';
    }

    public ReceiverTask() {
    }

    public ReceiverTask(Integer id, User user, Task task) {
        this.id = id;
        this.user = user;
        this.task = task;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
