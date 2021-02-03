import java.util.*;
public class No11650{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	ArrayList<N> list = new ArrayList<N>();
	for(int i = 0; i < num; i++){
		int x = sc.nextInt();
		int y = sc.nextInt();
		N a= new N(x, y);
		list.add(a);
	}
	Nsort nsort = new Nsort();
	Collections.sort(list, nsort);
	
	for(int i =0; i < num; i++){
		System.out.println(list.get(i).x +" "+ list.get(i).y);
	}
	}
}

class N{
	int x;
	int y;
	N(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}

class Nsort implements Comparator<N>{
	public int compare(N a, N b){
		if(a.x > b.x){
			return 1;
		}else if(a.x < b.x){
			return -1;
		}else{
			if(a.y > b.y){
				return 1;
			}else{
				return -1;
			}
		}
	}
}
