import java.util.Scanner;

public class No1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] set = {64,32,16,8,4,2,1};
		int X = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < set.length; i++) { //������ Ǫ�� ����� �ΰ����� �ִ�. �־��� ������ �ذ����� �����ϰų�, ���� ���ο� ����� �ذ����� �����ϰų�
			if(set[i] == X) {				  //�� ������ ���� ���� ���� �ذ������� �ذ��Ͽ���.
				count++;					  //set����Ʈ�� 2�� ���������� ������������ ����
				break;						  //64���� X�� ���Ͽ� ������ �� ���븸 �ʿ��ϹǷ� count = 1 �� ����
			}else if(set[i] < X){			  //�ƴ϶�� X���� X���� ���� 2�� �������� ����(���븦 ����) �ٽ� �ݺ�
				count++;					  
				X = X - set[i];
			}
		}
	
		
		
		System.out.print(count);
		sc.close();
	}

}
