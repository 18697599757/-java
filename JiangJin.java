import java.util.Scanner;

public class JiangJin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        double p1,p2,p3,p4,p5;
       p1=i+10000*0.1;
       p2=p1+10000*0.075;
       p3=p2+20000*0.05;
       p4=p3+20000*0.03;
       p5=p4+40000*0.01;
       if(i<=100000){
           double m=i+i*0.1;
           System.out.println(String.format("%.2f",m));
       }else if(i<=200000){
           double m=p1+(i-100000)*0.075;
           System.out.println(String.format("%.2f",m));
        }else if(i<=400000){
           double m=p2+(i-200000)*0.05;
           System.out.println(String.format("%.2f",m));
        }else if(i<=600000){
           double m=p3+(i-400000)*0.03;
           System.out.println(String.format("%.2f",m));

        }else if(i<=800000){
           double m=p4+(i-600000)*0.015;
           System.out.println(String.format("%.2f",m));
        }else{
          double m=p5+(i-1000000)*0.01;
          System.out.println(String.format("%.2f",m));
        }

       }


        }


