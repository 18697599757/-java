package demo02;

import java.util.Scanner;

public class TestYuanXin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        double y=in.nextDouble();
        double x1=2,y1=2,x2=-2,y2=2,x3=-2,y3=-2,x4=2,y4=-2;
        double d1=Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
        double d2=Math.sqrt(Math.pow((x2-x),2)+Math.pow((y2-y),2));
        double d3=Math.sqrt(Math.pow((x3-x),2)+Math.pow((y3-y),2));
        double d4=Math.sqrt(Math.pow((x4-x),2)+Math.pow((y4-y),2));
        if(d1>=1&&d2>=1&&d3>=1&&d4>=1){
            System.out.println(0);
        }else{
            System.out.println(10);
        }




    }
}
