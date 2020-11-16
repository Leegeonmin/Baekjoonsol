import java.util.Scanner;
import java.util.Arrays;
//양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 
//어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.\

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
		int cal() { // N은 약수의 곱을 이용해서 계산할 수 있다.
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
		for(int i = 0; i < count; i++) { // 약수들을 리스트에 저장
			measure[i] = sc.nextInt();
		}
		Arrays.sort(measure); //약수 sort

		calNumber A = new calNumber(count, measure);
		A.print();
		
		sc.close();
	}
	

}
