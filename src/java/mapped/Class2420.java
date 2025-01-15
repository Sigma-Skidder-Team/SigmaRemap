// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2420 implements Serializable
{
    private static String[] field14318;
    public int field14319;
    public int field14320;
    
    public Class2420(final int field14319, final int field14320) {
        this.field14319 = field14319;
        this.field14320 = field14320;
    }
    
    public Class2420(final long n) {
        this.field14319 = (int)n;
        this.field14320 = (int)(n >> 32);
    }
    
    public Long method9723() {
        return Class7859.method25423(this.field14319, this.field14320);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class2420) {
            final Class2420 class2420 = (Class2420)o;
            return this.field14319 == class2420.field14319 && this.field14320 == class2420.field14320;
        }
        return false;
    }
}
