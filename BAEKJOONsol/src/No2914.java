import java.util.Scanner;
/***�̶�, ��հ��� �׻� �ø��� �ؼ� ������ ������ �Ѵ�. ���� ���, â������ 1�� �ٹ� "��â���� ������ ��â�ǾƳ븦 ģ��"�� 
 * �� 38�� ���� ���ϵǾ� �ְ�, �� �ٹ��� ���۱��� �ִ� ��ε� 894���� �ִٸ�, ��հ��� 23.53�� �ǰ� �ø��ؼ� 24�� �ȴ�.

�Ŵ��� �����̴� �󸶳� ���� ������� ���۱ǷḦ �־�� �ϴ��� �ñ�������. �����̰� �˰� �ִ� ������ �ٹ��� ���ϵǾ� �ִ� ���� ������ ������ ���� ��հ��̴�. 
�̶�, ��� �� ���� ���۱��� �ִ� ��ε����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ٹ��� ���ϵ� ���� ���� A�� ��հ� I�� �־�����. (1 �� A, I �� 100) ***/
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