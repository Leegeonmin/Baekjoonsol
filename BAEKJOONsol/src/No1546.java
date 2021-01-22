import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

class calAverage{
	int n;
	int max;
	float[] list;
	
	calAverage(float[] list, int n){
		this.list = list;
		this.n = n;
		Arrays.sort(this.list);
		max = (int)this.list[n-1];
	}
	
	void setList(){
		for(int i = 0; i < n; i++){
			list[i] = (float)list[i] / max * 100;
		}
	}
	
	float getAverage(){
		float sum = 0;
		for(int i = 0; i < n; i++){
			sum += list[i];
		}
		sum = sum / n;
		return sum;
	
		}
	
}
public class No1546{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 float[] list = new float[n];
		 for(int i = 0; i < n; i++){
		 	list[i] = sc.nextInt();
		 }
		 calAverage a = new calAverage(list, n);
		 a.setList();
		 System.out.println(a.getAverage());
		 
		 
}
}
		 
