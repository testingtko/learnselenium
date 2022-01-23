

public class Day3Assignment {
	
	public Day3Assignment() {
		
		this(12,13,14);
		
		System.out.println("Default parameterized");
	}
	
	public Day3Assignment(int n) {
		
		System.out.println("One parameterized");
	}
	
	public Day3Assignment(int k, int l) {
		
		System.out.println("Two parametrized constructor");
		
	}
	
   public Day3Assignment(int x,int y,int z) {
		
		System.out.println("Three parametrized constructor");
		
	}
	
   public Day3Assignment(int a,int b, int c,int d) {
		
		System.out.println("Four parametrized constructor");
		
	}
   
   public static void main(String[] args) {
	
	  
	   Day3Assignment defparm=new Day3Assignment();
	   
	   Day3Assignment fourparm=new Day3Assignment(10,20,30,40);
	   
	   Day3Assignment oneparm=new Day3Assignment(10);
	   
	   Day3Assignment twoparm=new Day3Assignment(10,20);
	   
	  }
   
   
}
