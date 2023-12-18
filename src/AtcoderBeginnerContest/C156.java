package AtcoderBeginnerContest;

import java.util.Scanner;

public class C156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int P = 0;
        for(int i = 0;i < N;i++){
            X[i] = sc.nextInt();
            P += X[i];
        }P = (int) Math.round((double)P / N);

        int ans = 0;
        for(int i = 0;i < N;i++){
            ans += Math.pow(X[i] - P,2);
        }
        System.out.println(ans);
    }
}
