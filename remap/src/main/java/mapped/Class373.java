// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Random;

public abstract class Class373 implements IDynamicSerializable
{
    public final Class8372<?> field2213;
    
    public Class373(final Class8372<?> field2213) {
        this.field2213 = field2213;
    }
    
    public abstract void method1254(final Class1851 p0, final BlockPos p1, final BlockState p2, final Random p3);
}
