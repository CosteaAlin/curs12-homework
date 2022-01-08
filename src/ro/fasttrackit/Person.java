package ro.fasttrackit;

public class Person {
    private final String name;
    private final int age;
    private final String hairColor;

    public Person(String name, int age, String hairColor) {
        this.age = age;
        this.name = (handleNulls(name) == true) ? "No name" : name;
        this.hairColor = (handleNulls(hairColor)) ? "No hair color": hairColor;
    }


    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }

    protected Boolean handleNulls(String x) {
        return x == null;
    }
}
