package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;



@SpringBootApplication

public class SpringStarterProjectApplication {

	public static void main(String[] args) {
		
		
		/*int x=20;
		System.out.println("The value of x is:"+x);
		*/
		
		/*Student s=new Student();
		s.print();*/
		
		
		
		
		
		ConfigurableApplicationContext c=SpringApplication.run(SpringStarterProjectApplication.class, args);
		
	    Student s=c.getBean(Student.class);
	    s.print();
	}

}
