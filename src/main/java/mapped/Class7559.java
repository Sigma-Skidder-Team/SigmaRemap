// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class7559
{
    private static final Set<Integer> field29979;
    
    public static void method23730(final Class5207 class5207) {
        class5207.method16316(Class2044.field11648, 4, 4, new Class2993());
        class5207.method16316(Class2044.field11648, 9, 9, new Class2845());
        class5207.method16316(Class2044.field11648, 10, 10, new Class2892());
        class5207.method16316(Class2044.field11648, 11, 11, new Class2821());
        class5207.method16316(Class2044.field11648, 16, 15, new Class2800());
        class5207.method16316(Class2044.field11648, 29, 31, new Class3023());
        class5207.method16316(Class2044.field11648, 25, 26, new Class2953());
        class5207.method16316(Class2044.field11648, 32, 34, new Class3006());
        class5207.method16316(Class2044.field11648, 34, 36, new Class3014());
    }
    
    public static int method23731(int n) {
        if (n < 0) {
            n = 0;
        }
        final int method28390 = Class9526.field41014.method28390(n);
        if (method28390 != -1) {
            return method28390;
        }
        final int method28391 = Class9526.field41014.method28390(n & 0xFFFFFFF0);
        if (method28391 == -1) {
            if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
                Class8563.method28793().method34742().warning("Missing block completely " + n);
            }
            return 1;
        }
        if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
            Class8563.method28793().method34742().warning("Missing block " + n);
        }
        return method28391;
    }
    
    private static int method23732(final Class6108 class6108, final Class8322 class6109, final int n) {
        final Class6647 class6110 = class6108.method18207(Class6647.class);
        if (!class6110.method20193(class6109)) {
            if (class6110.method20192(n)) {
                class6110.method20190(class6109, n);
            }
        }
        else {
            final Class6082 method20194 = class6110.method20194(class6109);
            if (method20194.method18137() != n) {
                class6110.method20195(class6109);
                if (class6110.method20192(n)) {
                    class6110.method20190(class6109, n);
                }
            }
            else if (method20194.method18138() != -1) {
                return method20194.method18138();
            }
        }
        return n;
    }
    
    static {
        field29979 = new HashSet<Integer>();
        for (int i = 0; i < 50; ++i) {
            Class7559.field29979.add(i);
        }
        Class7559.field29979.add(127);
        for (int j = 129; j <= 134; ++j) {
            Class7559.field29979.add(j);
        }
        Class7559.field29979.add(140);
        Class7559.field29979.add(149);
        Class7559.field29979.add(151);
        for (int k = 155; k <= 158; ++k) {
            Class7559.field29979.add(k);
        }
        for (int l = 160; l <= 167; ++l) {
            Class7559.field29979.add(l);
        }
    }
}
