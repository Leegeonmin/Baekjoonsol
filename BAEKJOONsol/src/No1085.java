import java.util.*;
public class No1085{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		w = w - x;
		h = h - y;
		
		x = Math.min(x, y);
		w = Math.min(w, h);
		System.out.print(Math.min(x, w));
	}
}