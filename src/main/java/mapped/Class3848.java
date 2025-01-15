// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3848 extends Class3846
{
    private static String[] field17456;
    public static final Class7702 field17457;
    
    public Class3848(final Class9288 class9288) {
        super(class9288);
    }
    
    private static boolean method11902(final Class399 class399) {
        if (!(class399 instanceof Class511)) {
            if (!(class399 instanceof Class428)) {
                if (!(class399 instanceof Class510)) {
                    if (!(class399 instanceof Class423)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3848.field17457;
    }
    
    @Override
    public void method11860(final Class1847 class1847, final Class354 class1848, final Class399 class1849, final float n) {
        class1849.method1695(Class8520.field35269, 1.0f, 1.0f);
        if (!class1847.field10067) {
            class1847.method6761(class1849, (byte)54);
        }
        if (class1849.method1705(n, 0.2f)) {
            class1849.method1695(this.field17400.method24483(), this.field17400.method24477() * 0.5f, this.field17400.method24478() * 0.75f);
        }
    }
    
    @Override
    public void method11850(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class399 class7099) {
        if (this.method11903(class7098, class7099)) {
            this.method11904(class7099, class7098);
            this.method11905(class7099);
            this.method11906(class7097, class7099);
        }
        super.method11850(class7096, class7097, class7098, class7099);
    }
    
    private boolean method11903(final Class354 class354, final Class399 class355) {
        if (class355.field2404) {
            return false;
        }
        if (class355.method1941() > class354.method1075() + 0.9375 - 1.0E-7) {
            return false;
        }
        if (class355.method1935().field22771 < -0.08) {
            final double abs = Math.abs(class354.method1074() + 0.5 - class355.method1938());
            final double abs2 = Math.abs(class354.method1076() + 0.5 - class355.method1945());
            final double n = 0.4375 + class355.method1930() / 2.0f;
            return abs + 1.0E-7 > n || abs2 + 1.0E-7 > n;
        }
        return false;
    }
    
    private void method11904(final Class399 class399, final Class354 class400) {
        if (class399 instanceof Class513) {
            if (class399.field2391.method6754() % 20L == 0L) {
                Class7770.field31811.method13782((Class513)class399, class399.field2391.method6701(class400));
            }
        }
    }
    
    private void method11905(final Class399 class399) {
        final Class5487 method1935 = class399.method1935();
        if (method1935.field22771 >= -0.13) {
            class399.method1936(new Class5487(method1935.field22770, -0.05, method1935.field22772));
        }
        else {
            final double n = -0.05 / method1935.field22771;
            class399.method1936(new Class5487(method1935.field22770 * n, -0.05, method1935.field22772 * n));
        }
        class399.field2414 = 0.0f;
    }
    
    private void method11906(final Class1847 class1847, final Class399 class1848) {
        if (method11902(class1848)) {
            if (class1847.field10062.nextInt(5) == 0) {
                class1848.method1695(Class8520.field35269, 1.0f, 1.0f);
            }
            if (!class1847.field10067) {
                if (class1847.field10062.nextInt(5) == 0) {
                    class1847.method6761(class1848, (byte)53);
                }
            }
        }
    }
    
    public static void method11907(final Class399 class399) {
        method11909(class399, 5);
    }
    
    public static void method11908(final Class399 class399) {
        method11909(class399, 10);
    }
    
    private static void method11909(final Class399 class399, final int n) {
        if (class399.field2391.field10067) {
            final Class7096 method11878 = Class7521.field29825.method11878();
            for (int i = 0; i < n; ++i) {
                class399.field2391.method6709(new Class6911(Class8432.field34600, method11878), class399.method1938(), class399.method1941(), class399.method1945(), 0.0, 0.0, 0.0);
            }
        }
    }
    
    static {
        field17457 = Class3833.method11778(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
    }
}
