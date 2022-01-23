package Testpackage;


import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter any number");
		Scanner scin=new Scanner(System.in);
		number=scin.nextInt();
		for(int i=1;i<=10;i++) {
		System.out.println(number+  "*" +i+ "="  +number*i);
		}
		
	}
}
