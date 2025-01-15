// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8435
{
    public float[] field34667;
    public final int field34668;
    
    public Class8435(final float[] field34667, final int field34668) {
        this.field34667 = field34667;
        this.field34668 = field34668;
    }
    
    public float method28163(final int n) {
        if (this.field34667 != null) {
            final int method28165 = this.method28165(n);
            return this.field34667[(method28165 != 0 && method28165 != 1) ? 2 : 0];
        }
        throw new NullPointerException("uvs");
    }
    
    public float method28164(final int n) {
        if (this.field34667 != null) {
            final int method28165 = this.method28165(n);
            return this.field34667[(method28165 != 0 && method28165 != 3) ? 3 : 1];
        }
        throw new NullPointerException("uvs");
    }
    
    private int method28165(final int n) {
        return (n + this.field34668 / 90) % 4;
    }
    
    public int method28166(final int n) {
        return (n + 4 - this.field34668 / 90) % 4;
    }
    
    public void method28167(final float[] field34667) {
        if (this.field34667 == null) {
            this.field34667 = field34667;
        }
    }
}
