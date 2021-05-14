package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InnerFunctions {

    private List<Task> listOfTasks = new LinkedList<>();

    public void loadFromFile(){

        String fileName = "C:\\Users\\USER\\IdeaProjects\\java_auto\\src\\package_1\\Train\\qweqwe1.txt";

        try (Scanner sc =new Scanner(new File(fileName))){
            while(sc.hasNextLine()){
                String str=sc.nextLine();
                String[] arr = str.split(" ");
                String name = arr[0];
                int date = Integer.parseInt(arr[1]);
                int time = Integer.parseInt(arr[1]);
                listOfTasks.add(new Task(name, date, time));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(listOfTasks);
    }
}