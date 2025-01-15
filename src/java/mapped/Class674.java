// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class674 extends Class673
{
    private static String[] field3709;
    private Class5601 field3710;
    
    public Class674(final int n, final int n2, final int n3, final int n4, final int n5, final Class5601 field3710, final String s) {
        super(n, n2, n3, n4, n5, s);
        this.field3710 = null;
        this.field3710 = field3710;
    }
    
    @Override
    public boolean method3358(final int n) {
        return !(this.field3710 instanceof Class5600) || n == 0;
    }
    
    public Class5601 method3736() {
        return this.field3710;
    }
    
    public void method3737() {
    }
    
    public boolean method3738() {
        return true;
    }
}
