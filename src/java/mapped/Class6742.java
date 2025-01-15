// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6742
{
    private static String[] field26526;
    public int field26527;
    public float field26528;
    public float field26529;
    private long field26530;
    private final float field26531;
    public float field26532;
    
    public Class6742(final float n, final long field26530) {
        this.field26532 = 1.0f;
        this.field26531 = 1000.0f / n;
        this.field26530 = field26530;
    }
    
    public void method20527(final long field26530) {
        this.field26529 = (field26530 - this.field26530) / this.field26531 * this.field26532;
        this.field26530 = field26530;
        this.field26528 += this.field26529;
        this.field26527 = (int)this.field26528;
        this.field26528 -= this.field26527;
    }
}
