// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

public class Class3861 extends Class3860
{
    private static String[] field17486;
    public static final Class7112 field17487;
    
    public Class3861(final Class9288 class9288, final Class8289 class9289) {
        super(class9288, class9289);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3861.field17487, 0)).with((IProperty<Comparable>)Class3861.field17483, false));
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return class7097.getBlockState(class7098.method1139()).getMaterial().method26439();
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class3861.field17487, MathHelper.floor((180.0f + class7074.method21646()) * 16.0f / 360.0f + 0.5) & 0xF)).with((IProperty<Comparable>)Class3861.field17483, class7074.method21654().method6702(class7074.method21639()).method21779() == Class7558.field29976);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097 == Direction.DOWN && !this.method11843(class7096, class7099, class7100)) ? Class7521.field29147.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3861.field17487, class7097.method8143(class7096.method21772((IProperty<Integer>)Class3861.field17487), 16));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3861.field17487, class7097.method8343(class7096.method21772((IProperty<Integer>)Class3861.field17487), 16));
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3861.field17487, Class3861.field17483);
    }
    
    static {
        field17487 = Class8970.field37793;
    }
}
