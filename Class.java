import java.util.Scanner;
public class Class {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
      if(k<60){
          System.out.println("E");
      }else if(k<70){
          System.out.println("D");

        }else if(k<80){
          System.out.println("C");
      }else if(k<90){
          System.out.println("B");
      }else {
          System.out.println("A");
      }
    }
}
