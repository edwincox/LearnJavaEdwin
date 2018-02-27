package zelfverzonnen.controller;

import org.springframework.stereotype.Service;
import zelfverzonnen.Bank;

@Service
public class BankService {

    public boolean addNewBank(String bankName){
        Bank bank = new Bank(bankName);

        return true;
    }

}
