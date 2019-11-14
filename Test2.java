public class Test2 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("abc");
        str.setCharAt(1,(char)(10+'a'-1));
        System.out.print(str);
    }
}
