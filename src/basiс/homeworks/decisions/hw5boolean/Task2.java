package basiс.homeworks.decisions.hw5boolean;

public class Task2 {
    public class ShopStatus {

        /**
         * Создайте две переменные *isEdekaOpen* и *isReweOpen*, значения которых зависят от того, открыты магазины или нет.
         * Реализует логический метод *canBuy,*, возвращающий true ** Значение этой переменной должно быть true, если хотя бы
         * один магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.
         */
        public static void main(String[] args) {
            canBuy(true, true);
        }

        /**
         * мы объявляем переменную canBuy и присваиваем ей результат выполнения логической операции ИЛИ (|) между
         * переменными isEdekaOpen и isReweOpen. Логическая операция ИЛИ возвращает true, если хотя бы один из
         * операндов имеет значение true, в противном случае возвращает false.
         *
         * Наконец, мы выводим на экран строку "Я могу купить еду, это ..." с помощью метода System.out.println(),
         * и добавляем значение переменной canBuy в конце строки. Если хотя бы один магазин открыт (canBuy имеет
         * значение true), то строка будет выглядеть как "Я могу купить еду, это true". Если оба магазина закрыты
         * (canBuy имеет значение false), то строка будет выглядеть как "Я могу купить еду, это false".
         */
        public static void canBuy(boolean isEdekaOpen, boolean isReweOpen) {
            boolean canBuy = (isEdekaOpen || isReweOpen);
            System.out.println("Я могу купить еду, это " + canBuy);
        }
    }

}
