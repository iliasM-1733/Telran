package algorithms.lessonElevenHash;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Temp {
    public static void main(String[] args) {
        HashMap map  = new HashMap();

        MyObject o1 = new MyObject("abcd");
        MyObject o2 = new MyObject("jhgf");
        MyObject o3 = new MyObject("abcgd");

        MyHashSet set = new MyHashSet();

        set.addElement(o1);
        set.addElement(o2);
        set.addElement(o3);

    }
}


class MyHashSet {
    LinkedList <Object> [] bucket = new LinkedList[4];


    public MyHashSet() {
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new LinkedList<>();
        }
    }

    void addElement(Object obj) {
        int hash = obj.hashCode();

        for(int i = 15; i >= 0; i--) {
            if (hash % i == 0) {

                for (int j = 0; j < bucket[i].size(); j++) {
                    if (hash == bucket[i].get(j).hashCode()) {
                        if(obj.equals(bucket[i].get(j))) {
                            break;
                        }
                    }
                }

                bucket[i].add(obj);
                break;
            }
        }
    }

    boolean contains(Object obj) {
        int hash = obj.hashCode();

        for(int i = 15; i >= 0; i--) {
            int index = hash % 15;
            for (int j = 0; j < bucket[index].size(); j++) {
                if (hash == bucket[index].get(j).hashCode()) {
                    if(obj.equals(bucket[index].get(j))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}


class MyObject {
    String field;

    public MyObject(String field) {
        this.field = field;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return field.length() == (((MyObject) obj).field.length());
    }
}
