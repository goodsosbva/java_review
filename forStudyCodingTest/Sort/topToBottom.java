package codingTestSort;

import java.util.*;

public class topToBottom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		//int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
