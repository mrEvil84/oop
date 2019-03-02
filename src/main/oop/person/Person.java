package person;

import java.util.UUID;

public class Person extends Mammal {

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

//    @Override
//    public void eat(String food) {
//        System.out.println("Person eat " + food);
//    }

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
                ", pesel='" + pesel +
                '}';
    }

    protected void finalize( ) throws Throwable
    {
        System.out.println("Niszczenie obiektu...Person");
    }

    public void setName(String name) {
        this.name = name;
    }
}
