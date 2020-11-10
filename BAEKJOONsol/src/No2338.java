import java.util.Scanner;
import java.math.BigInteger;
public class No2338 {
//	두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램을 작성하시오.
//	첫째 줄에 A가, 둘째 줄에 B가 주어진다. 각각의 수는 10진수로 1,000자리를 넘지 않으며 양수와 음수가 모두 주어질 수 있다.
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			BigInteger A = sc.nextBigInteger();
			BigInteger B = sc.nextBigInteger();
			System.out.printf("%d\n%d\n%d", A.add(B), A.subtract(B), A.multiply(B)); //BigInteger function
			
			sc.close();
	}

}
