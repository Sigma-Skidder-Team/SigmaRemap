// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import java.util.BitSet;
import java.util.stream.Stream;
import it.unimi.dsi.fastutil.shorts.ShortList;
import net.minecraft.entity.Entity;
import org.apache.logging.log4j.LogManager;
import java.util.Map;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public interface IChunk extends Class1855, Class1861
{
    @Nullable
    BlockState method7008(final BlockPos p0, final BlockState p1, final boolean p2);
    
    void method7009(final BlockPos p0, final TileEntity p1);
    
    void method7010(final Entity p0);
    
    @Nullable
    default Class8199 method7011() {
        final Class8199[] method7014 = this.method7014();
        for (int i = method7014.length - 1; i >= 0; --i) {
            final Class8199 class8199 = method7014[i];
            if (!Class8199.method27155(class8199)) {
                return class8199;
            }
        }
        return null;
    }
    
    default int method7012() {
        final Class8199 method7011 = this.method7011();
        return (method7011 != null) ? method7011.method27159() : 0;
    }
    
    Set<BlockPos> method7013();
    
    Class8199[] method7014();
    
    Collection<Map.Entry<Class2020, Class9548>> method7015();
    
    void method7016(final Class2020 p0, final long[] p1);
    
    Class9548 method7017(final Class2020 p0);
    
    int method7018(final Class2020 p0, final int p1, final int p2);
    
    Class7859 method7019();
    
    void method7020(final long p0);
    
    Map<String, Class5936> method7021();
    
    void method7022(final Map<String, Class5936> p0);
    
    default boolean method7023(int n, int n2) {
        if (n < 0) {
            n = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        for (int i = n; i <= n2; i += 16) {
            if (!Class8199.method27155(this.method7014()[i >> 4])) {
                return false;
            }
        }
        return true;
    }
    
    @Nullable
    Class1873 method7024();
    
    void method7025(final boolean p0);
    
    boolean method7026();
    
    ChunkStatus method7027();
    
    void method7028(final BlockPos p0);
    
    default void method7029(final BlockPos class354) {
        LogManager.getLogger().warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", (Object)class354);
    }
    
    ShortList[] method7030();
    
    default void method7031(final short n, final int n2) {
        method7042(this.method7030(), n2).add(n);
    }
    
    default void method7032(final Class51 class51) {
        LogManager.getLogger().warn("Trying to set a BlockEntity, but this operation is not supported.");
    }
    
    @Nullable
    Class51 method7033(final BlockPos p0);
    
    @Nullable
    Class51 method7034(final BlockPos p0);
    
    Stream<BlockPos> method7035();
    
    Class6952<Block> method7036();
    
    Class6952<Fluid> method7037();
    
    default BitSet method7038(final Class2126 class2126) {
        throw Class8349.method27859(new RuntimeException("Meaningless in this context"));
    }
    
    Class8288 method7039();
    
    void method7040(final long p0);
    
    long method7041();
    
    default ShortList method7042(final ShortList[] array, final int n) {
        if (array[n] == null) {
            array[n] = (ShortList)new ShortArrayList();
        }
        return array[n];
    }
    
    boolean method7043();
    
    void method7044(final boolean p0);
}
