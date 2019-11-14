import java.util.Scanner;

public class Test07_05 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        System.out.println(a);
        System.out.println(fan(a));
    }
    public static String fan(String a){
        String s="";
        for (int i = 0; i <a.length() ; i++) {
            char t=a.charAt(i);
            s=t+s;
        }
        return s;


    }
}
