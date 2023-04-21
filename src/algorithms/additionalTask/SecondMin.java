package algorithms.additionalTask;

public class SecondMin {
    public static void main(String[] args) {
        //int [] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        int[] array = {2, Integer.MAX_VALUE};

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        boolean hasMoreThanMaxValue = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min2 = min;
                min = array[i];
                hasMoreThanMaxValue = true;
            } else if (array[i] < min2 && array[i] != min) {
                min2 = array[i];
            }
        }

        if (hasMoreThanMaxValue) {
            System.out.println("Второй по минимальности элемент в массиве: " + min2);
        } else {
            System.out.println("Второго по минимальности элемента нет");
        }

        System.out.println("Минимальный элемент в массиве: " + min);

        System.out.println(hasMoreThanMaxValue);
    }
}
