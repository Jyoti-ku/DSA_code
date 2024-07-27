package class_10;

public class case_3_function {
	static int val =14;
	public static void fun() {
		System.out.println("hello fun");
		int val =12;
		System .out.println(val);

		if(val==12) {
			return val;
			//conditional method
		}else {
			return 13; //conditional statement
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello from main");
		fun();
		

	}
	//when we not give confirm return then it not return;
//return keyword se forcefully function ko wipe out krta h or uska nicha ke code nahi reach kr sakta . so it will give error.
}
