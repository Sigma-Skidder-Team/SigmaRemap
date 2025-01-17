// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public abstract class Class3841 extends Block implements Class3840
{
    public Class3841(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12305;
    }
    
    @Override
    public boolean method11857(final BlockState class7096, final World class7097, final BlockPos class7098, final int n, final int n2) {
        super.method11857(class7096, class7097, class7098, n, n2);
        final TileEntity method6727 = class7097.getTileEntity(class7098);
        return method6727 != null && method6727.method2200(n, n2);
    }
    
    @Nullable
    @Override
    public Class434 method11827(final BlockState class7096, final World class7097, final BlockPos class7098) {
        final TileEntity method6727 = class7097.getTileEntity(class7098);
        return (method6727 instanceof Class434) ? method6727 : null;
    }
}
