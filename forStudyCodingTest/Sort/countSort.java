package codingTestSort;

public class countSort {
	
	public static final int MAX_VALUE = 9;

	public static void main(String[] args) {
		
		int n = 15;
        // ��� ������ ���� 0���� ũ�ų� ���ٰ� ����
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        // ��� ������ �����ϴ� �迭 ����(��� ���� 0���� �ʱ�ȭ)
        int[] cnt = new int[MAX_VALUE + 1];

        for (int i = 0; i < n; i++) {
            cnt[arr[i]] += 1; // �� �����Ϳ� �ش��ϴ� �ε����� �� ����
        }
        for (int i = 0; i <= MAX_VALUE; i++) { // �迭�� ��ϵ� ���� ���� Ȯ��
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print(i + " "); // ���⸦ �������� ������ Ƚ����ŭ �ε��� ���
            }
        }
    }

}


