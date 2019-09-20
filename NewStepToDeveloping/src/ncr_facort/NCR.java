package ncr_facort;

import java.util.Scanner;

public class NCR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the value of r");
        int r=sc.nextInt();
        NCR obj=new NCR();
        //int a=obj.fact(n);
        long x=obj.fact(n);
        long y=obj.fact(n-r);
        long z=obj.fact(r);
        long a=x/(y*z);
        System.out.println("The NCR factor of given values is "+a);
	}
	public long fact(int num)
	{
		long fact=1;
		for(int i=num;i>0;i--)
		{
		 fact=fact*i;
		}
		return fact;
		
	}
}

