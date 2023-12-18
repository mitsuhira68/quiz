package AtcoderBeginnerContest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        int cnt = 1;
        set.add(s);
        while(true){
            cnt++;
            s = ((s % 2 == 0)? s / 2 : 3 * s + 1);
            if(set.contains(s)){
                break;
            }
            else{
                set.add(s);
            }
        }
        System.out.println(cnt);
    }
}

