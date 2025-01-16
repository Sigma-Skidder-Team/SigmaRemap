// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.IChunkLightProvider;

public class Class1899 extends Class1897<Class7502>
{
    private static String[] field10320;
    
    public Class1899(final IChunkLightProvider class1908) {
        super(Class237.field912, class1908, new Class7502((Long2ObjectOpenHashMap<Class7281>)new Long2ObjectOpenHashMap()));
    }
    
    @Override
    public int method7351(final long n) {
        final Class7281 method7348 = this.method7348(Class353.method1111(n), false);
        return (method7348 != null) ? method7348.method22322(Class353.method1096(BlockPos.unpackX(n)), Class353.method1096(BlockPos.unpackY(n)), Class353.method1096(BlockPos.unpackZ(n))) : 0;
    }
}
