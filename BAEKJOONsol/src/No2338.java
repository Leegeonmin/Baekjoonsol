import java.util.Scanner;
import java.math.BigInteger;
public class No2338 {
//	�� �� A, B�� �Է¹޾�, A+B, A-B, A��B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	ù° �ٿ� A��, ��° �ٿ� B�� �־�����. ������ ���� 10������ 1,000�ڸ��� ���� ������ ����� ������ ��� �־��� �� �ִ�.
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			BigInteger A = sc.nextBigInteger();
			BigInteger B = sc.nextBigInteger();
			System.out.printf("%d\n%d\n%d", A.add(B), A.subtract(B), A.multiply(B)); //BigInteger function
			
			sc.close();
	}

}
