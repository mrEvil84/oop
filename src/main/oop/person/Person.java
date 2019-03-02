package person;

public class Person {

    String name;

    String surname;

    int age;

    String pesel;

    String status;

    public Person() {
        this.status = "Created";
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

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
