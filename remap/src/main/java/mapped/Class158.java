// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class158 implements Class122
{
    private static String[] field461;
    private final Class8697 field462;
    private final BlockPos field463;
    
    public Class158(final Class8697 field462, final BlockPos field463) {
        this.field462 = field462;
        this.field463 = field463;
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final BlockPos class7530 = class7529.method23579(Class6683.field26367);
        return class7530 != null && this.field462.method29812(class7529.method23588(), (float)(class7530.getX() + this.field463.getX()), (float)(class7530.getY() + this.field463.getY()), (float)(class7530.getZ() + this.field463.getZ()));
    }
    
    public static Class8775 method750(final Class7600 class7600) {
        return () -> new Class158(class7600.method23900(), BlockPos.ZERO);
    }
}
