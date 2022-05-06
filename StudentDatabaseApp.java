package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		
		//Student student=new Student();
		//student.enroll();
		//student.viewBalance();
		//student.payTiyution();
		//System.out.println(student.toString());
		
		
		//ask how many new students we want to add
		System.out.println("Enter number of new students to enroll");
		Scanner in=new Scanner(System.in);
		int numOfStudent=in.nextInt();
		Student[] students=new Student[numOfStudent];
		
		//create a number of new students
		for(int n=0;n<numOfStudent;n++) {
			students[n]=new Student();
			students[n].enroll();
			students[n].viewBalance();
			students[n].payTiyution();
			
		}
		for(int n=0;n<numOfStudent;n++) {
		System.out.println(students[n].toString());
		
		}
	}

}
