import java.util.*;
public class No2164{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	int count = sc.nextInt();
	
	for(int i = count; i > 0; i--){
		list.add(i);
	}
	
	while(list.size() != 1){
		list.removeLast();
		int a = list.removeLast();
	
		list.addFirst(a);
		
		
	} // 알고리즘
	
	System.out.println(list.get(0));
	}
}

	