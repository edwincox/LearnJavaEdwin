package opdrachtObject.Objectenconstructor;

/**
 * Created by CoxEGTPH on 9-2-2018.
 */
public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(12345, 5.00, "Edwin Cox", "edje@hotmail.com", "0678787878");
        System.out.println("Empty constructor");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Constructor with parametes called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(999999, 12.00, customerName, email, phoneNumber);
        System.out.println("Third constructor");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositFunds){
        this.balance += depositFunds;
        System.out.println("Deposit to you account=" + depositFunds);
        System.out.println("New bank balance= " + this.balance );
    }

    public void withdrawFunds(double withdrawFunds){
        double shortBalance = this.balance - withdrawFunds;
        // Mag geen geld er af gehaadl worden wanneer klant min komt te staan
        if (shortBalance < 0){
            System.out.println("Not enoughe money on the balance");
        }else {
            this.balance -= withdrawFunds;
            System.out.println("Withdraw= " + withdrawFunds + " New balance= " + this.balance );
        }

    }

    public void whatIsMyBalance(){
        System.out.println("Your balance= " + this.balance );
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
