import java.util.Scanner;

public class Test06_14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

          int n=Integer.parseInt(in.nextLine());
        for (int i =0; i <n;  i++) {
            String s1=in.nextLine();
            String s2=in.nextLine();

            int a=0;
            int b=0;

            for (int j = 0; j <s1.length() ; j++) {
               a=a+s1.charAt(j);
            }
//            System.out.println("b = " + b);
            for (int j = 0; j <s2.length() ; j++) {
                b=b+s2.charAt(j);
            }
            System.out.println(a-b);


        }
    }
}
