package com.seleniumwithjavanavpractice.Wait;

public class TimeUtil {
    private final static int DEFAULT_TIME = 500;
    private final static int DEFAULT_SHORT_TIME = 2000;
    private final static int DEFAULT_MEDIUM_TIME = 5000;
    private final static int DEFAULT_LONG_TIME = 1000;
    private final static int LONG_TIME = 15000;

    public static void defaultTime(){
        try {
            Thread.sleep(DEFAULT_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void shortTime(){
        try {
            Thread.sleep(DEFAULT_SHORT_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void mediumTime(){
        try {
            Thread.sleep(DEFAULT_MEDIUM_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void longTime(){
        try {
            Thread.sleep(DEFAULT_LONG_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void maxLongTime(){
        try {
            Thread.sleep(LONG_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void applyWait(int waitTimeInSeconds){
        try {
            Thread.sleep(waitTimeInSeconds*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
