package dynamicProgramming;

import java.util.Scanner;

public class warriorAnt {
	
	public static long[] d = new long[100];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� N�� �Է¹ޱ�
        int n = sc.nextInt();
        
        
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
        	arr[i] = sc.nextInt();
        }
        
        // ���Ҿ� ���
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);
        for(int j = 2; j < n; j++) {
        	d[j] = Math.max(d[j - 1], d[j - 2] + arr[j]);
        }
        // ��� ���
        System.out.println(d[n - 1]);
	}

}
