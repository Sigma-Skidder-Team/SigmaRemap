// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class4162 extends Class4158<Class491>
{
    private static String[] field18548;
    private final Class1658 field18549;
    
    public Class4162(final Class9550 class9550) {
        super(class9550);
        this.field18549 = Class869.method5277().method5305();
    }
    
    public void method12467(final Class491 class491, final float n, final Class7351 class492, final Class7807 class493, final int n2, final int n3) {
        final Class1847 method2186 = class491.method2186();
        if (method2186 != null) {
            final BlockPos method2187 = class491.method2193().method1149(class491.method2476().getOpposite());
            final Class7096 method2188 = class491.method2481();
            if (!method2188.method21706()) {
                if (class491.method2465(n) < 1.0f) {
                    Class9144.method33366();
                    class492.method22567();
                    class492.method22564(class491.method2466(n), class491.method2467(n), class491.method2468(n));
                    if (method2188.method21696() == Class7521.field29247 && class491.method2465(n) <= 4.0f) {
                        this.method12468(method2187, ((Class7097<Object, Class7096>)method2188).method21773((Class7111<Comparable>)Class3835.field17418, true), class492, class493, method2186, false, n3);
                    }
                    else if (class491.method2464() && !class491.method2462()) {
                        this.method12468(method2187, (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)Class7521.field29247.method11878()).method21773(Class3835.field17417, (method2188.method21696() != Class7521.field29239) ? Class178.field507 : Class178.field508)).method21773((Class7111<Comparable>)Class3835.field17415, (Comparable)((Class7097<Object, Class7096>)method2188).method21772((Class7111<V>)Class3836.field17415))).method21773((Class7111<Comparable>)Class3835.field17418, class491.method2465(n) >= 0.5f), class492, class493, method2186, false, n3);
                        final BlockPos method2189 = method2187.method1149(class491.method2476());
                        class492.method22568();
                        class492.method22567();
                        this.method12468(method2189, ((Class7097<Object, Class7096>)method2188).method21773((Class7111<Comparable>)Class3836.field17438, true), class492, class493, method2186, true, n3);
                    }
                    else {
                        this.method12468(method2187, method2188, class492, class493, method2186, false, n3);
                    }
                    class492.method22568();
                    Class9144.method33367();
                }
            }
        }
    }
    
    private void method12468(final BlockPos class354, final Class7096 class355, final Class7351 class356, final Class7807 class357, final Class1847 class358, final boolean b, final int n) {
        this.field18549.method5793().method33353(class358, this.field18549.method5794(class355), class355, class354, class356, class357.method25214(Class7969.method25824(class355)), b, new Random(), class355.method21758(class354), n);
    }
}
