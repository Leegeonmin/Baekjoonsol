import java.util.Arrays;
import java.util.Scanner;
//���� [A,B]�� Unlucky�� �Ǳ� ���ؼ� ������ ���� ��� ������ Lucky Set�� ����� �Ѵ�.
//Lucky Set�� N�� �־��� ��, N�� �����ϴ� Unlucky ������ ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
class calunlucky{
	int count;
	int[] Set;
	int val;
	int sub;
	public
		calunlucky(int count, int[] unluckySet, int val) {
			this.count = count;
			Set = new int[count];
			for(int i = 0; i < count; i++) {
				Set[i] = unluckySet[i];
			}
			this.val = val;
			Arrays.sort(Set);
	}
		void cal() {
			for(int i = 0; i < count - 1; i++) {
				if((Set[i] < val) && (Set[i+1] > val)) { 
					sub = (val - Set[i] - 1) * (Set[i+1] - val) + (Set[i+1] - val - 1);
//					�ΰ����� ������. N�� ������ ���Եǰų� ������ N���� ���� ������ �������� ������ N���� ū ������ ���� ���
					
					break;
				}
			}
		}
		void print() {
			System.out.println(sub);
		}
}
public class No1059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] unluckySet = new int[count + 1];
		for(int i = 0; i < count; i++) {
			unluckySet[i] = sc.nextInt();
		}
		unluckySet[count] = 0; // Lucky Set�� ������ 1�� �� ��츦 ����� 0�� �߰��Ѵ�
		
		int val = sc.nextInt();
		calunlucky A = new calunlucky(count+1, unluckySet, val);
		A.cal(); A.print();
		sc.close();
		
	}

}
