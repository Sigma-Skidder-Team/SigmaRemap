// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4466 implements Comparator<Class3167>
{
    private static String[] field19823;
    public final /* synthetic */ Class3311 field19824;
    
    public Class4466(final Class3311 field19824) {
        this.field19824 = field19824;
    }
    
    @Override
    public int compare(final Class3167 class3167, final Class3167 class3168) {
        final int method23505 = Class9400.field40313.method23505(class3167.method9901());
        final int method23506 = Class9400.field40313.method23505(class3168.method9901());
        if (method23505 > method23506) {
            return -1;
        }
        if (method23505 != method23506) {
            return 1;
        }
        return 0;
    }
}
