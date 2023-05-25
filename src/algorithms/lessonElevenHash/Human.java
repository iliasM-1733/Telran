package algorithms.lessonElevenHash;

import java.util.Objects;

public class Human {
    String name;
    int age;

    String secondName;

    String myHashcode;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMyHashcode() {
        String result = "////";
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", secondName='" + secondName + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name == human.name;
    }

    @Override
    public int hashCode() {
        // int result = name.length() + age;
        int result = name.hashCode() * 31;

        return result;
    }
}
