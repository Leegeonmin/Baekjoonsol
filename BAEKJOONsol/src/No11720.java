import java.util.*;
public class No11720{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String str = sc.next();
		String[] list = str.split("");
		int sum = 0;
		for(int i = 0; i< list.length; i++){
			sum += Integer.parseInt(list[i]);		
		}
		System.out.print(sum);
	}
}