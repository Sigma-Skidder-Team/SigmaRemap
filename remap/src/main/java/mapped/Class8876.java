// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.dimension.DimensionType;

import java.util.UUID;

public class Class8876
{
    private static String[] field37312;
    
    public static Class1849 method31206() {
        final Minecraft method28894 = Config.method28894();
        final ClientWorld field4683 = method28894.world;
        if (field4683 == null) {
            return null;
        }
        if (!method28894.method5283()) {
            return null;
        }
        final IntegratedServer method28895 = method28894.method5285();
        if (method28895 == null) {
            return null;
        }
        final Dimension field4684 = field4683.dimension;
        if (field4684 == null) {
            return null;
        }
        final DimensionType method28896 = field4684.getType();
        try {
            return method28895.method1481(method28896);
        }
        catch (final NullPointerException ex) {
            return null;
        }
    }
    
    public static Entity method31207(final UUID uuid) {
        final Class1849 method31206 = method31206();
        if (method31206 != null) {
            return method31206.method6914(uuid);
        }
        return null;
    }
    
    public static TileEntity method31208(final BlockPos class354) {
        final Class1849 method31206 = method31206();
        if (method31206 == null) {
            return null;
        }
        final IChunk method31207 = method31206.method6904().getChunk(class354.getX() >> 4, class354.getZ() >> 4, ChunkStatus.FULL, false);
        if (method31207 != null) {
            return method31207.getTileEntity(class354);
        }
        return null;
    }
}
