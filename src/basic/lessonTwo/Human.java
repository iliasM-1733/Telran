package basic.lessonTwo;

public class Human {
    int age = 0;
    String name;
    static int countOfPeople = 0;


    public Human() {
        countOfPeople++;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
