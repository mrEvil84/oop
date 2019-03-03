package person;

public abstract class Mammal {

    private String name;

    public Mammal() {
        this.name = "Mammal";
    }

    public Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(String food) {
        System.out.println("Mammal eat " + food);
    }

    public void voice(String voice) {

        System.out.println("Mammal : " + voice);
    }
}
