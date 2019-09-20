package resume;

import java.util.Scanner;

public class Resume {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.next();
		System.out.println("Enter your Age");
		String age=sc.next();
		System.out.println("Enter your Degree");
		String degree=sc.next();
		System.out.println("Enter your Branch");
		String branch=sc.next();
		System.out.println("Enter your Contact Number");
		String contactNo=sc.next();
		System.out.println("Name	: "+name);
		System.out.println("Age     : "+age);
		System.out.println("Degree	: "+degree);
		System.out.println("Branch	: "+branch);
		System.out.println("Contact	: "+contactNo);
		
	}

}


