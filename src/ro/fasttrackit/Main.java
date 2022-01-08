package ro.fasttrackit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /* EXERCISE 1 */
        Map<String, Integer> students = new HashMap<>();
        students.put("Alin", 6);
        students.put("Ion", 8);
        students.put("Bogdan", 9);
        System.out.println(getMaxValue(students));

        /* EXERCISE 2 */
        List<Person> personList = List.of(new Person("Alin", 16, "blonde"),
                new Person("Bogdan", 33, "dark"),
                new Person("Andrei", 22, "grey"),
                new Person("Ion", 22, "dark"));

        System.out.println(getPersonsName(personList));
        System.out.println(getPersonsNameAndAge(personList));
        System.out.println(getOlderPerson(personList, 20));
        System.out.println(getHairColorAndName(personList));
        System.out.println(getAgeAndPerson(personList));

        /* EXERCISE 3 */
        List<Employee> employeeList = List.of(new Employee("David", 25, "orange", "Apple", 120000),
                new Employee("Mihai", 35, "blonde", "Netflix", 126000),
                new Employee("Vlad", 51, "dark", "Microsoft", 142000),
                new Employee("Horea", 39, "dark", "Apple", 135000),
                new Employee("Darius", 22, "grey", "Netflix", 95000));

        System.out.println(getSalariesBiggerThanAmount(employeeList, 140000));
        System.out.println(getPersonsForCompany(employeeList,"Netflix"));
        System.out.println(getSumOfSalaries(employeeList));
        System.out.println(getCompanyWithBiggestSalary(employeeList));
    }

    static String getMaxValue(Map<String, Integer> students) {
        int maxGrade = 0;
        String smartestStudent = null;
        for (var entry : students.entrySet()) {
            if (entry.getValue() > maxGrade) {
                maxGrade = entry.getValue();
                smartestStudent = entry.getKey();
            }
        }
        return smartestStudent;
    }

    static List<String> getPersonsName(List<Person> personList) {
        List<String> personsName = new ArrayList<>();
        for (Person person : personList) {
            personsName.add(person.getName());
        }
        return personsName;
    }

    static Map<String, Integer> getPersonsNameAndAge(List<Person> personList) {
        Map<String, Integer> personMap = new HashMap<>();
        for (Person person : personList) {
            personMap.put(person.getName(), person.getAge());
        }
        return personMap;
    }

    static List<Person> getOlderPerson(List<Person> personList, int age) {
        List<Person> olderPersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > age) {
                olderPersons.add(person);
            }
        }
        return olderPersons;
    }

    static Map<String, List<String>> getHairColorAndName(List<Person> personList) {
        Map<String, List<String>> personMap = new HashMap<>();
        for (Person person1 : personList) {
            List<String> names = new ArrayList<>();
            for (Person person2 : personList) {
                if (person1.getHairColor().equalsIgnoreCase(person2.getHairColor())) {
                    names.add(person2.getName());
                }
            }
            personMap.put(person1.getHairColor(), names);
        }
        return personMap;
    }

    static Map<Integer, List<Person>> getAgeAndPerson(List<Person> personList) {
        Map<Integer, List<Person>> personMap = new HashMap<>();
        for (Person person1 : personList) {
            List<Person> persons = new ArrayList<>();
            for (Person person2 : personList) {
                if (person1.getAge() == person2.getAge()) {
                    persons.add(person2);
                }
            }
            personMap.put(person1.getAge(), persons);
        }
        return personMap;
    }

    static List<Employee> getSalariesBiggerThanAmount(List<Employee> employeeList, int amount) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getSalary() > amount) {
                result.add(employee);
            }
        }
        return result;
    }

    static Map<String, Employee> getPersonsForCompany(List<Employee> employeeList, String company) {
        Map<String, Employee> result = new HashMap<>();
        for (Employee employee : employeeList) {
            if (employee.getCompany().equalsIgnoreCase(company)) {
                result.put(employee.getName(), employee);
            }
        }
        return result;
    }

    static int getSumOfSalaries(List<Employee> employeeList) {
        int sum = 0;
        for (Employee employee : employeeList) {
            sum += employee.getSalary();
        }
        return sum;
    }

    static String getCompanyWithBiggestSalary(List<Employee> employeeList) {
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
}
