package average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int num=sc.nextInt();
		System.out.println("Enter the marks of students");
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
        	 arr[i]=sc.nextInt();
         }
        int sum=0;
        for(int i=0;i<num;i++)
        {
        	sum=sum+arr[i];
        }
        int avg=sum/num;
        System.out.println("The average is "+avg);
	}

}
