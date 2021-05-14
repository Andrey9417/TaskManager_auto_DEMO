package package1;

public class Task {

    private String name= "ads";
    private int date = 24;
    private int time = 11;

    public Task(String name, int date, int time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return name + " " + date +" " + time;
    }
    /* Тут надо определиться с полями для объекта Task
    *
    * сделать геттеры сеттеры, какие нужно
    *
    * может чето еще добавить..
    *
    * */
}
