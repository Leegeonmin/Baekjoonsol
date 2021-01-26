import java.util.*;
public class No1920{
			static String BinarySearch(int[] list, int key){
			int min = 0;
			int max = list.length -1;
			int mid = (min + max)/2;
			while(true){
				if(key > list[mid]){
					min = mid;
					mid = (min + max)/2;
					if(max == min +1){
						if(list[max] != key && list[min] != key){
					
						return "0";
					}else{
						return "1";
					}
				}
			}else if(key < list[mid]){
				max = mid;
				mid = (min + max)/2;
				if(max == min +1){
					if(list[max] != key && list[min] != key){
						return "0";
					}else{
						return "1";
					}
				}
			}else{
				return "1";
			}
		}
		}
	public static void main(String[] args){

		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int [] list = new int[count];
		
		for(int i = 0; i < count; i++){
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		
		int checkNum = sc.nextInt();
		int[] checkList = new int[checkNum];
		for(int i = 0; i < checkNum; i++){
			checkList[i] = sc.nextInt(); 
			System.out.println(BinarySearch(list, checkList[i]));
		}
		
	}
}

		
