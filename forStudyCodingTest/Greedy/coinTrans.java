// 그리디
// 거스름돈 문제
// 가장 큰 금액을 먼저 거슬러 주면 된다

package CodingTestWithJava.Greedy;

public class coinTrans {

	public static void main(String[] args) {
			int n = 1260;
	     	int cnt = 0;
	        int[] coinTypes = {500, 100, 50, 10};
			
	        for (int i = 0; i < 4; i++) {
	            int coin = coinTypes[i];
	            cnt += n / coin;
	            n %= coin;
	        }

	        System.out.println(cnt);
	    }

	}

