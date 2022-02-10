package com.example.dao.impl;

import com.example.model.Job;
import com.example.dao.JobDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JobDaoImpl implements JobDao {

    private static final String CREATE_JOB="INSERT INTO jobs(job_id,job_title) VALUES(?,?)";

    @Autowired
    private JdbcTemplate template;

    @Override
    public int createJob(Job job) {

        return    template.update(CREATE_JOB,job.getId(),job.getTitle());
    }

    @Override
    public List<Job> getJob() {
        String q="SELECT * FROM jobs";
        return template.query(q, BeanPropertyRowMapper.newInstance(Job.class));
    }

    @Override
    public int updateJob(Job job, int id) {
        String q="UPDATE jobs SET job_id=?,job-title=? WHERE job_id=?";
        return template.update(q,job.getId(),job.getTitle(),id);
    }

    @Override
    public int deleteJob(int id) {
        String q="DELETE FROM jobs WHERE job_id=?";
        return template.update(q,id);
    }
}
