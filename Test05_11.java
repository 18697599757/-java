public class Test05_11 {
    public static void main(String[] args) {
        double d=100;
        double s=0;
        for (int i = 1; i <=10 ; i++) {

            if(i==10){
                s=s+d;
                d=d/2;
            }else {
                s=s+d;
                d=d/2;
                s=s+d;
            }


        }
        System.out.print(String.format("%.2f ",s));
        System.out.println(String.format("%.2f",d));
    }
}
