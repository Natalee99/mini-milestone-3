package org.example.vehicle;

import java.time.LocalDate;

public class Trolley extends Vehicle{


    public Trolley(int id, String plateNumber, int capacity, LocalDate lastService) {
        super(id, plateNumber, capacity, lastService);
        addFuelType(FuelType.GAS);
        addFuelType(FuelType.HYBRID);

    }
}
