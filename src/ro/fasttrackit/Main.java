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

        StudentService studentService = new StudentService(students);
        studentService.printStudents();
        System.out.println(studentService.getSmartestStudent());

        /* EXERCISE 2 */
        PersonService personService = new PersonService(List.of(
                new Person("Alin", 16, "blonde"),
                new Person("Bogdan", 33, "dark"),
                new Person("Andrei", 22, "grey"),
                new Person("Ion", 22, "dark")));

        System.out.println(personService.getPersonsName());
        System.out.println(personService.getPersonsNameAndAge());
        System.out.println(personService.getOlderPersonThan(20));
        System.out.println(personService.getHairColorAndName());
        System.out.println(personService.getAgeAndPerson());

        /* EXERCISE 3 */
        EmployyService employyService = new EmployyService(List.of(
                new Employee("David", 25, "orange", "Apple", 120000),
                new Employee("Mihai", 35, "blonde", "Netflix", 126000),
                new Employee("Vlad", 51, "dark", "Microsoft", 142000),
                new Employee("Horea", 39, "dark", "Apple", 135000),
                new Employee("Darius", 22, "grey", "Netflix", 95000)));

        System.out.println(employyService.getSalariesBiggerThanAmount(140000));
        System.out.println(employyService.getPersonsForCompany("Netflix"));
        System.out.println(employyService.getSumOfSalaries());
        System.out.println(employyService.getCompanyWithBiggestSalary());
    }


}
