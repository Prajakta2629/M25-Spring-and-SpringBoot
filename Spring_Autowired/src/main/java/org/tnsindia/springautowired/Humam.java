package org.tnsindia.springautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Humam {
	 private Heart heart;
     public void pumping()
     {
    	heart.pump(); 
    	System.out.println("Name Of the animal:"+heart.getNameOfAnimal()+" "+"No of heart: "+heart.getNoOfHeart());
     }
     @Autowired
     @Qualifier("HumanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Humam(Heart heart) {
		super();
		this.heart = heart;
	}

	public Humam() {
		super();
		this.heart = heart;
	}
     
}
