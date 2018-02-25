package opdrachtAbstract;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // abstract methods
    public abstract void eat();
    // abstract methods
    public abstract void breathe();

}