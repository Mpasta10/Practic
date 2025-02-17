import static java.lang.Math.*; // var 10
import java.util.Scanner;

public class Pr_1_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), mx = Math.max(a, b);
        double d = cos(mx);
        System.out.println(d);
    }
}
