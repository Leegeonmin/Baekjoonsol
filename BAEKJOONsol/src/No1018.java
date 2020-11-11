import java.util.Scanner;

public class No1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int min = 64;
		String point, ipoint; // ù ü������ ���� ���� �Ǵ� ����̱� ������ �� �� �����ϱ� ���� �� ������ ���
		int count, icount; 
		String[][] fullset = new String[row][col];
		for(int i = 0; i < row; i++) {  //ü������ ����Ʈ�� ����
			String in = sc.next();
			fullset[i] = in.split("");
		}
		for(int i = 0; i < row-7; i++) {
			for(int j = 0; j < col-7; j++){ // 8*8ü���Ǹ��� �������ϱ� ������ ��������
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
						
						if((i+n) % 2 == remrow) { // �������� point��� ����
							if((j+m) % 2 == remcol) { // �������� point���� ���� 
								if(!(point.equals(fullset[i+n][j+m]))) { // �ٵ� ���� �ٸ��� ++;
									count++;
								}
								if(!(ipoint.equals(fullset[i+n][j+m]))) { // ��
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
