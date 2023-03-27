package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(3);
        //radio.increaseRadioStation();


        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(10);

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(11);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetUnderMinVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(4);
        radio.increaseVolume();

        int expected = 5;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(4);
        radio.reduceVolume();

        int expected = 3;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValuesVolumeInsideUp() {
        Radio radio = new Radio();

        radio.setSoundVolume(9);

        int expected = 9;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limitValuesVolumeOutsideUp() {
        Radio radio = new Radio();

        radio.setSoundVolume(11);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesVolumeInsideDown() {
        Radio radio = new Radio();

        radio.setSoundVolume(1);

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limitValuesVolumeOutsideDown() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}


