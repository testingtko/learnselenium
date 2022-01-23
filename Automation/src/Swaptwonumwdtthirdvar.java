

import java.util.Scanner;

public class Swaptwonumwdtthirdvar {

	public static void main(String[] args) {

		int a,b;
		System.out.println("Enter any two numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping " +a+ " " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping " +a+ " " +b);

		
	}

}
