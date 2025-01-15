// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6267 extends Class6257
{
    private static String[] field25129;
    
    public Class6267(final Class2233 class2233, final Class2215... array) {
        super(class2233, Class242.field1196, array);
    }
    
    @Override
    public int method18586(final int n) {
        return 5 + (n - 1) * 9;
    }
    
    @Override
    public int method18587(final int n) {
        return this.method18586(n) + 15;
    }
    
    @Override
    public int method18588() {
        return 3;
    }
    
    public static float method18606(final int n) {
        return 1.0f - 1.0f / (n + 1);
    }
}
