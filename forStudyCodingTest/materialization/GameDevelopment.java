package CodingTestWithJava.Greedy.materialization;

import java.util.Scanner;

public class GameDevelopment {
	
	 public static int n, m, x, y, direction;
	 // �湮�� ��ġ�� �����ϱ� ���� ���� �����Ͽ� 0���� �ʱ�ȭ
	 public static int[][] d = new int[50][50];
	 // ��ü �� ����
	 public static int[][] arr = new int [50][50];

	 // ��, ��, ��, �� ���� ����
	 public static int dx[] = {-1, 0, 1, 0};
	 public static int dy[] = {0, 1, 0, -1};
	 
	 // 0�� ���� �Ͽ��� -1 �� �������� ���� ������ �Ǿ��ϹǷ� -1�ϰ�� 3���� �������༭ ��ȸ�ϰ� ����� ��
	 public static void turnLeft() {
		 direction -= 1;
		 if (direction == -1) {
			 direction = 3; 
		 }
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // N, M�� ������ �������� �����Ͽ� �Է¹ޱ�
        n = sc.nextInt();
        m = sc.nextInt();
        
        // ���� ĳ������ X ��ǥ, Y ��ǥ, ������ �Է¹ޱ�
        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();
        d[x][y] = 1; // ���� ��ǥ �湮 ó��
        
        
        // ��ü �� ������ �Է� �ޱ�
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int res = 1;
        int turnTime = 0;  // ȸ���� 4���Ǹ� ������ ���ٴ� ��. �� �κ��� üũ�� ���� ���� ����
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
