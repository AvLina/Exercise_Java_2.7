package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void theStationNumber() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(1);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void maxTheStationNumber() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void minTheStationNumber() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void stationIncrease() {
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.increaseStation(10);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void stationDecrease() {
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.turnDownTheStation(1);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void setVolumeLevel() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseInVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.increaseVolume(1);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void decreaseInVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.reduseVolume(3);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void decreaseInVolume2() {
        radio.setMaxVolume(10);
        radio.setMinVolume(10);
        radio.reduseVolume(10);
        assertEquals(0, radio.getCurrentVolume());
    }

}