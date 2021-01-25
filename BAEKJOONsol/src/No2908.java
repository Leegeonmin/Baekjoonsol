import java.util.*;
public class No2908{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		String[] al = a.split("");
		String[] bl = b.split("");
		
		String newa = "";
		String newb = "";
		
		for(int i = 2; i >= 0; i--){
			newa += al[i];
			newb += bl[i];
		}
		
		System.out.print(Integer.parseInt(newa) > Integer.parseInt(newb) ? newa: newb);
		}
}