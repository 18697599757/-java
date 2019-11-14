import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int time=0;
        int day=0;
        for (int i = 0; i <7 ; i++) {
            int a=in.nextInt();
            int b=in.nextInt();
            if(a+b>time&&a+b>8){
                time=a+b;
                day=i+1;
            }
            
        }
        System.out.println(day);


        }
    }

