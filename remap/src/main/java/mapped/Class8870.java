// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8870
{
    private static String[] field37285;
    private long field37286;
    private Class4252 field37287;
    public final /* synthetic */ Class3336 field37288;
    
    public Class8870(final Class3336 field37288, final Class4252<?> field37289, final long n) {
        this.field37288 = field37288;
        this.field37287 = field37289;
        this.field37286 = System.currentTimeMillis() + n;
    }
    
    public boolean method31165() {
        return this.field37286 - System.currentTimeMillis() < 0L;
    }
    
    public Class4252 method31166() {
        return this.field37287;
    }
}
