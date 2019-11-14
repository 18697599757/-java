import java.util.Scanner;

public class Test07_10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String max="";
        String s="";

        for (int i = 0; i <a.length() ; i++) {
            char t=a.charAt(i);
            if(t>='A'&&t<='Z'||t>='a'&&t<='z'){
                s=s+t;
            }else {
                if(s.length()>max.length())
                    max=s;
                s="";
            }
        }
        System.out.println(max);

    }
}
