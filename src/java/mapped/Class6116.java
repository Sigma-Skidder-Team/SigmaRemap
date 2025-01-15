// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Iterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

public class Class6116 implements Class6113
{
    private static String[] field24828;
    private final Class869 field24829;
    
    public Class6116(final Class869 field24829) {
        this.field24829 = field24829;
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        final Class1848 field4683 = this.field24829.field4683;
        Class8726.method30059();
        Class8726.method30011();
        Class8726.method30117();
        Class8726.method30041();
        final Class354 class7353 = new Class354(n, n2, n3);
        final LongOpenHashSet set = new LongOpenHashSet();
        for (final Class354 class7354 : Class354.method1154(class7353.method1134(-10, -10, -10), class7353.method1134(10, 10, 10))) {
            final int method6992 = field4683.method6992(Class237.field911, class7354);
            final int method6993 = Class9546.method35697((15 - method6992) / 15.0f * 0.5f + 0.16f, 0.9f, 0.9f);
            final long method6994 = Class353.method1111(class7354.method1132());
            if (((LongSet)set).add(method6994)) {
                Class7282.method22340(field4683.method6762().method7405().method7289(Class237.field911, Class353.method1092(method6994)), Class353.method1099(method6994) * 16 + 8, Class353.method1100(method6994) * 16 + 8, Class353.method1101(method6994) * 16 + 8, 16711680, 0.3f);
            }
            if (method6992 == 15) {
                continue;
            }
            Class7282.method22339(String.valueOf(method6992), class7354.method1074() + 0.5, class7354.method1075() + 0.25, class7354.method1076() + 0.5, method6993);
        }
        Class8726.method30040();
        Class8726.method30060();
    }
}
