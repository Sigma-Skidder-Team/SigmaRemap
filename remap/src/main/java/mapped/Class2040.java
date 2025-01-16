// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

public enum Class2040 implements Class2041
{
    field11632(BlockState::getCollisionShape),
    field11633(BlockState::method21726);
    
    private final Class2041 field11634;
    
    private Class2040(final Class2041 field11634) {
        this.field11634 = field11634;
    }
    
    @Override
    public VoxelShape method8120(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return this.field11634.method8120(class7096, class7097, class7098, class7099);
    }
}
