// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

public class Class35 extends Long2ByteOpenHashMap
{
    private static String[] field87;
    public final /* synthetic */ int field88;
    public final /* synthetic */ Class1891 field89;
    
    public Class35(final Class1891 field89, final int n, final float n2, final int field90) {
        this.field89 = field89;
        this.field88 = field90;
        super(n, n2);
    }
    
    public void rehash(final int n) {
        if (n > this.field88) {
            super.rehash(n);
        }
    }
}
