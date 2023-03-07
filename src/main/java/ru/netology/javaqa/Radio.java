package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public int getVolume() {
        return currentVolume;
    }


    public void setRadioStation(int newRadioStation) {
        if (newRadioStation > 9) {
            return;
        }
        if (newRadioStation < 0) {
            return;
        }
        currentRadioStation = newRadioStation;
    }


    public void NextRadioStation() {

        if (currentRadioStation < 9) {
            currentRadioStation += 1;
        } else {
            currentRadioStation = 0;
        }
    }


    public void previousRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation -= 1;
        } else {
            currentRadioStation = 9;
        }
    }


    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        currentVolume = newVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}
