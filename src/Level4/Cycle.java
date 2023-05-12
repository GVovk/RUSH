package Level4;
//Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота)
// на 10 (ширина), заполненный буквой 'Q'.
public class Cycle {
    public static void main (String[] args) {
        int a = 0;
        while (a < 5) {
            int b =0;
            while (b<10){
                System.out.print("Q");
                b++;
            }
            System.out.println();
            a ++;
        }
    }}