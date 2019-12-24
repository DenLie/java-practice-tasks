package lesson02.part02;

/**
 * Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них. Если два числа равны между собой, необходимо вывести любое.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить на экран минимальное из двух целых чисел.
 * 4.	Если два числа равны между собой, необходимо вывести любое.
 */
import java.util.Scanner;
public class Task18 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите 1 число ");
    int a = sc.nextInt();
    System.out.println("Введите 2 число ");
    int b = sc.nextInt();


     if(a<=b){
        System.out.println(a);
    }else{
        System.out.println(b);
      }

  }
}
