// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public abstract class Class3845 extends Class3846
{
    public Class3845(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public float method11859(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        return 1.0f;
    }
    
    @Override
    public boolean method11818(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        return true;
    }
    
    @Override
    public boolean method11794(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        return false;
    }
    
    @Override
    public boolean method11793(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        return false;
    }
    
    @Override
    public boolean method11779(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final EntityType<?> class7099) {
        return false;
    }
}
