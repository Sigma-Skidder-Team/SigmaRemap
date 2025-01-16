// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

public abstract class Class3892 extends Block
{
    public static final Class7115 field17564;
    
    public Class3892(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3892.field17564, class7097.method8142(class7096.get((IProperty<Direction>)Class3892.field17564)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.get((IProperty<Direction>)Class3892.field17564)));
    }
    
    static {
        field17564 = Class8970.field37758;
    }
}
