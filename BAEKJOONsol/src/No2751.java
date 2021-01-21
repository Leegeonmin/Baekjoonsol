import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

public class No2751 {
//	N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] reg = new int[1000000];
		int n = 0;
		for(int i = 0; i < num; i++) {
			int a = sc.nextInt();
			if(IntStream.of(reg).anyMatch(x -> x == a )) {
			}else {
				reg[n] = a;
				n++;
			}
		}
		
		for(int i = n - 1; 0 <= i; i--) {
			System.out.println(reg[i]);
		}
	}

}
