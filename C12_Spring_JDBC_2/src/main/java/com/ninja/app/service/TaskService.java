package com.ninja.app.service;

import com.ninja.app.dao.ITaskDao;
import com.ninja.app.dao.RepositoryQualifier;
import com.ninja.app.dao.RepositoryType;
import com.ninjaapp.students.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Author: Daniel
 */
@Service
public class TaskService {
    @Autowired
    @RepositoryQualifier(type = RepositoryType.JPA)
    private ITaskDao taskDao;

    public void addTask(String subject,
                        Date startDate,
                        Date closeDate) {

        Task task = Task.Builder()
                .withSubject(subject)
                .withStartDate(startDate)
                .withCloseDate(closeDate)
                .build();

        taskDao.saveTask(task);
    }

    public List<Task> findAllTasks() {
        return taskDao.findAllTasks();
    }

    public String getServiceId() {
        return "taskService@1";
    }

    public List<Task> findCurrentToDoList()  {
        return null;
    }
}