package net.minecraft.util;

public class Timer
{
    public int elapsedTicks;
    public float renderPartialTicks;
    public float elapsedPartialTicks;
    private long lastSyncSysClock;
    private final float tickLength;

    public Timer(float p_i2708_1_, long p_i2708_2_)
    {
        this.tickLength = 1000.0F / p_i2708_1_;
        this.lastSyncSysClock = p_i2708_2_;
    }

    public void updateTimer(long p_74275_1_)
    {
        this.elapsedPartialTicks = (float)(p_74275_1_ - this.lastSyncSysClock) / this.tickLength;
        this.lastSyncSysClock = p_74275_1_;
        this.renderPartialTicks += this.elapsedPartialTicks;
        this.elapsedTicks = (int)this.renderPartialTicks;
        this.renderPartialTicks -= (float)this.elapsedTicks;
    }
}
