package com.example.spring_boot_rest.service;

import com.example.spring_boot_rest.model.JobPost ;
import com.example.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class JobService {



    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(


                new JobPost(
                        1,
                        "Java Developer",
                        "Must have strong experience in Spring Boot and Microservices.",
                        3,
                        Arrays.asList("Java", "Spring Boot", "MySQL", "Docker")
                ),


                new JobPost(
                        2,
                        "Frontend Developer",
                        "Experience with React, Redux, and modern CSS frameworks.",
                        2,
                        Arrays.asList("JavaScript", "React", "Redux", "CSS", "HTML5")
                ),


                new JobPost(
                        3,
                        "Data Scientist",
                        "Strong background in machine learning, statistics, and Python.",
                        5,
                        Arrays.asList("Python", "Pandas", "NumPy", "TensorFlow", "SQL")
                ),


                new JobPost(
                        4,
                        "DevOps Engineer",
                        "Responsible for CI/CD pipelines, automation, and cloud infrastructure.",
                        4,
                        Arrays.asList("AWS", "Kubernetes", "Docker", "Terraform", "Jenkins")
                ),


                new JobPost(
                        5,
                        "Full Stack Developer",
                        "Work on both client and server side using MERN stack.",
                        3,
                        Arrays.asList("Node.js", "React", "Express", "MongoDB")
                )

        ));
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
