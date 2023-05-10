package boolean1;
import java.util.Scanner;

/**
 Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.

 Требования:
 •	Программа должна считывать две строки c клавиатуры.
 •	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
 •	Если строки разные, то программа должна вывести сообщение "строки разные".
*/

public class Sravnenie_strok {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s1 = console.nextLine();
        String s2 = console.nextLine();
        if (s1.equals(s2))
        System.out.println("строки одинаковые");
        else
        System.out.println("строки разные");
    }
}
