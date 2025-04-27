// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;

public final class Class1900 extends Class1896
{
    private static String[] field10321;
    private final Long2ByteMap field10322;
    public final /* synthetic */ Class1883 field10323;
    
    public Class1900(final Class1883 field10323) {
        this.field10323 = field10323;
        super(7, 16, 256);
        (this.field10322 = new Long2ByteOpenHashMap()).defaultReturnValue((byte)7);
    }
    
    @Override
    public int method7345(final long n) {
        return Class1883.method7237(this.field10323, n) ? 0 : 7;
    }
    
    @Override
    public int method7302(final long n) {
        return this.field10322.get(n);
    }
    
    @Override
    public void method7304(final long n, final int n2) {
        if (n2 <= 6) {
            this.field10322.put(n, (byte)n2);
        }
        else {
            this.field10322.remove(n);
        }
    }
    
    public void method7374() {
        super.method7324(Integer.MAX_VALUE);
    }
}
