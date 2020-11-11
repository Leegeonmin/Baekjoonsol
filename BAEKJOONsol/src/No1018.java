import java.util.Scanner;

public class No1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int min = 64;
		String point, ipoint; // 첫 체스판의 색이 검정 또는 흰색이기 때문에 둘 다 저장하기 위해 두 변수를 사용
		int count, icount; 
		String[][] fullset = new String[row][col];
		for(int i = 0; i < row; i++) {  //체스판을 리스트에 저장
			String in = sc.next();
			fullset[i] = in.split("");
		}
		for(int i = 0; i < row-7; i++) {
			for(int j = 0; j < col-7; j++){ // 8*8체스판만을 만들어야하기 때문에 한정적임
				count = 0;
				icount = 0;
				point = fullset[i][j];
				if(point.equals("B")){
					ipoint = "W";
				}else {
					ipoint = "B";
				}
				int remrow = i % 2;
				int remcol = j % 2;
				
				for(int n = 0; n < 8; n++) { 
					for(int m = 0; m < 8; m++) {
						
						if((i+n) % 2 == remrow) { // 나머지가 point행과 같음
							if((j+m) % 2 == remcol) { // 나머지가 point열과 같음 
								if(!(point.equals(fullset[i+n][j+m]))) { // 근데 값이 다르면 ++;
									count++;
								}
								if(!(ipoint.equals(fullset[i+n][j+m]))) { // 역
									icount++;
								}
							}else {
								if(point.equals(fullset[i+n][j+m])) {
									count++;
								}
								if(ipoint.equals(fullset[i+n][j+m])) {
									icount++;
								}
							}
							
						}else {
							if((j+m) % 2 == remcol) {
								if(point.equals(fullset[i+n][j+m])) {
									count++;
								}
								if(ipoint.equals(fullset[i+n][j+m])) {
									icount++;
								}
							}else {
								if(!(point.equals(fullset[i+n][j+m]))) {
									count++;
								}
								if(!(ipoint.equals(fullset[i+n][j+m]))) {
									icount++;
								}
							}
						}
					
						
					}
				}
				if(count > icount) {
					count = icount;
				}
				
				if(min > count) {
					min = count;
				}

				
				
			}
			
		}
		System.out.print(min);
		sc.close();
		
	}
}
