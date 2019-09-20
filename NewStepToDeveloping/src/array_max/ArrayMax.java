package array_max;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Applications");
		int num=sc.nextInt();
		System.out.println("Enter the amount(in crores)");
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
        	 arr[i]=sc.nextInt();
         }
        int max=arr[0];
        for(int i=1;i<num;i++)
        {
        	if(arr[i]>max)
        		max=arr[i];
         }
        System.out.println("The winning bid is "+max+" crores.");
        

	}

}
