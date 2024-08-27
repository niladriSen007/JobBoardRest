package com.niladri.JobBoardRest.repo;

import com.niladri.JobBoardRest.model.JobModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    List<JobModel> jobs = new ArrayList<JobModel>();

    public JobRepo() {
        jobs.add(new JobModel(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

        // Frontend Developer Job Post
        jobs.add(
                new JobModel(2, "Frontend Developer", "Experience in building responsive web applications using React",
                        3, List.of("HTML", "CSS", "JavaScript", "React")));

        // Data Scientist Job Post
        jobs.add(new JobModel(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                List.of("Python", "Machine Learning", "Data Analysis")));

        // Network Engineer Job Post
        jobs.add(new JobModel(4, "Network Engineer",
                "Design and implement computer networks for efficient data communication", 5,
                List.of("Networking", "Cisco", "Routing", "Switching")));

        // Mobile App Developer Job Post
        jobs.add(new JobModel(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
                        3, List.of("iOS Development", "Android Development", "Mobile App")));
    }

    public List<JobModel> findAll() {
        return jobs;
    }

    public JobModel getJobById(int postId) {
        for (JobModel job : jobs) {
            if (job.getPostId() == postId) {
                return job;
            }
        }
        return null;
    }

    public void addJob(JobModel job) {
        jobs.add(job);
        System.out.println("Job added successfully");
    }

    public void updateJob(JobModel job) {
        for (JobModel j : jobs) {
            if (j.getPostId() == job.getPostId()) {
                j.setPostDesc(job.getPostDesc());
                j.setPostProfile(job.getPostProfile());
                j.setReqExperience(job.getReqExperience());
                j.setPostTechStack(job.getPostTechStack());
                System.out.println("Job updated successfully");
            }
        }
    }

    public void deleteJob(int postId) {
       for(JobModel j : jobs) {
           if (j.getPostId() == postId) {
               jobs.remove(j);
               break;
           }
       }
        System.out.println("Job deleted successfully");
    }
}
