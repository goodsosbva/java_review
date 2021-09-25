package codingTestSort;

public class insertionSort {

	public static void main(String[] args) {
		int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					// 스와프(Swap)
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
				}
				else {  // 자기 보다 크면 이미 이전은 정렬된 상태라고 판단
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
