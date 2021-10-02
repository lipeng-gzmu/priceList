package com.zzzlcc.service.impl;

import com.zzzlcc.mapper.TaskMapper;
import com.zzzlcc.pojo.Task;
import com.zzzlcc.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskMapper mapper;

    /**
     * 查看所有悬赏
     *
     * @return 所有悬赏
     */
    @Override
    public List<Task> listTasks() {
        return mapper.selectAll();
    }

    /**
     * 查看未被接取的任务
     *
     * @return
     */
    @Override
    public List<Task> listTasksNotReceive() {
        Task task = new Task();
        task.setIsReceived(0);
        return mapper.select(task);
    }

    /**
     * 通过ID查询自己发布的任务
     *
     * @param id 用户ID
     * @return 发布的所有悬赏
     */
    @Override
    public List<Task> listTasksPublish(Integer id) {
        Task task = new Task();
        // 设置userId为发布者ID查询自己发布的所有悬赏
        task.setIssueId(id);
        return mapper.select(task);
    }

    /**
     * 通过ID查询自己接取的任务
     *
     * @param id 用户ID
     * @return 接取的所有悬赏
     */
    @Override
    public List<Task> listTasksReceive(Integer id) {

        return null;
    }

    /**
     * 发布任务
     *
     * @param task
     */
    @Override
    public void publish(Task task) {

    }

    /**
     * 审核悬赏完成的任务
     *
     * @return
     */
    @Override
    public boolean verifyImages(int isComplete) {
        return false;
    }
}
