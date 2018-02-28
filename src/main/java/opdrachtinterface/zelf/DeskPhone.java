package opdrachtinterface.zelf;

public class DeskPhone implements ITelephone {


    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("No rining " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the desk phone");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        }else {
            return false;
        }
        return isRinging;
    }

    @Override
    public boolean isringing() {
        return isRinging;
    }
}