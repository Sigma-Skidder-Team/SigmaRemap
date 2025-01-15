// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class6114 implements Class6113
{
    private final Map<Integer, Class9468> field24821;
    private final Map<Integer, Float> field24822;
    private final Map<Integer, Long> field24823;
    
    public Class6114() {
        this.field24821 = Maps.newHashMap();
        this.field24822 = Maps.newHashMap();
        this.field24823 = Maps.newHashMap();
    }
    
    public void method18271(final int i, final Class9468 class9468, final float f) {
        this.field24821.put(i, class9468);
        this.field24823.put(i, Class8349.method27837());
        this.field24822.put(i, f);
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        if (!this.field24821.isEmpty()) {
            final long method27837 = Class8349.method27837();
            for (final Integer n4 : this.field24821.keySet()) {
                method18272(this.field24821.get(n4), this.field24822.get(n4), true, true, n, n2, n3);
            }
            for (final Integer n5 : this.field24823.keySet().toArray(new Integer[0])) {
                if (method27837 - this.field24823.get(n5) > 5000L) {
                    this.field24821.remove(n5);
                    this.field24823.remove(n5);
                }
            }
        }
    }
    
    public static void method18272(final Class9468 class9468, final float n, final boolean b, final boolean b2, final double n2, final double n3, final double n4) {
        Class8726.method30059();
        Class8726.method30011();
        Class8726.method30117();
        Class8726.method30068(0.0f, 1.0f, 0.0f, 0.75f);
        Class8726.method30041();
        Class8726.method30072(6.0f);
        method18273(class9468, n, b, b2, n2, n3, n4);
        Class8726.method30040();
        Class8726.method30012();
        Class8726.method30060();
    }
    
    private static void method18273(final Class9468 class9468, final float n, final boolean b, final boolean b2, final double n2, final double n3, final double n4) {
        method18274(class9468, n2, n3, n4);
        final Class354 method35232 = class9468.method35232();
        if (method18275(method35232, n2, n3, n4) <= 80.0f) {
            Class7282.method22336(new Class6221(method35232.method1074() + 0.25f, method35232.method1075() + 0.25f, method35232.method1076() + 0.25, method35232.method1074() + 0.75f, method35232.method1075() + 0.75f, method35232.method1076() + 0.75f).method18499(-n2, -n3, -n4), 0.0f, 1.0f, 0.0f, 0.5f);
            for (int i = 0; i < class9468.method35221(); ++i) {
                final Class6772 method35233 = class9468.method35217(i);
                if (method18275(method35233.method20671(), n2, n3, n4) <= 80.0f) {
                    Class7282.method22336(new Class6221(method35233.field26589 + 0.5f - n, method35233.field26590 + 0.01f * i, method35233.field26591 + 0.5f - n, method35233.field26589 + 0.5f + n, method35233.field26590 + 0.25f + 0.01f * i, method35233.field26591 + 0.5f + n).method18499(-n2, -n3, -n4), (i != class9468.method35222()) ? 0.0f : 1.0f, 0.0f, (i != class9468.method35222()) ? 1.0f : 0.0f, 0.5f);
                }
            }
        }
        if (b) {
            for (final Class6772 class9469 : class9468.method35230()) {
                if (method18275(class9469.method20671(), n2, n3, n4) <= 80.0f) {
                    Class7282.method22336(new Class6221(class9469.field26589 + 0.5f - n / 2.0f, class9469.field26590 + 0.01f, class9469.field26591 + 0.5f - n / 2.0f, class9469.field26589 + 0.5f + n / 2.0f, class9469.field26590 + 0.1, class9469.field26591 + 0.5f + n / 2.0f).method18499(-n2, -n3, -n4), 1.0f, 0.8f, 0.8f, 0.5f);
                }
            }
            for (final Class6772 class9470 : class9468.method35229()) {
                if (method18275(class9470.method20671(), n2, n3, n4) <= 80.0f) {
                    Class7282.method22336(new Class6221(class9470.field26589 + 0.5f - n / 2.0f, class9470.field26590 + 0.01f, class9470.field26591 + 0.5f - n / 2.0f, class9470.field26589 + 0.5f + n / 2.0f, class9470.field26590 + 0.1, class9470.field26591 + 0.5f + n / 2.0f).method18499(-n2, -n3, -n4), 0.8f, 1.0f, 1.0f, 0.5f);
                }
            }
        }
        if (b2) {
            for (int l = 0; l < class9468.method35221(); ++l) {
                final Class6772 method35236 = class9468.method35217(l);
                if (method18275(method35236.method20671(), n2, n3, n4) <= 80.0f) {
                    Class7282.method22339(String.format("%s", method35236.field26601), method35236.field26589 + 0.5, method35236.field26590 + 0.75, method35236.field26591 + 0.5, -1);
                    Class7282.method22339(String.format(Locale.ROOT, "%.2f", method35236.field26600), method35236.field26589 + 0.5, method35236.field26590 + 0.25, method35236.field26591 + 0.5, -1);
                }
            }
        }
    }
    
    public static void method18274(final Class9468 class9468, final double n, final double n2, final double n3) {
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        method22695.method12390(3, Class9237.field39615);
        for (int i = 0; i < class9468.method35221(); ++i) {
            final Class6772 method22696 = class9468.method35217(i);
            if (method18275(method22696.method20671(), n, n2, n3) <= 80.0f) {
                final float n4 = i / (float)class9468.method35221() * 0.33f;
                final int n5 = (i != 0) ? Class9546.method35697(n4, 0.9f, 0.9f) : 0;
                method22695.method12432(method22696.field26589 - n + 0.5, method22696.field26590 - n2 + 0.5, method22696.field26591 - n3 + 0.5).method12399(n5 >> 16 & 0xFF, n5 >> 8 & 0xFF, n5 & 0xFF, 255).method12397();
            }
        }
        method22694.method22695();
    }
    
    private static float method18275(final Class354 class354, final double n, final double n2, final double n3) {
        return (float)(Math.abs(class354.method1074() - n) + Math.abs(class354.method1075() - n2) + Math.abs(class354.method1076() - n3));
    }
}
