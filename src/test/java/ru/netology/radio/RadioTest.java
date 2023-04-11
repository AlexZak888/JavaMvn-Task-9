package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void setVolumeMin() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setVolumeBeforeMin() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeOverMin() {
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMax() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBeforeMax() {
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetVolumeOverMax() {
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMinAddOne() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeAddOne() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeAddOneMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume() {
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setVolumeMinusOne() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMinusOneMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMinusOneMax() {
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinStation() {
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStation() {
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setMaxStation() {
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setMinusStation() {
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void notSetStationOverMax() {
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStationMinAdd() {
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationAddOne() {
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMaxAddOne() {
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMin() {
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMinusOne() {
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMaxMinusOne() {
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}


