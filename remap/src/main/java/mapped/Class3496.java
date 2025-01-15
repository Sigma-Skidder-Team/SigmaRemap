// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.EnumSet;

public class Class3496 extends Class3446
{
    private static String[] field16444;
    public final Class787 field16445;
    private double field16446;
    private double field16447;
    private double field16448;
    private final double field16449;
    private final World field16450;
    
    public Class3496(final Class787 field16445, final double field16446) {
        this.field16445 = field16445;
        this.field16449 = field16446;
        this.field16450 = field16445.world;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        return this.field16445.method4152() == null && this.field16450.method6703() && this.field16445.method1804() && this.field16450.method6994(new BlockPos(this.field16445)) && this.field16445.method2718(Class2215.field13605).method27620() && this.method11059();
    }
    
    public boolean method11059() {
        final Vec3d method11060 = this.method11060();
        if (method11060 != null) {
            this.field16446 = method11060.x;
            this.field16447 = method11060.y;
            this.field16448 = method11060.z;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16445.method4150().method24731();
    }
    
    @Override
    public void method11015() {
        this.field16445.method4150().method24724(this.field16446, this.field16447, this.field16448, this.field16449);
    }
    
    @Nullable
    public Vec3d method11060() {
        final Random method2633 = this.field16445.method2633();
        final BlockPos class354 = new BlockPos(this.field16445);
        for (int i = 0; i < 10; ++i) {
            final BlockPos method2634 = class354.add(method2633.nextInt(20) - 10, method2633.nextInt(6) - 3, method2633.nextInt(20) - 10);
            if (!this.field16450.method6994(method2634) && this.field16445.method4345(method2634) < 0.0f) {
                return new Vec3d(method2634);
            }
        }
        return null;
    }
}
