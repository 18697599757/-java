public class Test06_11 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <i*3 ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <5 ; j++) {
                if(j+1==5){
                    System.out.println("*");
                }else {
                    System.out.print("*"+" "+" ");
                }



            }

        }
    }
}
