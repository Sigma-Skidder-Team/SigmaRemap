// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6938
{
    private static String[] field27172;
    private long field27173;
    
    public Class6938(final long n) {
        this.field27173 = System.currentTimeMillis() + n;
    }
    
    public boolean method21312() {
        return this.field27173 - System.currentTimeMillis() < 0L;
    }
}
