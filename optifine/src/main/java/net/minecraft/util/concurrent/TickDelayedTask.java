package net.minecraft.util.concurrent;

public class TickDelayedTask implements Runnable
{
    private final int field_218824_a;
    private final Runnable field_218825_b;

    public TickDelayedTask(int p_i542_1_, Runnable p_i542_2_)
    {
        this.field_218824_a = p_i542_1_;
        this.field_218825_b = p_i542_2_;
    }

    public int getScheduledTime()
    {
        return this.field_218824_a;
    }

    public void run()
    {
        this.field_218825_b.run();
    }
}
