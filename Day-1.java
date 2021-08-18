/*
	  Interpreter			         VS		  Compiler
	1. Translates just one line			       1. Scans and translates the whole
	   at a time.					           code at a time.
	
	2. Takes less time to analyze			   2. Takes more time to analyze but
	   but more time to execute.			   less time to execute.
	3. No intermediate code is			       3. Generates an intermediary code 
	   generated thus, efficient 			   thus, more memory is needed.
	   interms of memory.
	4. Debugging is easier.				       4. Debugging is relatively harder.
*/

import java.util.Scanner;

class StudentDetails{
    int rollno;
    String name;
    float marks;
    void studentInp(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Student Rollno : ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name   : ");
        name = sc.nextLine();
        System.out.print("Enter Student Marks2 : ");
        marks = sc.nextFloat();
            }
    void studentdisp(){
        System.out.println(" ----------------------");
        System.out.println("   Student Details");
        System.out.println(" ----------------------");
        System.out.println("Student Roll no : " +rollno);
        System.out.println("Studnet Name    : " +name);
        System.out.println("Studnet Marks   : " +marks);
    }
}

class StudentDemo{
    public static void main(String[] args) {
     StudentDetails I1 = new StudentDetails();
     I1.studentInp();
     I1.studentdisp();
    }
}

    