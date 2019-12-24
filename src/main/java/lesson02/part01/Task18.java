package lesson02.part01;

/**
 * Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
 * «Имя» получает «число1» через «число2» лет.
 * Пример: Коля получает 3000 через 5 лет.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Программа должна считывать данные с клавиатуры.
 * 3.	Выведенный текст должен содержать введенное имя.
 * 4.	Выведенный текст должен содержать введенное число1.
 * 5.	Выведенный текст должен содержать введенное число2.
 * 6.	Выведенный тест должен полностью соответствовать заданию.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task18 {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = consoleReader.readLine();
        System.out.println("Введите число1: ");
        String num1 = consoleReader.readLine();
        System.out.println("Введите число2: ");
        String num2 = consoleReader.readLine();
        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
        //напишите тут ваш код

    }
}
