package AtcoderBeginnerContest;

import java.util.Scanner;

public class B301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0;i < N;i++)A[i] = sc.nextInt();

        for(int i = 0;i < N - 1;i++){
            System.out.print(A[i] + " ");
            if(A[i] - A[i + 1] < -1){
                for(int j = A[i] + 1;j < A[i + 1];j++){
                    System.out.print(j  + " ");
                }
            }
            if(A[i] - A[i + 1] > 1){
                for(int j = A[i] - 1;j > A[i + 1];j--){
                    System.out.print(j + " ");
                }
            }
        }
        System.out.println(A[N - 1]);
    }
}
