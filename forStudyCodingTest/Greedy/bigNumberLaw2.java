// ū ���� ��Ģ ����
package CodingTestWithJava.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class bigNumberLaw2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // N, M, K�� ������ �������� �����Ͽ� �Է� �ޱ�
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // N���� ���� ������ �������� �����Ͽ� �Է� �ޱ�
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // �Է� ���� ���� �����ϱ�
        int first = arr[n - 1]; // ���� ū ��
        int second = arr[n - 2]; // �� ��°�� ū ��
        
        int result = 0;
        
        while (true) {
        	for (int i = 0; i < k; i++) {
        		if (m == 0) {
        			break;
        		}
        		result += first;
        		m -= 1;
        	}
        	if (m == 0) {
        		break;
        		}
        	result += second;
        	m -= 1;
        }
        System.out.println("����: " + result);
	}

}
