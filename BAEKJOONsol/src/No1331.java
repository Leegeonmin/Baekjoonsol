import java.util.ArrayList;
import java.util.Scanner;

public class No1331 {
//	 6×6 체스판 위에서 또 다른 나이트 투어의 경로를 찾으려고 한다. 
//	 체스판의 한 칸은 A~F 중의 알파벳 하나와 1~6 중의 숫자 하나로 나타낼 수 있다. 영식이의 나이트 투어 경로가 주어질 때, 
//	 이것이 올바른 것이면 Valid, 올바르지 않으면 Invalid를 출력하는 프로그램을 작성하시오.
	

/*** 처음으로 입력받은 위치를 firstpoint(마지막값과 비교를 위해), spl1에 숫자로 변환하여 저장한다.
 * 방문한 위치는 재방문이 안되는 걸 설정하기 위해 ArrayList에 add한다.
 * for문에서는 다음 입력 위치부터 재방문했는데 검사(Arrays.contains)하고
 * spl2에 다음 입력을 숫자로 변환하여 저장한다. 
 * 알고리즘은 이전위치와 현재위치의 x,y값 차이의 절대값 합이 3이면서 한쪽만 3이 아니면(x=3,y=0) 이동가능하다고판단하고
 * spl2의 값을 spl1로 바꾸어주고 다시 for문을 들어간다.
 * 마지막값은 firstpoint와 비교하여 방문가능한지 확인하게한다.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 1;
		String first = sc.next();
		ArrayList<String> a = new ArrayList<String>();
		a.add(first);
		String[] spl1 = first.split("");
		switch(spl1[0]){
		case "A":
			spl1[0] = "1";
			break;
		case "B":
			spl1[0] = "2";
			break;
		case "C":
			spl1[0] = "3";
			break;
		case "D":
			spl1[0] = "4";
			break;
		case "E":
			spl1[0] = "5";
			break;
		case "F":
			spl1[0] = "6";
			break;
		}
		String[] firstpoint = new String[2];
		firstpoint[0] = spl1[0];
		firstpoint[1] = spl1[1];
		for(int i = 0; i < 35; i++) {
			String second = sc.next();
			if(a.contains(second)) {
				result = 0;
				break;
			}else {
				a.add(second);
			}
			String[] spl2 = second.split("");
			switch(spl2[0]){
			case "A":
				spl2[0] = "1";
				break;
			case "B":
				spl2[0] = "2";
				break;
			case "C":
				spl2[0] = "3";
				break;
			case "D":
				spl2[0] = "4";
				break;
			case "E":
				spl2[0] = "5";
				break;
			case "F":
				spl2[0] = "6";
				break;
			}

			if( (Math.abs(Integer.parseInt(spl1[0]) - Integer.parseInt(spl2[0])) +
					Math.abs(Integer.parseInt(spl1[1]) - Integer.parseInt(spl2[1])) == 3) &&
					(Math.abs(Integer.parseInt(spl1[0]) - Integer.parseInt(spl2[0])) != 3) &&
					(Math.abs(Integer.parseInt(spl1[0]) - Integer.parseInt(spl2[0])) != 0)) {
				spl1[0] = spl2[0]; spl1[1] = spl2[1];
				if(i == 34) {
					if( (Math.abs(Integer.parseInt(spl2[0]) - Integer.parseInt(firstpoint[0])) +
							Math.abs(Integer.parseInt(spl2[1]) - Integer.parseInt(firstpoint[1])) == 3) &&
							(Math.abs(Integer.parseInt(spl2[0]) - Integer.parseInt(firstpoint[0])) != 3) &&
							(Math.abs(Integer.parseInt(spl2[0]) - Integer.parseInt(firstpoint[0])) != 0)) {
				}else {
					result = 0;
					break;
				}
					}
			}else {
				result = 0;
				break;
			}
		}
		
		if(result == 1) {
			System.out.print("Valid");
		}else {
			System.out.print("Invalid");
		}
	

	}
}
