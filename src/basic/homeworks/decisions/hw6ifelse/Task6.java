package basic.homeworks.decisions.hw6ifelse;

/**
 * Напишите метод, который определяет тип треугольника (равносторонний, равнобедренный, разносторонний) по заданным
 * сторонам и печатает ответ в консоль
 */
public class Task6 {
    public static void main(String[] args) {
        double side1 = 3.0;
        double side2 = 4.0;
        double side3 = 5.0;

        String triangleType = determineTriangleType(side1, side2, side3);
        System.out.println("Треугольник с заданными сторонами является: " + triangleType);
    }

    /**
     * В этом примере создается  метод determineTriangleType, принимающий три стороны треугольника в виде чисел с
     * плавающей точкой и возвращающий тип треугольника в виде строки.
     *
     * В методе main задаются значения переменных side1, side2 и side3 (стороны треугольника), затем вызывается метод
     * determineTriangleType, передавая ему эти значения. Результат (тип треугольника) выводится в консоль.
     *
     * Метод determineTriangleType использует конструкцию if-else if-else для проверки различных условий треугольника.
     * Если все три стороны равны, то треугольник является равносторонним. Если хотя бы две стороны равны, то
     * треугольник является равнобедренным. Во всех остальных случаях треугольник считается разносторонним.
     */
    public static String determineTriangleType(double side1, double side2, double side3) {
        if (side1 == side2 && side2 == side3) {
            return "равносторонний";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "равнобедренный";
        } else {
            return "разносторонний";
        }
    }
}

