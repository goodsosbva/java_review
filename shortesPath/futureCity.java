package shortestPath;

import java.util.Arrays;
import java.util.Scanner;

public class futureCity {
	
	public static final int INF = (int) 1e9; // ������ �ǹ��ϴ� ������ 10���� ����
    // ����� ����(N), ������ ����(M), ���� �� ���(X), ���� ������ ���(K)
    public static int n, m, x, k;
    // 2���� �迭(�׷��� ǥ��)�� �����
    public static int[][] graph = new int[101][101];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		// �ִ� �Ÿ� ���̺��� ��� �������� �ʱ�ȭ
        for (int i = 0; i < 101; i++) {
            Arrays.fill(graph[i], INF);
        }
        
        
        // �ִ� �Ÿ� ���̺��� ��� �������� �ʱ�ȭ
        for (int i = 0; i < 101; i++) {
            Arrays.fill(graph[i], INF);
        }
        
        for(int i = 1; i <= n; i++) {
        	for(int j = 1; j <= n; j++) {
        		if (i == j) graph[i][j] = 0;
        	}
        }
        // ���� ����
        for (int i = 0; i < m; i++) {
            // A���� B�� ���� ����� 1��� ����
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        
        // ��ȭ�Ŀ� ���� �÷��̵� ���� �˰����� ����
        for (int k = 1; k <= n; k++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }
        
        x = sc.nextInt();
        k = sc.nextInt();
        
        int res = graph[1][k] + graph[k][x];
        
        // ������ �� ���� ���, -1�� ���
        if (res >= INF) {
            System.out.println(-1);
        }
        // ������ �� �ִٸ�, �ִ� �Ÿ��� ���
        else {
            System.out.println(res);
        }
        
        
	}

}
