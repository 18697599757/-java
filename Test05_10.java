public class Test05_10 {
    public static void main(String[] args) {
        double m=2;
        double n=1;
        double s=0;
        for (int i = 1; i <=20 ; i++) {
            s=s+m/n;
            double t=m;
            m=m+n;
            n=t;


        }
        System.out.println(String.format("%.2f",s));
    }
}
