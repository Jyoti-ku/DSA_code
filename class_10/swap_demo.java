package class_10;

public class swap_demo {
public static void swap(int a, int b) {
	int temp =a;
	a=b;
	b=temp;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=13;
		System.out.println("before swap"+a+","+b);
		swap(a,b);
		System.out.println("after swap"+a+","+b);

	}

}
