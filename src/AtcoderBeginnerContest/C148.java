package AtcoderBeginnerContest;

import java.util.Scanner;

public class C148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        long ans;
        for(int i = 1;i <= B;i++){
            ans = (long) A * i;
            if(ans % B == 0){
                System.out.println(ans);
                return;
            }
        }
    }
}
