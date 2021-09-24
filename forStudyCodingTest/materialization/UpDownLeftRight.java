// 상하좌우 문제
// 입력 받은 방향대로 움직인 이후 위치한 곳 좌표 출력
package CodingTestWithJava.Greedy.materialization;

import java.util.Scanner;

public class UpDownLeftRight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] moves = sc.nextLine().split(" ");
        
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moving = {'l', 'r', 'u', 'd'};
        
        int x = 0, y = 0;
       
        for(int i = 0; i < moves.length; i++) {
        	char move = moves[i].charAt(0);
        	int nx = 0, ny = 0;
        	for(int j = 0; j < 4; j++) {
        		if (move == moving[j]) {
        			nx = x + dx[j];
        			ny = y + dy[j];
        		}
        	}
        	// 네모판 안에 있으면, 이동 확정
        	if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
        		x = nx;
        		y = ny;
    		}	
        }
        // 결과 출력
        x = x + 1;
        y = y + 1;
        System.out.println(x + " " + y);
	}

}
