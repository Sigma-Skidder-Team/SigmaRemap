// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

public class Class3880 extends Class3878
{
    private static String[] field17533;
    private static final VoxelShape[] field17534;
    
    public Class3880(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class3832 method11960() {
        return Items.field31518;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3880.field17534[class7096.method21772((Class7111<Integer>)this.method11952())];
    }
    
    static {
        field17534 = new VoxelShape[] { Class3833.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 3.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 5.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 7.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 9.0, 16.0) };
    }
}
