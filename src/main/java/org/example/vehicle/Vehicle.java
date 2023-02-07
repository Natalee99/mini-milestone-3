package org.example.vehicle;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Vehicle {
    protected int id;

    protected String plateNumber;
    protected int capacity;
    public ArrayList<FuelType> fuelType = new ArrayList<>();
    public String status;
    protected LocalDate lastService;

    public Vehicle(int id, String plateNumber, int capacity, LocalDate lastService) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.capacity = capacity;
        this.lastService = lastService;
        getUpStatus();
    }

    protected void getUpStatus() {
        int periodOfSErvice = Period.between(lastService, LocalDate.now()).getMonths();
        if (periodOfSErvice < 6) {
            setStatus("in operation");
        } else if (periodOfSErvice > 6 && periodOfSErvice < 36) {
            setStatus("need repair");

        } else {
            setStatus("for scrap");
        }

    }



    public int getId() {
        return id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getCapacity() {
        return capacity;
    }




    public LocalDate getLastService() {
        return lastService;
    }
    public ArrayList getFuelType() {
        return fuelType;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void addFuelType(FuelType fuelType) {
        this.fuelType.add(fuelType);
        }


    }


