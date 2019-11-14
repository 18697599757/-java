import java.util.Scanner;

public class Test06_15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s2=in.nextLine();
        String s1="";
        for (int i = 0; i <s2.length() ; i++) {
            char t=s2.charAt(i);
            s1=s1+t;

        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
