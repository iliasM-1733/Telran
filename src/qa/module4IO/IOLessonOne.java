package qa.module4IO;

import java.io.*;
import java.util.Scanner;

/**
 * IO - Input/Output
 * инструменты (потоки информации) для ввода/вывода иформации в среде JVM.
 * В Java существует стандартных потока, которые создаются автоматически:
 *     - System.out : это стандартный поток вывода, который используется для создания результата программы на устройстве
 * вывода, таком как экран компьютера.
 *     - System.in : это стандартный поток ввода, который используется для чтения символов с клавиатуры или любого
 * другого стандартного устройства ввода.
 *     - System.err: стандартный поток ошибок
 */
public class IOLessonOne {
    private final static String ROOT_PATH = System.getProperty("user.dir") + "/src/qa/module4IO/";


    public static void main(String[] args) throws IOException {
        tryingErrorStream();
    }

    public static void tryingScanner() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(n+k);
    }

    public static void tryingInputStream() {
        String path = "file.txt";
        try  {
            InputStream stream = new FileInputStream(ROOT_PATH + path + 1);
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        } catch (IOException ioException) {
            System.err.println("IOexception");
        } catch (Exception e) {
            String error = e.getMessage();
            System.err.printf("%s\n", error);
        } finally {
            System.out.println("\n\n\nfinally");
        }
    }

    /**
     * отличие BufferReader от InputStream заключается в том, что последний считывает информацию по одному байту, в то
     * время, как BufferReader считывает блоками и временно хранит их в специальном буфере. Это позволяет нам
     * оптимизировать работу программы за счет того, что мы уменьшаем количество обращений к файлу.
     */

    public static void tryingBufferReader() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        try {
            x = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(x);
        }


    }

    public static void tryingErrorStream() {
        System.out.println("simple message");
        System.err.println("error message");

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        System.out.println("Enter characters, and '0' to quit.");
        char c;
        do {
            try {
                c = (char)inputStreamReader.read();
                System.err.println(c);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (c != '0');
    }


    /**
     *  при помощи FileOutputStream Java позволяет создавать любые файлы.
     *  В примере, разобранном на уроке, мы создаем обычный текстовый файл и записываем в него информацию в виде текста,
     *  но аналогичным образом можно создавать фото, видео, аудио файлы.
     *  Для самостоятельного изучения можно разобрать пример создания png изображений при помощи потока вывода:
     *  https://eclipse.github.io/imagen/guide/encode/
      */

    public static void tryingFileOutputStream() throws IOException {
        File file = new File(ROOT_PATH + "test.txt");
        System.out.println(file.exists());
        FileOutputStream fos = new FileOutputStream(file);
        String str = "hello";
        fos.write(str.getBytes());
        fos.close();
        System.out.println(file.exists());
    }
}
