import java.util.Scanner;
import java.util.Arrays;
//��� A�� N�� ��¥ ����� �Ƿ���, N�� A�� ����̰�, A�� 1�� N�� �ƴϾ�� �Ѵ�. 
//� �� N�� ��¥ ����� ��� �־��� ��, N�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.\

class calNumber{
	public
		int count;
		int[] measure;
		calNumber(int count, int[] list){
			this.count = count;
			measure = new int[this.count];  // deep copy
			for(int i = 0; i < count; i++) {
				measure[i] = list[i];
			}
		}
		int cal() { // N�� ����� ���� �̿��ؼ� ����� �� �ִ�.
			return measure[0] * measure[count - 1];
		}
		void print() {
			System.out.print(this.cal());
		}
		
}
public class No1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] measure = new int[count];
		for(int i = 0; i < count; i++) { // ������� ����Ʈ�� ����
			measure[i] = sc.nextInt();
		}
		Arrays.sort(measure); //��� sort

		calNumber A = new calNumber(count, measure);
		A.print();
		
		sc.close();
	}
	

}
