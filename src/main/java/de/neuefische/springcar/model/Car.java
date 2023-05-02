package de.neuefische.springcar.model;

import java.util.UUID;

public class Car {

    UUID id = UUID.randomUUID();
    String hersteller;
    int reifen;
    boolean hatTuev;

    public Car(String hersteller, int reifen, boolean hatTuev) {
        this.hersteller = hersteller;
        this.reifen = reifen;
        this.hatTuev = hatTuev;
    }

    public String gethersteller() {
        return hersteller;
    }

    public void sethersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getreifen() {
        return reifen;
    }

    public void setreifen(int reifen) {
        this.reifen = reifen;
    }

    public boolean gethatTuev() {
        return hatTuev;
    }

    public void sethatTuev(boolean hatTuev) {
        this.hatTuev = hatTuev;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
