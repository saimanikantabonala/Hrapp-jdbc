package com.example.manager.impl;

import com.example.dao.JobDao;
import com.example.manager.JobManager;
import com.example.model.Job;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobManagerImpl implements JobManager {

    @Autowired
    JobDao jobDao;

    @Override
    public int createJob(Job job) {
        return jobDao.createJob(job);
    }

    @Override
    public List<Job> getJob() {
        return jobDao.getJob();
    }

    @Override
    public int updateJob(Job job, int id) {
        return jobDao.updateJob(job,id);
    }

    @Override
    public int deleteJob(int id) {
        return jobDao.deleteJob(id);
    }
}
