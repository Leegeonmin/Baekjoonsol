import java.util.*;
public class No10250{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int testcaseNum = sc.nextInt();
	
	for(int i = 0; i < testcaseNum; i++){
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		
		int floor, roomn;
		roomn = n%w == 0?(n / w) : (n/w)+1;
		floor = n%w == 0? w:n % w;
		
		System.out.println
(roomn >= 10 ? floor+""+roomn :floor*10+""+roomn );
}}
}