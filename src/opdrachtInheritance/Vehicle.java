package opdrachtInheritance;

/**
 * Created by CoxEGTPH on 9-2-2018.
 */
public class Vehicle {

    private boolean handSteering;
    private int changeGears;
    private int movingSpeed;

    public Vehicle(boolean handSteering, int changeGears, int movingSpeed) {
        this.handSteering = handSteering;
        this.changeGears = changeGears;
        this.movingSpeed = movingSpeed;
    }

    public void changingGears(int gears){
        switch (gears){
            case 1:
                increasingDecreasingSpeed(5);
                break;
            case 2:
                increasingDecreasingSpeed(10);
                break;
            case 3:
                increasingDecreasingSpeed(15);
                break;
            case 4:
                increasingDecreasingSpeed(20);
                break;
            case 5:
                increasingDecreasingSpeed(25);
                break;
        }
    }

    public void increasingDecreasingSpeed(int speed){
        this.movingSpeed = speed;
        System.out.println("Speed is " + this.movingSpeed);

    }

    public void steeringWheele(int gradesturen){
        System.out.println("Stuur draait graden " + gradesturen);
    }

    public boolean isHandSteering() {
        return handSteering;
    }

    public int getChangeGears() {
        return changeGears;
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }
}
