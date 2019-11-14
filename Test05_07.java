public class Test05_07 {
    public static void main(String[] args) {
        int s=0;
        int j=0;
        double k=0;
        for (int i = 1; i <=100 ; i++) {
            s=s+i;

        }
        for (int i = 1; i <=50 ; i++) {
            j=j+i*i;

        }
        for (double i = 1; i <=10 ; i++) {
            k=k+1/i;

        }
        double h=s+j+k;
        System.out.println(String.format("%.2f",h));
    }
}
