// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class78 implements Iterable<Class7576>
{
    private static String[] field173;
    private final Iterator<Class7576> field174;
    
    public Class78(final Iterator<Class7576> field174) {
        this.field174 = field174;
    }
    
    @Override
    public Iterator<Class7576> iterator() {
        return this.field174;
    }
}
