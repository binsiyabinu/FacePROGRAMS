package array_min;

import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Enter the number of players");
		int num=sc.nextInt();
		System.out.println("Enter the number of fouls made by each player");
        int arr[]=new int[num];
        for( i=0;i<num;i++)
        {
        	 arr[i]=sc.nextInt();
         }
        int min=arr[0],c=0;
        for( i=0;i<num;i++)
        {
        	if(arr[i]<min)
        	{
        		min=arr[i];
        		c=i+1;
        	}
         }
        System.out.println("The eligible player is player no:"+c+"("+min+" fouls)");
        

	}

}
