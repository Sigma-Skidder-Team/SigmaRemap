// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class3837 extends Class3834
{
    private static String[] field17446;
    public static final Class7702 field17447;
    public static final Class7702 field17448;
    public static final Class7702 field17449;
    
    public Class3837(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3837.field17415, Direction.UP));
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3837.field17415, class7097.method8142(class7096.method21772((Class7111<Direction>)Class3837.field17415)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3837.field17415, class7097.method8345(class7096.method21772((Class7111<Direction>)Class3837.field17415)));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        switch (Class9568.field41171[class7096.method21772((Class7111<Direction>)Class3837.field17415).getAxis().ordinal()]) {
            default: {
                return Class3837.field17449;
            }
            case 2: {
                return Class3837.field17448;
            }
            case 3: {
                return Class3837.field17447;
            }
        }
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Direction method21648 = class7074.method21648();
        final Class7096 method21649 = class7074.method21654().method6701(class7074.method21639().method1149(method21648.getOpposite()));
        return (method21649.method21696() == this && ((Class7097<Object, Object>)method21649).method21772((Class7111<Comparable>)Class3837.field17415) == method21648) ? ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3837.field17415, method21648.getOpposite()) : ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3837.field17415, method21648);
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Random random) {
        final Direction class7099 = class7096.method21772((Class7111<Direction>)Class3837.field17415);
        final double n = class7098.getX() + 0.55 - random.nextFloat() * 0.1f;
        final double n2 = class7098.getY() + 0.55 - random.nextFloat() * 0.1f;
        final double n3 = class7098.getZ() + 0.55 - random.nextFloat() * 0.1f;
        final double n4 = 0.4f - (random.nextFloat() + random.nextFloat()) * 0.4f;
        if (random.nextInt(5) == 0) {
            class7097.method6709(Class8432.field34616, n + class7099.getXOffset() * n4, n2 + class7099.getYOffset() * n4, n3 + class7099.getZOffset() * n4, random.nextGaussian() * 0.005, random.nextGaussian() * 0.005, random.nextGaussian() * 0.005);
        }
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3837.field17415);
    }
    
    @Override
    public Class2117 method11858(final Class7096 class7096) {
        return Class2117.field12340;
    }
    
    static {
        field17447 = Class3833.method11778(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
        field17448 = Class3833.method11778(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
        field17449 = Class3833.method11778(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);
    }
}
