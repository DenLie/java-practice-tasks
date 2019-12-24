package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список из слов "мама", "мыла", "раму".
 * 2. После каждого слова вставь в список строку, содержащую слово "именно".
 * 3. Вывести результат на экран, каждый элемент списка с новой строки.
 * <p>
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	Объяви переменную типа список строк и сразу проинициализируй ee.
 * 3.	Добавь в список слова: «мама», «мыла», «раму».
 * 4.	После каждого слова добавь в список строку, содержащую слово «именно».
 * 5.	Выведи элементы списка на экран, каждый с новой строки.
 */

public class Task08 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        String s = "именно";
        for (int i = 0; i < 6; i++) {
            if ((i == 1) | (i == 3) | (i == 5))
                list.add(i, s);
            System.out.println(list.get(i));
        }
    }
}
