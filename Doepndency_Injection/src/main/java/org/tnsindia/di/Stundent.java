package org.tnsindia.di;

public class Stundent {
	
    private String Student_Name;
    private int roll_no;
    void display() 
       {
    	   System.out.println("The NAme of the Student is:"+Student_Name);
    	   System.out.println("The Roll no of the Student is:"+roll_no);
       }
	public Stundent(String student_Name, int roll_no) {
		super();
		Student_Name = student_Name;
		this.roll_no = roll_no;
	}
       
    
    
    
    
    
    
	/*public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	*/
       
}

