package lesson02.part02;

/**
 * Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
 * Вывести на экран порядковый номер числа, отличного от остальных.
 * Пример для чисел 4 6 6:
 * 1
 * Пример для чисел 6 6 3:
 * 3
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна использовать команды System.out.println() или System.out.print().
 * 3.	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
 * 4.	Если все числа разные, ничего не выводить.
 */
import java.io.*;
import java.util.*;

public class Task24 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите 1 число ");
    int a = sc.nextInt();
    System.out.println("Введите 2 число ");
    int b = sc.nextInt();
    System.out.println("Введите 3 число ");
    int c = sc.nextInt();

    if (a == b & a != c) {
      System.out.println("3");
    } else if (b == c && b != a) {
      System.out.println("1");
    } else if (a == c && a != b) {
      System.out.println("2");
    }
  }
}
