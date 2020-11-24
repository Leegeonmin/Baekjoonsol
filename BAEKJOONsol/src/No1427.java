import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class No1427 {
//	 자리수를 내림차순으로 정렬한 수를 출력한다.
	
	/***
	 * string으로 읽으면 메모리를 최소화할 수 있다.
	 * Arrays와 Collections.reverseOrder()을 이용하여 내림차순으로 list에 저장한다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		String[] list = num.split("");
		Arrays.sort(list, Collections.reverseOrder());
		for(int i = 0; i < list.length; i++) {System.out.print(list[i]);}
		
		sc.close();
	}
}