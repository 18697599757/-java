import java.util.Scanner;

public class shuzu {
    public static void main(String[] args)  {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        int zm=0;
        int kg=0;
        int num=0;
        int other=0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c>='A'&&c<='Z'||c>='a'&&c<='z'){
                zm++;
            }
            else if(c==' '){
                kg++;
            }
            else if(c>='0'&&c<='9'){
                num++;
            }else {
                other++;
            }
        }
        System.out.println(zm+" "+kg+" "+num+" "+other);

    }
}
