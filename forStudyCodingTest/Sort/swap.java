package codingTestSort;

public class swap {

	public static void main(String[] args) {
		int arr[] = {1, 9};
		
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
