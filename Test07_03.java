import java.util.Scanner;

public class Test07_03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while (true){
            int a=in.nextInt();
            if(a==0){
                break;
            }else {
                System.out.println(sushu(a));
            }

        }
    }
    public static String sushu(int a){
        int x=1;
        for (int i = 2; i <a-1 ; i++) {
            if(a%i==0){
                x=0;
            }
        }
        if(x==1){
            String l="yes";
            return l;
        }else {
            String l="no";
            return l;
        }
    }
}
