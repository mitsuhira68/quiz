package Notcoder;

public class Kadai0105 {
    public static void main(String[] args) {
        //仕切りの線
        final String SHIKIRI = "================================================";
        int ja;//国語の点数
        int math;//数学の点数
        int eng;//英語の点数
        int sum;//総合点
        double jaAve = 0.0;
        double mathAve = 0.0;
        double engAve = 0.0;
        double sumAve = 0.0;
        System.out.println();//改行
        System.out.println(SHIKIRI);
        System.out.println("生徒名　国語 数学 英語 総合点");
        System.out.println(SHIKIRI);
        //半沢 直樹
        ja = 91;//国語
        math = 67;//数学
        eng = 82;//英語
        sum = ja + math + eng;
        System.out.println("半沢 直樹"+" "+ja + " "+ math + " "+eng + "     " + sum);
        jaAve += ja;
        mathAve += math;
        engAve += eng;
        sumAve += sum;

        //渡真利 忍
        ja = 65;
        math = 73;
        eng = 95;
        sum = ja + math + eng;
        System.out.println("渡真利 忍"+" "+ja + " "+ math + " "+eng + "     " + sum);
        jaAve += ja;
        mathAve += math;
        engAve += eng;
        sumAve += sum;

        //近藤 直弼
        ja = 53;
        math = 89;
        eng = 72;
        sum = ja + math + eng;
        System.out.println("渡真利 忍"+" "+ja + " "+ math + " "+eng + "     " + sum);
        jaAve += ja;
        mathAve += math;
        engAve += eng;
        sumAve += sum;

        jaAve /= 3;
        mathAve /= 3;
        engAve /= 3;
        sumAve /= 3;
        System.out.println(SHIKIRI);
        System.out.println("平均点 " + jaAve + " " + mathAve + " "+engAve + " " + sumAve);

    }
}
