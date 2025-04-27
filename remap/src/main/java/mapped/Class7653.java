// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class7653<T>
{
    private static String[] field30387;
    private final ArrayList<T> field30388;
    
    public Class7653(final int initialCapacity) {
        this.field30388 = new ArrayList<T>(initialCapacity);
    }
    
    public void method24253(final T e) {
        this.field30388.add(e);
    }
    
    public T method24254() {
        return this.field30388.remove(this.field30388.size() - 1);
    }
    
    public boolean method24255() {
        return this.field30388.isEmpty();
    }
    
    public void method24256() {
        this.field30388.clear();
    }
}
