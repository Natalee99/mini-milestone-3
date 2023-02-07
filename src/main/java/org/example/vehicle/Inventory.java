package org.example.vehicle;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Inventory {

    protected LocalDate lastService;
    private List<String> statuses;

    public Inventory() {
    }

    public void addStatus() {
        List<String> statuses = new ArrayList<>();
        for (String status : statuses) {
            statuses.add(status);
        }
        public void getStatus (){
            LocalDate localDate = LocalDate.parse("06");
//                statuses = (localDate.isBefore(LocalDate.parse("36")));
            if (localDate.isBefore("06")){
                System.out.println("in operation");
                if (localDate.isAfter("07") && localDate.isBefore("36")){
                    System.out.println("need repair");

                } else {
                    System.out.println("for scrap");
                }

        }
    }

}
}
