package Dfs_Bfs;

import java.util.*;

public class freezeDrinks {
	
	public static int n, m;
    public static int[][] graph = new int[1000][1000];
    
    public static boolean dfs(int x, int y) {
    	if (x <= -1 || x >=n || y <= -1 || y >= m) {
            return false;
        }
    	
    	if (graph[x][y] == 0) {  // ���̽�ũ���� 0
    		
    		graph[x][y] = 1;
    		
    		dfs(x - 1, y);
    		dfs(x + 1, y);
    		dfs(x, y - 1);
    		dfs(x, y + 1);
    		return true;
    	}
    	return false;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // N, M�� ������ �������� �����Ͽ� �Է� �ޱ�
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // ���� �����
        
        // 2���� ����Ʈ�� �� ���� �Է� �ޱ�
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
		
		int res = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if (dfs(i, j) == true) {
					res += 1;
				}
			}
		}
		System.out.println(res);

	}

}
