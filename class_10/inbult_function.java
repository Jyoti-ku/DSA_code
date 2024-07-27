package class_10;

public class inbult_function {

	public inbult_function() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2; 
		int b=3;
		double ans1=Math.pow(2, 3); //powe data type is double
		System.out.println(ans1); 
		
		int ans2=(int)(ans1);
		System.out.println(ans2);
		
		int ans =Math.max(a,b);
		System.out.println(ans);
		
		ans=Math.min(a, b);
		System.out.println(ans);
		
		int c= -120;
		System.out.println(Math.abs(c));//absolute convert negative to positive and positive to negative 
		int d=100;
		System.out.println(Math.sqrt(d));//return type double by defaults
	}
}