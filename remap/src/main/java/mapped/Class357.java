// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Random;

public abstract class Class357 implements IDynamicSerializable
{
    public final Class8804<?> field2184;
    
    public Class357(final Class8804<?> field2184) {
        this.field2184 = field2184;
    }
    
    public abstract BlockState method1164(final Random p0, final BlockPos p1);
}
