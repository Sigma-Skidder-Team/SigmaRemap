// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class Class3514 extends Class3446
{
    private static String[] field16509;
    public final Class787 field16510;
    public double field16511;
    public double field16512;
    public double field16513;
    public final double field16514;
    public int field16515;
    public boolean field16516;
    
    public Class3514(final Class787 class787, final double n) {
        this(class787, n, 120);
    }
    
    public Class3514(final Class787 field16510, final double field16511, final int field16512) {
        this.field16510 = field16510;
        this.field16514 = field16511;
        this.field16515 = field16512;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16510.isBeingRidden()) {
            return false;
        }
        if (!this.field16516) {
            if (this.field16510.method2640() >= 100) {
                return false;
            }
            if (this.field16510.method2633().nextInt(this.field16515) != 0) {
                return false;
            }
        }
        final Vec3d method11071 = this.method11071();
        if (method11071 != null) {
            this.field16511 = method11071.x;
            this.field16512 = method11071.y;
            this.field16513 = method11071.z;
            this.field16516 = false;
            return true;
        }
        return false;
    }
    
    @Nullable
    public Vec3d method11071() {
        return Class7775.method24900(this.field16510, 10, 7);
    }
    
    @Override
    public boolean method11017() {
        return !this.field16510.method4150().method24731() && !this.field16510.isBeingRidden();
    }
    
    @Override
    public void method11015() {
        this.field16510.method4150().method24724(this.field16511, this.field16512, this.field16513, this.field16514);
    }
    
    @Override
    public void method11018() {
        this.field16510.method4150().method24733();
        super.method11018();
    }
    
    public void method11072() {
        this.field16516 = true;
    }
    
    public void method11073(final int field16515) {
        this.field16515 = field16515;
    }
}
