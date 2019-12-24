package lesson02.part02;

/**
 * Ввести с клавиатуры строку и число N больше 0.
 * Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
 * Пример ввода:
 * абв
 * 2
 * Пример вывода:
 * абв
 * абв
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать текст c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Каждое значение должно быть выведено с новой строки.
 * 4.	Программа должна выводить на экран строку N раз.
 * 5.	В программе должен использоваться цикл while.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task32 {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите строку ");
    String line = reader.readLine();
    System.out.println("Введите кол-во повторений ");
    int a = Integer.parseInt(reader.readLine());
    while(a>0){
      System.out.println(line);
      a--;
    }

  }
}
