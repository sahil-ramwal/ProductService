package com.productservice.productservice;

//import com.productservice.productservice.inheritancerelations.mappedsuperclass.Mentor;
//import com.productservice.productservice.inheritancerelations.mappedsuperclass.MentorRepository;
import com.productservice.productservice.inheritancerelations.tablePerClass.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {
	private MentorRepository mentorRepository;
	private StudentRepo studentRepo;
	private  UserRepository userRepository;
	ProductServiceApplication(@Qualifier("tpc_mentorRepo") MentorRepository mentorRepository,StudentRepo studentRepo,UserRepository userRepository) {
		this.mentorRepository = mentorRepository;
		this.studentRepo=studentRepo;
		this.userRepository=userRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Mentor mentor=new Mentor();
		mentor.setName("sahil");
		mentor.setEmail("sahil@ramwal.com");
		mentor.setAvgRating(5.0);
		mentorRepository.save(mentor);
		Student student=new Student();

		student.setName("sahil");
		student.setEmail("hdhdhd");
		student.setPsp(97.0);
		studentRepo.save(student);
		User user =new User();
		user.setEmail("user@jdjd.com");
		user.setName("user");
		userRepository.save(user);
		//get all users
		List<User> users=userRepository.findAll();
		for(User user1:users){
			System.out.println(user1.toString());
		}


		}




}
