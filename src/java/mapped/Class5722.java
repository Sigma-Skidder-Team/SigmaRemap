// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5722 extends Class5714
{
    private static String[] field23271;
    public Class5487 field23272;
    public boolean field23273;
    
    public Class5722(final Class5487 field23272) {
        this.field23272 = field23272;
    }
    
    public boolean method16993() {
        return this.field23273;
    }
    
    public Class5487 method16994() {
        return this.field23272;
    }
    
    public void method16995(final double field22771) {
        this.field23272.field22771 = field22771;
    }
    
    public void method16996(final double n) {
        final float[] method23143 = Class7482.method23143();
        final float n2 = method23143[1];
        final float n3 = method23143[2];
        final float n4 = method23143[0];
        if (n2 == 0.0f) {
            if (n3 == 0.0f) {
                this.field23272.field22770 = 0.0;
                this.field23272.field22772 = 0.0;
            }
        }
        final double cos = Math.cos(Math.toRadians(n4));
        final double sin = Math.sin(Math.toRadians(n4));
        final double field22770 = (n2 * cos + n3 * sin) * n;
        final double field22771 = (n2 * sin - n3 * cos) * n;
        this.field23272.field22770 = field22770;
        this.field23272.field22772 = field22771;
        this.field23273 = true;
    }
    
    public void method16997(final Class5487 field23272) {
        this.field23272 = field23272;
        this.field23273 = true;
    }
}
