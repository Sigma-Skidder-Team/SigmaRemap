// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import java.util.Random;
import java.util.EnumSet;

public class Class3461 extends Class3446
{
    private static String[] field16316;
    private final Class787 field16317;
    private final int field16318;
    private BlockPos field16319;
    
    public Class3461(final Class787 field16317, final int field16318) {
        this.field16317 = field16317;
        this.field16318 = field16318;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16317.isBeingRidden()) {
            return false;
        }
        if (this.field16317.world.method6703()) {
            return false;
        }
        if (this.field16317.method2633().nextInt(this.field16318) != 0) {
            return false;
        }
        if (((Class1849)this.field16317.world).method6924(new BlockPos(this.field16317), 6)) {
            final Vec3d method24903 = Class7775.method24903(this.field16317, 15, 7, class1850 -> -class1849.method6925(Class353.method1089(class1850)));
            this.field16319 = ((method24903 != null) ? new BlockPos(method24903) : null);
            return this.field16319 != null;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16319 != null) {
            if (!this.field16317.method4150().method24731()) {
                if (this.field16317.method4150().method24714().equals(this.field16319)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11016() {
        if (this.field16319 != null) {
            final Class7746 method4150 = this.field16317.method4150();
            if (method4150.method24731()) {
                if (!this.field16319.withinDistance(this.field16317.method1934(), 10.0)) {
                    final Vec3d class5487 = new Vec3d(this.field16319);
                    final Vec3d method4151 = this.field16317.method1934();
                    final BlockPos method4152 = this.field16317.world.method6958(Class2020.field11526, new BlockPos(method4151.subtract(class5487).scale(0.4).add(class5487).subtract(method4151).normalize().scale(10.0).add(method4151)));
                    if (!method4150.method24724(method4152.getX(), method4152.getY(), method4152.getZ(), 1.0)) {
                        this.method11024();
                    }
                }
            }
        }
    }
    
    private void method11024() {
        final Random method2633 = this.field16317.method2633();
        final BlockPos method2634 = this.field16317.world.method6958(Class2020.field11526, new BlockPos(this.field16317).add(-8 + method2633.nextInt(16), 0, -8 + method2633.nextInt(16)));
        this.field16317.method4150().method24724(method2634.getX(), method2634.getY(), method2634.getZ(), 1.0);
    }
}
