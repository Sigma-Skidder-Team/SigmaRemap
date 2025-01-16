// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Class8011
{
    private static String[] field32978;
    private int field32979;
    
    public int method26227(final Class1849 class1849, final boolean b, final boolean b2) {
        if (!b) {
            return 0;
        }
        if (!class1849.method6765().method31216(Class8878.field37339)) {
            return 0;
        }
        final Random field10062 = class1849.rand;
        --this.field32979;
        if (this.field32979 > 0) {
            return 0;
        }
        this.field32979 += (60 + field10062.nextInt(60)) * 20;
        if (class1849.method6785() < 5 && class1849.dimension.method20503()) {
            return 0;
        }
        int n = 0;
        for (final PlayerEntity class1850 : class1849.method6840()) {
            if (class1850.isSpectator()) {
                continue;
            }
            final BlockPos class1851 = new BlockPos(class1850);
            if (class1849.dimension.method20503()) {
                if (class1851.getY() < class1849.method6743()) {
                    continue;
                }
                if (!class1849.method6994(class1851)) {
                    continue;
                }
            }
            final Class9592 method6784 = class1849.method6784(class1851);
            if (!method6784.method35974(field10062.nextFloat() * 3.0f)) {
                continue;
            }
            if (field10062.nextInt(MathHelper.method35651(((Class513)class1850).method2947().method23091(Class8276.field33987.method8449(Class8276.field33991)), 1, Integer.MAX_VALUE)) < 72000) {
                continue;
            }
            final BlockPos method6785 = class1851.method1138(20 + field10062.nextInt(15)).method1148(-10 + field10062.nextInt(21)).method1144(-10 + field10062.nextInt(21));
            if (!Class8532.method28620(class1849, method6785, class1849.getBlockState(method6785), class1849.getFluidState(method6785))) {
                continue;
            }
            Class5496 method6786 = null;
            final int n2 = 1 + field10062.nextInt(method6784.method35972().method8235() + 1);
            for (int i = 0; i < n2; ++i) {
                final Class851 class1852 = EntityType.field29055.method23371(class1849);
                class1852.method1729(method6785, 0.0f, 0.0f);
                method6786 = class1852.method4188(class1849, method6784, Class2101.field12174, method6786, null);
                class1849.method6886(class1852);
            }
            n += n2;
        }
        return n;
    }
}
