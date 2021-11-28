package ru.netology.domain;

public class Radio {

    private int minStation;
    private int maxStation;
    private int currentStation;

    private int minVolume;
    private int maxVolume;
    private int currentVolume;

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void increaseStation(int i) {
        if (currentStation < 10) {
            currentStation = currentStation + 1;
        }
    }

    public void turnDownTheStation(int i) {
        if (currentStation < 1) {
            currentStation = currentStation + 1;
        }
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume(int i) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduseVolume(int i) {
        if (currentVolume > 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == minVolume) {
            currentVolume = currentVolume + 1;
        }
    }
}












