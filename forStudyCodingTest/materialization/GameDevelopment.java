package CodingTestWithJava.Greedy.materialization;

import java.util.Scanner;

public class GameDevelopment {
	
	 public static int n, m, x, y, direction;
	 // 방문한 위치를 저장하기 위한 맵을 생성하여 0으로 초기화
	 public static int[][] d = new int[50][50];
	 // 전체 맵 정보
	 public static int[][] arr = new int [50][50];

	 // 북, 동, 남, 서 방향 정의
	 public static int dx[] = {-1, 0, 1, 0};
	 public static int dy[] = {0, 1, 0, -1};
	 
	 // 0이 북쪽 북에서 -1 즉 왼쪽으로 돌면 서쪽이 되야하므로 -1일경우 3으로 지정해줘서 순회하게 만드는 것
	 public static void turnLeft() {
		 direction -= 1;
		 if (direction == -1) {
			 direction = 3; 
		 }
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력받기
        n = sc.nextInt();
        m = sc.nextInt();
        
        // 현재 캐릭터의 X 좌표, Y 좌표, 방향을 입력받기
        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();
        d[x][y] = 1; // 현재 좌표 방문 처리
        
        
        // 전체 맵 정보를 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int res = 1;
        int turnTime = 0;  // 회전이 4번되면 갈곳이 없다는 것. 그 부분의 체크를 위해 변수 생성
        while(true) {
        	turnLeft();
        	int nx = x + dx[direction];
        	int ny = y + dy[direction];
        	
        	if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
        		res += 1;
        		turnTime = 0;
        		d[nx][ny] = 1;
        		x = nx;
        		y = ny;
        		continue;
        	}
        	else {
        		turnTime += 1;
        	}
        	
        	if (turnTime == 4) {
        		nx = x - dx[direction];
        		ny = y - dy[direction];
        		turnTime = 0;
        		if (arr[nx][ny] == 0) {
        			x = nx;
        			y = ny;
        		}
        		else {
        			break;
        		}
        	//turnTime = 0;
        	}
        	
        }
        System.out.println(res);
        
        
        

	}

}
