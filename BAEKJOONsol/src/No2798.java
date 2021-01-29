import java.util.*;
public class No2798{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	
	int[] set = new int[n];
	for(int i = 0; i < n; i++){
		set[i] =sc.nextInt();
	}
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	for(int i = 0; i < n-2; i++){
		for(int w = 1; w < n-1; w++){
			if(w>i){
		
				for(int k = 2; k < n ; k++){
					if((k > w) && (k>i) && (set[i] + set[w]+set[k] <= m)){
					list.add(set[i]+set[w]+set[k]);
				}
			}
			}
		}
	}
	Collections.sort(list);
	System.out.print(list.get(list.size()-1));
	
}
}