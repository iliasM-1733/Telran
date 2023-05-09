package basic;

public class LessonFourMethodsPartTwo {
    public static void main(String[] args) {
        //doEverythingByMyself();
        doEverythingByHelpers();
    }

    /**
     * давайте представим простой пример - у нас есть зоомагазин, который мы с вами
     * оборудовали "умными помощниками". Эти помощники делают часть работ за нас -
     * считают сколько корма надо тому или иному животному, могут включить для животных
     * звуки утра, чтобы они легче проснулись или звуки ночного дождя, чтобы спокойнее спали.
     * А так же отдельно могут посчитать за нас часть бухгалтерской работы.
     *
     * Давайте взглянем на каждый из этих методов (помощников) отдельно.
     *
     * Но прежде, посмотрим, как выглядел бы код без наших методов, когда приходилось
     * все делать самостоятельно:
     *
     * в методе doEverythingByMyself() - "делаюВсеСам()" описан обычный день магазина,
     * когда никаких помощников не было.
     *
     */

    private static void doEverythingByMyself() {
        System.out.println("Включить музыку для пробуждения животных в комнате с птицами");
        System.out.println("Включить музыку для пробуждения животных в террариуме");
        System.out.println("Для пробуждения рыб включаю мягкий свет");

        // теперь необходимо покормить всех животных. В магазине 3 попугая
        // норму корма для каждого мы высчитываем отдельно, согласно возрасту,
        // весу, а также ориентируемся на то самка это или самец, чтобы
        // добавить самке больше минералов для формирования яйца.

        // норма корма для первого попугая, где


        double parrotOneWeight = 2.3; // вес попугая 1, кг
        int parrotOneAge = 3; // возраст попугая 1
        String parrotOneName = "Pirat"; // имя попугая 1
        boolean parrotOneIsFemale = true; // является ли самкой попугай 1

        // логика для подсчета нормы корма в гр:
        double foodForParrotOne = parrotOneWeight * parrotOneAge * 10;

        // кормим первого попугая:
        System.out.printf("Попугай по имени %s получил свою дневную порцию корма размером %.2f грамм\n", parrotOneName, foodForParrotOne);

        // проверяем является ли первый попугай самкой:
        if (parrotOneIsFemale) {
            System.out.printf("Дадим %s дополнительные минералы, так как это самка\n", parrotOneName);
            foodForParrotOne = foodForParrotOne + 1;
        }


        // норма корма для второго попугая, где

        double parrotTwoWeight = 0.7; // вес попугая 2, кг
        int parrotTwoAge = 6; // возраст попугая 2
        String parrotTwoName = "Green Lightning"; // имя попугая 2
        boolean parrotTwoIsFemale = false; // является ли самкой попугай 2

        // логика для подсчета нормы корма в гр:
        double foodForParrotTwo = parrotTwoWeight * 10 - parrotTwoAge * 0.1;

        // кормим второго попугая:
        System.out.printf("Попугай по имени %s получил свою дневную порцию корма размером %.2f грамм\n", parrotTwoName, foodForParrotTwo);

        // проверяем является ли второй попугай самкой:
        if (parrotTwoIsFemale) {
            System.out.printf("Дадим %s дополнительные минералы, так как это самка\n", parrotTwoName);
            foodForParrotTwo  = foodForParrotTwo + 1;
        }



        // норма корма для третьего попугая, где

        double parrotThreeWeight = 1.8; // вес попугая 3, кг
        int parrotThreeAge = 1; // возраст попугая 3
        String parrotThreeName = "Karkusha"; // имя попугая 3
        boolean parrotThreeIsFemale = true; // является ли самкой попугай 3

        // логика для подсчета нормы корма в гр:
        double foodForParrotThree = parrotThreeWeight * 10 - parrotThreeAge * 0.1;

        // кормим третьего попугая:
        System.out.printf("Попугай по имени %s получил свою дневную порцию корма размером %.2f грамм\n", parrotThreeName, foodForParrotThree);

        // проверяем является ли третий попугай самкой:
        if (parrotThreeIsFemale) {
            System.out.printf("Дадим %s дополнительные минералы, так как это самка\n", parrotTwoName);
            foodForParrotThree = foodForParrotThree + 1;
        }


        // наконец закончили считать норму корма для каждого попугая отдельно и теперь мы можем пойти заняться делами,
        // ведь нам надо посчитать сколько мы должны залпатить за корм

        double totalFoodWeight = foodForParrotOne + foodForParrotTwo + foodForParrotThree;
        double priceForKg = 3;

        double totalPrice = totalFoodWeight / 1000 * priceForKg; // перевели в килограммы и умножили на цену
        // тк это бизнес расходы мы можем вернуть ндс, но для этого надо заполнить и отправить форму:

        double priceForReturn = totalPrice * 0.19;

        System.out.printf("форма на возврат %.2f связанных с производственными расходами.\n", priceForReturn);

        // ... работа в магазине

        // теперь можно выключить свет, включить животным звук ночного дождя и идти домой:

        System.out.println("Включаю звуки ночного дождя для животных в комнате с птицами");
        System.out.println("Включаю звуки ночной пустыни для животных в террариуме");
        System.out.println("Для рыб глушу свет");
    }


