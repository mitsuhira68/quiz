package AtcoderBeginnerContest;

import java.util.Scanner;

public class B330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0;i < N;i++)A[i] = sc.nextInt();
        int[] X = new int[N];//L以上R以下のA[i]からもっとも近い値

        for(int i = 0;i < N;i++){
            if(A[i] >= L && A[i] <= R){
                X[i] = A[i];
            }else if(A[i] < L){
                X[i] = L;
            }else if(A[i] > R){
                X[i] = R;
            }
        }
        for(int i:X){
            System.out.print(i + " ");
        }
    }
}
