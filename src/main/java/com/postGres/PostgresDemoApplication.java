package com.postGres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.postGres.dao.StudentDao;

@SpringBootApplication
public class PostgresDemoApplication  implements CommandLineRunner{

	@Autowired
	private StudentDao dao;
	public static void main(String[] args) {
		SpringApplication.run(PostgresDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//this.dao.createTable();
		this.dao.insertData("lambodar", "mumbai");
	}

}
