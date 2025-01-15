// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;

import java.util.EnumSet;

public class Vec3d implements Class5488
{
    public static final Vec3d field22769;
    public double field22770;
    public double field22771;
    public double field22772;
    
    public Vec3d(final double field22770, final double field22771, final double field22772) {
        this.field22770 = field22770;
        this.field22771 = field22771;
        this.field22772 = field22772;
    }
    
    public Vec3d(final Vector3f class9138) {
        this(class9138.method33311(), class9138.method33312(), class9138.method33313());
    }
    
    public Vec3d(final Vec3i class352) {
        this(class352.getX(), class352.getY(), class352.getZ());
    }
    
    public Vec3d method16737(final Vec3d class5487) {
        return new Vec3d(class5487.field22770 - this.field22770, class5487.field22771 - this.field22771, class5487.field22772 - this.field22772);
    }
    
    public Vec3d method16738() {
        final double n = MathHelper.method35641(this.field22770 * this.field22770 + this.field22771 * this.field22771 + this.field22772 * this.field22772);
        return (n >= 1.0E-4) ? new Vec3d(this.field22770 / n, this.field22771 / n, this.field22772 / n) : Vec3d.field22769;
    }
    
    public double method16739(final Vec3d class5487) {
        return this.field22770 * class5487.field22770 + this.field22771 * class5487.field22771 + this.field22772 * class5487.field22772;
    }
    
    public Vec3d method16740(final Vec3d class5487) {
        return new Vec3d(this.field22771 * class5487.field22772 - this.field22772 * class5487.field22771, this.field22772 * class5487.field22770 - this.field22770 * class5487.field22772, this.field22770 * class5487.field22771 - this.field22771 * class5487.field22770);
    }
    
    public Vec3d method16741(final Vec3d class5487) {
        return this.method16742(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public Vec3d method16742(final double n, final double n2, final double n3) {
        return this.method16744(-n, -n2, -n3);
    }
    
    public Vec3d method16743(final Vec3d class5487) {
        return this.method16744(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public Vec3d method16744(final double n, final double n2, final double n3) {
        return new Vec3d(this.field22770 + n, this.field22771 + n2, this.field22772 + n3);
    }
    
    public double method16745(final Vec3d class5487) {
        final double n = class5487.field22770 - this.field22770;
        final double n2 = class5487.field22771 - this.field22771;
        final double n3 = class5487.field22772 - this.field22772;
        return MathHelper.method35641(n * n + n2 * n2 + n3 * n3);
    }
    
    public double method16746(final Vec3d class5487) {
        final double n = class5487.field22770 - this.field22770;
        final double n2 = class5487.field22771 - this.field22771;
        final double n3 = class5487.field22772 - this.field22772;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public double method16747(final double n, final double n2, final double n3) {
        final double n4 = n - this.field22770;
        final double n5 = n2 - this.field22771;
        final double n6 = n3 - this.field22772;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }
    
    public Vec3d method16748(final double n) {
        return this.method16751(n, n, n);
    }
    
    public Vec3d method16749() {
        return this.method16748(-1.0);
    }
    
    public Vec3d method16750(final Vec3d class5487) {
        return this.method16751(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public Vec3d method16751(final double n, final double n2, final double n3) {
        return new Vec3d(this.field22770 * n, this.field22771 * n2, this.field22772 * n3);
    }
    
    public double method16752() {
        return MathHelper.method35641(this.field22770 * this.field22770 + this.field22771 * this.field22771 + this.field22772 * this.field22772);
    }
    
    public double method16753() {
        return this.field22770 * this.field22770 + this.field22771 * this.field22771 + this.field22772 * this.field22772;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Vec3d) {
            final Vec3d class5487 = (Vec3d)o;
            return Double.compare(class5487.field22770, this.field22770) == 0 && Double.compare(class5487.field22771, this.field22771) == 0 && Double.compare(class5487.field22772, this.field22772) == 0;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.field22770);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.field22771);
        final int n2 = 31 * n + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32);
        final long doubleToLongBits3 = Double.doubleToLongBits(this.field22772);
        return 31 * n2 + (int)(doubleToLongBits3 ^ doubleToLongBits3 >>> 32);
    }
    
    @Override
    public String toString() {
        return "(" + this.field22770 + ", " + this.field22771 + ", " + this.field22772 + ")";
    }
    
    public Vec3d method16754(final float n) {
        final float method35639 = MathHelper.cos(n);
        final float method35640 = MathHelper.sin(n);
        return new Vec3d(this.field22770, this.field22771 * method35639 + this.field22772 * method35640, this.field22772 * method35639 - this.field22771 * method35640);
    }
    
    public Vec3d method16755(final float n) {
        final float method35639 = MathHelper.cos(n);
        final float method35640 = MathHelper.sin(n);
        return new Vec3d(this.field22770 * method35639 + this.field22772 * method35640, this.field22771, this.field22772 * method35639 - this.field22770 * method35640);
    }
    
    public static Vec3d method16756(final Class9544 class9544) {
        return method16757(class9544.field41091, class9544.field41092);
    }
    
    public static Vec3d method16757(final float n, final float n2) {
        final float method35639 = MathHelper.cos(-n2 * 0.017453292f - 3.1415927f);
        final float method35640 = MathHelper.sin(-n2 * 0.017453292f - 3.1415927f);
        final float n3 = -MathHelper.cos(-n * 0.017453292f);
        return new Vec3d(method35640 * n3, MathHelper.sin(-n * 0.017453292f), method35639 * n3);
    }
    
    public Vec3d method16758(final EnumSet<Axis> set) {
        return new Vec3d(set.contains(Axis.X) ? MathHelper.floor(this.field22770) : this.field22770, set.contains(Axis.Y) ? MathHelper.floor(this.field22771) : this.field22771, set.contains(Axis.Z) ? MathHelper.floor(this.field22772) : this.field22772);
    }
    
    public double method16759(final Axis class111) {
        return class111.getCoordinate(this.field22770, this.field22771, this.field22772);
    }
    
    @Override
    public final double method16760() {
        return this.field22770;
    }
    
    @Override
    public final double method16761() {
        return this.field22771;
    }
    
    @Override
    public final double method16762() {
        return this.field22772;
    }
    
    static {
        field22769 = new Vec3d(0.0, 0.0, 0.0);
    }
}
