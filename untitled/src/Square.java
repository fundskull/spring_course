public class Square {
    public static void main(String[] args) {
        int wide = 0;
        int high;

        while (wide < 10) {
            high = 0;
            while (high < 20) {
                if (wide == 0 || wide == 9) {
                    System.out.println("o");
                } else if (high == 0 || high == 19) {
                    System.out.println("o");
                } else {
                    System.out.print(" ");
                }
                high++;
            }
                System.out.println();
                wide++;
        }
    }
}
