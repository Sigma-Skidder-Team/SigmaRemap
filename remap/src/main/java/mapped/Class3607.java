// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class Class3607 extends Class3446
{
    private static String[] field16793;
    public final Class787 field16794;
    public final double field16795;
    public double field16796;
    public double field16797;
    public double field16798;
    
    public Class3607(final Class787 field16794, final double field16795) {
        this.field16794 = field16794;
        this.field16795 = field16795;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16794.method2634() == null && !this.field16794.method1804()) {
            return false;
        }
        if (this.field16794.method1804()) {
            final BlockPos method11136 = this.method11136(this.field16794.world, this.field16794, 5, 4);
            if (method11136 != null) {
                this.field16796 = method11136.getX();
                this.field16797 = method11136.getY();
                this.field16798 = method11136.getZ();
                return true;
            }
        }
        return this.method11135();
    }
    
    public boolean method11135() {
        final Vec3d method24900 = Class7775.method24900(this.field16794, 5, 4);
        if (method24900 != null) {
            this.field16796 = method24900.x;
            this.field16797 = method24900.y;
            this.field16798 = method24900.z;
            return true;
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16794.method4150().method24724(this.field16796, this.field16797, this.field16798, this.field16795);
    }
    
    @Override
    public boolean method11017() {
        return !this.field16794.method4150().method24731();
    }
    
    @Nullable
    public BlockPos method11136(final IBlockReader class1855, final Entity class1856, final int n, final int n2) {
        final BlockPos class1857 = new BlockPos(class1856);
        final int method1074 = class1857.getX();
        final int method1075 = class1857.getY();
        final int method1076 = class1857.getZ();
        float n3 = (float)(n * n * n2 * 2);
        BlockPos class1858 = null;
        final Mutable class1859 = new Mutable();
        for (int i = method1074 - n; i <= method1074 + n; ++i) {
            for (int j = method1075 - n2; j <= method1075 + n2; ++j) {
                for (int k = method1076 - n; k <= method1076 + n; ++k) {
                    class1859.setPos(i, j, k);
                    if (class1855.getFluidState(class1859).isTagged(Class7324.field28319)) {
                        final float n4 = (float)((i - method1074) * (i - method1074) + (j - method1075) * (j - method1075) + (k - method1076) * (k - method1076));
                        if (n4 < n3) {
                            n3 = n4;
                            class1858 = new BlockPos(class1859);
                        }
                    }
                }
            }
        }
        return class1858;
    }
}
