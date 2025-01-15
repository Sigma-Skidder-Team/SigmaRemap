// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.ArrayList;

public class Class7595
{
    private static String[] field30118;
    private ArrayList field30119;
    
    public Class7595() {
        this.field30119 = new ArrayList();
    }
    
    public void method23888(final Class8017 e) {
        this.field30119.add(e);
    }
    
    public int method23889() {
        return this.field30119.size();
    }
    
    public Class8017 method23890(final int index) {
        return this.field30119.get(index);
    }
    
    public boolean method23891(final Class8017 o) {
        return this.field30119.contains(o);
    }
    
    public void method23892(final Collection collection) {
        collection.addAll(this.field30119);
    }
}
