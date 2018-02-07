package opdrachtautoboxing;

import java.util.ArrayList;

public class Branches {

    private String name;

    private ArrayList<Customer> customers;

    public Branches(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initailAmount){
        if (findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initailAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        int indexOf = customers.indexOf(customerName);

        for (int i=0 ; i < this.customers.size() ; i++){

            if (this.customers.get(i).getName().equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
