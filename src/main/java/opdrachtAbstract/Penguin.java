package opdrachtAbstract;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName() + " i'm not very good at that, can i go for a swim instead");
    }
}
