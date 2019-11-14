import java.util.Scanner;

public class Test06_12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b="";



        for (int i = 0; i <a.length() ; i++) {
            char t=a.charAt(i);
            if(t=='A'){
                t='Z';
                b=b+t;
            }else if(t=='B'){
                t='Y';
                b=b+t;
            }else if(t=='C'){
                t='X';
                b=b+t;
            }else if(t=='D'){
                t='W';
                b=b+t;
            }else if(t=='E'){
                t='V';
                b=b+t;
            }else if(t=='F'){
                t='U';
                b=b+t;
            }else if(t=='G'){
                t='T';
                b=b+t;
            }else if(t=='H'){
                t='S';
                b=b+t;
            }else if(t=='I'){
                t='R';
                b=b+t;
            }else if(t=='J'){
                t='Q';
                b=b+t;
            }else if(t=='K'){
                t='P';
                b=b+t;
            }else if(t=='L'){
                t='O';
                b=b+t;
            }else if(t=='M'){
                t='N';
                b=b+t;
            }else if(t=='N'){
                t='M';
                b=b+t;
            }else if(t=='O'){
                t='L';
                b=b+t;
            }else if(t=='P'){
                t='K';
                b=b+t;
            }else if(t=='Q'){
                t='J';
                b=b+t;
            }else if(t=='R'){
                t='I';
                b=b+t;
            }else if(t=='S'){
                t='H';
                b=b+t;
            }else if(t=='T'){
                t='G';
                b=b+t;
            }else if(t=='U'){
                t='F';
                b=b+t;
            }else if(t=='V'){
                t='E';
                b=b+t;
            }else if(t=='W'){
                t='D';
                b=b+t;
            }else if(t=='X'){
                t='C';
                b=b+t;
            }else if(t=='Y'){
                t='B';
                b=b+t;
            }else if(t=='Z'){
                t='A';
                b=b+t;
            }else if(t=='a'){
                t='z';
                b=b+t;
            }
            else if(t=='b'){
                t='y';
                b=b+t;
            }else if(t=='c'){
                t='x';
                b=b+t;
            }else if(t=='d'){
                t='w';
                b=b+t;
            }else if(t=='e'){
                t='v';
                b=b+t;
            }else if(t=='f'){
                t='u';
                b=b+t;
            }else if(t=='g'){
                t='t';
                b=b+t;
            }else if(t=='h'){
                t='s';
                b=b+t;
            }else if(t=='i'){
                t='r';
                b=b+t;
            }else if(t=='j'){
                t='q';
                b=b+t;
            }else if(t=='k'){
                t='p';
                b=b+t;
            }else if(t=='l'){
                t='o';
                b=b+t;
            }else if(t=='m'){
                t='n';
                b=b+t;
            }else if(t=='n'){
                t='m';
                b=b+t;
            }else if(t=='o'){
                t='l';
                b=b+t;
            }else if(t=='p'){
                t='k';
                b=b+t;
            }else if(t=='q'){
                t='j';
                b=b+t;
            }else if(t=='r'){
                t='i';
                b=b+t;
            }else if(t=='s'){
                t='h';
                b=b+t;
            }else if(t=='t'){
                t='g';
                b=b+t;
            }else if(t=='u'){
                t='f';
                b=b+t;
            }else if(t=='v'){
                t='e';
                b=b+t;
            }else if(t=='w'){
                t='d';
                b=b+t;
            }else if(t=='x'){
                t='c';
                b=b+t;
            }else if(t=='y'){
                t='b';
                b=b+t;
            }else if(t=='z'){
                t='a';
                b=b+t;
            }else {
                b=b+t;
            }




        }
        System.out.println(a);
        System.out.println(b);



    }
}
