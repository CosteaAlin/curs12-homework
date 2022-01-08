package ro.fasttrackit.scheduler;

import java.util.List;

public class DaySchedule {
    private List<String> activities;
    private DaysOfTheWeek day;

    public DaySchedule(DaysOfTheWeek day, List<String> activities){
        this.day=day;
        this.activities=activities;
    }

    public DaysOfTheWeek getDay(){
        return this.day;
    }

    public List<String> getActivities(){
        return this.activities;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "activities=" + activities +
                ", day=" + day +
                '}';
    }
}
