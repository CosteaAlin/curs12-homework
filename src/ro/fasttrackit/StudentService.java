package ro.fasttrackit;

import java.util.Map;

public class StudentService {
    private Map<String, Integer> studentMap;

    public StudentService(Map<String,Integer> studentMap){
        this.studentMap=studentMap;
    }

    public void printStudents(){
        for (var entry : studentMap.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public String getSmartestStudent() {
        int maxGrade = 0;
        String smartestStudent = null;
        for (var entry : studentMap.entrySet()) {
            if (entry.getValue() > maxGrade) {
                maxGrade = entry.getValue();
                smartestStudent = entry.getKey();
            }
        }
        return smartestStudent;
    }
}
