// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8935
{
    public short field37588;
    public short field37589;
    public short field37590;
    public short field37591;
    public short field37592;
    public short field37593;
    public short field37594;
    public short field37595;
    public Class7764 field37596;
    public short field37597;
    public short[] field37598;
    public final /* synthetic */ Class7526 field37599;
    
    private Class8935(final Class7526 field37599) {
        this.field37599 = field37599;
    }
    
    public void method31693() {
        this.field37596 = Class7526.method23547(this.field37599).method24836(this.field37589, this.field37590, this.field37591, this.field37592);
    }
    
    @Override
    public String toString() {
        return "[CharDef id=" + this.field37588 + " x=" + this.field37589 + " y=" + this.field37590 + "]";
    }
    
    public void method31694(final float n, final float n2) {
        this.field37596.method24816(n + this.field37593, n2 + this.field37594, this.field37591, this.field37592);
    }
    
    public int method31695(final int n) {
        if (this.field37598 != null) {
            int i = 0;
            int n2 = this.field37598.length - 1;
            while (i <= n2) {
                final int n3 = i + n2 >>> 1;
                final short n4 = this.field37598[n3];
                final int n5 = n4 & 0xFF;
                if (n5 >= n) {
                    if (n5 <= n) {
                        return n4 >> 8;
                    }
                    n2 = n3 - 1;
                }
                else {
                    i = n3 + 1;
                }
            }
            return 0;
        }
        return 0;
    }
}
