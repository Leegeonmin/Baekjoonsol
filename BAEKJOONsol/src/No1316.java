import java.util.Scanner;
import java.util.Arrays;
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
public class No1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		for(int i = 0; i < num; i++) {  // 단어를 입력받은 후 1글자씩 쪼개서 parse에 저장
			String word = sc.next();    // test에는 parse의 값을 순서대로 저장하지만 중복은 무시하고
			String[] parse = word.split("");
			String[] test = new String[parse.length];
			test[0] = parse[0];
			int testcount = 1;
			count++;
			for (int n = 1; n < parse.length; n++) {
				if(parse[n].equals(parse[n-1])) { //바로 앞 문자와 현재 문자가 같으면 그냥 넘어가지만
				}else { //다르다면 그룹 검사를 할 필요가 있다
					if(Arrays.stream(test).anyMatch(parse[n]::equals) ) { // 배열에서 anymatch값을 찾고 진리값을 출력하는 메서드
						count--;
						break;
					}else {
						test[testcount++] = parse[n];
					}
					
				}
			}
		}
		System.out.print(count);
		sc.close();
	}

}
