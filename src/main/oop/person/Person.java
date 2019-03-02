package person;

import java.util.UUID;

public class Person {

    String name;

    String surname;

    int age;

    String pesel;

    UUID id;

    public Person() {
        this.id = UUID.randomUUID();
    }

    public Person(String name, String surname, int age, String pesel) {
        this();

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                ", id=" + id.toString() +
                '}';
    }

    protected void finalize( ) throws Throwable
    {
        System.out.println("Niszczenie obiektu...Person");
    }
}
