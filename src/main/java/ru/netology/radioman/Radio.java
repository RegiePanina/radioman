package ru.netology.radioman;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;


    public int getCurrentRadioStation() {
        return currentRadioStation;

    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > maxVolume) {
            return;
        }
        if (soundVolume < minVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 10) {
            soundVolume++;
        } else {
            soundVolume = maxVolume;
        }
    }

    public void reduceVolume () {
        if (soundVolume > 0) {
            soundVolume--;
        } else {
            soundVolume = minVolume;
        }
    }

    public void increaseRadioStation () {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void reduceRadioStation () {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }
}