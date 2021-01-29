import java.util.*;
public class No10814{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	List<student> list = new ArrayList<student>();
	
	int testcaseNum = sc.nextInt();
	for(int i = 0;i < testcaseNum; i++){
		student s = new student(sc.nextInt(), sc.next(), i);
		list.add(s);
	}
	Collections.sort(list, new studentcompare());
	
	for(int i = 0; i < list.size(); i++){
		System.out.println(list.get(i).age + " " + list.get(i).name);
	}
	
	
}
}

class student{
	int age;
	String name;
	int num;
	student(int age, String name, int num){
		this.age = age;
		this.name = name;
		this.num = num;
	}
}


class studentcompare implements Comparator<student>{
	int ret;

	public int compare(student s1, student s2){
		if(s1.age < s2.age){
			ret = -1;
		}
		if(s1.age > s2.age){
			ret = 1;
		}
		if(s1.age == s2.age){
			if(s1.num < s2.num){
				ret = -1;
			}
			if(s1.num > s2.num){
				ret = 1;
			}
		}
		return ret;
	}
}
// 새로운 정렬 기준을 클래스로 만들고 compare 메서드를 override