import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class No1427 {
//	 �ڸ����� ������������ ������ ���� ����Ѵ�.
	
	/***
	 * string���� ������ �޸𸮸� �ּ�ȭ�� �� �ִ�.
	 * Arrays�� Collections.reverseOrder()�� �̿��Ͽ� ������������ list�� �����Ѵ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		String[] list = num.split("");
		Arrays.sort(list, Collections.reverseOrder());
		for(int i = 0; i < list.length; i++) {System.out.print(list[i]);}
		
		sc.close();
	}
}