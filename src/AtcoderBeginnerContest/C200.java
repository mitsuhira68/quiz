package AtcoderBeginnerContest;

import java.util.Scanner;

public class C200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] mod = new int[200];
        long  ans = 0;
        for(int i = 0;i < N;i++){
            A[i] = sc.nextInt();
            mod[A[i] % 200]++;
        }
        for(int i = 0;i < 200;i++){
            ans += ((long) mod[i] * (mod[i] - 1)) / 2;
        }
        System.out.println(ans);

    }
}