    /**
     *  а теперь давай посмотрим, как нам  облегчат жизнь наши помощникию
     *
     *  Первый помощник нужен для того, чтобы включить музыку утром.
     *  playMorningMusic - "играйУтреннююМузыку"
     *
     *  для этого помощника не нужны никакие уточняющие факторы (нет аргументов в круглых скобках),
     *  он начинает работать, как только мы его попросили
     *
     *  а также он не возвращает нам ничего (тип возвращаемого значения - void).
     *  Этот метод просто выполняет какую-то процедуру. У насть есть аналогичные помощники дома -
     *  включают таймер для отсчета на кухне, поддерживают температуру при помощи умного термостата и тд.
     *  Это процедурные методы.
     */

    private static void playMorningMusic() {
        System.out.println("Включить музыку для пробуждения животных в комнате с птицами");
        System.out.println("Включить музыку для пробуждения животных в террариуме");
        System.out.println("Для пробуждения рыб включаю мягкий свет");
    }


    /**
     *  второй помощник помогает нам посчитать норму корма для попугая.
     *  Теперь нам не надо считать все это вручную, помощник сам все сделает, покормит
     *  и лишь скажет нам, сколько корма использовал для системы учета.
     *
     *  нам лишь необходимо указать вес, возраст, имя и пол попугая! (аргументы в круглых скобках)
     *  и в ответ мы получим число - вес потраченного корма для внесения его в систему:
     *  "return foodForParrot;"
     *
     *  обратите внимание, "помощника" от которого мы ждем какой-то ответ в виде значения перменной видно сразу -
     *  в его "имени" это прямо указано:
     *
     *  "private static -->double<-- feedParrot(double weight, int age, String name, boolean isFemale)"
     *  то есть, если "помощник" должен перед нами каким-либо образом "отчитаться", в виде числа, строки, логического
     *  значения и тд, то он об этом сразу скажет и при этом он не может НЕ сделать этого, потому что мы ждем
     *  этот результат
     */


    // мне надо передать (double weight, int age, String name, boolean isFemale)
    // мне вернуться вот эти данные double
    private static double feedParrot(double weight, int age, String name, boolean isFemale) {
        double foodForParrot = weight * 10 - age * 0.1;

        // кормим попугая:
        System.out.printf("Попугай по имени %s получил свою дневную порцию корма размером %.2f грамм\n", name, foodForParrot);

        // проверяем является ли  попугай самкой:
        if (isFemale) {
            System.out.printf("Дадим %s дополнительные минералы, так как это самка\n", name);
            foodForParrot = foodForParrot + 1;
        }

        return foodForParrot;
    }

