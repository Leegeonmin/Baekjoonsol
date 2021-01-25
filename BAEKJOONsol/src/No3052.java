import java.util.*;
public class No3052{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++){
			int n = sc.nextInt();
			n = n % 42;
			if(!list.contains(n)){
				list.add(n);
			}
		}
		
		System.out.print(list.size());
		
	}
}