// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2376 extends ArithmeticException implements Class2375
{
    private static String[] field14170;
    private static final long field14171 = -6024911025449780478L;
    private final Class2413 field14172;
    
    public Class2376() {
        (this.field14172 = new Class2413(this)).method9652(Class2189.field13305, new Object[0]);
    }
    
    public Class2376(final Class2190 class2190, final Object... array) {
        (this.field14172 = new Class2413(this)).method9652(class2190, array);
    }
    
    public Class2413 method9503() {
        return this.field14172;
    }
    
    @Override
    public String getMessage() {
        return this.field14172.method9656();
    }
    
    @Override
    public String getLocalizedMessage() {
        return this.field14172.method9657();
    }
}
