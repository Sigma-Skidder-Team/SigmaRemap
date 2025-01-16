// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.stream.Stream;
import java.util.function.Function;

public class Class6955<T> implements Class6952<T>
{
    private static String[] field27230;
    private final Function<BlockPos, Class6952<T>> field27231;
    
    public Class6955(final Function<BlockPos, Class6952<T>> field27231) {
        this.field27231 = field27231;
    }
    
    @Override
    public boolean method21340(final BlockPos class354, final T t) {
        return this.field27231.apply(class354).method21340(class354, t);
    }
    
    @Override
    public void method21341(final BlockPos class354, final T t, final int n, final Class1955 class355) {
        this.field27231.apply(class354).method21341(class354, t, n, class355);
    }
    
    @Override
    public boolean method21342(final BlockPos class354, final T t) {
        return false;
    }
    
    @Override
    public void method21343(final Stream<Class7460<T>> stream) {
        stream.forEach(t2 -> this.field27231.apply(t2.field28774).method21343(Stream.of(t2)));
    }
}
