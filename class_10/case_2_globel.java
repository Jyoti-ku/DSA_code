package class_10;

public class case_2_globel {

	static int val =14;
	public static void  fun() {
		
		int val =12;
		val++;
		System.out.println(val);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(val);
		fun();
        System.out.println(val);
	}

}
//in heap any update in global variable will persist for future