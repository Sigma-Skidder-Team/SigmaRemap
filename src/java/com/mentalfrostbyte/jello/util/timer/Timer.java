package com.mentalfrostbyte.jello.util.timer;

public class Timer {
    private static String[] field34298;
    private long field34299 = 0L;
    private long field34300 = 0L;
    private boolean field34301 = false;

    public void method27118() {
        this.field34301 = true;
        this.field34299 = System.currentTimeMillis();
    }

    public void method27119() {
        this.field34301 = false;
    }

    public void method27120() {
        this.field34300 = 0L;
        this.field34299 = System.currentTimeMillis();
    }

    public long method27121() {
        if (this.field34301) {
            this.field34300 = this.field34300 + (System.currentTimeMillis() - this.field34299);
            this.field34299 = System.currentTimeMillis();
        }

        return this.field34300;
    }

    public void method27122(long var1) {
        this.field34299 = System.currentTimeMillis() - var1;
        this.field34300 = var1;
    }

    public boolean method27123() {
        return this.field34301;
    }
}
