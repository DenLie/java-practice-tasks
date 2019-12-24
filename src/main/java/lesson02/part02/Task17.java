package lesson02.part02;

/**
 * Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
 * Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
 * Примеры:
 * а) при вводе чисел
 * 1
 * 2
 * 2
 * получим вывод
 * 2 2
 * <p>
 * б) при вводе чисел
 * 2
 * 2
 * 2
 * получим вывод
 * 2 2 2
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна содержать System.out.println() или System.out.print()
 * 3.	Если два числа равны между собой, необходимо вывести числа на экран.
 * 4.	Если все три числа равны между собой, необходимо вывести все три.
 * 5.	Если нет равных чисел, ничего не выводить.
 */
import java.util.Scanner;
public class Task17 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите 1 число ");
    int a = sc.nextInt();
    System.out.println("Введите 2 число ");
    int b = sc.nextInt();
    System.out.println("Введите 3 число ");
    int c = sc.nextInt();

    if (a == b && a == c && b == c) {
      System.out.println(a + " " + b + " " + c);
    } else if (a == b) {
      System.out.println(a + " " + b);
    } else if (a==c){
        System.out.println(a +" "+ c);
    }else if (b==c){
        System.out.println(b +" "+ c);
    }else{
        System.out.println("Пары равных между собой чисел нет");
    }
  }
}
