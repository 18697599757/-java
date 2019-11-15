public class Bank {
    public static void main(String[] args){
        System.out.println();
        int p=1000;
        double r0=0.0414,r1=0.0468,r2=0.054,r3=0.0585,r4=0.0072,p1,p2,p3,p4,p5;
        p1=p*(1+r3*5);
         p2=p*(1+2*r1)*(1+3*r2);
         p3=p*(1+3*r2)*(1+2*r1);
         p4=p*Math.pow((1+r0),5);
         p5=p*Math.pow((1+r4/4),4*5);
        System.out.println("P="+String.format("%.2f",p1));
        System.out.println("P="+String.format("%.2f",p2));
        System.out.println("P="+String.format("%.2f",p3));
        System.out.println("P="+String.format("%.2f",p4));
        System.out.println("P="+String.format("%.2f",p5));

    }
}
