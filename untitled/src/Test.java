import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 100;

        while (value > 0) {
            int substractValue = scan.nextInt();
            value -= substractValue;
        }
        System.out.println("value < 0");
    }
}
