import java.util.ArrayList;
import java.util.Scanner;

public class No1331 {
//	 6��6 ü���� ������ �� �ٸ� ����Ʈ ������ ��θ� ã������ �Ѵ�. 
//	 ü������ �� ĭ�� A~F ���� ���ĺ� �ϳ��� 1~6 ���� ���� �ϳ��� ��Ÿ�� �� �ִ�. �������� ����Ʈ ���� ��ΰ� �־��� ��, 
//	 �̰��� �ùٸ� ���̸� Valid, �ùٸ��� ������ Invalid�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	

/*** ó������ �Է¹��� ��ġ�� firstpoint(���������� �񱳸� ����), spl1�� ���ڷ� ��ȯ�Ͽ� �����Ѵ�.
 * �湮�� ��ġ�� ��湮�� �ȵǴ� �� �����ϱ� ���� ArrayList�� add�Ѵ�.
 * for�������� ���� �Է� ��ġ���� ��湮�ߴµ� �˻�(Arrays.contains)�ϰ�
 * spl2�� ���� �Է��� ���ڷ� ��ȯ�Ͽ� �����Ѵ�. 
 * �˰����� ������ġ�� ������ġ�� x,y�� ������ ���밪 ���� 3�̸鼭 ���ʸ� 3�� �ƴϸ�(x=3,y=0) �̵������ϴٰ��Ǵ��ϰ�
 * spl2�� ���� spl1�� �ٲپ��ְ� �ٽ� for���� ����.
 * ���������� firstpoint�� ���Ͽ� �湮�������� Ȯ���ϰ��Ѵ�.
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
