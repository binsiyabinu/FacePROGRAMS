package additionfactorial;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean i = false;
		do
		{
			System.out.println("Enter a number");
			int num=sc.nextInt();
			if(num<0)
			{
			i=true;	
			}
			else
			{
				num=(num*(num+1))/2;
				System.out.println("The sum is "+num);
				i=false;
			}
            
		}while(i);
		
	}

}
