package dynamicProgramming;

public class fibobacciRecursive {
	
	// �� �� ���� ����� �޸������̼�(Memoization)�ϱ� ���� �迭 �ʱ�ȭ
    public static long[] d = new long[100];

    // �Ǻ���ġ �Լ�(Fibonacci Function)�� ����Լ��� ���� (ž�ٿ� ���̳��� ���α׷���)
    public static long fibo(int x) {
        // ���� ����(1 Ȥ�� 2�� �� 1�� ��ȯ)
        if (x == 1 || x == 2) {
            return 1;
        }
        // �̹� ����� �� �ִ� ������� �״�� ��ȯ
        if (d[x] != 0) {
            return d[x];
        }
        // ���� ������� ���� ������� ��ȭ�Ŀ� ���� �Ǻ���ġ ��� ��ȯ
        d[x] = fibo(x - 1) + fibo(x - 2);
        return d[x];
    }

	public static void main(String[] args) {
		System.out.println(fibo(10));
	}

}
