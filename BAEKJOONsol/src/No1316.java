import java.util.Scanner;
import java.util.Arrays;
//�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class No1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		for(int i = 0; i < num; i++) {  // �ܾ �Է¹��� �� 1���ھ� �ɰ��� parse�� ����
			String word = sc.next();    // test���� parse�� ���� ������� ���������� �ߺ��� �����ϰ�
			String[] parse = word.split("");
			String[] test = new String[parse.length];
			test[0] = parse[0];
			int testcount = 1;
			count++;
			for (int n = 1; n < parse.length; n++) {
				if(parse[n].equals(parse[n-1])) { //�ٷ� �� ���ڿ� ���� ���ڰ� ������ �׳� �Ѿ����
				}else { //�ٸ��ٸ� �׷� �˻縦 �� �ʿ䰡 �ִ�
					if(Arrays.stream(test).anyMatch(parse[n]::equals) ) { // �迭���� anymatch���� ã�� �������� ����ϴ� �޼���
						count--;
						break;
					}else {
						test[testcount++] = parse[n];
					}
					
				}
			}
		}
		System.out.print(count);
		sc.close();
	}

}
