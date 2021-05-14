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

        System.out.println("\n### Main menu");
        System.out.println("Type '1' to use showTask");
        System.out.println("Type '2' to use editTask");
        System.out.println("Type '3' to use addTask");
        System.out.println("Type '4' to use deleteTask");
        System.out.println("Type 'q' to exit");
        //Тут вывод строк главного меню с вариантами действий
    }
}
