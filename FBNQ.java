package demo02;

import java.util.Scanner;

public class FBNQ {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=feb(n);
        System.out.println(i%100);
    }
    public static int feb(int i){
        if(i==1||i==2){
            return 1;
        }else {
            return feb(i-1)+feb(i-2);
        }

    }
}
