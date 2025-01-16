// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class6034 extends Class6032<Class4408>
{
    public Class6034(final Function<Dynamic<?>, ? extends Class4408> function) {
        super(function);
    }
    
    public void method17959(final Random random, final IChunk class1860, final Class3090 class1861, final int n, final int n2, final int n3, final double n4, final BlockState class1862, final BlockState class1863, final int n5, final long n6, final Class4408 class1864) {
        if (n4 <= 1.75) {
            if (n4 <= -0.95) {
                Class6032.field24552.method17960(random, class1860, class1861, n, n2, n3, n4, class1862, class1863, n5, n6, Class6032.field24541);
            }
            else {
                Class6032.field24552.method17960(random, class1860, class1861, n, n2, n3, n4, class1862, class1863, n5, n6, Class6032.field24539);
            }
        }
        else {
            Class6032.field24552.method17960(random, class1860, class1861, n, n2, n3, n4, class1862, class1863, n5, n6, Class6032.field24544);
        }
    }
}
