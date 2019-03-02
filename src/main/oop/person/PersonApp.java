package person;

public class PersonApp {

    public static void main(String[] args) throws Throwable {

//        Person p = new Person("Adam", "Nowak", 30, "84101812345");
//        System.out.println(p.toString());
//        changeNameToRomek(p);
//        System.out.println(p.toString());

//        testInstanceOf();
        testEat();

    }

    public static void testEat() {

        Student student = new Student();
        Teacher teacher = new Teacher();
        Mammal student2 = new Student();

        student.eat("sandwich");
        teacher.eat("chicken");

        student2.eat("test");
        student2.voice("give me eat!!");

    }

    public static void changeNameToRomek(Person p) {
        p.setName("Romek");
    }

    public static void testInstanceOf()
    {
        Person person = new Person("Adam", "Kowalski", 34, "123456");
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Teacher);
        System.out.println(person instanceof Mammal);
        //System.out.println(person instanceof Integer);
    }
}
