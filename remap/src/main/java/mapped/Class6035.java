// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.world.chunk.IChunk;

import java.util.function.Function;

public class Class6035 extends Class6032<Class4408>
{
    public Class6035(final Function<Dynamic<?>, ? extends Class4408> function) {
        super(function);
    }
    
    public void method17959(final Random random, final IChunk class1860, final Biome class1861, final int n, final int n2, final int n3, final double n4, final BlockState class1862, final BlockState class1863, final int n5, final long n6, final Class4408 class1864) {
        if (Biome.field15442.method29027(n * 0.25, n2 * 0.25, false) > 0.0) {
            final int n7 = n & 0xF;
            final int n8 = n2 & 0xF;
            final Mutable class1865 = new Mutable();
            int i = n3;
            while (i >= 0) {
                class1865.setPos(n7, i, n8);
                if (class1860.getBlockState(class1865).method21706()) {
                    --i;
                }
                else {
                    if (i != 62) {
                        break;
                    }
                    if (class1860.getBlockState(class1865).getBlock() == class1863.getBlock()) {
                        break;
                    }
                    class1860.method7008(class1865, class1863, false);
                    break;
                }
            }
        }
        Class6032.field24552.method17960(random, class1860, class1861, n, n2, n3, n4, class1862, class1863, n5, n6, class1864);
    }
}
