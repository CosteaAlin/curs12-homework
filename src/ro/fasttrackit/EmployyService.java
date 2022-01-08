package ro.fasttrackit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployyService {
    private final List<Employee> employeeList;

    public EmployyService(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getSalariesBiggerThanAmount(int amount) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getSalary() > amount) {
                result.add(employee);
            }
        }
        return result;
    }

    public Map<String, Employee> getPersonsForCompany(String company) {
        Map<String, Employee> result = new HashMap<>();
        for (Employee employee : employeeList) {
            if (employee.getCompany().equalsIgnoreCase(company)) {
                result.put(employee.getName(), employee);
            }
        }
        return result;
    }

    public int getSumOfSalaries() {
        int sum = 0;
        for (Employee employee : employeeList) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public String getCompanyWithBiggestSalary() {
        HashMap<String, Integer> resultHashMap = new HashMap<>();
        for (Employee employee1 : employeeList) {
            int salary = 0;
            for (Employee employee2 : employeeList) {
                if (employee1.getCompany().equalsIgnoreCase(employee2.getCompany())) {
                    salary += employee2.getSalary();
                }
                resultHashMap.put(employee1.getCompany(), salary);
            }
        }
        return getMaxValue(resultHashMap);
    }

    private String getMaxValue(HashMap<String, Integer> employeeMap) {
        int maxGrade = 0;
        String maxValue = null;
        for (var entry : employeeMap.entrySet()) {
            if (entry.getValue() > maxGrade) {
                maxGrade = entry.getValue();
                maxValue = entry.getKey();
            }
        }
        return maxValue;
    }
}
