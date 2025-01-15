// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public abstract class Class3892 extends Class3833
{
    public static final Class7115 field17564;
    
    public Class3892(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((Class7097<O, BlockState>)class7096).method21773((Class7111<Comparable>)Class3892.field17564, class7097.method8142(class7096.method21772((Class7111<Direction>)Class3892.field17564)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Direction>)Class3892.field17564)));
    }
    
    static {
        field17564 = Class8970.field37758;
    }
}
