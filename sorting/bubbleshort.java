package sorting;

public class bubbleshort {
	 public static void bubbleShort(int[] arr) {
		 for(int round=1; round<arr.length-1; round++) {
			 for(int i=0; i<arr.length-1;i++){
				 if(arr[i]>arr[i+1]) {
					 int temp = arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=temp;
				 }
			 }
		 }
	 }
	 

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {5,6,7,8,9};
		bubbleShort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	

	}

}
