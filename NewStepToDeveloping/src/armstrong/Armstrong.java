package armstrong;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		int c=num;
		while(num!=0)
		{
			int n=num%10;
			sum=sum+(n*n*n);
			num=num/10;
		}
		if(sum==c) 
		{
			System.out.println("The given number is armstrong");
		}
		else
			System.out.println("The given number is not armstrong");
		

	}

}
