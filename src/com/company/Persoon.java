package com.company;

public class Persoon {


    private String voornaam;
    private String achternaam;


    public void setVoornaam(String voornaam) {

        this.voornaam = voornaam;
    }

    public String getVoornaam() {

        return this.voornaam;
    }

    public void setAchternaam(String achternaam) {

        this.achternaam = achternaam;
    }

    public String getAchternaam() {

        return this.achternaam;
    }

    public String getVolledigeNaam() {

        return String.format("%s %s", this.voornaam, this.achternaam);
    }

}
