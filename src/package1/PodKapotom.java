package package1;

import java.util.Scanner;

public class PodKapotom {
    private InnerFunctions functions;

    public PodKapotom(InnerFunctions functions) {

        this.functions = functions;
        functions.loadFromFile();
    }

    Scanner scan = new Scanner(System.in);

    public void showTask() {
        System.out.println("\n\nЗапущен метод showTask");
        System.out.println("type:\n 1 for next task;\n 2 for tasks for today;" +
                "\n 3 for all tasks;\n 0 - return to main menu");
        cycle:
        while (true) {
            String str = scan.nextLine();
            switch (str) {
                case "1": {
                    System.out.println("next task is:");
                    functions.printNextTask();
                    break cycle;
                }
                case "2": {
                    System.out.println("tasks for today:");
                    functions.printTasksForToday();
                    break cycle;
                }
                case "3": {
                    System.out.println("all future tasks:");
                    functions.printAllTasks();
                    break cycle;
                }
                case "0": {
                    break cycle;
                }
                default: {
                    System.out.println("wrong");
                }
            }
        }
    }

    public void editTask() {
        System.out.println("\n\nЗапущен метод editTask");
        functions.editTask();
    }

    public void addTask() {
        System.out.println("\n\nЗапущен метод addTask");
        functions.addTask();

    }

    public void deleteTask() {
        System.out.println("\n\nЗапущен метод deleteTask");
        functions.deleteTask();
    }
}
