package lesson02.part02;

/**
 * Ввести с клавиатуры два числа m и n.
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 * Пример: m=2, n=4
 * 8888
 * 8888
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать два числа c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Программа должна выводить прямоугольник размером m на n из восьмёрок.
 * 4.	В программе должен использоваться цикл for.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task36 {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите число 1 ");
    int m = Integer.parseInt(reader.readLine());
    System.out.println("Введите число 2 ");
    int n = Integer.parseInt(reader.readLine());
    for (int j = 0; j < m; j++) {
      for (int i = 0; i < n; i++) {
        System.out.print(8);
      }
      System.out.println();
    }
  }
}
