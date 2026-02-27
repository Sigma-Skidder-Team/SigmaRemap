package net.minecraft.util;

public class Timer {
    private static String[] field40355;
    public float renderPartialTicks;
    public float elapsedPartialTicks;
    private long prevTimeMillis;
    private final float tickTime;
    public float timerSpeed = 1.0F;

    public Timer(float var1, long var2) {
        this.tickTime = 1000.0F / var1;
        this.prevTimeMillis = var2;
    }

    public int getPartialTicks(long timeMillis) {
        this.elapsedPartialTicks = (float) (timeMillis - this.prevTimeMillis) / this.tickTime * this.timerSpeed;
        this.prevTimeMillis = timeMillis;
        this.renderPartialTicks = this.renderPartialTicks + this.elapsedPartialTicks;
        int var5 = (int) this.renderPartialTicks;
        this.renderPartialTicks -= (float) var5;
        return var5;
    }
}
