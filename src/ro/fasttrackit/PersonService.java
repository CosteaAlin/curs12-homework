package ro.fasttrackit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
    private final List<Person> personList;

    public PersonService(List<Person> personList) {
        this.personList = personList;
    }

    public List<String> getPersonsName() {
        List<String> personsName = new ArrayList<>();
        for (Person person : personList) {
            personsName.add(person.getName());
        }
        return personsName;
    }

    public Map<String, Integer> getPersonsNameAndAge() {
        Map<String, Integer> personMap = new HashMap<>();
        for (Person person : personList) {
            personMap.put(person.getName(), person.getAge());
        }
        return personMap;
    }

    public List<Person> getOlderPersonThan(int age) {
        List<Person> olderPersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > age) {
                olderPersons.add(person);
            }
        }
        return olderPersons;
    }

    public Map<String, List<String>> getHairColorAndName() {
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

    public Map<Integer, List<Person>> getAgeAndPerson() {
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
}
