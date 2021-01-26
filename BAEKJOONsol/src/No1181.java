import java.util.*;
public class No1181{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		ArrayList<String> noolist = new ArrayList<String>();
		
		int count = sc.nextInt();
		for(int i = 0; i < count; i++){
			list.add(sc.next());
		}
		
		Comparator<String> c = new Comparator<String>(){
			public int compare(String s1, String s2){
				return Integer.compare(s1.length(), s2.length());
			}
		};
		
		Collections.sort(list, c);
		//길이 정렬
		
		for(int i = 0; i < list.size(); i++){
			if(!noolist.contains(list.get(i))){
				noolist.add(list.get(i));
			}
		}
		// 중복 제거
		
		String[] array =  noolist.toArray(new String[noolist.size()]);
		
		ArrayList<Integer> setcount = new ArrayList<Integer>();
		
		setcount.add(0);
		
		for(int i = 1; i < array.length; i++){
			if(array[i-1].length() != array[i].length()){
				setcount.add(i);
			}
		}
		
		
		for(int i = 0; i < setcount.size(); i++){
			
			if(i != setcount.size() -1){
				if(setcount.get(i+1) - setcount.get(i) != 1){// 같은 길이가 없으면 무시
			
					Arrays.sort(array, 	setcount.get(i), setcount.get(i) + 	setcount.get(i+1) - setcount.get(i));
					}
			}else{
				Arrays.sort(array, setcount.get(i), array.length);
			}
		}
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		// 같은 길이 단어 부분 정렬
	}
}