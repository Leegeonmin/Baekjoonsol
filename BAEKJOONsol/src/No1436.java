import java.util.Scanner;
//����, ���� ù ��° ��ȭ�� ������ ������ ���� 666, �� ��° ��ȭ�� ������ ������ ���� 1666 �̷��� �̸��� ���� ���̴�.
//�Ϲ�ȭ�ؼ� �����ϸ�, N��° ��ȭ�� ������ ������ ���� (N��°�� ���� ������ ����) �� ����.
//���� ���� N��° ��ȭ�� ���� �� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
public class No1436 {
/***
 * n�� 10000���� ���� ���ϱ�., 6����� 3���̻� ���� ���� ã�ƺ���
 * ��� �� ����Ʈ�� �ɰ� �˻��ϴϱ� �޸𸮰� �ʰ��Ǿ���.
 * valueOf.contains��� ���� �޼��尡 �־���..,
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int i = 666;
		while(true) {
			if(String.valueOf(i).contains("666")) { //valurOf�� contains
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
