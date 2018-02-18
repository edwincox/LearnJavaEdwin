package opdrachtinterface.zelf;

/**
 * Created by CoxEGTPH on 8-2-2018.
 */
public class Main {

    public static void main(String[] args) {

    ITelephone timsPhone;
    timsPhone = new DeskPhone(12345);
    timsPhone.powerOn();
    timsPhone.callPhone(12345);
    timsPhone.answer();
        System.out.println("====================");
    timsPhone = new MobilePhone(98745);
    timsPhone.powerOn();
    timsPhone.callPhone(98745);
    timsPhone.answer();


    }
}
