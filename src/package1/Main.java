package package1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PodKapotom podKapotom = new PodKapotom(new InnerFunctions());

        while (true){
            printMainMenu(); // тут похимичить надо, чтобы красиво все выводилось на экран, когда приходим в главое меню
            String str = sc.nextLine();
            switch(str){
                case "1":
                {
                    System.out.println(1);
                    podKapotom.showTask();
                    // вызов метода showTask
                    break;
                }
                case "2":
                {
                    System.out.println(2);
                    podKapotom.editTask();
                    // вызов метода editTask
                    break;
                }
                case "3":
                {
                    System.out.println(3);
                    podKapotom.addTask();
                    // вызов метода addTask
                    break;
                }
                case "4":
                {
                    System.out.println(4);
                    podKapotom.deleteTask();
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