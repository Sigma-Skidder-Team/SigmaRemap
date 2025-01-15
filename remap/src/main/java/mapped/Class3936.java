// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

public class Class3936 extends Class3932
{
    private static String[] field17818;
    public static final Class7112 field17819;
    public static final VoxelShape field17820;
    
    public Class3936(final Class299 class299, final Class9288 class300) {
        super(class299, class300);
        this.method11877(((Class7097<O, BlockState>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3936.field17819, 0));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3936.field17820;
    }
    
    @Override
    public VoxelShape method11810(final BlockState class7096, final Class1855 class7097, final BlockPos class7098) {
        return Class7698.method24486();
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return ((Class7097<O, BlockState>)this.method11878()).method21773((Class7111<Comparable>)Class3936.field17819, MathHelper.floor(class7074.method21646() * 16.0f / 360.0f + 0.5) & 0xF);
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((Class7097<O, BlockState>)class7096).method21773((Class7111<Comparable>)Class3936.field17819, class7097.method8143(class7096.method21772((Class7111<Integer>)Class3936.field17819), 16));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return ((Class7097<O, BlockState>)class7096).method21773((Class7111<Comparable>)Class3936.field17819, class7097.method8343(class7096.method21772((Class7111<Integer>)Class3936.field17819), 16));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, BlockState> class9500) {
        class9500.method35378(Class3936.field17819);
    }
    
    static {
        field17819 = Class8970.field37793;
        field17820 = Class3833.method11778(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
    }
}
