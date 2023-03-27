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

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void increaseVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = maxVolume;
        }
    }

    public void reduceVolume () {
        if (soundVolume > 10) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = minVolume;
        }
    }

    public void increaseRadioStation () {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void reduceRadioStation () {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }
}