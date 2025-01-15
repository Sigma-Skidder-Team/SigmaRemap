// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util.math;

import mapped.Axis;
import net.minecraft.dispenser.IPosition;
import mapped.Vec2f;
import net.minecraft.client.renderer.Vector3f;

import java.util.EnumSet;

public class Vec3d implements IPosition
{
    public static final Vec3d ZERO = new Vec3d(0.0D, 0.0D, 0.0D);
    public double x;
    public double y;
    public double z;
    
    public Vec3d(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3d(final Vector3f class9138) {
        this(class9138.getX(), class9138.getY(), class9138.getZ());
    }

    public Vec3d(final Vec3i class352) {
        this(class352.getX(), class352.getY(), class352.getZ());
    }

    public Vec3d subtractReverse(Vec3d vec)
    {
        return new Vec3d(vec.x - this.x, vec.y - this.y, vec.z - this.z);
    }

    public Vec3d normalize()
    {
        double d0 = (double)MathHelper.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        return d0 < 1.0E-4D ? ZERO : new Vec3d(this.x / d0, this.y / d0, this.z / d0);
    }

    public double dotProduct(Vec3d vec)
    {
        return this.x * vec.x + this.y * vec.y + this.z * vec.z;
    }

    public Vec3d crossProduct(Vec3d vec)
    {
        return new Vec3d(this.y * vec.z - this.z * vec.y, this.z * vec.x - this.x * vec.z, this.x * vec.y - this.y * vec.x);
    }

    public Vec3d subtract(Vec3d vec)
    {
        return this.subtract(vec.x, vec.y, vec.z);
    }

    public Vec3d subtract(double x, double y, double z)
    {
        return this.add(-x, -y, -z);
    }

    public Vec3d add(Vec3d vec)
    {
        return this.add(vec.x, vec.y, vec.z);
    }

    public Vec3d add(double x, double y, double z)
    {
        return new Vec3d(this.x + x, this.y + y, this.z + z);
    }

    public double distanceTo(Vec3d vec)
    {
        double d0 = vec.x - this.x;
        double d1 = vec.y - this.y;
        double d2 = vec.z - this.z;
        return (double)MathHelper.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
    }

    public double squareDistanceTo(Vec3d vec)
    {
        double d0 = vec.x - this.x;
        double d1 = vec.y - this.y;
        double d2 = vec.z - this.z;
        return d0 * d0 + d1 * d1 + d2 * d2;
    }

    public double squareDistanceTo(double xIn, double yIn, double zIn)
    {
        double d0 = xIn - this.x;
        double d1 = yIn - this.y;
        double d2 = zIn - this.z;
        return d0 * d0 + d1 * d1 + d2 * d2;
    }

    public Vec3d scale(double factor)
    {
        return this.mul(factor, factor, factor);
    }

    public Vec3d inverse()
    {
        return this.scale(-1.0D);
    }

    public Vec3d mul(Vec3d vec)
    {
        return this.mul(vec.x, vec.y, vec.z);
    }

    public Vec3d mul(double factorX, double factorY, double factorZ)
    {
        return new Vec3d(this.x * factorX, this.y * factorY, this.z * factorZ);
    }

    public double length()
    {
        return (double)MathHelper.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double lengthSquared()
    {
        return this.x * this.x + this.y * this.y + this.z * this.z;
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (!(p_equals_1_ instanceof Vec3d))
        {
            return false;
        }
        else
        {
            Vec3d vec3d = (Vec3d)p_equals_1_;

            if (Double.compare(vec3d.x, this.x) != 0)
            {
                return false;
            }
            else if (Double.compare(vec3d.y, this.y) != 0)
            {
                return false;
            }
            else
            {
                return Double.compare(vec3d.z, this.z) == 0;
            }
        }
    }

    public int hashCode()
    {
        long j = Double.doubleToLongBits(this.x);
        int i = (int)(j ^ j >>> 32);
        j = Double.doubleToLongBits(this.y);
        i = 31 * i + (int)(j ^ j >>> 32);
        j = Double.doubleToLongBits(this.z);
        i = 31 * i + (int)(j ^ j >>> 32);
        return i;
    }

    public String toString()
    {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
    
    public Vec3d rotatePitch(final float pitch) {
        float f = MathHelper.cos(pitch);
        float f1 = MathHelper.sin(pitch);
        double d0 = this.x;
        double d1 = this.y * (double)f + this.z * (double)f1;
        double d2 = this.z * (double)f - this.y * (double)f1;
        return new Vec3d(d0, d1, d2);
    }
    
    public Vec3d rotateYaw(final float yaw) {
        float f = MathHelper.cos(yaw);
        float f1 = MathHelper.sin(yaw);
        double d0 = this.x * (double)f + this.z * (double)f1;
        double d1 = this.y;
        double d2 = this.z * (double)f - this.x * (double)f1;
        return new Vec3d(d0, d1, d2);
    }
    
    public static Vec3d fromPitchYaw(final Vec2f p_189984_0_) {
        return fromPitchYaw(p_189984_0_.x, p_189984_0_.y);
    }

    public static Vec3d fromPitchYaw(float pitch, float yaw)
    {
        float f = MathHelper.cos(-yaw * ((float)Math.PI / 180F) - (float)Math.PI);
        float f1 = MathHelper.sin(-yaw * ((float)Math.PI / 180F) - (float)Math.PI);
        float f2 = -MathHelper.cos(-pitch * ((float)Math.PI / 180F));
        float f3 = MathHelper.sin(-pitch * ((float)Math.PI / 180F));
        return new Vec3d((double)(f1 * f2), (double)f3, (double)(f * f2));
    }

    public Vec3d align(EnumSet<Axis> axes)
    {
        double d0 = axes.contains(Axis.X) ? (double)MathHelper.floor(this.x) : this.x;
        double d1 = axes.contains(Axis.Y) ? (double)MathHelper.floor(this.y) : this.y;
        double d2 = axes.contains(Axis.Z) ? (double)MathHelper.floor(this.z) : this.z;
        return new Vec3d(d0, d1, d2);
    }
    
    public double getCoordinate(final Axis axis) {
        return axis.getCoordinate(this.x, this.y, this.z);
    }
    
    @Override
    public final double getX() {
        return this.x;
    }
    
    @Override
    public final double getY() {
        return this.y;
    }
    
    @Override
    public final double getZ() {
        return this.z;
    }
}
