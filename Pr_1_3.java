import static java.lang.Math.*; // var 10
import java.util.Scanner;

public class Pr_1_3 {
    public static void main(String args[]) {
        double Y, F;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x <= -3) {
            Y = Math.pow(x, 5) + 1;
            F = Math.pow(Math.E, x + 1);
        } else if (-3 < x && x <= 0) {
            Y = 1 + Math.pow(2, tan(x));
            F = Math.pow(x, 4);
        } else {
            Y = Math.pow(1 / tan(x), 2);
            F = Math.pow(tan(x), 1 / 5);
        }
        System.out.println(Y);
        System.out.println(F);
    }
}
