import java.util.*;
public class No2562{
	public static void main(String[] args){
		Map<Integer, Integer> map =
		new HashMap<Integer, Integer>();
		
		Scanner sc = new Scanner(System.in);
		int count=1;
		while(sc.hasNextInt()){
			int a = sc.nextInt();
			map.put(a, count++);
			if(!sc.hasNextInt()){
				break;
			}
			
		}
		
		int Key = 0;
		TreeMap<Integer, Integer> tm =
		new TreeMap<Integer, Integer>(map);
		Iterator<Integer> it =
		tm.keySet().iterator();
		while(it.hasNext()){
			int a = it.next();
			if(!it.hasNext()){
				Key = a;
			}
		}
		
		System.out.println(Key);
		System.out.print(map.get(Key));
	}
}