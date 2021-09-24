package CodingTestWithJava.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class bigNumberLaw {

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

        // ���� ū ���� �������� Ƚ�� ���
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first; // ���� ū �� ���ϱ�
        result += (m - cnt) * second; // �� ��°�� ū �� ���ϱ�

        System.out.println(result);

	}

}
