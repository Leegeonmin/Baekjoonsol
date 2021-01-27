import java.util.*;
public class No2609{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int a =sc.nextInt();
	int b = sc.nextInt();
	int max,min;
	
	max = a > b ? a: b;
	min = a < b ? a: b;

	while(max % min !=0){
		int res= max%min;
		max = min;
		min = res;
	
	}//최대공약수 알고리즘
	System.out.println(min);
	System.out.println(a*b/min);
	}
}
