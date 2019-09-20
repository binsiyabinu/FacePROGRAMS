package pass_fail;

import java.util.Scanner;

public class PassFail {

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
        int c=0;
        for(int i=0;i<num;i++)
        {
        	if(arr[i]<45)
        	c++;	
        }
       System.out.println("Number of students appearing for retest is "+c); 
	}

}