    /**
     *  подобные методы мы используем в повседневной жизни, когда нам надо получить какую-то выписку
     *  (SHUFA в Германии), либо мы можем указать в нашем банковском приложении временной интервали и мы получим отчет
     *  о доходах расходах, можно предположить, что данный метод выглядел бы примерно так:
     *
     *  -->double<-- expensesInDatePeriod(Date start, Date end) {
     *      double expenses = 0;
     *      some logic
     *      return expenses;
     *  }
     */





    /**
     * следующий помощник нужен нам для того, чтобы он составил и отправил запрос на возврат НДС  за нас.
     * Для работы ему нужно лишь знать сколько корма в гр мы потратили и какова цена за корм.
     * Он сам все посчитает и отправит отчет за нас.
     * Это процедурный метод и нам он не возвращает никакое значение:
     *
     * private static -->void<-- calculateTaxes(double totalFoodWeight, double priceForKg )
     */
    private static void calculateTaxes(double totalFoodWeight, double priceForKg) {
        double totalPrice = totalFoodWeight / 1000 * priceForKg; // перевели в килограммы и умножили на цену
        // тк это бизнес расходы мы можем вернуть ндс, но для этого надо заполнить и отправить форму:

        double priceForReturn = totalPrice * 0.19;

        System.out.printf("форма на возврат %.2f связанных с производственными расходами.\n", priceForReturn);
    }


    /**
     * финальный метод готовит животных ко сну. Нам не надо делать все операции самим, лишь позвать нашего
     * "помощника"
     * playNightMusic() - "включиНочнуюМузыку".
     * это тоже проуедурный метод, который нам ничего не возвращает
     */

    private static void playNightMusic() {
        System.out.println("Включаю звуки ночного дождя для животных в комнате с птицами");
        System.out.println("Включаю звуки ночной пустыни для животных в террариуме");
        System.out.println("Для рыб глушу свет");
    }

    /**
     * как же теперь выглядит жизнь в зоомагазине? она состоит из того, что нам необходимо лишь вызывать методы в
     * нуждной последовательности - использовать наших помощников.
     */

    private static void doEverythingByHelpers(){

        //разбудили животных
        playMorningMusic();

        double parrotOneWeight = 2.3; // вес попугая 1, кг
        int parrotOneAge = 3; // возраст попугая 1
        String parrotOneName = "Pirat"; // имя попугая 1
        boolean parrotOneIsFemale = true; // является ли самкой попугай 1

        double parrotTwoWeight = 0.7; // вес попугая 2, кг
        int parrotTwoAge = 6; // возраст попугая 2
        String parrotTwoName = "Green Lightning"; // имя попугая 2
        boolean parrotTwoIsFemale = false; // является ли самкой попугай 2

        double parrotThreeWeight = 1.8; // вес попугая 3, кг
        int parrotThreeAge = 1; // возраст попугая 3
        String parrotThreeName = "Karkusha"; // имя попугая 3
        boolean parrotThreeIsFemale = true; // является ли самкой попугай 3

        double weightOfFood = 0;

        //покормили попугаев
        weightOfFood = feedParrot(parrotOneWeight, parrotOneAge, parrotOneName, parrotOneIsFemale); // weightOfFood = 10
        weightOfFood += feedParrot(parrotTwoWeight, parrotTwoAge, parrotTwoName, parrotTwoIsFemale); // weightOfFood = weightOfFood + 12  = 22
        weightOfFood += feedParrot(parrotThreeWeight, parrotThreeAge, parrotThreeName, parrotThreeIsFemale); // weightOfFood = weightOfFood + 7 = 29

        //отправили форму на возврат ндс
        double priceOfFood = 3.0;
        calculateTaxes(weightOfFood, priceOfFood);

        // был рабочий день

        //запустили процедуры перед сном
        playNightMusic();
    }

}
