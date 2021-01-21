import java.util.Scanner;

public class No1152{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
     
        if(n.equals(" ")){

            System.out.println(0);

        }else{

            n = n.trim();

            String[] sen = n.split(" ");

         

            System.out.print(sen.length);

        }

    }

}
