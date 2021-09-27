package dynamicProgramming;

import java.util.Scanner;

public class tileConstruction {
	
	public static long[] d = new long[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		d[1] = 1;
		d[2] = 3;
		
		for(int i = 3; i <= n; i++){
			d[i] = d[i - 1] + 2 * d[i - 2];
		}
		
		System.out.println(d[n]);

	}

}
