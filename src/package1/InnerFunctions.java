package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InnerFunctions {

    private List<Task> listOfTasks = new LinkedList<>();

    public void loadFromFile(){

        listOfTasks.clear();
        try (Scanner sc =new Scanner(new File("src/package1/qweqwe1.txt"))){
            while(sc.hasNextLine()){
                String str=sc.nextLine();
                String[] arr = str.split(" ");
                String name = arr[0];
                int date = Integer.parseInt(arr[1]);
                int time = Integer.parseInt(arr[2]);
                listOfTasks.add(new Task(name, date, time));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(listOfTasks);
    }
    public void writeToFile(){
        System.out.println("file with DataBase was updated");
    }

    public void printNextTask(){
        System.out.println("next task");
    }
    public void printTasksForToday(){
        System.out.println("tasks for today");
    }
    public void printAllTasks(){
        System.out.println("all tasks");
        loadFromFile();
    }
    public void editTask(){
        writeToFile();
        System.out.println("method editTask finished");
        // "введите название таска"  (можно тоже в цикле чтоб было несколько попыток)
        // "хотите изменить дату?" y/n
        // "хотите изменить время?" y/n
        // "хотите изменить название?" y/n
    }
    public void addTask(){
        writeToFile();
        System.out.println("method addTask finished");
        // введите название таска
        // введите дату таска
        // введите время таска
        // тут можно проверить что такой таск уже возможно есть в списке и сказать об этом
        // плюс можно подсказать, нет ли уже тасков назначенных на это время
    }
    public void deleteTask(){
        writeToFile();
        System.out.println("method deleteTask finished");
        // "введите название таска"
        // "вы действительно хотите удалить данный таск?" (вывести таск на экран)  y/n
    }

}
