// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.chunk.IChunk;

import java.util.Random;

public class Class8314<SC extends Class4407>
{
    private static String[] field34153;
    public final Class6032<SC> field34154;
    public final SC field34155;
    
    public Class8314(final Class6032<SC> field34154, final SC field34155) {
        this.field34154 = field34154;
        this.field34155 = field34155;
    }
    
    public void method27602(final Random random, final IChunk class1860, final Biome class1861, final int n, final int n2, final int n3, final double n4, final BlockState class1862, final BlockState class1863, final int n5, final long n6) {
        this.field34154.method17960(random, class1860, class1861, n, n2, n3, n4, class1862, class1863, n5, n6, this.field34155);
    }
    
    public void method27603(final long n) {
        this.field34154.method17962(n);
    }
    
    public SC method27604() {
        return this.field34155;
    }
}
