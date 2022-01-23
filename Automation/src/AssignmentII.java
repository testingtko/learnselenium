
public class AssignmentII {

	
		
		public void m0() {
			
			System.out.println("Default method");
		}
		
		public void m1(int n) {
			
			System.out.println("One parameterized metod");
		}
		
		public void m2(int k, int l) {
			
			System.out.println("Two parametrized method");
			
		}
		
	   public void m3(int x,int y,int z) {
			
			System.out.println("Three parametrized method");
			
		}
		
	   public void m4(int a,int b, int c,int d) {
		   
		    this.m3(3, 4, 5);
			
			System.out.println("Four parametrized method");
			
			this.m0();
			
			this.m1(6);
			
			this.m2(7,8);
			
		}
	   
	   public static void main(String[] args) {
		
		   AssignmentII as=new AssignmentII();
		   
		   as.m4(9, 8, 7, 6);
		   
		  
	}

	}

	
	

