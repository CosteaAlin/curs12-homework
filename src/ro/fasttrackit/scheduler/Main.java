package ro.fasttrackit.scheduler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> activities=List.of("read","sleep","run","eat");
        DaySchedule d1=new DaySchedule(DaysOfTheWeek.MONDAY,activities);
        System.out.println(d1);
    }
}
