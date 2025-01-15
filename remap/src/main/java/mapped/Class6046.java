// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.cache.CacheLoader;
import net.minecraft.util.math.shapes.VoxelShape;

public final class Class6046 extends CacheLoader<VoxelShape, Boolean>
{
    private static String[] field24596;
    
    public Boolean load(final VoxelShape class7702) {
        return !Class7698.method24496(Class7698.method24487(), class7702, Class9306.field39922);
    }
}
