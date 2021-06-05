package EducationJavaOnEnglish;

import java.util.Scanner;

public class LeaveOrWhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing them game! Press q or Q to quit!");


        for (int i = 0; i < 5; i++) {
            String response = scanner.next();
            if (response.equals("q") || response.equals("Q")) {
                System.out.println("You quit the game!");
            } else {
                System.out.println("You are still playing the game *pew pew pew*");
            }
        }
    }
}
