import java.util.Scanner;
/***����̴� �ڽ��� �˰��ִ� �������� ���� ��Ȯ�ϴٰ� �����Ѵ�. �� �Ź� ��翡 �Ƿ��ִ� �������� ���� �� �� ��ŭ �߸��Ǿ��ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� 1m2�� ����� �� L (1 �� L �� 10)�� ��Ƽ�� ���ȴ� ���� ���� P (1 �� P �� 1000)�� �־�����.

��° �ٿ��� �� ��翡 �Ƿ��ִ� �������� ���� �־�����. 106���� ���� ���� ���� 5���� �־�����. ***/
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
		
		a = sc.nextLine();		// string���� �޾Ƽ� �ɰ��� integer�� �ٲ㼭 ���
		nl2 = a.split(" ");
		for(int i = 0; i < nl2.length; i++) {
			System.out.print(Integer.parseInt(nl2[i]) - num +  " ");
		}
		
		sc.close();
	}

}
