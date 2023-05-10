package Level4;


import java.util.Scanner;

public class While_i_scanner_console {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int count = 10;
        while (count>0) {
            System.out.println(name + text);
            count--;
        }
            }
}
