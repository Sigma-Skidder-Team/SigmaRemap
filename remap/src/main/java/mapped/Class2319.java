// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2319 extends Exception
{
    private static String[] field14052;
    private static final long field14053 = 3731842424390998726L;
    private final int field14054;
    
    public Class2319(final int field14054) {
        this.field14054 = field14054;
    }
    
    public Class2319(final int field14054, final String message) {
        super(message);
        this.field14054 = field14054;
    }
    
    public Class2319(final int field14054, final Throwable cause) {
        super(cause);
        this.field14054 = field14054;
    }
    
    public Class2319(final int field14054, final String message, final Throwable cause) {
        super(message, cause);
        this.field14054 = field14054;
    }
    
    public int method9447() {
        return this.field14054;
    }
}
