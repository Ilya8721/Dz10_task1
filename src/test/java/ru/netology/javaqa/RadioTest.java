package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource({"0", "5", "9"})

    void setRadioStation(int currentRadioStation) {
        Radio radio = new Radio();
        radio.setRadioStation(currentRadioStation);

        int expected = currentRadioStation;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0, 1", "5, 6", "9, 0"})

    void nextRadioStation(int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setRadioStation(currentRadioStation);
        radio.NextRadioStation();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0, 9", "5, 4", "9, 8"})

    void previousRadioStation(int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setRadioStation(currentRadioStation);
        radio.previousRadioStation();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setSoundVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);

        int expected = 50;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}