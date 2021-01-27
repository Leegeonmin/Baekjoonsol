import java.util.*;
public class No1978{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int testcaseNum = sc.nextInt();
	int count = 0;
	
	for(int i = 0; i < testcaseNum; i++){
		int key = sc.nextInt();
		if(key == 1){
			count--;
		}
		
		int sqrtkey = (int)Math.sqrt(key);
		count++;
		for(int n = 2; n<= sqrtkey; n++){
			if(key % n == 0){
				count--;
				break;
			}
		}
		
	}
	System.out.println(count);

		
	}
}

		
