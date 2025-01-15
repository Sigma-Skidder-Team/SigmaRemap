package net.minecraft.world.border;

public enum BorderStatus
{
    GROWING(4259712),
    SHRINKING(16724016),
    STATIONARY(2138367);

    private final int color;

    private BorderStatus(int p_i2728_3_)
    {
        this.color = p_i2728_3_;
    }

    public int getColor()
    {
        return this.color;
    }
}
