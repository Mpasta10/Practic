import java.util.Scanner; // var 2 

public class Sm_1 {
    public static void main(String args[]) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (input != "") {
            input = scanner.nextLine();
            count += 1;
        }
        if (count != 0) {
            System.out.println("Вы ввели " + count + " параметров");
        } else {
            System.out.println("Вы не передовали параметров");
        }
    }
}
