import java.util.Scanner;
/***상근이는 자신이 알고있는 참가자의 수가 정확하다고 생각한다. 각 신문 기사에 실려있는 참가자의 수가 몇 명 만큼 잘못되어있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 1m2당 사람의 수 L (1 ≤ L ≤ 10)과 파티가 열렸던 곳의 넓이 P (1 ≤ P ≤ 1000)가 주어진다.

둘째 줄에는 각 기사에 실려있는 참가자의 수가 주어진다. 106보다 작은 양의 정수 5개가 주어진다. ***/
public class No2845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String lp;
		int num = 1;
		String a;
		String nl1[];
		String nl2[];
		
		lp = sc.nextLine();
		nl1 = lp.split(" ");
		for(int i = 0; i < nl1.length; i++) {
			num *= Integer.parseInt(nl1[i]);
		}
		
		a = sc.nextLine();		// string으로 받아서 쪼개고 integer로 바꿔서 계산
		nl2 = a.split(" ");
		for(int i = 0; i < nl2.length; i++) {
			System.out.print(Integer.parseInt(nl2[i]) - num +  " ");
		}
		
		sc.close();
	}

}
