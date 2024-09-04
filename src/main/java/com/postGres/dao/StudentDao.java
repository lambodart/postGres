package com.postGres.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createTable() {
		var query = 
		"create table student ( id serial primary key , name varchar(255) ,city varchar(255) )";
		int update = this.jdbcTemplate.update(query);
		System.out.println("Strudent Insertrdc :: "+update);
	}
	
	
	public void insertData(String name,String city){
		var query = 
				"insert into student(name,city) values (?,?) ";
		int update = this.jdbcTemplate.update(query,name , city);
		System.out.println("Insert Done :: "+update);
	}
}
