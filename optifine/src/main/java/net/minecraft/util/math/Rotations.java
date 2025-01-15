package net.minecraft.util.math;

import net.minecraft.nbt.FloatNBT;
import net.minecraft.nbt.ListNBT;

public class Rotations
{
    protected final float x;
    protected final float y;
    protected final float z;

    public Rotations(float p_i2664_1_, float p_i2664_2_, float p_i2664_3_)
    {
        this.x = !Float.isInfinite(p_i2664_1_) && !Float.isNaN(p_i2664_1_) ? p_i2664_1_ % 360.0F : 0.0F;
        this.y = !Float.isInfinite(p_i2664_2_) && !Float.isNaN(p_i2664_2_) ? p_i2664_2_ % 360.0F : 0.0F;
        this.z = !Float.isInfinite(p_i2664_3_) && !Float.isNaN(p_i2664_3_) ? p_i2664_3_ % 360.0F : 0.0F;
    }

    public Rotations(ListNBT p_i2665_1_)
    {
        this(p_i2665_1_.getFloat(0), p_i2665_1_.getFloat(1), p_i2665_1_.getFloat(2));
    }

    public ListNBT writeToNBT()
    {
        ListNBT listnbt = new ListNBT();
        listnbt.add(FloatNBT.valueOf(this.x));
        listnbt.add(FloatNBT.valueOf(this.y));
        listnbt.add(FloatNBT.valueOf(this.z));
        return listnbt;
    }

    public boolean equals(Object p_equals_1_)
    {
        if (!(p_equals_1_ instanceof Rotations))
        {
            return false;
        }
        else
        {
            Rotations rotations = (Rotations)p_equals_1_;
            return this.x == rotations.x && this.y == rotations.y && this.z == rotations.z;
        }
    }

    public float getX()
    {
        return this.x;
    }

    public float getY()
    {
        return this.y;
    }

    public float getZ()
    {
        return this.z;
    }
}
