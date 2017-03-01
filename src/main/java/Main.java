import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 22.02.2017.
 */
public class Main {
    public static void main(String[] s) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(n > 1 ? n % 2 > 0 ? n : n / 2 : 0);
    }
}