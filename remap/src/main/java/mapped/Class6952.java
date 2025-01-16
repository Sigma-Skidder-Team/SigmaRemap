// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.stream.Stream;

public interface Class6952<T>
{
    boolean method21340(final BlockPos p0, final T p1);
    
    default void method21345(final BlockPos class354, final T t, final int n) {
        this.method21341(class354, t, n, Class1955.field10642);
    }
    
    void method21341(final BlockPos p0, final T p1, final int p2, final Class1955 p3);
    
    boolean method21342(final BlockPos p0, final T p1);
    
    void method21343(final Stream<Class7460<T>> p0);
}
