package org.example.vehicle;

import java.time.LocalDate;
import java.util.List;

public class Bus extends Vehicle{

    public FuelType GAS;
    public List<String> statuses;
    public int pollutionInd;

    public Bus(int id, int platenumber, int capacity) {
        super(id, platenumber, capacity);
    }

    private void setPollutionIndicator(LocalDate localDate){
        if (localDate.getStatus)
    }

}
