package shortestPath;

import java.util.Arrays;
import java.util.Scanner;

public class futureCity {
	
	public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
    // 노드의 개수(N), 간선의 개수(M), 거쳐 갈 노드(X), 최종 목적지 노드(K)
    public static int n, m, x, k;
    // 2차원 배열(그래프 표현)를 만들기
    public static int[][] graph = new int[101][101];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		// 최단 거리 테이블을 모두 무한으로 초기화
        for (int i = 0; i < 101; i++) {
            Arrays.fill(graph[i], INF);
        }
        
        
        // 최단 거리 테이블을 모두 무한으로 초기화
        for (int i = 0; i < 101; i++) {
            Arrays.fill(graph[i], INF);
        }
        
        for(int i = 1; i <= n; i++) {
        	for(int j = 1; j <= n; j++) {
        		if (i == j) graph[i][j] = 0;
        	}
        }
        // 간선 정보
        for (int i = 0; i < m; i++) {
            // A에서 B로 가는 비용은 1라고 설정
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        
        // 점화식에 따라 플로이드 워셜 알고리즘을 수행
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
        
        // 도달할 수 없는 경우, -1을 출력
        if (res >= INF) {
            System.out.println(-1);
        }
        // 도달할 수 있다면, 최단 거리를 출력
        else {
            System.out.println(res);
        }
        
        
	}

}
