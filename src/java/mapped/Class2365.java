// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2365 extends RuntimeException
{
    private static String[] field14154;
    private final Class7689 field14155;
    
    public Class2365(final Class7689 field14155) {
        this.field14155 = field14155;
    }
    
    public Class7689 method9500() {
        return this.field14155;
    }
    
    @Override
    public Throwable getCause() {
        return this.field14155.method24411();
    }
    
    @Override
    public String getMessage() {
        return this.field14155.method24410();
    }
}
