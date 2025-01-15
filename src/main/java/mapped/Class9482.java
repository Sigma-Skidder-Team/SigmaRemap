// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedHashSet;
import java.util.Set;

public final class Class9482
{
    private static String[] field40756;
    private final Set<Class7465> field40757;
    
    public Class9482() {
        this.field40757 = new LinkedHashSet<Class7465>();
    }
    
    public synchronized void method35305(final Class7465 class7465) {
        this.field40757.add(class7465);
    }
    
    public synchronized void method35306(final Class7465 class7465) {
        this.field40757.remove(class7465);
    }
    
    public synchronized boolean method35307(final Class7465 class7465) {
        return this.field40757.contains(class7465);
    }
}
