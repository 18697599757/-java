public class Test05_06 {
    public static void main(String[] args) {
        long s=0;

        for (int i = 1; i <=20 ; i++) {
            long k=1;
            for (int j = 1; j <=i ; j++) {
                k=k*j;

            }
            s=s+k;

        }
        System.out.println(s);
    }
}
