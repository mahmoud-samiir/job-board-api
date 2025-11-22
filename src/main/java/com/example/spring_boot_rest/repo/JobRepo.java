package com.example.spring_boot_rest.repo;

import com.example.spring_boot_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile,String postDesc);
}
//List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//
//
//        new JobPost(
//                1,
//                "Java Developer",
//                "Must have strong experience in Spring Boot and Microservices.",
//                3,
//                Arrays.asList("Java", "Spring Boot", "MySQL", "Docker")
//        ),
//
//
//        new JobPost(
//                2,
//                "Frontend Developer",
//                "Experience with React, Redux, and modern CSS frameworks.",
//                2,
//                Arrays.asList("JavaScript", "React", "Redux", "CSS", "HTML5")
//        ),
//
//
//        new JobPost(
//                3,
//                "Data Scientist",
//                "Strong background in machine learning, statistics, and Python.",
//                5,
//                Arrays.asList("Python", "Pandas", "NumPy", "TensorFlow", "SQL")
//        ),
//
//
//        new JobPost(
//                4,
//                "DevOps Engineer",
//                "Responsible for CI/CD pipelines, automation, and cloud infrastructure.",
//                4,
//                Arrays.asList("AWS", "Kubernetes", "Docker", "Terraform", "Jenkins")
//        ),
//
//
//        new JobPost(
//                5,
//                "Full Stack Developer",
//                "Work on both client and server side using MERN stack.",
//                3,
//                Arrays.asList("Node.js", "React", "Express", "MongoDB")
//        )
//
//));
//public List<JobPost> getAllJobs(){
//    return jobs;
//}
//
//public void addJob(JobPost job){
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//public JobPost getJob(int postId) {
//    for(JobPost job:jobs){
//        if(job.getPostId()==postId)
//            return job;
//    }
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//    for(JobPost jobPost1 : jobs){
//        if(jobPost1.getPostId()==jobPost.getPostId()){
//            jobPost1.setPostDesc(jobPost.getPostDesc());
//            jobPost1.setPostProfile(jobPost.getPostProfile());
//            jobPost1.setPostTechStack(jobPost.getPostTechStack());
//            jobPost1.setReqExperience(jobPost.getReqExperience());
//        }
//    }
//}
//
//public void deleteJob(int postId) {
////        for(JobPost jobPost:jobs)
////            if (jobPost.getPostId() == postId){
////                jobs.remove(jobPost);
////            }
//    jobs.removeIf(jobPost -> jobPost.getPostId() == postId);
//}
