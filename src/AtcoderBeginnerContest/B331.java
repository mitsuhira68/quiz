package AtcoderBeginnerContest;

import java.util.Scanner;
//100^3くらいならTLEこない！
public class B331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();//6 eggs
        int M = sc.nextInt();//8 eggs
        int L = sc.nextInt();//12 eggs

        int ans = (S + M + L)*100;
        for(int i = 0;i <= 100;i++){
            for(int j = 0;j <= 100;j++){
                for(int k = 0;k <= 100;k++){
                    if(i * 6 + j * 8 + k * 12 >= N){
                        ans = Math.min(ans,(i * S) + (j * M) + (k * L));
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
