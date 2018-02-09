package opdrachtinterface.zelf;

/**
 * Created by CoxEGTPH on 8-2-2018.
 */
public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk hpone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing "+ phoneNumber + " on deskphone");

    }

    @Override
    public void answer() {
        System.out.println("Answering the desk phone");
        isRinging=false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging=true;
            System.out.println("Ring ring");
        }else {
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
