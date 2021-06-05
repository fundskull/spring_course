package Poke;

import java.util.Scanner;

public class MassiviVseSuda {
    public static void main(String[] args) {
        int[] x = sozdanieMassiva();
        pokajiMassive(x);
        massiveInitialize(x);
        pokajiMassive(x);
        minusMassive(x);
        pokajiMassive(x);
    }

    public static void massiveInitialize(int[] data) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    public static int[] sozdanieMassiva() {
        Scanner scanner = new Scanner(System.in);
        int massiveCount = Integer.parseInt(scanner.nextLine());
        int[] massive = new int[massiveCount];
        return massive;
    }

    public static void minusMassive(int[] data) {
        int pobedi = 100;
        for (int i = 0; i < data.length; i++) {
            pobedi -= data[i];
            if (pobedi > 0) {
                System.out.println("Продолжай");
                System.out.println(pobedi -= data[i]);
            } else {
                System.out.println("Лол, кек, чебурек, твой массив слишком большой");
                break;
            }
        }
    }

    public static void pokajiMassive(int[] data) {
        for (int i  = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
