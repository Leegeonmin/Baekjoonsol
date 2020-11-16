import java.util.Arrays;
import java.util.Scanner;
//구간 [A,B]가 Unlucky가 되기 위해선 구간에 속한 모든 정수가 Lucky Set에 없어야 한다.
//Lucky Set과 N이 주어질 때, N을 포함하는 Unlucky 구간의 개수를 구하는 프로그램을 작성하시오.
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
//					두가지로 나뉜다. N이 구간에 포함되거나 구간에 N보다 작은 정수만 있을경우와 구간이 N보다 큰 정수만 있을 경우
					
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
		unluckySet[count] = 0; // Lucky Set의 개수가 1개 일 경우를 대비해 0을 추가한다
		
		int val = sc.nextInt();
		calunlucky A = new calunlucky(count+1, unluckySet, val);
		A.cal(); A.print();
		sc.close();
		
	}

}
