package com.niladri.JobBoardRest.controller;

import com.niladri.JobBoardRest.model.JobModel;
import com.niladri.JobBoardRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobs")
    public List<JobModel> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/job/{postId}")
    public JobModel getJobById(@PathVariable("postId") int postId) {
        return jobService.getJobById(postId);
    }

    @PostMapping("/job")
    public String addJob(@RequestBody JobModel job) {
        jobService.addJob(job);
        return "Job added successfully";
    }

    @PutMapping("/updatejob")
    public JobModel updateJob(@RequestBody JobModel job) {
        jobService.updateJob(job);
        return jobService.getJobById(job.getPostId());
    }


    @DeleteMapping("/deletejob/{postId}")
    public String deleteJob(@PathVariable("postId") int postId) {
        jobService.deleteJob(postId);
        return "Job deleted successfully";
    }
}
