import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

//길이가 짧은 것부터
//길이가 같으면 사전 순으로


public class No1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String[] Name = new String[num];
		String[] Name2 = new String[num];
		for(int i = 0; i < num; i++) {
			Name[i] = sc.next();
			for(int n = 0; n < i; n++) {
				if(Name[n].equals(Name[i])) {
					System.out.print("SIBAL");
					System.arraycopy(Name, 0, Name2, 0, i);
				}
			}
		}
		System.out.print(Name2.length);
		ArrayList<Num> list = new ArrayList<Num>();

		for(int i = 0; i < num; i++) {
			Num A = new Num(Name[i].length(), i);
			list.add(A);
		}
		Collections.sort(list);
		for(int i = 0; i < num; i++) {
		}
		
		String[] Name1 = new String[num];
		for(int i = 0; i < num; i++) {
			Name1[i] = Name[list.get(i).num];
		}
		
		for(int i = 0; i < num - 1; i++) {
			if(Name1[i].length() == Name1[i+1].length()) {
				String tmp;
				if(Name1[i].compareTo(Name1[i+1]) >= 1) {

					tmp = Name1[i];
					Name1[i] = Name1[i+1];
					Name1[i+1] = tmp;
				}
				
			}
		}
		for(int i = 0; i < num; i++) {
			System.out.println(Name1[i]);
		}
		

}

public static class Num implements Comparable<Num>{
	public
	int length;
	int num;
	Num(int a, int b){
		length = a;
		num = b;
	}
	public int compareTo(Num A) {
		if(length > A.length) {
			return 1;
		}else if(length < A.length) {
			return -1;
		}else {
			return 0;
		}
	}
}
}
