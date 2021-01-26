import java.util.*;
public class No10809{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[26];
		Arrays.fill(list, -1);
		
		String word = sc.next();
		String[] wl = word.split("");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(String a: wl){
			set.add(a);
		}
		int[] count = new int[set.size()];
		
		List<String> setlist = new ArrayList<String>(set);
		String[] setarray = setlist.toArray(new String[setlist.size()]);
		
		for(int i = 0; i < set.size(); i++){
			count[i] = word.indexOf(setarray[i]);
			list[setarray[i].charAt(0)-97] = count[i];
		}
		
		for(int k  = 0; k < list.length; k++){
			System.out.print(list[k] + " ");
		}
		}
}