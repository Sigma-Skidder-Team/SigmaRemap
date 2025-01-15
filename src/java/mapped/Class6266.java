// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6266 extends Class6257
{
    private static String[] field25128;
    
    public Class6266(final Class2233 class2233, final Class242 class2234, final Class2215... array) {
        super(class2233, class2234, array);
    }
    
    @Override
    public int method18586(final int n) {
        return 15 + (n - 1) * 9;
    }
    
    @Override
    public int method18587(final int n) {
        return super.method18586(n) + 50;
    }
    
    @Override
    public int method18588() {
        return 3;
    }
    
    @Override
    public boolean method18589(final Class6257 class6257) {
        return super.method18589(class6257) && class6257 != Class7882.field32366;
    }
}
