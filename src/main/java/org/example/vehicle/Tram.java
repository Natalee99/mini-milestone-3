package org.example.vehicle;

import java.time.LocalDate;

public class Tram extends Vehicle{
    public Tram(int id, String plateNumber, int capacity, LocalDate lastService) {
        super(id, plateNumber, capacity, lastService);
        addFuelType(FuelType.ELECTRIC);
        getUpStatus();
    }
}
