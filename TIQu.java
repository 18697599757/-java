import java.util.Scanner;

public class TIQu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        if(k>99999){
            System.out.println("输入错误!!");
        }else if(k>9999){
            System.out.println(5);
        }else if(k>999){
            System.out.println(4);

        }else if(k>99){
            System.out.println(3);
        }else if(k>9){
            System.out.println(2);
        }else{
            System.out.println(1);
        }
        int a=k/10000;
        int b=(k-a*10000)/1000;
        int c=(k-a*10000-b*1000)/100;
        int d=(k-a*10000-b*1000-c*100)/10;
        int e=k-a*10000-b*1000-c*100-d*10;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e);
        System.out.println(e*10000+d*1000+c*100+b*10+a);
    }
}
