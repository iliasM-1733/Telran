package algorithms.lessonElevenHash;

import java.util.HashSet;
import java.util.Set;

public class HashCode {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == "hello");
        System.out.println(str2 == "hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Human human1 = new Human("Ivan", 31);
        Human human2 = new Human("Ivan", 31);


        System.out.println("human1 == human2 is " + (human1 == human2));
        System.out.println("human1.equals(human2) is " + human1.equals(human2));
        Set<Human> set = new HashSet<>();
        set.add(human1);
        set.add(human2);
        System.out.println(set);

    }
}
