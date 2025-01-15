// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7356
{
    private int field28387;
    private int field28388;
    
    public Class7356(final int n, final int n2) {
        this.field28387 = Math.min(n, n2);
        this.field28388 = Math.max(n, n2);
    }
    
    public boolean method22597(final int n) {
        return n >= this.field28387 && n <= this.field28388;
    }
    
    public int method22598() {
        return this.field28387;
    }
    
    public int method22599() {
        return this.field28388;
    }
    
    @Override
    public String toString() {
        return "min: " + this.field28387 + ", max: " + this.field28388;
    }
}
