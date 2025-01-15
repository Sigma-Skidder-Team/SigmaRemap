// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util.math;

import com.google.common.base.MoreObjects;
import mapped.Class5488;
import net.minecraft.util.Direction;

import javax.annotation.concurrent.Immutable;

@Immutable
public class Vec3i implements Comparable<Vec3i>
{
    public static final Vec3i field2166;
    @Deprecated
    private final int field2167;
    @Deprecated
    private final int field2168;
    @Deprecated
    private final int field2169;
    
    public Vec3i(final int field2167, final int field2168, final int field2169) {
        this.field2167 = field2167;
        this.field2168 = field2168;
        this.field2169 = field2169;
    }
    
    public Vec3i(final double n, final double n2, final double n3) {
        this(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Vec3i) {
            final Vec3i class352 = (Vec3i)o;
            return this.getX() == class352.getX() && this.getY() == class352.getY() && this.getZ() == class352.getZ();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.getY() + this.getZ() * 31) * 31 + this.getX();
    }
    
    @Override
    public int compareTo(final Vec3i class352) {
        if (this.getY() != class352.getY()) {
            return this.getY() - class352.getY();
        }
        return (this.getZ() != class352.getZ()) ? (this.getZ() - class352.getZ()) : (this.getX() - class352.getX());
    }
    
    public int getX() {
        return this.field2167;
    }
    
    public int getY() {
        return this.field2168;
    }
    
    public int getZ() {
        return this.field2169;
    }
    
    public Vec3i method1077() {
        return this.method1078(1);
    }
    
    public Vec3i method1078(final int n) {
        return this.method1079(Direction.DOWN, n);
    }
    
    public Vec3i method1079(final Direction class179, final int n) {
        return (n != 0) ? new Vec3i(this.getX() + class179.getXOffset() * n, this.getY() + class179.getYOffset() * n, this.getZ() + class179.getZOffset() * n) : this;
    }
    
    public Vec3i method1080(final Vec3i class352) {
        return new Vec3i(this.getY() * class352.getZ() - this.getZ() * class352.getY(), this.getZ() * class352.getX() - this.getX() * class352.getZ(), this.getX() * class352.getY() - this.getY() * class352.getX());
    }
    
    public boolean method1081(final Vec3i class352, final double n) {
        return this.method1085(class352.getX(), class352.getY(), class352.getZ(), false) < n * n;
    }
    
    public boolean method1082(final Class5488 class5488, final double n) {
        return this.method1085(class5488.method16760(), class5488.method16761(), class5488.method16762(), true) < n * n;
    }
    
    public double method1083(final Vec3i class352) {
        return this.method1085(class352.getX(), class352.getY(), class352.getZ(), true);
    }
    
    public double method1084(final Class5488 class5488, final boolean b) {
        return this.method1085(class5488.method16760(), class5488.method16761(), class5488.method16762(), b);
    }
    
    public double method1085(final double n, final double n2, final double n3, final boolean b) {
        final double n4 = b ? 0.5 : 0.0;
        final double n5 = this.getX() + n4 - n;
        final double n6 = this.getY() + n4 - n2;
        final double n7 = this.getZ() + n4 - n3;
        return n5 * n5 + n6 * n6 + n7 * n7;
    }
    
    public int method1086(final Vec3i class352) {
        return (int)(Math.abs(class352.getX() - this.getX()) + (float)Math.abs(class352.getY() - this.getY()) + Math.abs(class352.getZ() - this.getZ()));
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x", this.getX()).add("y", this.getY()).add("z", this.getZ()).toString();
    }
    
    public String method1087() {
        return "" + this.getX() + ", " + this.getY() + ", " + this.getZ();
    }
    
    static {
        field2166 = new Vec3i(0, 0, 0);
    }
}
