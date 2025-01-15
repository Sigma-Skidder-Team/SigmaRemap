// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6652 extends Class6635
{
    private static String[] field26298;
    private long field26299;
    private Class8322 field26300;
    
    public Class6652(final Class6108 class6108) {
        super(class6108);
        this.field26299 = 0L;
        this.field26300 = null;
    }
    
    public boolean method20218(final int n) {
        return System.currentTimeMillis() > this.field26299 + n;
    }
    
    public void method20219() {
        this.field26299 = System.currentTimeMillis();
    }
    
    public long method20220() {
        return this.field26299;
    }
    
    public Class8322 method20221() {
        return this.field26300;
    }
    
    public void method20222(final Class8322 field26300) {
        this.field26300 = field26300;
    }
}
