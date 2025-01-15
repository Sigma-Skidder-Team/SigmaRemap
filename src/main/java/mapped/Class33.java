// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.LinkedHashMap;

public class Class33 extends LinkedHashMap
{
    private static String[] field83;
    public final /* synthetic */ Class7522 field84;
    
    public Class33(final Class7522 field84, final int initialCapacity, final float loadFactor, final boolean accessOrder) {
        this.field84 = field84;
        super(initialCapacity, loadFactor, accessOrder);
    }
    
    public boolean removeEldestEntry(final Map.Entry entry) {
        final Class8941 class8941 = entry.getValue();
        if (class8941 != null) {
            Class7522.method23534(this.field84, class8941.field37622);
        }
        return this.size() > 200;
    }
}
