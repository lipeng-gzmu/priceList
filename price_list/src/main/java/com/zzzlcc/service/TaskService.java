package com.zzzlcc.service;

import com.zzzlcc.pojo.Task;

import java.util.List;

public interface TaskService {
    /**
     * 查看所有悬赏
     *
     * @return 所有悬赏
     */
    List<Task> listTasks();

    /**
     * 查看未被接取的任务
     *
     * @return
     */
    List<Task> listTasksNotReceive();

    /**
     * 通过ID查询自己发布的任务
     *
     * @param id 用户ID
     * @return 发布的所有悬赏
     */
    List<Task> listTasksPublish(Integer id);

    /**
     * 通过ID查询自己接取的任务
     *
     * @param id 用户ID
     * @return 接取的所有悬赏
     */
    List<Task> listTasksReceive(Integer id);

    /**
     * 发布任务
     *
     * @param task
     */
    void publish(Task task);

    /**
     * 审核悬赏完成的任务
     *
     * @return
     */
    boolean verifyImages(int isComplete);


}
