package class_10;

public class demo_1_take_no_return_something {

	public static int add()
	{
		System.out.println("add is start");
		int a=12;
		int b=13;
		int ans =a+b;
		System.out.println("add is end");
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main is end");
		int ans = add();
		System.out.println(ans);
		System.out.println("main is end");
	}

}
