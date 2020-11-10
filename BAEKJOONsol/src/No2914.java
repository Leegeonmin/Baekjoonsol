import java.util.Scanner;
/***이때, 평균값은 항상 올림을 해서 정수로 만들어야 한다. 예를 들어, 창영이의 1집 앨범 "영창에서 영원히 영창피아노를 친다"에 
 * 총 38개 곡이 수록되어 있고, 이 앨범에 저작권이 있는 멜로디가 894개가 있다면, 평균값은 23.53이 되고 올림해서 24가 된다.

매니저 강산이는 얼마나 많은 사람에게 저작권료를 주어야 하는지 궁금해졌다. 강산이가 알고 있는 정보는 앨범에 수록되어 있는 곡의 개수와 위에서 구한 평균값이다. 
이때, 적어도 몇 곡이 저작권이 있는 멜로디인지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 앨범에 수록된 곡의 개수 A와 평균값 I가 주어진다. (1 ≤ A, I ≤ 100) ***/
public class No2914 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		int num;
		num = (a * (b-1)) + 1;
		System.out.print(num);
		
		sc.close();
	}
}
