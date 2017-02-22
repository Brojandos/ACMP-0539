import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n == 1) System.out.println(0);
        else if (n % 2 == 0) System.out.println(n / 2);
        else System.out.println(n);
    }
}
