package com.example.notifyme;

import android.util.Patterns;

public class Employer {
    private int id;
    private String name;
    private double salary;

    public Employer(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Patterns.EMAIL_ADDRESS.matcher(name).matches()) {
            this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (!(salary < 1000000 && salary > 1000000000)) {
            this.salary = salary;
        }
    }
}
