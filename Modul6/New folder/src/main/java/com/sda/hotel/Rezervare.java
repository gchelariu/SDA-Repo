package com.sda.hotel;

import java.time.LocalDate;

public class Rezervare {

    LocalDate date;
    String name;
    int nrRoom;

    Rezervare(LocalDate date, String name, int nrRoom) {
        this.date = date;
        this.name = name;
        this.nrRoom = nrRoom;
    }

    @Override
    public boolean equals(Object x){
        if(x instanceof Rezervare){
            Rezervare tmp = (Rezervare) x;
         return this.date.equals(tmp.date) &&
                 this.nrRoom == tmp.nrRoom;
        } else {
            return false;
        }
    }

}
