package MotorCycle;

public class Bike {
    private boolean on;
    private boolean off;
    private int increaseSpeed;
    private int decreaseSpeed;
    private int defaultSpeed = 0;
    private int currentSpeed;


    public boolean onBike() {
        on = true;
        return true;
    }


    public boolean offBike() {
        off = false;
        return false;
    }

    public int increaseBikeSpeed(int increaseSpeed) {
        currentSpeed = defaultSpeed + increaseSpeed;
        return currentSpeed;



    }

    public int decreaeBikeSpeed(int decreaseSpeed) {
        currentSpeed = defaultSpeed - decreaseSpeed;
        return currentSpeed;
    }
}
