// �����¿� ����
// �Է� ���� ������ ������ ���� ��ġ�� �� ��ǥ ���
package CodingTestWithJava.Greedy.materialization;

import java.util.Scanner;

public class UpDownLeftRight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // N�� �Է¹ޱ�
        int n = sc.nextInt();
        sc.nextLine(); // ���� ����
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
        	// �׸��� �ȿ� ������, �̵� Ȯ��
        	if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
        		x = nx;
        		y = ny;
    		}	
        }
        // ��� ���
        x = x + 1;
        y = y + 1;
        System.out.println(x + " " + y);
	}

}
