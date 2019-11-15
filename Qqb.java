package demo02;

import java.util.Scanner;

public class Qqb {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        for(int i=0;i<m;i++){
            int[] arr=new int[n];
            for(int j=0;j<arr.length;j++){
                arr[j]=in.nextInt();
            }
            for(int p=0;p<arr.length-1;p++){
                for(int q=0;q<arr.length-1-p;q++){
                    int t=arr[q];
                    arr[q]=arr[q+1];
                    arr[q+1]=t;
                }


                }
            if(arr[1]-arr[0]<5&&arr[3]-arr[2]<5){
                System.out.println("yse");
            }else {
                System.out.println("no");
            }
            }

        }


    }

