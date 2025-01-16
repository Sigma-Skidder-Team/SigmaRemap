// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class6864 extends Class6863
{
    private static String[] field26894;
    
    private Class6864() {
    }
    
    @Override
    public void method20976(final Random random, final int n, final int n2, final int n3, final boolean b) {
        if (random.nextFloat() >= 0.4f) {
            this.field26893 = Blocks.MOSSY_COBBLESTONE.getDefaultState();
        }
        else {
            this.field26893 = Blocks.COBBLESTONE.getDefaultState();
        }
    }
}
