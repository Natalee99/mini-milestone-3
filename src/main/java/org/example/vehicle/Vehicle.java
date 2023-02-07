package org.example.vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    protected int id;

    protected int platenumber;
    protected int capacity;
    public FuelType type;
    public List<String> statuses;
    protected LocalDate lastService;

    public Vehicle(int id, int platenumber, int capacity) {
        this.id = id;
        this.platenumber = platenumber;
        this.capacity = capacity;
    }





    public int getId() {
        return id;
    }

    public int getPlatenumber() {
        return platenumber;
    }

    public int getCapacity() {
        return capacity;
    }



    public FuelType getFuelType() {
        return fuelType;
    }

    public LocalDate getLastService() {
        return lastService;
    }
}
