import java.util.Scanner;
/***����̴� ������ ����Ʈ�� ������ ����Ʈ�� �ٸ��� �����Ϸ��� �Ѵ�. (�̶� �� ����Ʈ���� �ִ� �� ���� �ٸ��� ����� �� �ִ�.) 
 * ����̴� �ٸ��� �ִ��� ���� �������� �ϱ� ������ ������ ����Ʈ ������ŭ (N��) �ٸ��� �������� �Ѵ�. 
 * �ٸ������� ���� ������ �� ���ٰ� �� �� �ٸ��� ���� �� �ִ� ����� ���� ���ϴ� ���α׷��� �ۼ��϶�. ***/


public class No1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 0; i < count; i++) {
			int m,n;
			long result = 1;
			n = sc.nextInt();
			m = sc.nextInt(); 
			//�ᱹ mCn�� ���ϴ� ���� ����
			int C = (m-n)>n ? n:m-n;  // mCn = mCm-n �̹Ƿ� n�� m-n �� ���� ���� ����ϴ� ���� �ӵ��� ������ �� �� �ִ�.
			long num = 1; // ����
			long den = 1; // �и�
			for(int j = 0; j < C; j++) { // ������ ������� result�� �������� ������ �׷� ������ �κ��� ������ �ȵǾ
				num *= m-j;				 // �ѹ��� ��� �� result���� ������
				den *= C-j;
			}
			result = num / den;
			System.out.println(result);
		}
	}
}
