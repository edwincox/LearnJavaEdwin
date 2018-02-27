package zelfverzonnen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @RequestMapping("/addBank")
    public String addBank(){
        return "Bank should be add";
    }

    @RequestMapping("/removeBank")
    public String removeBank(){
        return "Bank should be add";
    }
}
