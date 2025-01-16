// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class Class3606 extends Class3446
{
    private static String[] field16788;
    public final Class821 field16789;
    public final double field16790;
    public final double field16791;
    public final /* synthetic */ Class821 field16792;
    
    public Class3606(final Class821 field16792, final Class821 field16793, final double field16794, final double field16795) {
        this.field16792 = field16792;
        this.field16789 = field16793;
        this.field16790 = field16794;
        this.field16791 = field16795;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public void method11018() {
        this.field16789.method4844(null);
        Class821.method4848(this.field16792).method24733();
    }
    
    @Override
    public boolean method11013() {
        final BlockPos method4849 = Class821.method4849(this.field16789);
        return method4849 != null && this.method11134(method4849, this.field16790);
    }
    
    @Override
    public void method11016() {
        final BlockPos method4849 = Class821.method4849(this.field16789);
        if (method4849 != null) {
            if (Class821.method4850(this.field16792).method24731()) {
                if (!this.method11134(method4849, 10.0)) {
                    Class821.method4852(this.field16792).method24724(method4849.getX(), method4849.getY(), method4849.getZ(), this.field16791);
                }
                else {
                    final Vec3d method4850 = new Vec3d(method4849.getX() - this.field16789.getPosX(), method4849.getY() - this.field16789.getPosY(), method4849.getZ() - this.field16789.getPosZ()).normalize().scale(10.0).add(this.field16789.getPosX(), this.field16789.getPosY(), this.field16789.getPosZ());
                    Class821.method4851(this.field16792).method24724(method4850.x, method4850.y, method4850.z, this.field16791);
                }
            }
        }
    }
    
    private boolean method11134(final BlockPos class354, final double n) {
        return !class354.withinDistance(this.field16789.method1934(), n);
    }
}
