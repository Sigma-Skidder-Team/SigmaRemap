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

    public void reset() {
        this.currentTime = 0L;
        this.systemCurrentTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (this.enabled) {
            this.currentTime = this.currentTime + (System.currentTimeMillis() - this.systemCurrentTime);
            this.systemCurrentTime = System.currentTimeMillis();
        }

        return this.currentTime;
    }

    public void setElapsedTime(long time) {
        this.systemCurrentTime = System.currentTimeMillis() - time;
        this.currentTime = time;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
