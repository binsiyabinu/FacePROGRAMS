package toll_of_vehicle;

import java.util.Scanner;

public class TollOfVehicle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Vehicles");
		int num=sc.nextInt();
		System.out.println("Enter the fare collected for each vehicle");
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
        	 arr[i]=sc.nextInt();
         }
        int h=0,l=0;
        for(int i=0;i<num;i++)
        {
        	if(arr[i]>50)
        	{
        		h++;
        	}
        	else if(arr[i]>0 && arr[i]<=50)
        	{
        		l++;
        	}
         }
        System.out.println("The number of heavy vehicle "+h+" and the number of light weight vehicles is "+l);
	
	}

}
