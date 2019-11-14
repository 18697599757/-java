import java.util.Scanner;

public class MaiWenJu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a=in.nextFloat();
        float b=in.nextFloat();
        float c=1.9F;
        b=b/10;
        a=a+b;
        System.out.println((int)(a/c));

    }
}
