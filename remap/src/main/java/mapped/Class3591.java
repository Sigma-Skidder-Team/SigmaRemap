// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.EnumSet;

public class Class3591 extends Class3446
{
    private static String[] field16730;
    private final Class787 field16731;
    private double field16732;
    private double field16733;
    private double field16734;
    private final double field16735;
    private final World field16736;
    
    public Class3591(final Class787 field16731, final double field16732) {
        this.field16731 = field16731;
        this.field16735 = field16732;
        this.field16736 = field16731.world;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16736.method6703()) {
            return false;
        }
        if (this.field16731.method1706()) {
            return false;
        }
        final Vec3d method11121 = this.method11121();
        if (method11121 != null) {
            this.field16732 = method11121.x;
            this.field16733 = method11121.y;
            this.field16734 = method11121.z;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16731.method4150().method24731();
    }
    
    @Override
    public void method11015() {
        this.field16731.method4150().method24724(this.field16732, this.field16733, this.field16734, this.field16735);
    }
    
    @Nullable
    private Vec3d method11121() {
        final Random method2633 = this.field16731.method2633();
        final BlockPos class354 = new BlockPos(this.field16731);
        for (int i = 0; i < 10; ++i) {
            final BlockPos method2634 = class354.add(method2633.nextInt(20) - 10, 2 - method2633.nextInt(8), method2633.nextInt(20) - 10);
            if (this.field16736.method6701(method2634).method21696() == Class7521.field29173) {
                return new Vec3d(method2634);
            }
        }
        return null;
    }
}
