// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.IdentityHashMap;

public class Class32 extends IdentityHashMap<Object, Class7576>
{
    private static String[] field80;
    private static final long field81 = -5576159264232131854L;
    public final /* synthetic */ Class7352 field82;
    
    public Class32(final Class7352 field82) {
        this.field82 = field82;
    }
    
    @Override
    public Class7576 put(final Object key, final Class7576 class7576) {
        return super.put(key, new Class7578(class7576));
    }
}
