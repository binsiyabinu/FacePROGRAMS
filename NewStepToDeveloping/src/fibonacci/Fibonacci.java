package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int p1=0;
	int p2=1;
	System.out.println("The fibonacci series is ");
	System.out.print(+p1+" "+p2);
	for(int i=0;i<=num;i++)
	{
		int sum=p1+p2;
		p1=p2;
		p2=sum;
		System.out.print(" "+sum);
	}
	
		
	}

}
