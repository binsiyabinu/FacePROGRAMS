package cricket;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		int bow=sc.nextInt();
		
		double arr[]=new double[bow];
		int brr[]=new int[bow];
		System.out.println("Enter the runs conceded by the bowlers");
		
		for(int i=0;i<bow;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Number of balls for each bowler");
		for(int i=0;i<bow;i++)
		{
			brr[i]=sc.nextInt();
		}
		 
		for(int i=0;i<bow;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<bow;i++)
		{
			System.out.println(brr[i]);
		}
		System.out.println("Economy of the bowlers is");
		double sum=0;
		int c=0;
		double two = 0;
		for(int i=0;i<bow;i++)
		{
			double one=brr[i]/6;
			 two=arr[i]/one;
			 arr[i]=two;
			sum=sum+two;
			System.out.println(two);
		}
		double avg=sum/bow;
		System.out.println("The overall economy of the team is "+avg);
		for(int i=0;i<bow;i++)
		{
		if(arr[i]<avg)
		{
			c++;
		}
		}
		System.out.println("The number of bowlers eligible are "+c);
	}

}
