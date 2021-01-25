import java.util.*;
public class No2920{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] in = new int[8];
		int[] asc = {1,2,3,4,5,6,7,8};
		int[] des = {8,7,6,5,4,3,2,1};
		for(int i = 0; i < 8; i++){
			in[i] = sc.nextInt();
			
		}
		int trg = 0;
		if(in[0] == 1){
			for(int i = 0; i<8; i++){
				if(in[i] != asc[i]){
					System.out.print("mixed");
					System.exit(0);
				}
			}
				System.out.print("ascending");
			
			
		}else if(in[0] == 8){
			for(int i = 0; i < 8; i++){
				if(in[i] != des[i]){
					System.out.print("mixed");
					System.exit(0);
				}
			}
			System.out.print("descending");
		}else{
			System.out.print("mixed");
		}
		
	}
}