// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

import it.unimi.dsi.fastutil.ints.IntSortedSet;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import net.minecraft.util.math.MathHelper;

import java.util.stream.IntStream;

public class Class8577 implements Class8576
{
    private final Class8488[] field36058;
    private final double field36059;
    private final double field36060;
    
    public Class8577(final Class2317 class2317, final int n, final int endInclusive) {
        this(class2317, new IntRBTreeSet(IntStream.rangeClosed(-n, endInclusive).toArray()));
    }
    
    public Class8577(final Class2317 class2317, final IntSortedSet set) {
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Need some octaves!");
        }
        final int n = -set.firstInt();
        final int lastInt = set.lastInt();
        final int n2 = n + lastInt + 1;
        if (n2 >= 1) {
            final Class8488 class2318 = new Class8488(class2317);
            final int n3 = lastInt;
            this.field36058 = new Class8488[n2];
            if (lastInt >= 0) {
                if (lastInt < n2) {
                    if (set.contains(0)) {
                        this.field36058[lastInt] = class2318;
                    }
                }
            }
            for (int i = lastInt + 1; i < n2; ++i) {
                if (i >= 0 && set.contains(n3 - i)) {
                    this.field36058[i] = new Class8488(class2317);
                }
                else {
                    class2317.method9436(262);
                }
            }
            if (lastInt > 0) {
                final Class2317 class2319 = new Class2317((long)(class2318.method28343(0.0, 0.0, 0.0, 0.0, 0.0) * 9.223372036854776E18));
                for (int j = n3 - 1; j >= 0; --j) {
                    if (j < n2 && set.contains(n3 - j)) {
                        this.field36058[j] = new Class8488(class2319);
                    }
                    else {
                        class2319.method9436(262);
                    }
                }
            }
            this.field36060 = Math.pow(2.0, lastInt);
            this.field36059 = 1.0 / (Math.pow(2.0, n2) - 1.0);
            return;
        }
        throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
    }
    
    public double method29029(final double n, final double n2, final double n3) {
        return this.method29030(n, n2, n3, 0.0, 0.0, false);
    }
    
    public double method29030(final double n, final double n2, final double n3, final double n4, final double n5, final boolean b) {
        double n6 = 0.0;
        double field36060 = this.field36060;
        double field36061 = this.field36059;
        for (final Class8488 class8488 : this.field36058) {
            if (class8488 != null) {
                n6 += class8488.method28343(method29032(n * field36060), b ? (-class8488.field34834) : method29032(n2 * field36060), method29032(n3 * field36060), n4 * field36060, n5 * field36060) * field36061;
            }
            field36060 /= 2.0;
            field36061 *= 2.0;
        }
        return n6;
    }
    
    @Nullable
    public Class8488 method29031(final int n) {
        return this.field36058[n];
    }
    
    public static double method29032(final double n) {
        return n - MathHelper.lfloor(n / 3.3554432E7 + 0.5) * 3.3554432E7;
    }
    
    @Override
    public double method29028(final double n, final double n2, final double n3, final double n4) {
        return this.method29030(n, n2, 0.0, n3, n4, false);
    }
}
