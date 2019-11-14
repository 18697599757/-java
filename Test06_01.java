public class Test06_01 {
    public static void main(String[] args) {
        for (int i = 2; i <=100 ; i++) {
            int k=0;
            for (int j = 2; j <i ; j++) {
               if(i%j==0){
                   k=1;
               }

            }
            if(k==0){
                System.out.print(i+" ");
            }
           if (i==100){
               System.out.println();
           }
        }
    }
}
