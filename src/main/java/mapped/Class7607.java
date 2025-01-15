// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7607 implements Class7604
{
    private static String[] field30155;
    private final int[] field30156;
    
    public Class7607(final int n) {
        this.field30156 = new int[n];
    }
    
    @Override
    public int method23902(final int n) {
        return this.field30156[n];
    }
    
    @Override
    public void method23903(final int n, final int n2) {
        this.field30156[n] = n2;
    }
    
    @Override
    public int method23904() {
        return this.field30156.length;
    }
}
