import java.util.*;
public class No2675{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int TestN = sc.nextInt();
		for(int i = 0; i < TestN; i++){
			int count = sc.nextInt();
			String str = sc.next();
			String[] list = str.split("");
			
			for(int n = 0; n < list.length; n++){
				for(int j = 0; j < count; j++){
					System.out.print(list[n]);
				}
			}
			System.out.println();
		}
	}
}