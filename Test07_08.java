import java.util.Scanner;

public class Test07_08 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (true){
            int q=0,b=0,s=0,g=0;
            int a=in.nextInt();
            if(a==0){
                break;
            }else {
                q=a/1000;
                b=(a-q*1000)/100;
                s=(a-q*1000-b*100)/10;
                g=a%10;
            }
            System.out.println(q+" "+b+" "+s+" "+g);
            }
        }
    }

