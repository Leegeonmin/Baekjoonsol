import java.util.Arrays;
import java.util.Scanner;

public class No1157{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		 int[] list = new int[26];
		
		 Arrays.fill(list, 0);
        String word = sc.next();
		 word = word.toUpperCase();
		 for(int i=0; i < word.length();i++){
		 	int key = ((int)word.charAt(i)- 65);
		 	list[key]++;
		 }
		 // count
		 int[] cplist = list.clone();
		 Arrays.sort(cplist);
		 
		 if(cplist[24] == cplist[25]){
		 	System.out.println("?");
		 }else{
		 	int max = cplist[25];
			for(int i = 0; i < 26; i++){
				if(max == list[i]){
				
					System.out.println((char)(i+65));
					break;
				}
			}
		 
		 }
		 
		 
}
}
		 