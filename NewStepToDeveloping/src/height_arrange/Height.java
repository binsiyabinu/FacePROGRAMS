package height_arrange;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int num=sc.nextInt();
		System.out.println("Enter the heights of students");
		double arr[] = new double[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextDouble();
		}
		double max;
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]>arr[j])
				{
				max=arr[i];
				arr[i]=arr[j];
				arr[j]=max;
				}
			}
		}
		System.out.println("The heights in order are");
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
