// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.Type;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.function.Supplier;

public final class Class8835<T extends TileEntity>
{
    private static String[] field37133;
    private final Supplier<? extends T> field37134;
    private final Set<Block> field37135;
    
    private Class8835(final Supplier<? extends T> field37134, final Set<Block> field37135) {
        this.field37134 = field37134;
        this.field37135 = field37135;
    }
    
    public static <T extends TileEntity> Class8835<T> method30854(final Supplier<? extends T> supplier, final Block... array) {
        return new Class8835<T>(supplier, (Set<Block>)ImmutableSet.copyOf((Object[])array));
    }
    
    public Class5412<T> method30855(final Type<?> type) {
        return new Class5412<T>(this.field37134, this.field37135, type);
    }
}