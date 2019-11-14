public class WanShu {
    public static void main(String[] args) {
        for(int i=6;i<=1000;i++){
            int s=0;

            for(int j=1;j<i;j++){
                if(i%j==0){

                    s=s+j;
                }

            }
            if(i==s){
                for(int k=1;k<i;k++){
                    if(i%k==0){
                        System.out.print(i+"its factors are");
                        if(i%k==0){
                            System.out.print(k+'\n');
                        }else {
                            System.out.print(k+',');
                        }

                    }
                }
                }

                }
                }
            }
