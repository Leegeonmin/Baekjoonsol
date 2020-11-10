import java.util.Scanner; // use Scanner I/O
import java.math.BigInteger;
public class No1271 {
/***���� �ֹ��� ������ ������ �ּҷ� �ٲٴµ� ���������� ����ȫ ������ �� ���� �߰��ؼ� �ֹ��� �������� �� ���� �����ڰ� ������.
�� ����� �� ���ַ� �˷����� ���ֿ� �ִ� ���� ����ü���� �ڽŵ鿡�� ���� �й��� �޶�� ���� �޷����� �����ߴ�.
�����佺 �߾� ���� ������ ��å��, ����� ���� ����ü�� �����ϴ١���� ��Ģ�� �԰��ؼ� ���� �Ȱ��� �й��ϰ��� �Ѵ�.
�� ����ü���� �󸶾� ���� �� �� �ִ°�?
��, ����ü�鿡�� �����ϰ� �й��� �� ���� ���� ���ΰ�? 
	
	ù° �ٿ��� �ֹ��� ������ ���� �� n�� ���� ������ �� ����ü�� �� m�� �־�����. 
	(1 <= m <= n <= 10^1000, m,n�� 10���� ����) ***/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger m = sc.nextBigInteger();  // m,n <= 10^1000 -> use BigInteger
		BigInteger n = sc.nextBigInteger();
		BigInteger pay, rmpay;
		
		pay   = m.divide(n);
		rmpay = m.mod(n);

		System.out.printf("%d\n%d", pay, rmpay);
		
		sc.close();
	}

}
