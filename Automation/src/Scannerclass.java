

	import java.util.Scanner;

	public class Scannerclass {
		
		public static void main(String[] args) {
			
			Scanner sin=new Scanner(System.in);
			System.out.println("Please enter any Integer value");
			int p=sin.nextInt();
			System.out.println("Value of p is " + p);
			System.out.println("Please enter any float value");
	        float f=sin.nextFloat();		
			System.out.println("Value of f is " + f);
			System.out.println("Please enter any String");
			String s=sin.nextLine();
			System.out.println("Value of String is " + s);
				
		}

	}


