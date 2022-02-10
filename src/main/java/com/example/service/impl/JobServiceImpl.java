package com.example.service.impl;

import com.example.manager.JobManager;
import com.example.model.Job;
import com.example.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobManager jobManager;

    @Override
    public int createJob(Job job) {
        return    jobManager.createJob(job);
    }

    @Override
    public List<Job> getJob() {
        return jobManager.getJob();
    }

    @Override
    public int updateJob(Job job, int id) {
        return jobManager.updateJob(job,id);
    }

    @Override
    public int deleteJob(int id) {
        return jobManager.deleteJob(id);
    }

}
