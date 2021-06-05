import java.util.Scanner;

public class Mathematic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hp = 50;
        int monsterHP = 50;
        int damage = 10;
        int enemyDamage = 10;
        int enemyChooseTarget;
        int enemyBlockTarget;
        int chooseTarget;
        int chooseBlock;


        System.out.println("Выбирай для атаки и блока значения от 1 до 5 включительно!");

        while (hp > 0 && monsterHP > 0) {

            chooseBlock = scan.nextInt();
            chooseTarget = scan.nextInt();
            enemyChooseTarget = 1 + (int) (Math.random() * 5);
            enemyBlockTarget = 1 + (int) (Math.random() * 5);

            if (chooseTarget == enemyBlockTarget) {
                System.out.println("Ты промахнулся!");
            } else {
                monsterHP -= damage;
                System.out.println("Ты пробил цель! У противника осталось " + monsterHP + " жизней!");
            }

            if (enemyChooseTarget == chooseBlock) {
                System.out.println("Противник промахнулся!");
            } else {
                hp -= enemyDamage;
                System.out.println("Противник попал по тебе! У тебя осталось " + hp + " жизней!");
            }
        }
        if (hp <= 0) {
            System.out.println("Бой закончен! Ты проиграл!");
        } else {
            System.out.println("Бой закончен! Ты выиграл!");
        }
    }
}
