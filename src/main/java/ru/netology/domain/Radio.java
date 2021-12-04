package ru.netology.domain;

public class Radio {
    private int radioStation;
    private int volumeLevel;


    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > 9) {
            return;
        }
        this.radioStation = radioStation;
    }

    public void nextStation() {
        if (radioStation < 9) {
            radioStation = radioStation + 1;
        }
        if (radioStation == 9) {
            radioStation = 0;
        }
    }

    public void prevStation() {
        if (radioStation > 0) {
            radioStation = radioStation - 1;
        }
        if (radioStation == 0) {
            radioStation = 9;
        }
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel < 0) {
            volumeLevel = 0;
        }
        if (volumeLevel > 10) {
            volumeLevel = 10;
        }
        this.volumeLevel = volumeLevel;
    }


    public void increaseVolume() {
        if (volumeLevel < 10) {
            volumeLevel = volumeLevel + 1;
        }
        if (volumeLevel == 10) {
            this.volumeLevel = volumeLevel;
        }
    }

    public void reductionVolume() {
        if (volumeLevel > 0) {
            volumeLevel = volumeLevel - 1;
        }
        if (volumeLevel == 0) {
            this.volumeLevel = volumeLevel;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}