// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.world.chunk.IChunk;

import java.util.function.Function;

public class Class6036 extends Class6032<Class4408>
{
    public Class6036(final Function<Dynamic<?>, ? extends Class4408> function) {
        super(function);
    }
    
    public void method17959(final Random random, final IChunk class1860, final Biome class1861, final int n, final int n2, final int n3, final double n4, final BlockState class1862, final BlockState class1863, final int n5, final long n6, final Class4408 class1864) {
        if (n4 >= -1.0 && n4 <= 2.0) {
            if (n4 <= 1.0) {
                Class6032.field24552.method17960(random, class1860, class1861, n, n2, n3, n4, class1862, class1863, n5, n6, Class6032.field24541);
            }
            else {
                Class6032.field24552.method17960(random, class1860, class1861, n, n2, n3, n4, class1862, class1863, n5, n6, Class6032.field24543);
            }
        }
        else {
            Class6032.field24552.method17960(random, class1860, class1861, n, n2, n3, n4, class1862, class1863, n5, n6, Class6032.field24540);
        }
    }
}
