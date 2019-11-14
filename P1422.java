import java.util.Scanner;

public class P1422 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a=in.nextFloat();
        if(a<=150){
            System.out.println(String.format("%.1f",a*0.4463));
        }else if(a<=400){
            double d=150*0.4463+(a-150)*0.4663;
            System.out.println(String.format("%.1f",d));

        }else{
            double d=(150*0.4463)+((400-150)*0.4663)+(a-400)*0.5663;
            System.out.println(String.format("%.1f",d));
        }

    }
}
