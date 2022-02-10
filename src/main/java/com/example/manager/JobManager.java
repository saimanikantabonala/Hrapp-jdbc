package com.example.manager;

import com.example.model.Job;

import java.util.List;

public interface JobManager {
    int createJob(Job job);
    List<Job> getJob();
    int updateJob(Job job,int id);
    int deleteJob(int id);
}
