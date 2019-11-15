import java.util.Scanner;
public class ifElseIfElse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float x=in.nextFloat();
        if(x<1){
            float y=x;
            System.out.println(String.format("%.2f",y));
        }else if(x>=1&&x<10){
            float y=2*x-1;
            System.out.println(String.format("%.2f",y));

        }else if(x>=10){
            float y=3*x-11;
            System.out.println(String.format("%.2f",y));
        }
    }
}
