package mark_sorting;

import java.util.Scanner;

public class MarkSorting {

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
        int max;
        for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]<arr[j])
				{
				max=arr[i];
				arr[i]=arr[j];
				arr[j]=max;
				}
			}
		}
        System.out.println("The priority of marks is");
        for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
