// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class Class3489 extends Class3446
{
    private static String[] field16423;
    private final Class787 field16424;
    private double field16425;
    private double field16426;
    private double field16427;
    private final double field16428;
    
    public Class3489(final Class787 field16424, final double field16425) {
        this.field16424 = field16424;
        this.field16428 = field16425;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16424.method4196()) {
            return false;
        }
        final Vec3d method24905 = Class7775.method24905(this.field16424, 16, 7, new Vec3d(this.field16424.method4199()));
        if (method24905 != null) {
            this.field16425 = method24905.x;
            this.field16426 = method24905.y;
            this.field16427 = method24905.z;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16424.method4150().method24731();
    }
    
    @Override
    public void method11015() {
        this.field16424.method4150().method24724(this.field16425, this.field16426, this.field16427, this.field16428);
    }
}
