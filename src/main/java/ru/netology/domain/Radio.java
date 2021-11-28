package ru.netology.domain;

public class Radio {
    private int radioStation;
    private int volumeLevel;
    private int numberOfRadioStations = 10;
    private int volumeMax = 100;
    private int volumeMin = 0;

    public Radio (int numberOfRadioStations){
        this.numberOfRadioStations = numberOfRadioStations;
    }

public Radio(){

}

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            radioStation = numberOfRadioStations -1;
        }
        if (radioStation > numberOfRadioStations - 1) {
            radioStation = 0;
        }
        this.radioStation = radioStation;
    }

    public void nextStation() {
        if (radioStation < numberOfRadioStations -1) {
            radioStation = radioStation + 1;
        }
        else  {
            radioStation = 0;
        }
    }

    public void prevStation() {
        if (radioStation > 0) {
            radioStation = radioStation - 1;
        }
        if (radioStation == 0) {
            radioStation = numberOfRadioStations -1;
        }
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel < volumeMin) {
            volumeLevel = volumeMin;
        }
        if (volumeLevel > volumeMax) {
            volumeLevel = volumeMax;
        }
        this.volumeLevel = volumeLevel;
    }


    public void increaseVolume() {
        if (volumeLevel < volumeMax) {
            volumeLevel = volumeLevel + 1;
        }
//        if (volumeLevel == volumeMax) {
//            this.volumeLevel = volumeLevel;
//        }
    }

    public void reductionVolume() {
        if (volumeLevel > volumeMin) {
            volumeLevel = volumeLevel - 1;
        }
//        if (volumeLevel == 0) {
//            this.volumeLevel = volumeLevel;
//        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}