import java.util.Scanner;
/***ü���� �� 16���� �ǽ��� ����ϸ�, ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8���� �����Ǿ� �ִ�.
�����̰� �߰��� ��� �ǽ��� ������ �־����� ��, �� ���� ���ϰų� ���� �ùٸ� ��Ʈ�� �Ǵ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.***/

public class No3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int set[] = {1, 1, 2, 2, 2, 8}; // set full chess numset set[]
		String in = sc.nextLine();
		String inl[] = in.split(" "); // split input to String 
		for(int i = 0; i < 6; i++) {
			System.out.print(set[i] - Integer.parseInt(inl[i]) + " ");
		}
		
		sc.close();
	}
}
