package Television;

public class Television {

    boolean onTv;
    boolean offTv;
    int defaultVolume = 5;
    int volume;
    int increaseVolume;
    int currentVolume;


    public boolean onTv() {
        onTv = true;
        return onTv;
    }


    public boolean offTv() {
        offTv = false;
        return offTv;
    }

    public int volumeIncrease(int increaseVolume) {
        currentVolume = defaultVolume + increaseVolume;
        return currentVolume;
    }

    public int voulumeDecrease(int decreaseVolume) {
        currentVolume = defaultVolume - decreaseVolume;
        return currentVolume;
    }
}

