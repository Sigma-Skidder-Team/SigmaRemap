// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.ObjectSet;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;

public class Class1894 extends Class1892
{
    private static String[] field10289;
    public final Long2ByteMap field10290;
    public final int field10291;
    public final /* synthetic */ Class8730 field10292;
    
    public Class1894(final Class8730 field10292, final int field10293) {
        this.field10292 = field10292;
        super(field10293 + 2, 16, 256);
        this.field10290 = (Long2ByteMap)new Long2ByteOpenHashMap();
        this.field10291 = field10293;
        this.field10290.defaultReturnValue((byte)(field10293 + 2));
    }
    
    @Override
    public int method7302(final long n) {
        return this.field10290.get(n);
    }
    
    @Override
    public void method7304(final long n, final int n2) {
        byte b;
        if (n2 <= this.field10291) {
            b = this.field10290.put(n, (byte)n2);
        }
        else {
            b = this.field10290.remove(n);
        }
        this.method7331(n, b, n2);
    }
    
    public void method7331(final long n, final int n2, final int n3) {
    }
    
    @Override
    public int method7328(final long n) {
        return this.method7332(n) ? 0 : Integer.MAX_VALUE;
    }
    
    private boolean method7332(final long n) {
        final ObjectSet set = (ObjectSet)Class8730.method30153(this.field10292).get(n);
        return set != null && !set.isEmpty();
    }
    
    public void method7333() {
        this.method7324(Integer.MAX_VALUE);
    }
}
