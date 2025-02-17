import java.util.Scanner; // var 10

public class Pr_1_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextInt(), y = scanner.nextInt();
        if (x > y) {
            System.out.println(y / 2);
        } else {
            System.out.println(x / 2);
        }
    }
}
