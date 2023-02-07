package org.example.vehicle;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Inventory {

    protected LocalDate lastService;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVericle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public void addVehicals(List<Vehicle> vehicles){
        for(Vehicle vehicle:vehicles){
            vehicles.add(vehicle);
        }
    }




    public void vehicleStatus(String status){
        ArrayList<Vehicle> vehicleStatus = new ArrayList<>();
        for (Vehicle vehicle: vehicles){
            if(vehicle.getStatus().equals(status)){
                vehicleStatus.add(vehicle);
            }
        }
        for (Vehicle vehicle:vehicleStatus){

        }
    }
}

