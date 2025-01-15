// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class2315 extends Random
{
    private static String[] field14042;
    private static final long field14043 = 1L;
    
    @Override
    public int nextInt(final int n, final int n2) {
        return this.nextInt(n2 - n) + n;
    }
}
