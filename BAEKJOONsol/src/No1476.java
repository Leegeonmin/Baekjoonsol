import java.util.Scanner;
public class No1476 {
// (1 �� E �� 15, 1 �� S �� 28, 1 �� M �� 19)
//	���� ���, 15���� 15 15 15�� ��Ÿ�� �� �ִ�. ��
//	����, 1���� ������ 16���� �Ǹ� 16 16 16�� �ƴ϶� 1 16 16�� �ȴ�. ������ 1 �� E �� 15 �� ������ �Ѿ�� �����̴�.

//	E, S, M�� �־�����, 1���� �ر԰� ��� ���󿡼� 1 1 1�϶�,
//	�ر԰� ��� ���󿡼� E S M�� �츮�� �˰� �ִ� ������ �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	/***
	 *�������غ��� 1���� 1, 1, 1�̰� ��� ������ 1����� ����̱� ������,
	 *1�� ���ٺ��� E,S,M�� ������ �� �ִ�Ÿ�̹��� ���´�.
	 *�׷� 1�� �� Ƚ���� E,S,M�� �� �ϳ��� ���ϸ� ������ ���´� */
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
