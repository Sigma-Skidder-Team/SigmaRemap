// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class TimerUtil {
    private long lastUpdate;
    private long elapsedTime;
    private boolean running;

    public TimerUtil() {
        this.lastUpdate = 0L;
        this.elapsedTime = 0L;
        this.running = false;
    }

    public void start() {
        this.running = true;
        this.lastUpdate = System.currentTimeMillis();
    }

    public void stop() {
        this.running = false;
    }

    public void reset() {
        this.elapsedTime = 0L;
        this.lastUpdate = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (this.running) {
            this.elapsedTime += System.currentTimeMillis() - this.lastUpdate;
            this.lastUpdate = System.currentTimeMillis();
        }
        return this.elapsedTime;
    }

    public void setElapsedTime(final long elapsedTime) {
        this.lastUpdate = System.currentTimeMillis() - elapsedTime;
        this.elapsedTime = elapsedTime;
    }

    public boolean isRunning() {
        return this.running;
    }
}
