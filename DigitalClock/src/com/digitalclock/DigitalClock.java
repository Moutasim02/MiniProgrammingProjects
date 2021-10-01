package com.digitalclock;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame{
    JLabel jLabClock;
    ClockThread ct;

    public DigitalClock() {
        jLabClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jLabClock.setFont(new Font("Arial", Font.ITALIC, 75));
        jLabClock.setOpaque(true);
        jLabClock.setBackground(Color.yellow);
        add(jLabClock);
        setSize(1200, 120);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
    }



    public static void main(String[] args) {
        new DigitalClock();
    }

}
