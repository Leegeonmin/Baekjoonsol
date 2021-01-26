import java.util.*;
public class No1259{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.next();
			String strcopy = "";
			if(str.equals("0")){
				break;
			}
			
			 for(int i = str.length()-1; i >= 0; i--){
			 
			 	strcopy += str.charAt(i);
			 }
			 
			 if(str.equals(strcopy)){
			 	System.out.println("yes");
			 }else{
			 	System.out.println("no");
				}
				
			
		}
	}
}