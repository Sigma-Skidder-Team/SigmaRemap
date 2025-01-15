// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class76 implements Iterable<Object>
{
    private static String[] field169;
    private Iterator<Object> field170;
    
    public Class76(final Iterator<Object> field170) {
        this.field170 = field170;
    }
    
    @Override
    public Iterator<Object> iterator() {
        return this.field170;
    }
}
