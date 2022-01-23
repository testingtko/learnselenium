package Testpackage;



public class Constructorpractice {

	public Constructorpractice() {
		
		System.out.println("Testing is zero paprametrerized constrctor");
	}
	
	public Constructorpractice(int a) {
		
		System.out.println("Testing is one parameterized constructor");
	}
	
	public Constructorpractice(int x, int z) {
		
		System.out.println("Testing is two parameterized constructor");
		
		System.out.println("Test");
	}
	
	public static void main(String[] args) {
		
		Constructorpractice cp=new Constructorpractice();
		
		Constructorpractice cp1=new Constructorpractice(22);
		
		Constructorpractice cp2=new Constructorpractice(24,35);
		
	}
}

