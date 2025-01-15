// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.BitSet;
import java.util.function.Function;
import java.util.Random;

public class Class8312<WC extends Class5118>
{
    private static String[] field34148;
    public final Class7304<WC> field34149;
    public final WC field34150;
    
    public Class8312(final Class7304<WC> field34149, final WC field34150) {
        this.field34149 = field34149;
        this.field34150 = field34150;
    }
    
    public boolean method27600(final Random random, final int n, final int n2) {
        return this.field34149.method22402(random, n, n2, this.field34150);
    }
    
    public boolean method27601(final Class1860 class1860, final Function<Class354, Class3090> function, final Random random, final int n, final int n2, final int n3, final int n4, final int n5, final BitSet set) {
        return this.field34149.method22403(class1860, function, random, n, n2, n3, n4, n5, set, this.field34150);
    }
}
