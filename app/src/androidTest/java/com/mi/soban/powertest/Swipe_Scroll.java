package com.mi.soban.powertest;

import android.graphics.Point;
import android.graphics.PointF;

import static com.mi.soban.powertest.InstrumentedTest_Base_class.device;

public class Swipe_Scroll extends InstrumentedTest_Base_class{
    Point size;
    int startx;
    int starty;
    int endy;
    int endx;
    int height;
    int width;

    public void bottomTopswipe(int timeduration) {

        height=device.getDisplayHeight();
        width= device.getDisplayWidth();
        size = device.getDisplaySizeDp();
        System.out.println(size);

        starty = (int) (height * 0.50);
        endy = (int) (height * 0.20);
        startx = width / 2;
        System.out.println("Start swipe operation");
        device.swipe(startx, starty, startx, endy, timeduration);

    }


    public void topBottomswipe(int timeduration) {

        height=device.getDisplayHeight();
        width= device.getDisplayWidth();
        size = device.getDisplaySizeDp();

        starty = (int) (height * 0.50);
        endy = (int) (height * 0.20);
        startx = width / 2;
        System.out.println("Start swipe operation");
        device.swipe(startx, endy, startx, starty, timeduration);

    }
    public void rightLeftSwipe(int timeduration) {

        height=device.getDisplayHeight();
        width= device.getDisplayWidth();
        size = device.getDisplaySizeDp();

        startx = (int) (width * 0.70);
        endx = (int) (width * 0.30);
        starty = height / 2;
        System.out.printf("Start swipe operation");
        device.swipe(startx, starty, endx, starty, timeduration);

    }


    public void leftRightSwipe(int timeduration) {
        // duration should be in milliseconds

        height=device.getDisplayHeight();
        width= device.getDisplayWidth();
        size = device.getDisplaySizeDp();

        startx = (int) (width * 0.70);
        endx = (int) (width * 0.30);
        starty = height / 2;
        System.out.printf("Start swipe operation");
        device.swipe(endx, starty, startx, starty, timeduration);

    }
}
