package com.example.service;

import com.example.model.Job;

import java.util.List;

public interface JobService {
    int createJob(Job job);

    List<Job> getJob();

    int updateJob(Job job, int id);

    int deleteJob(int id);

}
