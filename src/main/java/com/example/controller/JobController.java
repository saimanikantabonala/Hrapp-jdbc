package com.example.controller;

import com.example.model.Job;
import com.example.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/savejob")
    public int createJob (@RequestBody Job job){
        return    jobService.createJob(job);
    }

    @GetMapping("/showjobs")
    public List<Job> getJob(){
        return jobService.getJob();
    }

    @GetMapping("/updatejob/{id}")
    public int updateJob(@RequestBody Job job,@PathVariable int id){
        return jobService.updateJob(job,id);
    }

    @DeleteMapping("/deletejob/{id}")
    public int deleteJob(@PathVariable int id){
        return jobService.deleteJob(id);
    }
}
