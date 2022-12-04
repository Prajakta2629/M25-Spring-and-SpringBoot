package org.tnsindia.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		//Stundent s=new Stundent();
		//s.setStudent_Name("Prajakta k");
		//s.display();
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Stundent s1=c.getBean("s1", Stundent.class);
		
		s1.display();
		

}
}