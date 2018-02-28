package opdrachtautoboxing;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branches> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branches>();
    }


    public boolean addBranch(String brancheName){
        if (findBranch(brancheName) == null){
            this.branches.add(new Branches(brancheName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String CustomerName, double initailAmount){
        Branches branches = findBranch(branchName);
        if (branches != null){
            return branches.newCustomer(CustomerName, initailAmount);
        }

        return false;
    }

    public boolean addCustomerTransacton(String branchName, String customerName, double amount){
        Branches branches = findBranch(branchName);
        if (branches != null){
            branches.addCustomerTransaction(customerName, amount);
            return true;
        }
        return false;
    }

    private Branches findBranch(String branchName) {
        for (int i = 0 ; i<this.branches.size() ; i++){
            if (this.branches.get(i).getName().equals(branchName)){
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean showTransations){
        Branches branches = findBranch(branchName);
        if (branches!= null){
            System.out.println("Customer details for branch " + branches.getName());
            int i =0;
            ArrayList<Customer> branchCustomers = branches.getCustomers();
            for (Customer customer : branchCustomers){
                System.out.println("Number " + i +"Customer " + customer.getName());
                i++;
                if (showTransations){
                    System.out.println("Transaction");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j =0 ; j<transactions.size() ; j++){
                        System.out.println(" [ " + (j+1) + " ] " + " Amount " + transactions.get(j) );
                    }
                }
            }

        }else {
            return false;
        }
        return false;
    }

}
