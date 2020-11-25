import java.util.Scanner;
public class No1476 {
// (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
//	예를 들어, 15년은 15 15 15로 나타낼 수 있다. 하
//	지만, 1년이 지나서 16년이 되면 16 16 16이 아니라 1 16 16이 된다. 이유는 1 ≤ E ≤ 15 라서 범위를 넘어가기 때문이다.

//	E, S, M이 주어졌고, 1년이 준규가 사는 나라에서 1 1 1일때,
//	준규가 사는 나라에서 E S M이 우리가 알고 있는 연도로 몇 년인지 구하는 프로그램을 작성하시오.
	
	/***
	 *생각을해보니 1년이 1, 1, 1이고 모든 연도는 1년부터 출발이기 때문에,
	 *1을 빼다보면 E,S,M이 같아질 수 있는타이밍이 나온다.
	 *그럼 1을 뺀 횟수와 E,S,M값 중 하나를 더하면 연도가 나온다 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int E,S,M;
		E = sc.nextInt();
		S = sc.nextInt();
		M = sc.nextInt();
		
		int count = 0;
		
		while(!(E == M && M == S && E == S)) {
			if(E == 1) {
				E = 16;
			}
			if(S == 1) {
				S = 29;
			}
			if(M == 1) {
				M = 20;
			}
			count++;
			E--;S--;M--;
			
		}
		System.out.print(count + E);
		sc.close();
	}

}
