import java.util.Scanner;

public class No1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] set = {64,32,16,8,4,2,1};
		int X = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < set.length; i++) { //문제를 푸는 방식은 두가지가 있다. 주어진 문제의 해결방식을 적용하거나, 내가 새로운 방식의 해결방식을 제시하거나
			if(set[i] == X) {				  //이 문제는 내가 새로 만든 해결방식으로 해결하였다.
				count++;					  //set리스트에 2의 제곱수들을 내림차순으로 저장
				break;						  //64부터 X와 비교하여 같으면 그 막대만 필요하므로 count = 1 로 끝남
			}else if(set[i] < X){			  //아니라면 X에서 X보다 작은 2의 제곱수를 빼고(막대를 남김) 다시 반복
				count++;					  
				X = X - set[i];
			}
		}
	
		
		
		System.out.print(count);
		sc.close();
	}

}
