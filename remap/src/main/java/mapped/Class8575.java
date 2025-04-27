// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import java.util.stream.IntStream;

public class Class8575 implements Class8576
{
    private final Class8820[] field36055;
    private final double field36056;
    private final double field36057;
    
    public Class8575(final Class2317 class2317, final int n, final int endInclusive) {
        this(class2317, new IntRBTreeSet(IntStream.rangeClosed(-n, endInclusive).toArray()));
    }
    
    public Class8575(final Class2317 class2317, final IntSortedSet set) {
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Need some octaves!");
        }
        final int n = -set.firstInt();
        final int lastInt = set.lastInt();
        final int n2 = n + lastInt + 1;
        if (n2 >= 1) {
            final Class8820 class2318 = new Class8820(class2317);
            final int n3 = lastInt;
            this.field36055 = new Class8820[n2];
            if (lastInt >= 0) {
                if (lastInt < n2) {
                    if (set.contains(0)) {
                        this.field36055[lastInt] = class2318;
                    }
                }
            }
            for (int i = lastInt + 1; i < n2; ++i) {
                if (i >= 0 && set.contains(n3 - i)) {
                    this.field36055[i] = new Class8820(class2317);
                }
                else {
                    class2317.method9436(262);
                }
            }
            if (lastInt > 0) {
                final Class2317 class2319 = new Class2317((long)(class2318.method30767(class2318.field37092, class2318.field37093, class2318.field37094) * 9.223372036854776E18));
                for (int j = n3 - 1; j >= 0; --j) {
                    if (j < n2 && set.contains(n3 - j)) {
                        this.field36055[j] = new Class8820(class2319);
                    }
                    else {
                        class2319.method9436(262);
                    }
                }
            }
            this.field36057 = Math.pow(2.0, lastInt);
            this.field36056 = 1.0 / (Math.pow(2.0, n2) - 1.0);
            return;
        }
        throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
    }
    
    public double method29027(final double n, final double n2, final boolean b) {
        double n3 = 0.0;
        double field36057 = this.field36057;
        double field36058 = this.field36056;
        for (final Class8820 class8820 : this.field36055) {
            if (class8820 != null) {
                n3 += class8820.method30766(n * field36057 + (b ? class8820.field37092 : 0.0), n2 * field36057 + (b ? class8820.field37093 : 0.0)) * field36058;
            }
            field36057 /= 2.0;
            field36058 *= 2.0;
        }
        return n3;
    }
    
    @Override
    public double method29028(final double n, final double n2, final double n3, final double n4) {
        return this.method29027(n, n2, true) * 0.55;
    }
}
