package net.minecraft.util.math;

public class ColumnPos
{
    public final int x;
    public final int z;

    public ColumnPos(int p_i526_1_, int p_i526_2_)
    {
        this.x = p_i526_1_;
        this.z = p_i526_2_;
    }

    public ColumnPos(BlockPos p_i527_1_)
    {
        this.x = p_i527_1_.getX();
        this.z = p_i527_1_.getZ();
    }

    public String toString()
    {
        return "[" + this.x + ", " + this.z + "]";
    }

    public int hashCode()
    {
        int i = 1664525 * this.x + 1013904223;
        int j = 1664525 * (this.z ^ -559038737) + 1013904223;
        return i ^ j;
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (!(p_equals_1_ instanceof ColumnPos))
        {
            return false;
        }
        else
        {
            ColumnPos columnpos = (ColumnPos)p_equals_1_;
            return this.x == columnpos.x && this.z == columnpos.z;
        }
    }
}
