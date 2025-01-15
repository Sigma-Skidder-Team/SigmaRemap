// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.Closeable;

public final class Class1668 implements Closeable
{
    private static String[] field9447;
    private final String field9448;
    private final long field9449;
    private final Class1682[] field9450;
    private final long[] field9451;
    public final /* synthetic */ Class1675 field9452;
    
    public Class1668(final Class1675 field9452, final String field9453, final long field9454, final Class1682[] field9455, final long[] field9456) {
        this.field9452 = field9452;
        this.field9448 = field9453;
        this.field9449 = field9454;
        this.field9450 = field9455;
        this.field9451 = field9456;
    }
    
    public String method5881() {
        return this.field9448;
    }
    
    @Nullable
    public Class9541 method5882() throws IOException {
        return this.field9452.method5904(this.field9448, this.field9449);
    }
    
    public Class1682 method5883(final int n) {
        return this.field9450[n];
    }
    
    public long method5884(final int n) {
        return this.field9451[n];
    }
    
    @Override
    public void close() {
        final Class1682[] field9450 = this.field9450;
        for (int length = field9450.length, i = 0; i < length; ++i) {
            Class7690.method24432(field9450[i]);
        }
    }
}
