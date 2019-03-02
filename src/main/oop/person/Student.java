package person;

public class Student extends  Person {

    @Override
    public void eat(String food) {
//        super.eat(food);
        System.out.println("Student eat : " + food);
    }
}
