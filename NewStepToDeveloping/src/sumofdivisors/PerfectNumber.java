package sumofdivisors;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.print("The divisors of the numbers are");
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.print(" "+i);
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("The sum of the divisors are "+sum);
      if(sum==num)
      {
    	  System.out.println("It is a perfect number");
      }
      else
      {
    	  System.out.println("It is not a perfect number");
      }
	}

}
