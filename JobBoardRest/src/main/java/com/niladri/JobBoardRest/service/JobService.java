package com.niladri.JobBoardRest.service;


import com.niladri.JobBoardRest.model.JobModel;
import com.niladri.JobBoardRest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public List<JobModel> getAllJobs() {
        return jobRepo.findAll();
    }

    public JobModel getJobById(int postId) {
        return jobRepo.getJobById(postId);
    }

    public void addJob(JobModel job) {
        jobRepo.addJob(job);

    }

    public void updateJob(JobModel job) {
        jobRepo.updateJob(job);
    }

    public void deleteJob(int postId) {
        jobRepo.deleteJob(postId);
    }
}
