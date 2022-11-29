package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJasperConnectDbApplication implements CommandLineRunner{

	@Autowired
	private DBRepository dbRepo;
	 
	public static void main(String[] args) {
		SpringApplication.run(DemoJasperConnectDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		long id = 3594;
		//List<ModelDB> db = dbRepo.findAllByOrderByIdDesc();
		//db.forEach(System.out :: println);
		ModelDB singleDb = dbRepo.findAllById(id);
		System.out.println(singleDb);
	}

}
