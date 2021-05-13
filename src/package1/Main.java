package package1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            printMainMenu(); // тут похимичить надо, чтобы красиво все выводилось на экран, когда приходим в главое меню
            String str = sc.nextLine();
            switch(str){
                case "1":
                {
                    System.out.println(1);
                    // вызов метода showTask
                    break;
                }
                case "2":
                {
                    System.out.println(2);
                    // вызов метода editTask
                    break;
                }
                case "3":
                {
                    System.out.println(3);
                    // вызов метода addTask
                    break;
                }
                case "4":
                {
                    System.out.println(4);
                    // вызов метода deleteTask
                    break;
                }
                case "q":
                {
                    return;
                }
                default:
                {
                    System.out.println("wrong");
                }
            }

        }
    }

    private static void printMainMenu() {

        //Тут вывод строк главного меню с вариантами действий
    }
}
