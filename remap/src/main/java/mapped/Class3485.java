// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3485 extends Class3479
{
    private static String[] field16413;
    private final Class3833 field16414;
    private final Class759 field16415;
    private int field16416;
    
    public Class3485(final Class3833 field16414, final Class787 field16415, final double n, final int n2) {
        super(field16415, n, 24, n2);
        this.field16414 = field16414;
        this.field16415 = field16415;
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16415.field2391.method6765().method31216(Class8878.field37316)) {
            return false;
        }
        if (this.field16392 > 0) {
            --this.field16392;
            return false;
        }
        if (!this.method11052()) {
            this.field16392 = this.method11044(this.field16390);
            return false;
        }
        this.field16392 = 20;
        return true;
    }
    
    private boolean method11052() {
        return (this.field16395 != null && this.method11050(this.field16390.field2391, this.field16395)) || this.method11049();
    }
    
    @Override
    public void method11018() {
        super.method11018();
        this.field16415.field2414 = 1.0f;
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16416 = 0;
    }
    
    public void method11053(final Class1851 class1851, final BlockPos class1852) {
    }
    
    public void method11054(final Class1847 class1847, final BlockPos class1848) {
    }
    
    @Override
    public void method11016() {
        super.method11016();
        final Class1847 field2391 = this.field16415.field2391;
        final BlockPos method11055 = this.method11055(new BlockPos(this.field16415), field2391);
        final Random method11056 = this.field16415.method2633();
        if (this.method11048()) {
            if (method11055 != null) {
                if (this.field16416 > 0) {
                    final Class5487 method11057 = this.field16415.method1935();
                    this.field16415.method1937(method11057.field22770, 0.3, method11057.field22772);
                    if (!field2391.field10067) {
                        ((Class1849)field2391).method6911(new Class6910(Class8432.field34629, new Class8321(Class7739.field31374)), method11055.getX() + 0.5, method11055.getY() + 0.7, method11055.getZ() + 0.5, 3, (method11056.nextFloat() - 0.5) * 0.08, (method11056.nextFloat() - 0.5) * 0.08, (method11056.nextFloat() - 0.5) * 0.08, 0.15000000596046448);
                    }
                }
                if (this.field16416 % 2 == 0) {
                    final Class5487 method11058 = this.field16415.method1935();
                    this.field16415.method1937(method11058.field22770, -0.3, method11058.field22772);
                    if (this.field16416 % 6 == 0) {
                        this.method11053(field2391, this.field16395);
                    }
                }
                if (this.field16416 > 60) {
                    field2391.method6690(method11055, false);
                    if (!field2391.field10067) {
                        for (int i = 0; i < 20; ++i) {
                            ((Class1849)field2391).method6911(Class8432.field34636, method11055.getX() + 0.5, method11055.getY(), method11055.getZ() + 0.5, 1, method11056.nextGaussian() * 0.02, method11056.nextGaussian() * 0.02, method11056.nextGaussian() * 0.02, 0.15000000596046448);
                        }
                        this.method11054(field2391, method11055);
                    }
                }
                ++this.field16416;
            }
        }
    }
    
    @Nullable
    private BlockPos method11055(final BlockPos class354, final Class1855 class355) {
        if (class355.method6701(class354).method21696() != this.field16414) {
            for (final BlockPos class356 : new BlockPos[] { class354.method1139(), class354.method1145(), class354.method1147(), class354.method1141(), class354.method1143(), class354.method1139().method1139() }) {
                if (class355.method6701(class356).method21696() == this.field16414) {
                    return class356;
                }
            }
            return null;
        }
        return class354;
    }
    
    @Override
    public boolean method11050(final Class1852 class1852, final BlockPos class1853) {
        final Class1860 method6687 = class1852.method6687(class1853.getX() >> 4, class1853.getZ() >> 4, Class9312.field39989, false);
        if (method6687 != null) {
            if (method6687.method6701(class1853).method21696() == this.field16414) {
                if (method6687.method6701(class1853.method1137()).method21706()) {
                    if (method6687.method6701(class1853.method1138(2)).method21706()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
}
