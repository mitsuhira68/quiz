package AtcoderBeginnerContest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();int M = sc.nextInt();
        int[][] a = new int[M][N];
        int copple = (N * N - N)/2;
        for(int i = 0;i < M;i++){
            for(int j = 0;j < N;j++){
                a[i][j] = sc.nextInt();
            }
        }
        Set<StringBuilder> set = new HashSet<>();

        for(int i = 0;i < M;i++){
            for(int j = 0;j < N - 1;j++){
                StringBuilder sb = new StringBuilder(a[i][j] + " " + a[i][j + 1]);
                if(!set.contains(sb.reverse())){
                    set.add(sb);
                }
            }
        }

        for(StringBuilder kumi:set){
            System.out.println(kumi);
        }
        System.out.println(copple - set.size());


    }
}
