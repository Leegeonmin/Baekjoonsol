import java.util.*;
public class No2577{
	public static void main(String[] args){
		Map<Integer, Integer> map =
		new HashMap<Integer, Integer>();
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		a = a * b * c;
		
		String str = Integer.toString(a);
		
		String[] list = str.split("");
		
		int[] count = new int[10];
		Arrays.fill(count, 0);
		
		for(int i = 0; i < list.length; i++){
			int chg = Integer.parseInt(list[i]);
			count[chg] += 1;
			
		}
		
		for(int i = 0; i < count.length; i++){
			System.out.println(count[i]);
		}
	}
}