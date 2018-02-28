package opdrachtInheritance;

public class Ford extends Car{


    private int ruitenwissers;
    private boolean carRadio;
    private boolean automaticClosedDoors;

    public Ford(boolean handSteering, int changeGears, int movingSpeed, int ruitenwissers, boolean carRadio, boolean automaticClosedDoors) {
        super(handSteering, changeGears, movingSpeed);
        this.ruitenwissers = ruitenwissers;
        this.carRadio = carRadio;
        this.automaticClosedDoors = automaticClosedDoors;
    }

    @Override
    public void changingGears(int gears) {
        super.changingGears(gears);
    }

    public int getRuitenwissers() {
        return ruitenwissers;
    }

    public boolean isCarRadio() {
        return carRadio;
    }

    public boolean isAutomaticClosedDoors() {
        return automaticClosedDoors;
    }

}
