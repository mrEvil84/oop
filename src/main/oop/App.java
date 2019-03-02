package oop;

public class App {

    public static void main(String[] args) {
         testCalculator();
    }

    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static void testCalculator() {

        System.out.println(
                "10 + 10 + 10 + 10 = " +
                        (new Calculator()).add(10).add(10).add(10).add(10).getAddResult()
        );

        System.out.println("20 + 20 = " + Calculator.add(20,20));
    }
}
