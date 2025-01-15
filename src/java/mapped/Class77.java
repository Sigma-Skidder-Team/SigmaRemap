// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class77 implements Iterable<Class6287>
{
    private static String[] field171;
    private Iterator<Class6287> field172;
    
    public Class77(final Iterator<Class6287> field172) {
        this.field172 = field172;
    }
    
    @Override
    public Iterator<Class6287> iterator() {
        return this.field172;
    }
}
