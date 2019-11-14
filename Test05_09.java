public class Test05_09 {
    public static void main(String[] args) {
        for (int i = 2; i <=1000 ; i++) {
            int s=0;
            for (int j = 1; j <i ; j++) {
                if ((i % j) == 0) {
                    s += j;

                }
            }
                if(s==i)
                {
                    System.out.print(i+" its factors are ");
                    for (int k = 1; k <i ; k++) {
                        if ((i%k)==0){
                            if(k*2==i){
                                System.out.print(k);
                            }else {
                                System.out.print(k);
                                System.out.print(",");
                            }
                        }


                    }
                    System.out.println();

                }



            }


        }
    }

