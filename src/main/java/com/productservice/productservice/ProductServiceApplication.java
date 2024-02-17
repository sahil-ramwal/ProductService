package com.productservice.productservice;

//import com.productservice.productservice.inheritancerelations.mappedsuperclass.Mentor;
//import com.productservice.productservice.inheritancerelations.mappedsuperclass.MentorRepository;
import com.productservice.productservice.inheritancerelations.tablePerClass.*;
import com.productservice.productservice.models.Category;
import com.productservice.productservice.models.Price;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.repository.CategoryRepository;
import com.productservice.productservice.repository.PriceRepository;
import com.productservice.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {
	private MentorRepository mentorRepository;
	private StudentRepo studentRepo;
	private  UserRepository userRepository;
	private final PriceRepository priceRepository;
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;

	ProductServiceApplication(@Qualifier("tpc_mentorRepo") MentorRepository mentorRepository,StudentRepo studentRepo,UserRepository userRepository,
							  PriceRepository priceRepository,
							  CategoryRepository categoryRepository,
							  ProductRepository productRepository) {
		this.mentorRepository = mentorRepository;
		this.studentRepo=studentRepo;
		this.userRepository=userRepository;
		this.priceRepository = priceRepository;
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Mentor mentor=new Mentor();
//		mentor.setName("sahil");
//		mentor.setEmail("sahil@ramwal.com");
//		mentor.setAvgRating(5.0);
//		mentorRepository.save(mentor);
//		Student student=new Student();
//
//		student.setName("sahil");
//		student.setEmail("hdhdhd");
//		student.setPsp(97.0);
//		studentRepo.save(student);
//		User user =new User();
//		user.setEmail("user@jdjd.com");
//		user.setName("user");
//		userRepository.save(user);
//		//get all users
//		List<User> users=userRepository.findAll();
//		for(User user1:users){
//			System.out.println(user1.toString());
//		}
//
//
//		Price price=new Price();
//		price.setCurrency("INR");
//		price.setValue(100000.0);
//		//Price savedprice=priceRepository.save(price);
//
//		Category category=new Category();
//		category.setName("Apple devices");
//		Category savedCategory=categoryRepository.save(category);
//
//
//		Product product=new Product();
//		product.setCategory(savedCategory);
//		product.setTitle("iphone 15");
//		product.setDescription("new iphone");
//		//product.setPrice(new Price());
//		product.setPrice(price);
//		product.setCategory(savedCategory);
//
//		Product savedProduct =productRepository.save(product);
    //   Optional<Price> price=priceRepository.findById(UUID.fromString("e3b8e10e-79b7-4429-99ec-feb1b48cda72"));


		}




}
