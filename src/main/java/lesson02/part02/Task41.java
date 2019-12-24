package lesson02.part02;

/**
 * Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить среднее из трех чисел.
 * 4.	Если все числа равны, вывести любое из них.
 * 5.	Если два числа из трех равны, вывести любое из двух.
 */
import java.util.Scanner;
public class Task41 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите 1 число ");
    int a = sc.nextInt();
    System.out.println("Введите 2 число ");
    int b = sc.nextInt();
    System.out.println("Введите 3 число ");
    int c = sc.nextInt();
    if ((a > b && a < c) || (a < b && a > c)) {
      System.out.println(a);
    }
    if ((b > a && b < c) || (b < a && b > c)) {
      System.out.println(b);
    }
    if ((c > a && c < b) || (c < a && c > b)) {
      System.out.println(c);
    }
    if (a == b && b == c && c == a) {
      System.out.println(a);
    }
    if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
      System.out.println(b);
    }

  }
}
