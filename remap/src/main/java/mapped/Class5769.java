// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public final class Class5769 implements Class5770
{
    private static String[] field23600;
    private final int field23601;
    private final float field23602;
    
    public Class5769(final int field23601, final float field23602) {
        this.field23601 = field23601;
        this.field23602 = field23602;
    }
    
    @Override
    public int method17159(final Random random) {
        int n = 0;
        for (int i = 0; i < this.field23601; ++i) {
            if (random.nextFloat() < this.field23602) {
                ++n;
            }
        }
        return n;
    }
    
    public static Class5769 method17160(final int n, final float n2) {
        return new Class5769(n, n2);
    }
    
    @Override
    public Class1932 method17161() {
        return Class5769.field23605;
    }
}
