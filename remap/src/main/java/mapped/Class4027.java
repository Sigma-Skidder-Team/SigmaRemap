// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class4027 extends Block
{
    private static String[] field18119;
    public static final Class7114<Direction.Axis> field18120;
    
    public Class4027(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.getDefaultState()).with(Class4027.field18120, Direction.Axis.Y));
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        switch (Class6210.field25055[class7097.ordinal()]) {
            case 1:
            case 2: {
                switch (Class6210.field25054[class7096.get(Class4027.field18120).ordinal()]) {
                    case 1: {
                        return ((StateHolder<O, BlockState>)class7096).with(Class4027.field18120, Direction.Axis.Z);
                    }
                    case 2: {
                        return ((StateHolder<O, BlockState>)class7096).with(Class4027.field18120, Direction.Axis.X);
                    }
                    default: {
                        return class7096;
                    }
                }
                break;
            }
            default: {
                return class7096;
            }
        }
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class4027.field18120);
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return ((StateHolder<O, BlockState>)this.getDefaultState()).with(Class4027.field18120, class7074.method21648().getAxis());
    }
    
    static {
        field18120 = Class8970.field37749;
    }
}
