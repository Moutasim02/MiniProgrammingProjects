package com.digitalclock;
import java.util.*; //contains a collection of frameworks, classes, date and time facilities , miscellaneous, event module, etc...
//Now we using .Date
public class ClockThread extends Thread {

    DigitalClock dc;
    String time;
    public ClockThread(DigitalClock dc) {

        this.dc = dc;
        start();
    }

    public void run() {
        try {
            while (true) {
                time = "" + new Date();
                dc.jLabClock.setText(time);
            }
        } catch (Exception e) {
            System.out.println("Error...");
        }

    }
}
