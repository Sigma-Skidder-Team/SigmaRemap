// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7674
{
    private static String[] field30469;
    private final long field30470;
    private final String field30471;
    
    public Class7674(final String field30471, final long n) {
        this.field30471 = field30471;
        this.field30470 = System.currentTimeMillis() + n;
    }
    
    public boolean method24358() {
        return this.method24359() < 0L;
    }
    
    public long method24359() {
        return this.field30470 - System.currentTimeMillis();
    }
    
    public String method24360() {
        return this.field30471;
    }
}
