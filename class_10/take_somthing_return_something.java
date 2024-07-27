package class_10;

public class take_somthing_return_something {

	
		// TODO Auto-generated constructor stub
		public static  int add(int a,int b) {
			System.out.println("add is start");
			int ans =a+b;
			System.out.println("add is end");
			return ans;
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("main is start");
		 int ans =add(12,13);
		 System.out.println(ans);
		 System.out.println("main is end");
				 
 
	}

}
