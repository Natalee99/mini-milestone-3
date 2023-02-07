package org.example.vehicle;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import static org.example.vehicle.FuelType.GAS;

public class Bus extends Vehicle{


    public List<String> statuses;
    public int pollutionInd;

    public Bus(int id, String plateNumber, int capacity,LocalDate lastService) {
        super(id, plateNumber, capacity, lastService);
        addFuelType(GAS);
        getUpStatus();
    }

    @Override
    protected void getUpStatus() {
        int periodInMonths = Period.between(this.getLastService(), LocalDate.now()).getMonths();
        if(periodInMonths < 6 && pollutionInd > 5){
            this.setStatus("in operation");
        } else if (periodInMonths > 6 && periodInMonths < 12 &&  pollutionInd >= 3 && pollutionInd <= 5){
            this.setStatus("need repair");
        } else{
            this.setStatus("for scrap");
        }
    }
}


