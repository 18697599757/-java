import java.util.Scanner;

public class Test06_10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        String c=in.nextLine();
        int dx=0,xx=0,num=0,kg=0,other=0;
        char t;
        for (int i = 0; i <a.length() ; i++) {
            t=a.charAt(i);
            if(t>='A'&&t<='Z'){
                dx++;
            }else if(t>='a'&&t<='z'){
                xx++;
            }else if(t>='0'&&t<='9'){
                num++;
            }else if(t==' '){
                kg++;
            }else {
                other++;
            }

        }
        for (int i = 0; i <b.length() ; i++) {
            t=b.charAt(i);
            if(t>='A'&&t<='Z'){
                dx++;
            }else if(t>='a'&&t<='z'){
                xx++;
            }else if(t>='0'&&t<='9'){
                num++;
            }else if(t==' '){
                kg++;
            }else {
                other++;
            }

        }
        for (int i = 0; i <c.length() ; i++) {
            t=c.charAt(i);
            if(t>='A'&&t<='Z'){
                dx++;
            }else if(t>='a'&&t<='z'){
                xx++;
            }else if(t>='0'&&t<='9'){
                num++;
            }else if(t==' '){
                kg++;
            }else {
                other++;
            }

        }
        System.out.println(dx+" "+xx+" "+num+" "+kg+" "+other);

    }
}
