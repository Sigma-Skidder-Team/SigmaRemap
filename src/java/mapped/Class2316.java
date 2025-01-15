// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class2316 extends Random
{
    private static String[] field14044;
    private static final long field14045 = 1L;
    
    @Override
    public int nextInt(final int n, final int n2) {
        return this.nextInt(n2 - n) + n;
    }
}
