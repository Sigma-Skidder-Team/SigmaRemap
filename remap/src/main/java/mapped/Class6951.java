// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.stream.Stream;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.function.Function;
import it.unimi.dsi.fastutil.shorts.ShortList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.IChunk;

import java.util.function.Predicate;

public class Class6951<T> implements Class6952<T>
{
    private static String[] field27215;
    public final Predicate<T> field27216;
    private final ChunkPos field27217;
    private final ShortList[] field27218;
    
    public Class6951(final Predicate<T> predicate, final ChunkPos class7859) {
        this(predicate, class7859, new ListNBT());
    }
    
    public Class6951(final Predicate<T> field27216, final ChunkPos field27217, final ListNBT class52) {
        this.field27218 = new ShortList[16];
        this.field27216 = field27216;
        this.field27217 = field27217;
        for (int i = 0; i < class52.size(); ++i) {
            final ListNBT method347 = class52.method347(i);
            for (int j = 0; j < method347.size(); ++j) {
                IChunk.method7042(this.field27218, i).add(method347.method348(j));
            }
        }
    }
    
    public ListNBT method21338() {
        return Class7532.method23599(this.field27218);
    }
    
    public void method21339(final Class6952<T> class6952, final Function<BlockPos, T> function) {
        for (int i = 0; i < this.field27218.length; ++i) {
            if (this.field27218[i] != null) {
                final ShortListIterator iterator = this.field27218[i].iterator();
                while (iterator.hasNext()) {
                    final BlockPos method7101 = Class1865.method7101((short)((Iterator)iterator).next(), i, this.field27217);
                    class6952.method21345(method7101, function.apply(method7101), 0);
                }
                this.field27218[i].clear();
            }
        }
    }
    
    @Override
    public boolean method21340(final BlockPos class354, final T t) {
        return false;
    }
    
    @Override
    public void method21341(final BlockPos class354, final T t, final int n, final Class1955 class355) {
        IChunk.method7042(this.field27218, class354.getY() >> 4).add(Class1865.method7100(class354));
    }
    
    @Override
    public boolean method21342(final BlockPos class354, final T t) {
        return false;
    }
    
    @Override
    public void method21343(final Stream<Class7460<T>> stream) {
        stream.forEach(class7460 -> this.method21341(class7460.field28774, class7460.method22980(), 0, class7460.field28776));
    }
}
