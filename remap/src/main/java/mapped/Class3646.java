// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Class3646 extends Class3643
{
    private static String[] field16918;
    private static final Class222[] field16919;
    private final int field16920;
    private final Set<Integer> field16921;
    private final Map<Class222, Integer> field16922;
    
    public Class3646(final String s) {
        this.field16921 = new HashSet<Integer>();
        this.field16922 = new HashMap<Class222, Integer>();
        this.field16920 = Class8881.method31263(s);
    }
    
    public Class7220 method11218(final String s, final String s2) {
        return new Class7225(this, s, this, s2);
    }
    
    @Override
    public int method11202(final Class6108 class6108, final Class8322 class6109, final int n) {
        if (n == this.field16920) {
            for (final Class222 class6110 : Class3646.field16919) {
                if (this.field16921.contains(this.method11205(class6108, class6109.method27702(class6110)))) {
                    return this.field16922.get(class6110);
                }
            }
            return this.field16920;
        }
        return n;
    }
    
    static {
        field16919 = new Class222[] { Class222.field773, Class222.field771, Class222.field772, Class222.field774 };
    }
}
