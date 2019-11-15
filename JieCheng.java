package demo02;

public class JieCheng {
    public static void main(String[] args) {
        long s=0;
        for(long  i=1;i<=20;i++){
            long p=1;
            for(long j=1;j<=i;j++){
                p=p*j;

            }
             s=s+p;
        }
        System.out.println(s);
    }
}
