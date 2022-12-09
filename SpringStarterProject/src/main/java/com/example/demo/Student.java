package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
       private int roll_no;
       private String name;
       
       //Setter and getter method to access private data member.
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
       
	//user define method 
	public void print()
	{
		System.out.println("Welcome to 25 batch");
	}
       
}
