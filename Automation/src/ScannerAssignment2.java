

import java.util.Scanner;
public class ScannerAssignment2 {
	
		
		public int mult(int X1,int X2) {
			int mult=X1*X2;
			return mult;
		}
		public int sum(int X1, int X2) {
			int sum=X1+X2;
			return sum;
		 }
		public int sub(int X1,int X2){
			int sub=X1-X2;
			return sub;
		}
		public int div(int X1,int X2) {
			int div=X1/X2;
			return div;
		}
		
		public static void main(String[] args) {
			
			// Created object for user Input
			Scanner input=new Scanner(System.in);
			
			// Take user input 
			System.out.println("Please Enter mult's first value in X1");
			int X1=input.nextInt();
			System.out.println("Value of X1 is " + X1);
			System.out.println("Please Enter mult's Second value in X2");
			int X2=input.nextInt();
			System.out.println("Value of X2 is " +X2);
			
			//Created object for calling the methods
			ScannerAssignment2 sc=new ScannerAssignment2();
			//Multiplication of two numbers 
			int mult=sc.mult(X1, X2);
			System.out.println("value of multiplication of two numbers is " +mult);
			
			//Addition of two numbers 
			System.out.println("Please enter Sum's first value in X3");
			int X3=input.nextInt();
			System.out.println("Value of X3 is " + X3);
		    int sum=sc.sum(mult, X3);
		    System.out.println("Value of Addition of two numbers is " +sum);
		    
		    //Addition of two numbers 
		  	System.out.println("Please enter Sum's first value in X4");
		  	int X4=input.nextInt();
		  	System.out.println("Value of X4 is " + X4);
		  	int sum1=sc.sum(sum, X4);
		  	System.out.println("Value of Addition of two numbers is " +sum1);
		    
		    //Subtraction of two numbers
		  	System.out.println("Please enter Sub's first value in X5");
		  	int X5=input.nextInt();
		  	System.out.println("Value of X5 is " + X5);
		  	int sub= sc.sub(sum1, X5);
		  	System.out.println("Value of Subtraction of two numbers is " +sub);
		  	
		    //Division of two numbers 
		  	System.out.println("Please enter division's first value in X6");
		  	int X6=input.nextInt();
		  	System.out.println("Value of X6 is " + X6);
		  	int div= sc.div(sub, X6);
		  	System.out.println("Value of Division of two numbers is " +div);
					
			
			}	
		}


