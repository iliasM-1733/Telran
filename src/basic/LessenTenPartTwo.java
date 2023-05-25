package basic;

public class LessenTenPartTwo {
    public static void main(String[] args) {
        String str;
        str = "hello str";

        String[] strings1 = {"hello strings", "world", "srfse", "ewfrwf", "42tr43t", "ge5h", "frefwr","frf ", "last element"};

        String[] strings2 = new String[4];
        strings2[0] = "on";
        strings2[1] = "two";
        strings2[2] = "three";


        System.out.println(strings1.length);
        System.out.println(strings2.length);

        System.out.println("strings1 link:" + strings1);
        System.out.println("strings2 link:" + strings2);

        strings2 = strings1;

        System.out.println(strings1.length);
        System.out.println(strings2.length);
        System.out.println("strings1 link:" + strings1);
        System.out.println("strings2 link:" + strings2);

        System.out.println(strings2[0]);

        strings1[0] = "new element in strings1";
        System.out.println(strings2[0]);




    }
}
