// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.world.chunk;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.lighting.WorldLightManager;

import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class AbstractChunkProvider implements IChunkLightProvider, AutoCloseable
{
    @Nullable
    public Chunk getChunk(final int n, final int n2, final boolean b) {
        return (Chunk)this.getChunk(n, n2, ChunkStatus.FULL, b);
    }
    
    @Nullable
    public Chunk func_225313_a(final int n, final int n2) {
        return this.getChunk(n, n2, false);
    }
    
    @Nullable
    @Override
    public IBlockReader getChunkForLight(final int n, final int n2) {
        return this.getChunk(n, n2, ChunkStatus.EMPTY, false);
    }
    
    public boolean chunkExists(final int n, final int n2) {
        return this.getChunk(n, n2, ChunkStatus.FULL, false) != null;
    }
    
    @Nullable
    public abstract IChunk getChunk(final int p0, final int p1, final ChunkStatus p2, final boolean p3);
    
    public abstract void tick(final BooleanSupplier p0);
    
    public abstract String makeString();
    
    @Override
    public void close() throws IOException {
    }
    
    public abstract WorldLightManager getLightManager();
    
    public void setAllowedSpawnTypes(final boolean b, final boolean b2) {
    }
    
    public void forceChunk(final ChunkPos class7859, final boolean b) {
    }
    
    public boolean isChunkLoaded(final Entity class399) {
        return true;
    }
    
    public boolean isChunkLoaded(final ChunkPos class7859) {
        return true;
    }
    
    public boolean canTick(final BlockPos class354) {
        return true;
    }
}
