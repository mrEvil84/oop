package person;

public class Teacher extends Person {

    @Override
    public void eat(String food) {
        System.out.println("Teacher eat : " + food);
    }
}
