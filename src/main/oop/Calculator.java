package oop;

public class Calculator {

    private int addResult = 0;

    public static int add(int a, int b) {
        return a + b;
    }

    public Calculator add(int param) {
        this.addResult += param;

        return this;
    }

    public int getAddResult() {
        return addResult;
    }
}
