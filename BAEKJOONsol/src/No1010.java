import java.util.Scanner;
/***재원이는 서쪽의 사이트와 동쪽의 사이트를 다리로 연결하려고 한다. (이때 한 사이트에는 최대 한 개의 다리만 연결될 수 있다.) 
 * 재원이는 다리를 최대한 많이 지으려고 하기 때문에 서쪽의 사이트 개수만큼 (N개) 다리를 지으려고 한다. 
 * 다리끼리는 서로 겹쳐질 수 없다고 할 때 다리를 지을 수 있는 경우의 수를 구하는 프로그램을 작성하라. ***/


public class No1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 0; i < count; i++) {
			int m,n;
			long result = 1;
			n = sc.nextInt();
			m = sc.nextInt(); 
			//결국 mCn를 구하는 것이 문제
			int C = (m-n)>n ? n:m-n;  // mCn = mCm-n 이므로 n과 m-n 중 작은 것을 사용하는 것이 속도를 빠르게 할 수 있다.
			long num = 1; // 분자
			long den = 1; // 분모
			for(int j = 0; j < C; j++) { // 원래는 순서대로 result에 넣으려고 했으나 그럼 나머지 부분이 포함이 안되어서
				num *= m-j;				 // 한번에 계산 후 result에서 나눴다
				den *= C-j;
			}
			result = num / den;
			System.out.println(result);
		}
	}
}
