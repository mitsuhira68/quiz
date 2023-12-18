package AtcoderBeginnerContest;

import java.util.*;

public class B329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < N ;i++){
            A[i] = sc.nextInt();
            set.add(A[i]);
        }

        ArrayList<Integer> al = new ArrayList<>(set);//setを配列に変換
        Collections.sort(al);//ArrayListをソート
        System.out.println(al.get(al.size() - 2));
    }
}
