// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

public class Class3996 extends Class3833
{
    private static String[] field18014;
    
    public Class3996(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12305;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class7698.method24486();
    }
    
    @Override
    public boolean method11780(final BlockState class7096) {
        return true;
    }
}
