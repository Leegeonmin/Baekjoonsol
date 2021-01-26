import java.util.*;
public class No11654{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int num=0;
		try{
			num = Integer.parseInt(str);
		}catch(NumberFormatException e){
	System.out.print((int)str.charAt(0));
	System.exit(0);
		}
		System.out.print(num + 48);
		}
}