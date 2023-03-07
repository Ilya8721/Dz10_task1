package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class RadioTest {

    @ParameterizedTest
    @CsvSource({"-5, 0", "-1, 0", "0, 0", "1, 1", "5, 5", "8, 8", "9, 9", "10, 0", "15, 0"})

    void setRadioStation(int currentRadioStation , int expected) {
        Radio radio = new Radio();
        radio.setRadioStation(currentRadioStation);

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

    @ParameterizedTest
    @CsvSource({"-100, 0", "-1, 0", "0, 0", "1, 1", "50, 50", "99, 99", "100, 100", "101, 0", "150, 0"})

    void setSoundVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(currentVolume);

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0, 1", "50, 51", "100, 100"})

    void increaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(currentVolume);
        radio.increaseVolume();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0, 0", "50, 49", "100, 99"})

    void decreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(currentVolume);
        radio.decreaseVolume();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}