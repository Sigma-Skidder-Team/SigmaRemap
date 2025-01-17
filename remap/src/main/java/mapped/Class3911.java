// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

public class Class3911 extends Block
{
    private static String[] field17716;
    public static final Class7113 field17717;
    
    public Class3911(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3911.field17717, false));
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097 == Direction.UP) {
            final Block method21696 = class7098.method21696();
            return (Class7096)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3911.field17717, method21696 == Blocks.field29331 || method21696 == Blocks.field29329);
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Block method21696 = class7074.method21654().getBlockState(class7074.method21639().method1137()).method21696();
        return (Class7096)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class3911.field17717, method21696 == Blocks.field29331 || method21696 == Blocks.field29329);
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3911.field17717);
    }
    
    static {
        field17717 = Class8970.field37744;
    }
}
