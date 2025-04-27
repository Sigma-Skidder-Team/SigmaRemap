// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class96 implements Iterable<Object>
{
    private static String[] field263;
    private final Iterator<Object> field264;
    
    public Class96(final Iterator<Object> field264) {
        this.field264 = field264;
    }
    
    @Override
    public Iterator<Object> iterator() {
        return this.field264;
    }
}
