import java.util.Scanner;
public class No1550 {
//	16���� ���� �Է¹޾Ƽ� 10������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b[] = a.split(""); // make String to list by split ""
		int sum = 0;

		for(int i = 0; b.length > i; i++) {
			switch(b[i]) {
			case "A":
				b[i] = "10";
				break;
			case "B":
				b[i] = "11";
				break;
			case "C":
				b[i] = "12";
				break;
			case "D":
				b[i] = "13";
				break;
			case "E":
				b[i] = "14";
				break;
			case "F":
				b[i] = "15";
				break;
			}
			sum += Integer.parseInt(b[i]) * Math.pow(16, b.length - i-1); //b is string list,So convert
		}
		
		System.out.println(sum);
		sc.close();
	}

}
