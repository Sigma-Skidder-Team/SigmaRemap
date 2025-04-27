// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.nio.IntBuffer;

public class Class9339
{
    private static String[] field40096;
    private final IntBuffer field40097;
    private final int field40098;
    private final boolean[] field40099;
    private final boolean[] field40100;
    
    public Class9339(final IntBuffer field40097, final int field40098) {
        this.field40097 = field40097;
        this.field40098 = field40098;
        this.field40099 = new boolean[field40097.capacity()];
        this.field40100 = new boolean[field40097.capacity()];
    }
    
    public int method34612(final int n) {
        return this.method34614(n, this.field40099[n]);
    }
    
    public int method34613(final int n) {
        return this.method34614(n, !this.field40099[n]);
    }
    
    private int method34614(final int n, final boolean b) {
        return this.field40097.get((b ? this.field40098 : 0) + n);
    }
    
    public void method34615(final int n) {
        this.field40099[n] = !this.field40099[n];
        this.field40100[n] = true;
    }
    
    public boolean method34616(final int n) {
        return this.field40100[n];
    }
    
    public void method34617() {
        Arrays.fill(this.field40099, false);
        Arrays.fill(this.field40100, false);
    }
}
