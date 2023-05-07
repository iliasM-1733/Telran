package basiс.homeworks.decisions.hw5boolean;


/**
 * Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура первой колбы
 * выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод, который проверяет это
 * устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2. В результате он выводит сообщение true
 * или false.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(isDeviceWorking(100, 100));
        System.out.println(isDeviceWorking(101, 99));
        System.out.println(isDeviceWorking(100.1, 99.9));

    }

    /**
     * Объяснение:
     *
     * Создаем статический метод isDeviceWorking, который принимает два целочисленных аргумента temperature1 и
     * temperature2.
     * Создаем логическую переменную isWorking, которая будет истинной, только если temperature1 выше 100 градусов, и
     * temperature2 меньше 100 градусов.
     * Возвращаем значение isWorking.
     * В итоге, метод будет возвращать true, только если первая колба горячая (температура выше 100 градусов), а вторая
     * колба холодная (температура меньше 100 градусов). Если хотя бы одно из условий не выполнено, метод вернет false.

     */
    public static boolean isDeviceWorking(double temperature1, double temperature2) {
        boolean isWorking = temperature1 > 100 && temperature2 < 100;
        return isWorking;
    }

}
