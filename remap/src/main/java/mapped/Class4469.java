// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import java.util.Set;

public abstract class Class4469 extends Class4473
{
    public static final BlockState field19829;
    public static final BlockState field19830;
    public static final BlockState field19831;
    public static final BlockState field19832;
    public static final BlockState field19833;
    public static final BlockState field19834;
    public static final Set<Block> field19835;
    public static final int field19836;
    public static final int field19837;
    public static final int field19838;
    public static final int field19839;
    public Class8123 field19840;
    
    public static final int method13414(final int n, final int n2, final int n3) {
        return n2 * 25 + n3 * 5 + n;
    }
    
    public Class4469(final Class9520 class9520, final int n) {
        super(class9520, n);
    }
    
    public Class4469(final Class9520 class9520, final Direction class9521, final MutableBoundingBox field19849) {
        super(class9520, 1);
        this.method13456(class9521);
        this.field19849 = field19849;
    }
    
    public Class4469(final Class9520 class9520, final int n, final Direction class9521, final Class8123 field19840, final int n2, final int n3, final int n4) {
        super(class9520, n);
        this.method13456(class9521);
        this.field19840 = field19840;
        final int method26744 = Class8123.method26744(field19840);
        final int n5 = method26744 % 5;
        final int n6 = method26744 / 5 % 5;
        final int n7 = method26744 / 25;
        if (class9521 != Direction.NORTH && class9521 != Direction.SOUTH) {
            this.field19849 = new MutableBoundingBox(0, 0, 0, n4 * 8 - 1, n3 * 4 - 1, n2 * 8 - 1);
        }
        else {
            this.field19849 = new MutableBoundingBox(0, 0, 0, n2 * 8 - 1, n3 * 4 - 1, n4 * 8 - 1);
        }
        switch (Class6364.field25466[class9521.ordinal()]) {
            case 1: {
                this.field19849.offset(n5 * 8, n7 * 4, -(n6 + n4) * 8 + 1);
                break;
            }
            case 2: {
                this.field19849.offset(n5 * 8, n7 * 4, n6 * 8);
                break;
            }
            case 3: {
                this.field19849.offset(-(n6 + n4) * 8 + 1, n7 * 4, n5 * 8);
                break;
            }
            default: {
                this.field19849.offset(n6 * 8, n7 * 4, n5 * 8);
                break;
            }
        }
    }
    
    public Class4469(final Class9520 class9520, final CompoundNBT class9521) {
        super(class9520, class9521);
    }
    
    @Override
    public void method13415(final CompoundNBT class51) {
    }
    
    public void method13416(final Class1851 class1851, final MutableBoundingBox class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    final BlockState method13441 = this.method13441(class1851, j, i, k, class1852);
                    if (!Class4469.field19835.contains(method13441.getBlock())) {
                        if (this.method13438(i) >= class1851.method6743() && method13441 != Class4469.field19834) {
                            this.method13440(class1851, Class7521.field29147.getDefaultState(), j, i, k, class1852);
                        }
                        else {
                            this.method13440(class1851, Class4469.field19834, j, i, k, class1852);
                        }
                    }
                }
            }
        }
    }
    
    public void method13417(final Class1851 class1851, final MutableBoundingBox class1852, final int n, final int n2, final boolean b) {
        if (!b) {
            this.method13444(class1851, class1852, n + 0, 0, n2 + 0, n + 8 - 1, 0, n2 + 8 - 1, Class4469.field19829, Class4469.field19829, false);
        }
        else {
            this.method13444(class1851, class1852, n + 0, 0, n2 + 0, n + 2, 0, n2 + 8 - 1, Class4469.field19829, Class4469.field19829, false);
            this.method13444(class1851, class1852, n + 5, 0, n2 + 0, n + 8 - 1, 0, n2 + 8 - 1, Class4469.field19829, Class4469.field19829, false);
            this.method13444(class1851, class1852, n + 3, 0, n2 + 0, n + 4, 0, n2 + 2, Class4469.field19829, Class4469.field19829, false);
            this.method13444(class1851, class1852, n + 3, 0, n2 + 5, n + 4, 0, n2 + 8 - 1, Class4469.field19829, Class4469.field19829, false);
            this.method13444(class1851, class1852, n + 3, 0, n2 + 2, n + 4, 0, n2 + 2, Class4469.field19830, Class4469.field19830, false);
            this.method13444(class1851, class1852, n + 3, 0, n2 + 5, n + 4, 0, n2 + 5, Class4469.field19830, Class4469.field19830, false);
            this.method13444(class1851, class1852, n + 2, 0, n2 + 3, n + 2, 0, n2 + 4, Class4469.field19830, Class4469.field19830, false);
            this.method13444(class1851, class1852, n + 5, 0, n2 + 3, n + 5, 0, n2 + 4, Class4469.field19830, Class4469.field19830, false);
        }
    }
    
    public void method13418(final Class1851 class1851, final MutableBoundingBox class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final BlockState class1853) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (this.method13441(class1851, j, i, k, class1852) == Class4469.field19834) {
                        this.method13440(class1851, class1853, j, i, k, class1852);
                    }
                }
            }
        }
    }
    
    public boolean method13419(final MutableBoundingBox class6997, final int n, final int n2, final int n3, final int n4) {
        final int method13437 = this.method13437(n, n2);
        final int method13438 = this.method13439(n, n2);
        final int method13439 = this.method13437(n3, n4);
        final int method13440 = this.method13439(n3, n4);
        return class6997.intersectsWith(Math.min(method13437, method13439), Math.min(method13438, method13440), Math.max(method13437, method13439), Math.max(method13438, method13440));
    }
    
    public boolean method13420(final Class1851 class1851, final MutableBoundingBox class1852, final int n, final int n2, final int n3) {
        final int method13437 = this.method13437(n, n3);
        final int method13438 = this.method13438(n2);
        final int method13439 = this.method13439(n, n3);
        if (!class1852.isVecInside(new BlockPos(method13437, method13438, method13439))) {
            return false;
        }
        final Class845 class1853 = EntityType.field28974.method23371(class1851.method6744());
        class1853.method2663(class1853.method2701());
        class1853.method1730(method13437 + 0.5, method13438, method13439 + 0.5, 0.0f, 0.0f);
        class1853.method4188(class1851, class1851.method6784(new BlockPos(class1853)), Class2101.field12177, null, null);
        class1851.method6886(class1853);
        return true;
    }
    
    static {
        field19829 = Class7521.field29519.getDefaultState();
        field19830 = Class7521.field29520.getDefaultState();
        field19831 = Class7521.field29521.getDefaultState();
        field19832 = Class4469.field19830;
        field19833 = Class7521.field29528.getDefaultState();
        field19834 = Class7521.field29173.getDefaultState();
        field19835 = (Set)ImmutableSet.builder().add((Object)Class7521.field29330).add((Object)Class7521.field29548).add((Object)Class7521.field29758).add((Object)Class4469.field19834.getBlock()).build();
        field19836 = method13414(2, 0, 0);
        field19837 = method13414(2, 2, 0);
        field19838 = method13414(0, 1, 0);
        field19839 = method13414(4, 1, 0);
    }
}
