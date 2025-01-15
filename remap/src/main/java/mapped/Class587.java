// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Iterator;

public interface Class587<T>
{
    default void method3455(final int n, final int n2, final int n3, final Class3662<?> class3662, final Iterator<T> iterator, final int n4) {
        int method11304 = n;
        int method11305 = n2;
        if (class3662 instanceof Class3664) {
            final Class3664 class3663 = (Class3664)class3662;
            method11304 = class3663.method11304();
            method11305 = class3663.method11305();
        }
        int n5 = 0;
        for (int i = 0; i < n2; ++i) {
            if (n5 == n3) {
                ++n5;
            }
            final boolean b = method11305 < n2 / 2.0f;
            final int method11306 = MathHelper.method35642(n2 / 2.0f - method11305 / 2.0f);
            if (b) {
                if (method11306 > i) {
                    n5 += n;
                    ++i;
                }
            }
            for (int j = 0; j < n; ++j) {
                if (!iterator.hasNext()) {
                    return;
                }
                final boolean b2 = method11304 < n / 2.0f;
                final int method11307 = MathHelper.method35642(n / 2.0f - method11304 / 2.0f);
                int n6 = method11304;
                boolean b3 = j < method11304;
                if (b2) {
                    n6 = method11307 + method11304;
                    b3 = (method11307 <= j && j < method11307 + method11304);
                }
                if (!b3) {
                    if (n6 == j) {
                        n5 += n - j;
                        break;
                    }
                }
                else {
                    this.method3440(iterator, n5, n4, i, j);
                }
                ++n5;
            }
        }
    }
    
    void method3440(final Iterator<T> p0, final int p1, final int p2, final int p3, final int p4);
}
