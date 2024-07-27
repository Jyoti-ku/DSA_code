package class_10;

public class take_something_return_nothing {
public static void add(int a,int b) {
System.out.println("add is start")	;
int ans =a+b;
 System.out.println(ans);
 System .out.println("ans is end");
}

public static void sub(int a,int b) {
	System.out.println("sub is start");
	int ans =a-b;
	System.out.println("ans is end");
}

	public static void f1() {
		System.out.println("hello from fi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main is start");
		add(2,3);
		sub(12,13);
		System.out.println("main is end");
	}

}
