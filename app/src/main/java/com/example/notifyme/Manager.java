package com.example.notifyme;

import com.example.notifyme.Employer;

public class Manager extends Employer {
    private int salaryBase;


    public Manager(int id, String name, double salary, int salaryBase) {
        super(id, name, salary);
        this.salaryBase = salaryBase;
    }
}
