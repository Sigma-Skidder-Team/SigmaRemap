// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util.math;

import com.google.common.base.MoreObjects;
import net.minecraft.dispenser.IPosition;
import net.minecraft.util.Direction;

import javax.annotation.concurrent.Immutable;

@Immutable
public class Vec3i implements Comparable<Vec3i>
{
    public static final Vec3i NULL_VECTOR = new Vec3i(0, 0, 0);
    @Deprecated
    private final int x;
    @Deprecated
    private final int y;
    @Deprecated
    private final int z;
    
    public Vec3i(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3i(double x, double y, double z)
    {
        this(MathHelper.floor(x), MathHelper.floor(y), MathHelper.floor(z));
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (!(p_equals_1_ instanceof Vec3i))
        {
            return false;
        }
        else
        {
            Vec3i vec3i = (Vec3i)p_equals_1_;

            if (this.getX() != vec3i.getX())
            {
                return false;
            }
            else if (this.getY() != vec3i.getY())
            {
                return false;
            }
            else
            {
                return this.getZ() == vec3i.getZ();
            }
        }
    }

    public int hashCode()
    {
        return (this.getY() + this.getZ() * 31) * 31 + this.getX();
    }

    public int compareTo(Vec3i p_compareTo_1_)
    {
        if (this.getY() == p_compareTo_1_.getY())
        {
            return this.getZ() == p_compareTo_1_.getZ() ? this.getX() - p_compareTo_1_.getX() : this.getZ() - p_compareTo_1_.getZ();
        }
        else
        {
            return this.getY() - p_compareTo_1_.getY();
        }
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getZ() {
        return this.z;
    }
    
    public Vec3i down() {
        return this.down(1);
    }

    public Vec3i down(int n)
    {
        return this.offset(Direction.DOWN, n);
    }

    public Vec3i offset(Direction facing, int n)
    {
        return n == 0 ? this : new Vec3i(this.getX() + facing.getXOffset() * n, this.getY() + facing.getYOffset() * n, this.getZ() + facing.getZOffset() * n);
    }

    public Vec3i crossProduct(Vec3i vec)
    {
        return new Vec3i(this.getY() * vec.getZ() - this.getZ() * vec.getY(), this.getZ() * vec.getX() - this.getX() * vec.getZ(), this.getX() * vec.getY() - this.getY() * vec.getX());
    }

    public boolean withinDistance(Vec3i p_218141_1_, double distance)
    {
        return this.distanceSq(p_218141_1_.getX(), p_218141_1_.getY(), p_218141_1_.getZ(), false) < distance * distance;
    }

    public boolean withinDistance(IPosition p_218137_1_, double distance)
    {
        return this.distanceSq(p_218137_1_.getX(), p_218137_1_.getY(), p_218137_1_.getZ(), true) < distance * distance;
    }

    public double distanceSq(Vec3i to)
    {
        return this.distanceSq(to.getX(), to.getY(), to.getZ(), true);
    }

    public double distanceSq(IPosition p_218138_1_, boolean useCenter)
    {
        return this.distanceSq(p_218138_1_.getX(), p_218138_1_.getY(), p_218138_1_.getZ(), useCenter);
    }

    public double distanceSq(double p_218140_1_, double p_218140_3_, double p_218140_5_, boolean useCenter)
    {
        double d0 = useCenter ? 0.5D : 0.0D;
        double d1 = (double)this.getX() + d0 - p_218140_1_;
        double d2 = (double)this.getY() + d0 - p_218140_3_;
        double d3 = (double)this.getZ() + d0 - p_218140_5_;
        return d1 * d1 + d2 * d2 + d3 * d3;
    }

    public int manhattanDistance(Vec3i p_218139_1_)
    {
        float f = (float)Math.abs(p_218139_1_.getX() - this.getX());
        float f1 = (float)Math.abs(p_218139_1_.getY() - this.getY());
        float f2 = (float)Math.abs(p_218139_1_.getZ() - this.getZ());
        return (int)(f + f1 + f2);
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("x", this.getX()).add("y", this.getY()).add("z", this.getZ()).toString();
    }

    public String func_229422_x_()
    {
        return this.getX() + ", " + this.getY() + ", " + this.getZ();
    }
}
