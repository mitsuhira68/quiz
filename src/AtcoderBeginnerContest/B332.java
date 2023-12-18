package AtcoderBeginnerContest;

import java.util.Scanner;

public class B332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int G = sc.nextInt();
        int M = sc.nextInt();

        int waterG = 0;
        int waterM = 0;

        for(int i = 0;i < K;i++){
            if(waterG == G){
                waterG = 0;
            }else if(waterM == 0){
                waterM = M;
            }else{//別々にカップの中の水をいじるよりもこっちのほうがイメージつかみ易くない？
                int z = Math.min(waterM,G - waterG);
                waterG += z;
                waterM -= z;
            }
           // System.out.println(waterG +" "+waterM);
        }
        System.out.println(waterG +" "+waterM);
    }
}
