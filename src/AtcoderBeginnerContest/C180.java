package AtcoderBeginnerContest;

import java.util.Scanner;

public class C180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        for(int i = 1;i < Math.sqrt(N);i++){
            if(N % i == 0) System.out.println(i);
        }
        for(int i = (int)Math.sqrt(N);i >= 1;i--){
            if(N % i == 0) System.out.println(N / i);
        }
    }
}
