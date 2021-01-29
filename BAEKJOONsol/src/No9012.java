import java.util.*;
public class No9012{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int p = sc.nextInt();
	for(int i= 0; i < p; i++){
		String str = sc.next();
		String[] spl = str.split("");
		int open = 0;
		int close = 0;
		
		for(int n = 0; n < spl.length; n++){
			if(spl[n].equals("(")){
				open++;
			}else{
				close++;
			}
			
			if(open < close){
				System.out.println("NO");
				break;
			}// 닫기가 더 많을수없음
			
			if(n == spl.length -1){//마지막에서 검사
				if(spl[n].equals("(")){
					System.out.println("NO");
				}else if(open!= close){
					System.out.println("NO");
				}else{
					System.out.println("YES");
				}
			}
		}
	}
}
}