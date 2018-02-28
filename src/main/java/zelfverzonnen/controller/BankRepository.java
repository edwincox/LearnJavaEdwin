package zelfverzonnen.controller;

import org.springframework.data.repository.CrudRepository;

public interface BankRepository extends CrudRepository{

    @Override
    default Object save(Object o) {
        return null;
    }
}