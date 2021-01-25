import java.util.*;
public class No8958{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++){
			
			String str = sc.next();
			String[] list = str.split("");
			int cal = 0;
			int[] cplist = new int[list.length];
			if(list[0].equals("O")){
				cplist[0] = 1;
			}else{
				cplist[0] = 0;
			}
			
			for(int n = 1; n < list.length; n++){
				if(list[n].equals("O")){
					cplist[n] = cplist[n-1] + 1;
				}else{
					cplist[n] = 0;
				}
			}
			
		
			for(int j = 0; j < cplist.length; j++){
				cal += cplist[j];
			}
			System.out.println(cal);
		}
	}
}