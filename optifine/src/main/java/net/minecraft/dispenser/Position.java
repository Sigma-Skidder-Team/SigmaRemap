package net.minecraft.dispenser;

public class Position implements IPosition
{
    protected final double x;
    protected final double y;
    protected final double z;

    public Position(double p_i2150_1_, double p_i2150_3_, double p_i2150_5_)
    {
        this.x = p_i2150_1_;
        this.y = p_i2150_3_;
        this.z = p_i2150_5_;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public double getZ()
    {
        return this.z;
    }
}
