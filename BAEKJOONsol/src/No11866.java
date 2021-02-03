import java.util.*;
public class No11866{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++){
			que.add(i+1);
		}
		
		while(que.size() > 0){
			for(int i = 0; i< k;i++){
				if(i == k-1){
					int a = que.poll();
					list.add(a);
				}else{
					int a = que.poll();
					que.add(a);
				}
			}
		}
	
		
		System.out.print("<");
		for(int i = 0; i < list.size(); i++){
			if(i == list.size()-1){
				System.out.print(list.get(i)+">");
				break;
			}
		
			System.out.print(list.get(i)+ ", ");
		}
		
	}
}