// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class3517 extends Class3514
{
    private static String[] field16509;
    public final float field16518;
    
    public Class3517(final Class787 class787, final double n) {
        this(class787, n, 0.001f);
    }
    
    public Class3517(final Class787 class787, final double n, final float field16518) {
        super(class787, n);
        this.field16518 = field16518;
    }
    
    @Nullable
    @Override
    public Vec3d method11071() {
        if (!this.field16510.method1711()) {
            return (this.field16510.method2633().nextFloat() < this.field16518) ? super.method11071() : Class7775.method24902(this.field16510, 10, 7);
        }
        final Vec3d method24902 = Class7775.method24902(this.field16510, 15, 7);
        return (method24902 != null) ? method24902 : super.method11071();
    }
}
