package package1;

import java.util.Scanner;

public class PodKapotom {
    private InnerFunctions functions;

    public PodKapotom(InnerFunctions functions) {
        this.functions = functions;
    }

    /* Тут еще надо добавить:
    *
    * запись в фаил и считку с фаила;
    *
    * объявить коллекцию для хранения данных
    *
    *
    *
    * */
    Scanner scan = new Scanner(System.in);

    public void showTask(){
        System.out.println("choose");
        String str = scan.nextLine();
        if (str.equals("q")){

            functions.loadFromFile();
        }
        /*
        System.out.println("choose");
        String str = scan.nextLine();
        // тут тоже сделать ввод в цикле, чтоб можно было ошибочные вводы делать
        switch(str){
            case "1":
            {
                System.out.println(1);
                // вызов метода: выводится ближайший по времени таск
                break;
            }
            case "2":
            {
                System.out.println(2);
                // вызов метода: выводятся таски на сегодня
                break;
            }
            case "3":
            {
                System.out.println(3);
                // вызов метода: выводятся все таски
                break;
            }
            case "0":
            {
                System.out.println(0);
                break;
            }
            default:
            {
                System.out.println("wrong");
            }
        }
         */

    }

    public void editTask(){
        System.out.println("choose");
        String str = scan.nextLine();
        if (str.equals("q")){

            functions.loadFromFile();
        }
        // "введите название таска"  (можно тоже в цикле чтоб было несколько попыток)
        // "хотите изменить дату?" y/n
        // "хотите изменить время?" y/n
        // "хотите изменить название?" y/n
    }

    public void addTask(){
        System.out.println("choose");
        String str = scan.nextLine();
        if (str.equals("q")){

            functions.loadFromFile();
        }
        // введите название таска
        // введите дату таска
        // введите время таска
        // тут можно проверить что такой таск уже возможно есть в списке и сказать об этом
        // плюс можно подсказать, нет ли уже тасков назначенных на это время
    }

    public void deleteTask(){
        System.out.println("choose");
        String str = scan.nextLine();
        if (str.equals("q")){

            functions.loadFromFile();
        }
        // "введите название таска"
        // "вы действительно хотите удалить данный таск?" (вывести таск на экран)  y/n

    }
}
