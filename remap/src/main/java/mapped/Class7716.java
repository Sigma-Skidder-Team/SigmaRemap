// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public final class Class7716 implements Class7712
{
    private static String[] field30679;
    
    @Override
    public int method24616(final BlockState class7096, final Class1856 class7097, final BlockPos class7098) {
        final Class3090 method30337 = Class8763.method30337(class7097, class7098);
        return (Class8763.method30387() != null && method30337 == Class7102.field27638) ? Class8763.method30387().method24633(method30337, class7098) : method30337.method9858(class7098.getX(), class7098.getZ());
    }
    
    @Override
    public boolean method24617() {
        return false;
    }
}
