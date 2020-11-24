import java.util.Scanner;
//따라서, 숌은 첫 번째 영화의 제목은 세상의 종말 666, 두 번째 영화의 제목은 세상의 종말 1666 이렇게 이름을 지을 것이다.
//일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 숫자) 와 같다.
//숌이 만든 N번째 영화의 제목에 들어간 숫자를 출력하는 프로그램을 작성하시오
public class No1436 {
/***
 * n은 10000보다 작은 수니까., 6이적어도 3개이상 들어가는 수를 찾아보자
 * 모든 수 리스트로 쪼개 검사하니까 메모리가 초과되었다.
 * valueOf.contains라는 좋은 메서드가 있었다..,
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int i = 666;
		while(true) {
			if(String.valueOf(i).contains("666")) { //valurOf의 contains
				count++;
			}
			if(count == n) {
				System.out.print(i);
				break;
			}
			i++;
		}
		sc.close();
	}

}
