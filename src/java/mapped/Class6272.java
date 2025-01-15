// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class6272 extends Class6257
{
    private static String[] field25135;
    
    public Class6272(final Class2233 class2233, final Class2215... array) {
        super(class2233, Class242.field1200, array);
    }
    
    @Override
    public int method18586(final int n) {
        return 5 + (n - 1) * 8;
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
    public boolean method18600(final Class8321 class8321) {
        return class8321.method27630() || super.method18600(class8321);
    }
    
    public static boolean method18609(final Class8321 class8321, final int n, final Random random) {
        return (!(class8321.method27622() instanceof Class4055) || random.nextFloat() >= 0.6f) && random.nextInt(n + 1) > 0;
    }
}
