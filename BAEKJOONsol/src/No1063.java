import java.util.Scanner;
//킹과 돌의 마지막 위치를 구하는 프로그램을 작성하시오.
public class No1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String king = sc.next();
		String stone = sc.next();
		int count = sc.nextInt();
		Chess A = new Chess(king, stone);
		for(int i = 0; i < count; i++) {
			A.Move(sc.next());
		}
		A.print();
		sc.close();
	}

}

class Chess{
	public
	String King, Stone;
	int[] Kingint = new int[2]; // 체스말의 좌표 ex) A1을 각각 나누어 배열에 저장
	int[] Stoneint = new int[2];
	Chess(String a, String b){
		this.King = a;
		this.Stone = b;
		StringtoInt();
	}
	void Move(String pos) { // StringtoInt로 배열에 저장한 값들을 이동시키는 알고리즘
		switch(pos) {
		case "R":
			if(Kingint[0] + 1 == Stoneint[0] && Kingint[1] == Stoneint[1]) { //king이 이동할 위치에 stone이 있는지 확인
				if(Stoneint[0] + 1 <= 8) { //Stone이 해당 위치로 이동이 가능하다면
					Kingint[0]++;
					Stoneint[0]++;
				}
			}else { // 없으면 
				if(Kingint[0] + 1 <= 8) { // king이 해당 위치를 갈 수 있다면
					Kingint[0]++;
				}
			}
			break;
		case "L":
			if(Kingint[0] - 1 == Stoneint[0] && Kingint[1] == Stoneint[1]) {
				if(Stoneint[0] - 1 >= 1) {
					Kingint[0]--;
					Stoneint[0]--;
				}
			}else {
				if(Kingint[0] - 1 >= 1) {
					Kingint[0]--;
				}
			}
			break;
		case "B":
			if(Kingint[1] - 1 == Stoneint[1] && Kingint[0] == Stoneint[0]) {
				if(Stoneint[1] - 1 >= 1) {
					Kingint[1]--;
					Stoneint[1]--;
				}
			}else {
				if(Kingint[1] - 1 >= 1) {
					Kingint[1]--;
				}
			}
			break;
		case "T":
			if(Kingint[1] + 1 == Stoneint[1] && Kingint[0] == Stoneint[0]) {
				if(Stoneint[1] + 1 <= 8) {
					Kingint[1]++;
					Stoneint[1]++;
				}
			}else {
				if(Kingint[1] + 1 <= 8) {
					Kingint[1]++;
				}
			}
			break;
		case "RT":
			if(Kingint[1] + 1 == Stoneint[1] && Kingint[0] + 1 == Stoneint[0]) {
				if(Stoneint[1] + 1 <= 8 && Stoneint[0] + 1 <= 8) {
					Kingint[0]++; Kingint[1]++;
					Stoneint[0]++; Stoneint[1]++;
				}
			}else {
				if(Kingint[0] + 1 <= 8 && Kingint[1] + 1 <= 8) {
					Kingint[0]++; Kingint[1]++;
				}
			}
			break;
		case "LT":
			if(Kingint[0] - 1 == Stoneint[0] && Kingint[1] + 1 == Stoneint[1]) {
				if(Stoneint[0] - 1 >= 1 && Stoneint[1] + 1 <= 8) {
					Kingint[0]--; Kingint[1]++;
					Stoneint[0]--; Stoneint[1]++;
				}
			}else {
				if(Kingint[0] - 1 >= 1 && Kingint[1] + 1 <= 8) {
					Kingint[0]--; Kingint[1]++;
				}
			}
			break;
		case "RB":
			if(Kingint[0] + 1 == Stoneint[0] && Kingint[1] - 1 == Stoneint[1]) {
				if(Stoneint[0] + 1 <= 8 && Stoneint[1] - 1 >= 1) {
					Kingint[0]++; Kingint[1]--;
					Stoneint[0]++; Stoneint[1]--;
				}
			}else {
				if(Kingint[0] + 1 <= 8 && Kingint[1] - 1 >= 1) {
					Kingint[0]++; Kingint[1]--;
				}
			}
			break;
		case "LB":
			if(Kingint[0] - 1 == Stoneint[0] && Kingint[1] - 1 == Stoneint[1]) {
				if(Stoneint[0] - 1 >= 1 && Stoneint[1] - 1 >= 1) {
					Kingint[0]--; Kingint[1]--;
					Stoneint[0]--; Stoneint[1]--;
				}
			}else {
				if(Kingint[0] - 1 >= 1 && Kingint[1] - 1 >= 1) {
					Kingint[0]--; Kingint[1]--;
				}
			}
			break;
		}

	}
	void StringtoInt() { //입력받은 String을 Int로 변환

		String[] a = King.split("");
		String[] b = Stone.split("");
		Kingint[1] = Integer.parseInt(a[1]);
		Stoneint[1] = Integer.parseInt(b[1]);
		
		switch(a[0]) {
		case "A":
			Kingint[0] = 1;
			break;
		case "B":
			Kingint[0] = 2;
			break;
		case "C":
			Kingint[0] = 3;
			break;
		case "D":
			Kingint[0] = 4;
			break;
		case "E":
			Kingint[0] = 5;
			break;
		case "F":
			Kingint[0] = 6;
			break;
		case "G":
			Kingint[0] = 7;
			break;
		case "H":
			Kingint[0] = 8;
			break;
		}
		switch(b[0]) {
		case "A":
			Stoneint[0] = 1;
			break;
		case "B":
			Stoneint[0] = 2;
			break;
		case "C":
			Stoneint[0] = 3;
			break;
		case "D":
			Stoneint[0] = 4;
			break;
		case "E":
			Stoneint[0] = 5;
			break;
		case "F":
			Stoneint[0] = 6;
			break;
		case "G":
			Stoneint[0] = 7;
			break;
		case "H":
			Stoneint[0] = 8;
			break;
		}
	}

	void InttoString()  { // Move에서 계산을 다 한 후 다시 String으로 바꾸어줌
		switch(Kingint[0]) {
		case 1:
			King = "A" + Integer.toString(Kingint[1]);
			break;
		case 2:
			King = "B" + Integer.toString(Kingint[1]);
			break;
		case 3:
			King = "C" + Integer.toString(Kingint[1]);
			break;
		case 4:
			King = "D" + Integer.toString(Kingint[1]);
			break;
		case 5:
			King = "E" + Integer.toString(Kingint[1]);
			break;
		case 6:
			King = "F" + Integer.toString(Kingint[1]);
			break;
		case 7:
			King = "G" + Integer.toString(Kingint[1]);
			break;
		case 8:
			King = "H" + Integer.toString(Kingint[1]);
			break;
		}
		switch(Stoneint[0]) {
		case 1:
			Stone = "A" + Integer.toString(Stoneint[1]);
			break;
		case 2:
			Stone = "B" + Integer.toString(Stoneint[1]);
			break;
		case 3:
			Stone = "C" + Integer.toString(Stoneint[1]);
			break;
		case 4:
			Stone = "D" + Integer.toString(Stoneint[1]);
			break;
		case 5:
			Stone = "E" + Integer.toString(Stoneint[1]);
			break;
		case 6:
			Stone = "F" + Integer.toString(Stoneint[1]);
			break;
		case 7:
			Stone = "G" + Integer.toString(Stoneint[1]);
			break;
		case 8:
			Stone = "H" + Integer.toString(Stoneint[1]);
			break;
		}
	}
	void print() {
		InttoString();
		System.out.print(King + "\n" + Stone);
	}
}