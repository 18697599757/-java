import java.util.Scanner;

public class ball {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double r=in.nextDouble();
        int h=in.nextInt();
        double c=3.14*2*r;
        double s=3.14*r*r;
        double ballb=4*3.14*r*r;
        double v=(4/3)*3.14*Math.pow(r,3);
        double dv=s*h;
        System.out.println("C="+String.format("%.2f",c));
        System.out.println("S="+String.format("%.2f",s));
        System.out.println("Ball area="+String.format("%.2f",ballb));
        System.out.println("Ball volume="+String.format("%.2f",v));
        System.out.println("Cylinder volume="+String.format("%.2f",dv));

    }
}
