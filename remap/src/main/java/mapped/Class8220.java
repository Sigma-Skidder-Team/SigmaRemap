// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8220 extends Class8221
{
    private static String[] field33766;
    private final String field33767;
    private final int field33768;
    
    public Class8220(final String field33767, final int n) {
        super(n);
        this.field33767 = field33767;
        this.field33768 = this.field33770.getWidth(field33767);
    }
    
    @Override
    public void method27232(final float n) {
    }
    
    @Override
    public int method27233() {
        return Math.max(super.method27233(), this.field33768 + 14);
    }
}
