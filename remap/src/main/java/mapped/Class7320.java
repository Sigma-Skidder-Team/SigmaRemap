// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import java.util.Optional;
import java.util.function.BiFunction;

public final class Class7320 implements Class7318
{
    private static String[] field28310;
    public final /* synthetic */ World field28311;
    public final /* synthetic */ BlockPos field28312;
    
    public Class7320(final World field28311, final BlockPos field28312) {
        this.field28311 = field28311;
        this.field28312 = field28312;
    }
    
    @Override
    public <T> Optional<T> method22435(final BiFunction<World, BlockPos, T> biFunction) {
        return Optional.of(biFunction.apply(this.field28311, this.field28312));
    }
}
