import java.util.Scanner;

public class Test07_07 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String s="";
        for (int i = 0; i <a.length() ; i++) {
            char t=a.charAt(i);
            if(t=='A'||t=='a'||t=='E'||t=='e'||t=='I'||t=='i'||t=='O'||t=='o'||t=='U'||t=='u'){
                s=s+t;
            }
        }
        System.out.println(s);
    }
}
