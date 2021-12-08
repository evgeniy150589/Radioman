package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldTheRadioStationTurnOn6() {
        Radio radio = new Radio();

        radio.setRadioStation(6);
        int expected = 6;

        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationTurnMinus1() {
        Radio radio = new Radio();

        radio.setRadioStation(-1);
        int expected = 0;

        int actual = radio.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldTheRadioStationTurnOn12() {
        Radio radio = new Radio();

        radio.setRadioStation(12);
        int expected = 0;

        int actual = radio.getRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldTheRadioStationBeMore9() {
        Radio radio = new Radio();
        radio.setRadioStation(9);

        radio.nextStation();


        int expected = 0;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void shouldTheRadioStationSwitchFrom6To7() {
        Radio radio = new Radio();
        radio.setRadioStation(6);

        radio.nextStation();


        int expected = 7;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test

    public void shouldTheRadioStationSwitchFrom8To9() {
        Radio radio = new Radio();
        radio.setRadioStation(8);

        radio.nextStation();


        int expected = 9;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationBeLess0() {
        Radio radio = new Radio();
        radio.setRadioStation(0);

        radio.prevStation();


        int expected = 9;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom5To4() {
        Radio radio = new Radio();
        radio.setRadioStation(5);

        radio.prevStation();


        int expected = 4;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo6() {
        Radio radio = new Radio();

        radio.setVolumeLevel(6);
        int expented = 6;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo10() {
        Radio radio = new Radio();

        radio.setVolumeLevel(10);
        int expented = 10;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnMinus1() {
        Radio radio = new Radio();

        radio.setVolumeLevel(-1);
        int expented = 0;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo12() {
        Radio radio = new Radio();

        radio.setVolumeLevel(12);

        radio.increaseVolume();

        int expented = 10;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }

    @Test
    public void shouldTheVolumeIncreaseFrom1To2() {
        Radio radio = new Radio();

        radio.setVolumeLevel(1);

        radio.increaseVolume();

        int expented = 2;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }


    @Test
    public void shouldTheVolumeReductionFrom5To4() {
        Radio radio = new Radio();

        radio.setVolumeLevel(5);

        radio.reductionVolume();

        int expented = 4;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }


    @Test
    public void shouldTheVolumeIncreaseFrom10To11() {
        Radio radio = new Radio();

        radio.setVolumeLevel(10);

        radio.increaseVolume();

        int expented = 10;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }

    @Test
    public void shouldTheVolumeDecreaseFrom0() {
        Radio radio = new Radio();

        radio.setVolumeLevel(0);

        radio.reductionVolume();

        int expented = 0;
        int actual = radio.getVolumeLevel();
        assertEquals(expented, actual);
    }
}