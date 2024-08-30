package com.mentalfrostbyte.jello.util.timer;

public class TimerUtil {
    private long systemCurrentTime = 0L;
    private long currentTime = 0L;
    private boolean enabled = false;

    public void start() {
        this.enabled = true;
        this.systemCurrentTime = System.currentTimeMillis();
    }

    public void stop() {
        this.enabled = false;
    }

    public void method27120() {
        this.currentTime = 0L;
        this.systemCurrentTime = System.currentTimeMillis();
    }

    public long method27121() {
        if (this.enabled) {
            this.currentTime = this.currentTime + (System.currentTimeMillis() - this.systemCurrentTime);
            this.systemCurrentTime = System.currentTimeMillis();
        }

        return this.currentTime;
    }

    public void method27122(long var1) {
        this.systemCurrentTime = System.currentTimeMillis() - var1;
        this.currentTime = var1;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
