package AtcoderBeginnerContest;

import java.util.Scanner;

public class B328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N];
        for(int i = 0;i < N;i++)D[i] = sc.nextInt();

        int ans = 0;
        for(int i = 1;i <= N;i++){
            for(int j = 1;j <= D[i];j++){
                StringBuilder sb = new StringBuilder();
                sb.append(i);sb.append(j);
                for (int k = 1;k < N;k++){
                    char c = sb.charAt(k);
                    if(c != sb.charAt(k - 1))break;
                }
            }
        }
    }
}
