package Testpackage;


import java.util.Scanner;

public class ScannerAssignment {
	
	public int sum(int X1, int X2) {
		int sum=X1+X2;
		return sum;
	 }
	public int sub(int X1,int X2){
		int sub=X1-X2;
		return sub;
	}
	
	public int mult(int X1,int X2) {
		int mult=X1*X2;
		return mult;
	}
	public int div(int X1,int X2) {
		int div=X1/X2;
		return div;
	}
	
	public static void main(String[] args) {
		
		// Created object for user Input
		Scanner input=new Scanner(System.in);
		
		// Take user input for Sum of two numbers
		System.out.println("Please Enter first value");
		int X1=input.nextInt();
		System.out.println("Value of X1 is " + X1);
		System.out.println("Please Enter Second value");
		int X2=input.nextInt();
		System.out.println("Value of X2 is " +X2);
		
		//Created object for calling the methods
		ScannerAssignment sc=new ScannerAssignment();
		//Addition of two numbers 
		int sum=sc.sum(X1, X2);
		System.out.println("value of sum is " + sum);
		
		//Subtraction of two numbers 
		System.out.println("Please enter value of X3");
		int X3=input.nextInt();
		System.out.println("Value of X3 is " + X3);
	    int sub=sc.sub(sum, X3);
	    System.out.println("Value of Substraction is " +sub);
	    
	    //Subtraction of two numbers 
	  	System.out.println("Please enter value of X4");
	  	int X4=input.nextInt();
	  	System.out.println("Value of X4 is " + X4);
	  	int sub1=sc.sub(sub, X4);
	  	System.out.println("Value of Substraction is " +sub1);
	    
	    //Multiplication of two numbers
	  	System.out.println("Please enter value of X5");
	  	int X5=input.nextInt();
	  	System.out.println("Value of X5 is " + X5);
	  	int mult= sc.mult(sub1, X5);
	  	System.out.println("Value of Multiplication is " +mult);
	  	
	    //Division of two numbers 
	  	System.out.println("Please enter value of X6");
	  	int X6=input.nextInt();
	  	System.out.println("Value of X6 is " + X6);
	  	int div= sc.div(sub1, X6);
	  	System.out.println("Value of Division is " +div);
		
		
		}	
	}
