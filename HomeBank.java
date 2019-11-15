public class HomeBank {
    public static void main(String[] args){
        int d=300000;
        int p=6000;
        double r=0.01;
        double month=Math.log(p/(p-d*r))/Math.log(1+r);
        System.out.println(String.format("%.1f",month));
    }
}
