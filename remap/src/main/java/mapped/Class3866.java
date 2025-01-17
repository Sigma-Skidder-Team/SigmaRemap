// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;

public class Class3866 extends Class3865
{
    private static String[] field17496;
    
    public Class3866(final Properties class9288) {
        super(class9288, () -> Class5412.field22543);
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class478();
    }
    
    @Override
    public Class9455<ResourceLocation> method11935() {
        return Class8276.field33987.method8449(Class8276.field34037);
    }
    
    @Override
    public boolean method11849(final BlockState class7096) {
        return true;
    }
    
    @Override
    public int method11848(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return MathHelper.method35651(Class475.method2424(class7097, class7098), 0, 15);
    }
    
    @Override
    public int method11851(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return (class7099 != Direction.UP) ? 0 : class7096.method21715(class7097, class7098, class7099);
    }
}
