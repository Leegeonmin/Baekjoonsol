import java.util.Scanner;
public class No2475 {

		/***��ǻ�͸� �����ϴ� ȸ���� KOI ���ڿ����� �����ϴ� ��ǻ�͸��� 6�ڸ��� ������ȣ�� �ű��. 
		������ȣ�� ó�� 5�ڸ����� 00000���� 99999������ �� �� �ϳ��� �־����� 6��° �ڸ����� �������� ����. 
		�������� ������ȣ�� ó�� 5�ڸ��� ���� 5���� ���ڸ� ���� ������ ���� ���� 10���� ���� �������̴�.

		���� ��� ������ȣ�� ó�� 5�ڸ��� ���ڵ��� 04256�̸�, 
		�� ���ڸ� ������ ������ �� 0+16+4+25+36 = 81 �� 10���� ���� �������� 1�� �������̴�. ***/
//		ù° �ٿ� ������ȣ�� ó�� 5�ڸ��� ���ڵ��� ��ĭ�� ���̿� �ΰ� �ϳ��� �־�����.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		double a,b,c,d,e; //  only double can do math.pow
		a = Math.pow(sc.nextDouble(), 2);
		b = Math.pow(sc.nextDouble(), 2);
		c = Math.pow(sc.nextDouble(), 2);
		d = Math.pow(sc.nextDouble(), 2);
		e = Math.pow(sc.nextDouble(), 2);
		int result;
		result = (int)(a+b+c+d+e)%10; 
		System.out.print(result);
		
		sc.close();
		
	}
	
}
