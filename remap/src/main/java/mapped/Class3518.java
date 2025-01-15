// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;

public class Class3518 extends Class3517
{
    private static String[] field16519;
    
    public Class3518(final Class787 class787, final double n) {
        super(class787, n);
    }
    
    @Nullable
    @Override
    public Class5487 method11071() {
        Class5487 class5487 = null;
        if (this.field16510.method1706()) {
            class5487 = Class7775.method24902(this.field16510, 15, 15);
        }
        if (this.field16510.method2633().nextFloat() >= this.field16518) {
            class5487 = this.method11074();
        }
        return (class5487 != null) ? class5487 : super.method11071();
    }
    
    @Nullable
    private Class5487 method11074() {
        final BlockPos class354 = new BlockPos(this.field16510);
        final Class385 class355 = new Class385();
        final Class385 class356 = new Class385();
        for (final BlockPos class357 : BlockPos.method1158(MathHelper.floor(this.field16510.method1938() - 3.0), MathHelper.floor(this.field16510.method1941() - 6.0), MathHelper.floor(this.field16510.method1945() - 3.0), MathHelper.floor(this.field16510.method1938() + 3.0), MathHelper.floor(this.field16510.method1941() + 6.0), MathHelper.floor(this.field16510.method1945() + 3.0))) {
            if (class354.equals(class357)) {
                continue;
            }
            final Class3833 method21696 = this.field16510.field2391.method6701(class356.method1287(class357).method1290(Direction.DOWN)).method21696();
            if (!(method21696 instanceof Class3972) && !method21696.method11785(Class7188.field27893)) {
                continue;
            }
            if (!this.field16510.field2391.method6961(class357)) {
                continue;
            }
            if (!this.field16510.field2391.method6961(class355.method1287(class357).method1290(Direction.UP))) {
                continue;
            }
            return new Class5487(class357);
        }
        return null;
    }
}
