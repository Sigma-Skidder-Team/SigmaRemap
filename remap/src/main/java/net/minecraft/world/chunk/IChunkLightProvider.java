// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.world.chunk;

import mapped.Class237;
import mapped.Class353;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public interface IChunkLightProvider
{
    @Nullable
    IBlockReader getChunkForLight(final int p0, final int p1);
    
    default void method7420(final Class237 class237, final Class353 class238) {
    }
    
    IBlockReader method7414();
}
