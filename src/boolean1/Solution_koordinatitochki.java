package boolean1;
import java.util.Scanner;
/**
Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x",
 а второе - координата "y"). Известно, что точка не лежит на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.

Подсказка:
Принадлежность точки с координатами (x, y) к одной из четвертей определяется следующим образом:

для первой четверти x>0 и y>0;
для второй четверти x<0 и y>0;
для третьей четверти x<0 и y<0;
для четвертой четверти x>0 и y<0
 */

public class Solution_koordinatitochki {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
if (x>0 && y>0)
    System.out.println("1");
else if (x<0 && y>0)
    System.out.println("2");
else if (x<0 && y<0)
    System.out.println("3");
else if (x>0 && y<0)
    System.out.println("4");
    }
}
