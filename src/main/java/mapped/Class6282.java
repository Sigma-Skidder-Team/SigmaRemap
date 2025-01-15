// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6282 extends Class6257
{
    private static String[] field25149;
    
    public Class6282(final Class2233 class2233, final Class2215... array) {
        super(class2233, Class242.field1199, array);
    }
    
    @Override
    public int method18586(final int n) {
        return 1 + (n - 1) * 8;
    }
    
    @Override
    public int method18587(final int n) {
        return this.method18586(n) + 20;
    }
    
    @Override
    public int method18588() {
        return 5;
    }
    
    @Override
    public float method18595(final int n, final Class6363 class6363) {
        return (class6363 != Class6363.field25464) ? 0.0f : (n * 2.5f);
    }
}
