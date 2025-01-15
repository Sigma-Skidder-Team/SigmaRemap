// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4462 implements Comparator<Class3167>
{
    private static String[] field19816;
    public final /* synthetic */ Class3315 field19817;
    
    public Class4462(final Class3315 field19817) {
        this.field19817 = field19817;
    }
    
    @Override
    public int compare(final Class3167 class3167, final Class3167 class3168) {
        if (Class3315.method10494(this.field19817, class3167) > Class3315.method10494(this.field19817, class3168)) {
            return -1;
        }
        if (Class3315.method10494(this.field19817, class3167) >= Class3315.method10494(this.field19817, class3168)) {
            return class3167.method9900().compareTo(class3168.method9900());
        }
        return 1;
    }
}
