package com.sda.hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Room {

    int nr;
    ArrayList<Rezervare> rezervari;

    Room(int nr) {
        this.nr = nr;
    }

    boolean reserve(LocalDate date, String name) {

        Rezervare x = new Rezervare(date, name, nr);
        if(rezervari.contains(x)){
            return false;
        } else{
            rezervari.add(x);
            return true;
        }
    }
}
