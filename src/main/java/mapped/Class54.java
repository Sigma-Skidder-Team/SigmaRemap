// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.RandomAccess;
import java.util.AbstractList;

public final class Class54 extends AbstractList<Class1929> implements RandomAccess
{
    private static String[] field134;
    public final Class1929[] field135;
    
    private Class54(final Class1929[] field135) {
        this.field135 = field135;
    }
    
    public static Class54 of(final Class1929... array) {
        return new Class54(array.clone());
    }
    
    @Override
    public Class1929 get(final int n) {
        return this.field135[n];
    }
    
    @Override
    public int size() {
        return this.field135.length;
    }
}
