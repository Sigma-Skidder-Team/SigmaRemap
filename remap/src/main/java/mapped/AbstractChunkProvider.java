// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class AbstractChunkProvider implements Class1908, AutoCloseable
{
    @Nullable
    public Class1862 method7398(final int n, final int n2, final boolean b) {
        return (Class1862)this.getChunk(n, n2, ChunkStatus.field39989, b);
    }
    
    @Nullable
    public Class1862 method7399(final int n, final int n2) {
        return this.method7398(n, n2, false);
    }
    
    @Nullable
    @Override
    public IBlockReader method7400(final int n, final int n2) {
        return this.getChunk(n, n2, ChunkStatus.field39977, false);
    }
    
    public boolean method7401(final int n, final int n2) {
        return this.getChunk(n, n2, ChunkStatus.field39989, false) != null;
    }
    
    @Nullable
    public abstract IChunk getChunk(final int p0, final int p1, final ChunkStatus p2, final boolean p3);
    
    public abstract void method7403(final BooleanSupplier p0);
    
    public abstract String method7404();
    
    @Override
    public void close() throws IOException {
    }
    
    public abstract Class1886 getLightManager();
    
    public void method7406(final boolean b, final boolean b2) {
    }
    
    public void method7407(final Class7859 class7859, final boolean b) {
    }
    
    public boolean method7408(final Entity class399) {
        return true;
    }
    
    public boolean method7409(final Class7859 class7859) {
        return true;
    }
    
    public boolean method7410(final BlockPos class354) {
        return true;
    }
}
