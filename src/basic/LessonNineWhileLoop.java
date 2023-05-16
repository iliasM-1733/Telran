package basic;

import java.util.Scanner;

/**
 * Цикл while состоит из блока кода и условия (логического выражения). Если условие равно true, выполняется код внутри
 * блока. Этот код повторяется до тех пор, пока условие не станет false. Поскольку этот цикл проверяет условие перед
 * выполнением блока, структура управления также известна как цикл предварительного тестирования. Вы можете думать о
 * цикле while как о повторяющемся условном операторе.
 * Основной синтаксис цикла while следующий:
 *         while (condition) {
 *             // body: do some logic
 *         }
 * Тело цикла может содержать любые корректные операторы Java, включая условные операторы и даже другие циклы, причем
 * последние называются вложенными циклами.
 */

public class LessonNineWhileLoop {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        tryReturnWithWhile();
    }


    /**
     * simpleWhileLoop - простой цикл while.
     * Данный метод демонстрирует простой запуск цикла, пока условие в скобках () выболняется (true), цикл работает.
     * в каждой итерации цикл печатает значение переменной х, после увеличивает эту переменную на единицу - "х++".
     * Как только х становится равным 10 условие в скобках перестает работать и цикл останавливается.
     */
    private static void simpleWhileLoop() {
        int x = 0;
        while (x < 3) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
    }


    /**
     * simpleWhileLoop - простой цикл while.
     * метод полностью аналогичен методу simpleWhileLoop() и демонстрирует перегрузку методов (когда методы имеют одно
     * и тоже имя, но разный набор или последовательность аргументов)за исключением того, что в качестве аргумента
     * принимает целое число, которое будет счетчиком итераций. Вся остальная логика сохранена.
     */
    private static void simpleWhileLoop(int x) {

        while (x > 0) { // 0

            System.out.print(x + " ");
            x--; // 0

        }

        System.out.println();
    }

    /**
     * whileLoopWithChar - цикл while с char.
     * В качестве условия в круглых скобках цикла может выступать любое выражение, которое дает булевый результат (true
     * или false). Так как char также можно итерировать, то есть перечислять с заданным шагом (см. таблицу ASCII),
     * в программирование на Java есть возможность перечислять и изменять перемнные данного типа.
     * В качестве условия выполнения данного метода выступает выражение  (letter <= 'Z'), данное выражение будет
     * выполнятся до тех пор, пока мы используем символы, стоящие в таблице символов ранее символа 'Z'. В условиях
     * данного метода исходный символ всегда задан изначально и равен 'A'. Таким образом данный цикл распечатает в
     * консоль весь латинский алфавит.
     */
    private static void whileLoopWithChar() {
        char letter = 0;
        while (letter < 128) { // false
            System.out.print("\'" + letter + "\'" + " ");
            letter++;
        }

    }

    /**
     * simpleDoWhileLoop - простой цикл do-while.
     * В отличии от цикла while, где перед первой итерацие проверяется условие выполнения, что стоит в круглых скобках,
     * в цикле do-while всегда выполнится хотя бы одна итерация, только затем будет выполнятся проверка условия.
     * В данном примере, в качестве аргумента мы принимает переменную типа int, далее мы в любом случае выполняем код,
     * который находится в теле цикла do-while (код в фигурных скобках после ключевого слова do), в ходе выполнения
     * данного кода происходит увеличение на 1 значения переменной х и только затем проверка условия в круглых скобках.
     * В случае, если в круглых скобках цикла будет значение true, то выполнится новая итерация данного цикла, до тех
     * пор, пока условие не станет ложным.
     * В случае, если передать в качестве аргумента 100 - код выполнится один раз, далее произойдет проверка и цикл
     * остановится.
     * В случае, если передать в качестве аргумента 0 - код выполнится 10 раз, далее произойдет проверка и цикл
     * остановится.
     * В случае, если передать в качестве аргумента 9 - код выполнится один раз, переменная х увеличится на один,
     * далее произойдет проверка и цикл остановится.
     */
    private static void simpleDoWhileLoop(int x) { // x = 8
        do {

            System.out.println("i print it from do-while loop. x = " + x);
            x++; // x = 10

        } while (x < 10);  // true or false
    }

    /**
     * simpleWhileDoLoop - простой цикл while.
     * В циклах while-do всегда перед первой итерацией проверяется условие выполнения, что стоит в круглых скобках,
     * если условие выполняется (true), то код в теле цикла тоже выполнится.
     * В данном пирмере, в качестве аргумента мы принимает переменную типа int, далее происходит проверка условия
     * выполнения (x < 10), по завершению которой код либо выполняется, либо нет. в ходе выполнения
     * данного кода происходит увеличение на 1 значения переменной х и затем новыя итерация цикла.
     * В случае, если в круглых скобках цикла будет значение true, то выполнится новая итерация данного цикла, до тех
     * пор, пока условие не станет ложным.
     * В случае, если переадать в качестве аргумента 100 - произойдет проверка (x < 10) и код не выполнится ни разу.
     * В случае, если переадать в качестве аргумента 0 - произойдет проверка (x < 10) и код выполнится 10 раз, далее
     * произойдет проверка и цикл остановится, когда условие перестанет выполнятся.
     * В случае, если переадать в качестве аргумента 9 - произойдет проверка (x < 10) код выполнится один раз, переменная
     * х увеличится на один, далее произойдет проверка и цикл остановится.
     */
    private static void simpleWhileDoLoop(int x) {
        while (x < 10) {
            System.out.println("i print it from while-do loop");
            x++;
        }
    }

    /**
     * whileLoopWithScanner - цикл while со сканнером
     * данный цикл работает до тех пор, пока пользовательпередает данные в консоль. Метод scanner.hasNext() - возвращает
     * true в том случае, если в консоли есть данные для считывания и false - если все данные считаны и новых нет.
     * Данный цикл в каждой итерации считывает новое число из консоли и прибавляет его к переменной sum, после
     * завершения цикла в консольраспечатывается сумма всех введенных чисел.
     * Так как Java не понимает, когда мы перестали вводить числа в консоль, нам необходимо явно это указать нажав
     * комбинацию клавиш:
     * Mac: 'command' + 'D'
     * Windows: 'Ctrl' + 'D'
     */
    private static void whileLoopWithScanner() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            sum += elem;
        }

        System.out.println(sum);
    }

    /**
     * tryBreakWithWhile - использование break с циклом while.
     * аналогично использованию с циклом for, ключевое слово break полностью остановит цикл while.
     * В данном примере мы используем бесконечный цикл while, тк его условие выполнения никогда не станет false.
     * Даднный цикл по своей логике похож на цикл из метода whileLoopWithScanner(), за исключением условия остановки,
     * так как мы ориентируемся на вводимые данные, как только переменная х станет равна 0, то есть пользователь введет
     * 0, выполнится условие для блока if (x == 0) и сработает ключевое слово break, после чего работа цикла будет
     * остановлена и в консоль выведется сумма всех чисел введенных пользователем ранее.
     *
     * В случае вложенных циклов, ключевое слово break остановит лишь тот цикл, в котором оно использовано,
     * то есть только вложенный цикл.
     */
    private static void tryBreakWithWhile() {
        int sum = 0;
        while (true) {
            int x = SCANNER.nextInt();
            if (x == 0) {
                break;
            }
            sum += x;
        }
        System.out.println(sum);
    }

    /**
     * tryContinueWithWhile - использование continue с циклом while.
     * аналогично использованию с циклом for, ключевое слово continue остановит лишь одну итерацию цикла while.
     * В данном примере мы используем бесконечный цикл while, тк его условие выполнения никогда не станет false.
     * Данный цикл по своей логике похож на цикл из метода tryBreakWithWhile(), данный цикл также остановится,
     * как только переменная х станет равна 0, то есть пользователь введет
     * 0, выполнится условие для блока else if (x == 0) и сработает ключевое слово break, после чего работа цикла будет
     * остановлена и в консоль выведется сумма нечетных всех чисел введенных пользователем ранее.
     *
     * Но также следует обратить внимание на блок
     * if (x % 2 == 0) { continue;}
     * в данном случае, если пользователь введет четное число, выполнится блок кода if, который ведет к ключевому слову
     * continue, после которого прерывается лишь данная конкретная итерация.
     *
     * В случае вложенных циклов, ключевое слово continue остановит лишь итерацию того цикла, в которой оно использовано,
     * то есть только вложенного цикла.
     */
    private static void tryContinueWithWhile() {
        int sum = 0;
        while (true) {
            int x = SCANNER.nextInt();
            if (x % 2 == 0 && x != 0) {
                continue;
            } else if (x == 0) {
                break;
            }
            sum += x;
        }
        System.out.println(sum);
    }

    /**
     * tryReturnWithWhile - использование return с циклом while.
     * аналогично использованию с циклом for, ключевое слово return остановит не просто цикл, но и выполнение всего метода.
     * В данном примере мы используем бесконечный цикл while, тк его условие выполнения никогда не станет false.
     * Данный цикл по своей логике похож на цикл из метода tryBreakWithWhile(), данный цикл также остановится,
     * как только переменная х станет равна 0, то есть пользователь введет 0, выполнится условие для блока if (x == 0)
     * и сработает ключевое слово return, после чего работа цикла и всего метода будет завершена. Так как это единственное
     *  условие остановки цикла, а также всего метода, код после цикла никогда не выполнится, и Java посчитает ошибкой
     *  если после цикла будет какой-то исполняемый код. Именно по этой причине последняя строка закомментирована.
     *
     *  Ключевое слово return остановит выполнение всего метода не зависимо от того, сколько вложенных циклов мы
     *  используем.
     */
    private static void tryReturnWithWhile() {
        int sum = 0;
        while (true) {
            int x = SCANNER.nextInt();
            if (x == 0) {
                System.out.println(sum);
                return;
            }
            sum += x;
        }
//        System.out.println(sum);
    }

}