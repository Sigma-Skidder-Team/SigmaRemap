// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class MathUtils
{
    private double field37251;
    public static final double field37252 = 0.10000000149011612;
    
    public MathUtils(final double field37251) {
        if (field37251 > 0.0 && field37251 < 1.0) {
            this.field37251 = field37251;
            return;
        }
        throw new AssertionError((Object)"Smoothness must be between 0 and 1 (both non-inclusive)");
    }
    
    public MathUtils() {
        this(0.10000000149011612);
    }
    
    public Class7202 method31029(final Class7202 class7202, final Class7202 class7203, final Class7202 class7204, final double n) {
        return new Class7202((1.0 - n) * (1.0 - n) * class7202.method22096() + 2.0 * n * (1.0 - n) * class7203.method22096() + n * n * class7204.method22096(), (1.0 - n) * (1.0 - n) * class7202.method22097() + 2.0 * n * (1.0 - n) * class7203.method22097() + n * n * class7204.method22097());
    }
    
    public Class7202 method31030(final Class7202 class7202, final Class7202 class7203, final Class7202 class7204, final Class7202 class7205, final double n) {
        final double n2 = 1.0 - n;
        final double n3 = n2 * n2;
        final double n4 = n3 * n2;
        return new Class7202(class7202.method22096() * n4 + class7203.method22096() * 3.0 * n * n3 + class7204.method22096() * 3.0 * n * n * n2 + class7205.method22096() * n * n * n, class7202.method22097() * n4 + class7203.method22097() * 3.0 * n * n3 + class7204.method22097() * 3.0 * n * n * n2 + class7205.method22097() * n * n * n);
    }
    
    public double method31031(final List<Class7202> list, final float n) {
        if (n != 0.0f) {
            final List<Class7202> method31032 = this.method31032(list);
            double n2 = 1.0;
            for (int i = 0; i < method31032.size(); ++i) {
                final Class7202 class7202 = method31032.get(i);
                if (class7202.method22096() > n) {
                    break;
                }
                final double method31033 = class7202.method22097();
                Class7202 class7203 = new Class7202(1.0, 1.0);
                if (i + 1 < method31032.size()) {
                    class7203 = method31032.get(i + 1);
                }
                n2 = method31033 + (class7203.method22097() - class7202.method22097()) * ((n - class7202.method22096()) / (class7203.method22096() - class7202.method22096()));
            }
            return n2;
        }
        return 0.0;
    }
    
    public List<Class7202> method31032(final List<Class7202> list) {
        if (list == null) {
            throw new AssertionError((Object)"Provided list had no reference");
        }
        if (list.size() >= 3) {
            final Class7202 class7202 = list.get(0);
            final Class7202 class7203 = list.get(1);
            final Class7202 class7204 = list.get(2);
            final Class7202 class7205 = (list.size() != 4) ? null : list.get(3);
            final ArrayList list2 = new ArrayList();
            Class7202 class7206 = class7202;
            for (double n = 0.0; n < 1.0; n += this.field37251) {
                list2.add(class7206);
                class7206 = ((class7205 != null) ? this.method31030(class7202, class7203, class7204, class7205, n) : this.method31029(class7202, class7203, class7204, n));
            }
            return list2;
        }
        return null;
    }
    
    public static float lerp(final float n, final double... array) {
        final ArrayList list = new ArrayList();
        list.add(new Class7202(0.0, 0.0));
        list.add(new Class7202(array[0], array[1]));
        list.add(new Class7202(array[2], array[3]));
        list.add(new Class7202(1.0, 1.0));
        return (float)new MathUtils(0.0055555556900799274).method31031(list, n);
    }
}
