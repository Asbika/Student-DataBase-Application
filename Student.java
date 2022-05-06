package studentDatabaseApp;
import java.util.Scanner;

public class Student {
	
	//usig encapsulation 
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000;
	
	//constractor: prompted user to enter student's name and year
	Scanner in=new Scanner(System.in);
	public Student() {
		 
		 System.out.println("Enter student first name: ");
		 this.firstName=in.nextLine();
		 
		 System.out.println("Enter student last name: ");
	     this.lastName=in.nextLine();
	     
	     System.out.println("1-Freashmen \n2-Sophmore \n3-Junior \n4-Senior \nEnter Student Class Level: ");
	     this.gradeYear=in.nextInt(); 
	     
	     setStudentID();
	 }
	
	//generate an ID
	 private void setStudentID() {
		 //grade level + ID
		 id++;
		 this.studentId= gradeYear+""+id;
	 }
	 
	//enroll in courses
	 String forTest="Q";
	 String bl;
	 public void enroll() {	 
		 //Get inside a loop, user hits 0
		 do {
		 System.out.println("Enter course to enroll(Q to quit):");
		 Scanner in=new Scanner(System.in);
		 String course=in.nextLine();
		 
		 if(!course.equals(forTest)) {
			 
			  courses=courses+"\n"+" " +" "+course;
			  tuitionBalance=tuitionBalance+costOfCourse;
			  
		 }  else if(course.equals(forTest))break;
			
	 }while(1!=0);
		 
	 }

	//view balance
	public void viewBalance() {
		System.out.println("BALANCE: $"+tuitionBalance);
	}
	//pay tuition
	public void payTiyution() {
		System.out.println("Enter your payment: $");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		System.out.println("Thank you for your payment of $"+payment);
		tuitionBalance=tuitionBalance-payment;
		viewBalance(); 
	}
	//Show status
	@Override
	public String toString() {
			return "\nName: "+firstName+" "+lastName+
					"\nGrade Level: "+gradeYear+
					"\nStudent ID: "+studentId+
					"\nCourses Enrolled: "+" "+courses+
					"\nBalance: $"+tuitionBalance;
	}
}
