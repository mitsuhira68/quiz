package AtcoderBeginnerContest;

import java.util.Scanner;

public class B297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean B;
        boolean KR;

        int Bx = -1;int By = -1;
        int Rx = -1;int Ry = -1;
        int K = -1;

        for(int i = 0;i < 8;i++){
            if(S.charAt(i) == 'B'){
                if(Bx == -1)Bx = i;
                else By = i;
            }
            if(S.charAt(i) == 'R'){
                if(Rx == -1)Rx = i;
                else Ry = i;
            }
            if(S.charAt(i) == 'K') K = i;
        }
        B = (Bx % 2 != By % 2);
        KR = (Rx < K && K < Ry);

        System.out.println((B && KR)?("Yes"):("No"));
    }
}
