// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public final class Class7714 implements Class7712
{
    private static String[] field30677;
    
    @Override
    public int method24616(final BlockState class7096, final Class1856 class7097, final BlockPos class7098) {
        final Biome method30337 = Class8763.method30337(class7097, class7098);
        return (Class8763.method30391() == null) ? method30337.method9868() : Class8763.method30391().method24633(method30337, class7098);
    }
    
    @Override
    public boolean method24617() {
        return false;
    }
}
