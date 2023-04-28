package boolean1;

import java.util.Scanner;

/**
Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.

Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2

b) при вводе чисел 2 2 2 получим вывод 2 2 2
Требования:
•	Программа должна считывать три числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести их на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводить.
*/

public class Solution2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

   if (a==b && b==c) //важно! Сначала сравнить все три числа из введенных с консоли, т.к. логика может не дойти до этого условия если увидит a=b

            System.out.print(a + " " + b + " " + c);
        else if (a==b)
            System.out.println(a + " " + b);
        else if (a==c)
            System.out.print(a + " " + c);
        else if (b==c)
            System.out.print(b + " " + c);

        /*
        //второе решение через булевые переменные
        boolean ab = (a == b);
        boolean ac = (a == c);
        boolean bc = (b == c);
        if (ab == bc) {
            System.out.print(a + " " + b + " " + c);
        } //работает при трех равных числах
        else if (ab) {
            System.out.print(a + " " + b);
        }//работает при первом и втором одинаковом числе
        else if (ac) {
            System.out.print(a + " " + c);
        } //выводит все три введенных числа???????????????????????
        else if (bc) {
            System.out.print(b + " " + c);
        } // работает при втором и третьем одинаковом числе
        */
    }
}
