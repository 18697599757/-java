import java.util.Scanner;

public class Test07_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            double a = in.nextInt();
            double b = in.nextInt();
            double c = in.nextInt();
            if(a==0&&b==0&&c==0){
                break;
            } else if (b * b - 4 * a * c > 0) {
            double arr[] = fca(a, b, c);
            System.out.println(String.format("%.2f %.2f", arr[0], arr[1]));
        } else if (b * b - 4 * a * c == 0) {
            System.out.println(String.format("%.2f", fcb(a, b, c)));

        } else if (b * b - 4 * a * c < 0) {
            System.out.println(fcc(a, b, c));
        }
    }
    }




    public static double[] fca(double a, double b, double c){
        double x1=0,x2=0;
        x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
        double[] arr={x1,x2};
        return arr;
    }
    public static double fcb(double a, double b, double c){
        double x;
        x=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        return x;
    }
    public static String fcc(double a, double b, double c){
        String  x="NULL";
        return x;
    }
}

