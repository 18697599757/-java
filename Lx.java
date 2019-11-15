package demo02;

public class Lx {
    public static void main(String[] args) {
        //首先。把菱形看成上下两部分，上五下四，所以，第一个for循环有5次，第二个for循环有4次
        for( int i = 1; i <= 4; i++){

            for( int j = 1; j <= 4-i ; j++){
                System.out.print(" ");
            }
            for( int k = 1; k <= 2*i-1 ; k++){//找规律，i是 1 3 5 7 9基数
                System.out.print('*');
            }
            //换一行
            System.out.println();
        }
        for( int i = 1; i <= 3; i++){
            for( int j = 1;j <= i; j++){//空格 1 2 3 4 so
                System.out.print(" ");
            }
            for( int k = 1; k <= 2*(3 - i + 1 )-1; k++){//* 7 5 3 1 倒着来的基数
                System.out.print('*');
            }
            System.out.println();
        }
    }
}


