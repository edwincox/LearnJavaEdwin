package opdrachtinterface.zelf;

/**
 * Created by CoxEGTPH on 8-2-2018.
 */
public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456789);

        timsPhone.powerOn();
        timsPhone.callPhone(123456789);
        timsPhone.answer();

        timsPhone = new MobilePhone(555555);
        timsPhone.powerOn();
        timsPhone.callPhone(555555);
        timsPhone.answer();


    }
}
