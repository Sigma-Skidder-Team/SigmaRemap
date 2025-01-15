// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class3515 extends Class3514
{
    private static String[] field16509;
    
    public Class3515(final Class787 class787, final double n, final int n2) {
        super(class787, n, n2);
    }
    
    @Nullable
    @Override
    public Vec3d method11071() {
        Vec3d class5487 = Class7775.method24900(this.field16510, 10, 7);
        int n = 0;
        while (class5487 != null) {
            if (this.field16510.field2391.method6701(new BlockPos(class5487)).method21749(this.field16510.field2391, new BlockPos(class5487), Class2084.field12052)) {
                break;
            }
            if (n++ >= 10) {
                break;
            }
            class5487 = Class7775.method24900(this.field16510, 10, 7);
        }
        return class5487;
    }
}
