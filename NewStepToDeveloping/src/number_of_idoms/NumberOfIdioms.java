package number_of_idoms;

import java.util.Scanner;

public class NumberOfIdioms {

	public static void main(String[] args) {
		Scanner sc=new 	Scanner(System.in);
		System.out.println("Enter the kgs of gold");
		int gold=sc.nextInt();
		int result=gold+(gold/5);
		if((gold/5)>=5)
			result=result+(gold/25);
		System.out.println("Number of sculptures can be made is "+result);
	}

}
