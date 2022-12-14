package algorithms.lessonElevenHash;

import java.util.*;
import java.util.concurrent.DelayQueue;

public class HashCode {
//    public static void main(String[] args) {
//        Human h1 = new Human("Ivan", 20);
//        Human h2 = new Human("Mari", 20);
//        Human h3 = new Human("Mari", 20);
//
//        Set<Human> set = new HashSet<>();
//        set.add(h1);
//        set.add(h2);
//        set.add(h3);
//        System.out.println(set);
//        System.out.println(h1.hashCode());
//        System.out.println(h2.hashCode());
//
//        Map<Human, String> map = new HashMap<>(24);
//        map.put(h1, "human 1");
//        map.put(h2, "human 2");
//        map.put(h3, "human 3");
//
//        h1.setAge(21);
//        System.out.println(h1);
//
//        Human h4 = new Human("Ivan", 20);
//        h1.setSecondName("Ivanov");
//        h4.setSecondName("Petrov");
//        System.out.println("map.get(h1): " + map.get(h1));
//        System.out.println("map.get(h4): " + map.get(h4));
//
//
//        int[] nums = {1};
//        int[] nums2 = {1};
//        System.out.println(nums.hashCode() == nums2.hashCode());
//
//
//
//    }

    public static void main(String[] args) {
        // хранение не уникальных данных
        List list = new LinkedList();


        // хранение последовательности ввода
        Queue queue = new DelayQueue();
        Deque deque = new ArrayDeque();

        Stack stack = new Stack();

        // множества нужны для хранения уникальных не повотряющихся данных
        Set set = new LinkedHashSet();

        // Map - нужен для хранения пары ключ-значение, при этом ключи обязаны быть уникальными
        Map<String, String> map = new LinkedHashMap<>();



    }
}
