package Notcoder;

public class Kadai0104 {
    public static void main(String[] args) {
        //定数宣言
        final String ANIMAL = "種類:";
        final String NAME = "名前:";
        final String GENDER = "性別:";
        final String HIGH = "身長:";
        final String WEIGHT = "体重:";
        final String AREA = "出身地:";

        //エレガントくんの情報
        String animal = "インドゾウ";
        String name = "エレガント";
        char gender = '男';
        int high = 320;
        long weight = 2000000;
        String area = "インド";
        //使用した変数: int long char String
        System.out.println("シスエボ動物園にいる動物のデータ");
        System.out.println(ANIMAL + animal);
        System.out.println(NAME + name);
        System.out.println(GENDER + gender);
        System.out.println(HIGH + high);
        System.out.println(WEIGHT + weight);
        System.out.println(AREA + area);

        System.out.println();//空白行の生成

        //ぱおんちゃんのデータ
        animal = "アフリカゾウ";
        name = "ぱおん";
        gender = '女';
        high = 330;
        weight = 1800000;
        area = "アフリカ";
        System.out.println(ANIMAL + animal);
        System.out.println(NAME + name);
        System.out.println(GENDER + gender);
        System.out.println(HIGH + high);
        System.out.println(WEIGHT + weight);
        System.out.println(AREA + area);

    }
}
