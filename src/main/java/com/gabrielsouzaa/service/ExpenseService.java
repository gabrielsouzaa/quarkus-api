package com.gabrielsouzaa.service;

import com.gabrielsouzaa.entity.Expense;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExpenseService {

	public List<Expense> getAllExpensesByClientID() {
        List<Expense> list = new ArrayList<>();
        Expense expense1 = new Expense("Sabesp", 100.0);
        Expense expense2 = new Expense("ENEL", 16.89);
        list.add(expense1);
        list.add(expense2);
		return list;
	}
    

}