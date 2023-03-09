package ru.netology.javaqa;

public class Radio {
    private int numberOfRadioStations = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = numberOfRadioStations - 1;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentRadioStation;
    private int currentVolume;


    public Radio() {}

    public Radio(int numberOfRadioStations) {
        if (numberOfRadioStations >= 1) {
            maxRadioStation = minRadioStation + numberOfRadioStations - 1;
        }
    }


    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public  int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return  maxRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getVolume() {
        return currentVolume;
    }


    public void setRadioStation(int newRadioStation) {
        if (newRadioStation > maxRadioStation) {
            return;
        }
        if (newRadioStation < minRadioStation) {
            return;
        }
        currentRadioStation = newRadioStation;
    }


    public void NextRadioStation() {

        if (currentRadioStation < maxRadioStation) {
            currentRadioStation += 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }


    public void previousRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation -= 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }


    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
        currentVolume = newVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
    }
}
