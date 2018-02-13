package opdrachtpolymorphism;

class Main{
    public static void main(String[] args){

        Car nissan = new Nissan(4, "Nissan Auto");

        nissan.startEngine();
        nissan.accelerate();
        nissan.brake();

        Car ford = new Ford(4, "Ford Auto");

        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Car peugot = new Peugot(6, "Peugot Auto");

        peugot.startEngine();
        peugot.accelerate();
        peugot.brake();

    }
}


class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void accelerate() {
        System.out.println("Ford -> accelerate, ");
    }
}

class Nissan extends Car{

    public Nissan(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void brake() {
        System.out.println("Nissan -> accelerate, ");
    }
}

class Peugot extends Car{

    public Peugot(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Peugot -> accelerate, ");
    }
}



class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public void startEngine(){
        System.out.println("Car -> startEngine, ");
    }

    public void accelerate(){
        System.out.println("Car -> accelerate, ");
    }

    public void brake(){
        System.out.println("Car -> brake, ");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}



