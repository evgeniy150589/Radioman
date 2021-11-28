package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldTheRadioStationTurnOn6() {
        radio.setRadioStation(6);
        int expected = 6;

        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationTurnMinus1() {
        radio.setRadioStation(-1);
        int expected = 9;

        int actual = radio.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldTheRadioStationTurnOn12() {
        radio.setRadioStation(12);
        int expected = 0;

        int actual = radio.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldTheRadioStationBeMore9() {
        radio.setRadioStation(9);

        radio.nextStation();


        int expected = 0;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void shouldTheRadioStationSwitchFrom6To7() {
        radio.setRadioStation(6);

        radio.nextStation();


        int expected = 7;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationBeLess0() {
        radio.setRadioStation(0);

        radio.prevStation();


        int expected = 9;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom5To4() {
        radio.setRadioStation(5);

        radio.prevStation();


        int expected = 4;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo6() {

        radio.setVolumeLevel(6);
        int expented = 6;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo10() {

        radio.setVolumeLevel(10);
        int expented = 10;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnMinus1() {

        radio.setVolumeLevel(-1);
        int expented = 0;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo12() {

        radio.setVolumeLevel(12);

        radio.increaseVolume();

        int expented = 13;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }

    @Test
    public void shouldTheVolumeIncreaseFrom1To2() {

        radio.setVolumeLevel(1);

        radio.increaseVolume();

        int expented = 2;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }


    @Test
    public void shouldTheVolumeReductionFrom59To58() {

        radio.setVolumeLevel(59);

        radio.reductionVolume();

        int expented = 58;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }


    @Test
    public void shouldTheVolumeIncreaseFrom100To101() {

        radio.setVolumeLevel(100);

        radio.increaseVolume();

        int expented = 100;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }

    @Test
    public void shouldTheVolumeDecreaseFrom0() {

        radio.setVolumeLevel(0);

        radio.reductionVolume();

        int expented = 0;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }
}