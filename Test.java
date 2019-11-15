package demo02;

public class Test {
    public static void main(String[] args) {
        int arr[][]= new int [10][10];
        for(int [] row: arr){
            for(int data:row){
                System.out.printf("%d\t",data);

            }
            System.out.println();
        }

    }
}



