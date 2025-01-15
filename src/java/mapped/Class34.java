// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.LinkedHashMap;

public class Class34 extends LinkedHashMap
{
    private static String[] field85;
    public final /* synthetic */ Class7526 field86;
    
    public Class34(final Class7526 field86, final int initialCapacity, final float loadFactor, final boolean accessOrder) {
        this.field86 = field86;
        super(initialCapacity, loadFactor, accessOrder);
    }
    
    public boolean removeEldestEntry(final Map.Entry entry) {
        Class7526.method23544(this.field86, entry.getValue());
        Class7526.method23545(this.field86, Class7526.method23546(this.field86).field29981);
        return false;
    }
}
