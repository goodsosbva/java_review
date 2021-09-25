package codingTestSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class replacementOfElementsInTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // N�� K�� �Է¹ޱ�
        int n = sc.nextInt();
        int k = sc.nextInt();

        // �迭 A�� ��� ���Ҹ� �Է¹ޱ�
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // �迭 B�� ��� ���Ҹ� �Է¹ޱ�
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // �迭 A�� �������� ���� ����
        Arrays.sort(a);
        // �迭 B�� �������� ���� ����
        Arrays.sort(b, Collections.reverseOrder());

        // ù ��° �ε������� Ȯ���ϸ�, �� �迭�� ���Ҹ� �ִ� K�� �� 
        for (int i = 0; i < k; i++) {
            // A�� ���Ұ� B�� ���Һ��� ���� ���
            if (a[i] < b[i]) {
                // �� ���Ҹ� ��ü
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            // A�� ���Ұ� B�� ���Һ��� ũ�ų� ���� ��, �ݺ����� Ż��
            else break;
        }

        // �迭 A�� ��� ������ ���� ���
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];
        }
        System.out.println(result);

	}

}
