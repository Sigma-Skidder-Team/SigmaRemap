// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2374 extends IllegalArgumentException implements Class2375
{
    private static String[] field14167;
    private static final long field14168 = -6024911025449780478L;
    private final Class2413 field14169;
    
    public Class2374(final Class2190 class2190, final Object... array) {
        (this.field14169 = new Class2413(this)).method9652(class2190, array);
    }
    
    public Class2413 method9503() {
        return this.field14169;
    }
    
    @Override
    public String getMessage() {
        return this.field14169.method9656();
    }
    
    @Override
    public String getLocalizedMessage() {
        return this.field14169.method9657();
    }
}
