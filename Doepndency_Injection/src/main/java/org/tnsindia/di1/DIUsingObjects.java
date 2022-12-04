package org.tnsindia.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tnsindia.di.Stundent;

public class DIUsingObjects {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Studentk s1=c.getBean("s1", Studentk.class);
		
		s1.cheating();
		
		
		
		
		
		
	}

}
