package net.minecraft.client.util;

import java.util.Objects;
import net.minecraft.util.math.Vec3d;

public class PosAndRotation
{
    private final Vec3d field_224786_a;
    private final float field_224787_b;
    private final float field_224788_c;

    public PosAndRotation(Vec3d p_i2015_1_, float p_i2015_2_, float p_i2015_3_)
    {
        this.field_224786_a = p_i2015_1_;
        this.field_224787_b = p_i2015_2_;
        this.field_224788_c = p_i2015_3_;
    }

    public Vec3d func_224783_a()
    {
        return this.field_224786_a;
    }

    public float func_224784_b()
    {
        return this.field_224787_b;
    }

    public float func_224785_c()
    {
        return this.field_224788_c;
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass())
        {
            PosAndRotation posandrotation = (PosAndRotation)p_equals_1_;
            return Float.compare(posandrotation.field_224787_b, this.field_224787_b) == 0 && Float.compare(posandrotation.field_224788_c, this.field_224788_c) == 0 && Objects.equals(this.field_224786_a, posandrotation.field_224786_a);
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return Objects.hash(this.field_224786_a, this.field_224787_b, this.field_224788_c);
    }

    public String toString()
    {
        return "PosAndRot[" + this.field_224786_a + " (" + this.field_224787_b + ", " + this.field_224788_c + ")]";
    }
}
