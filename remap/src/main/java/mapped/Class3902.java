// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import javax.annotation.Nullable;

public class Class3902 extends Class3892
{
    private static String[] field17617;
    public static final Class7114<Class107> field17618;
    
    public Class3902(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        return method12002(class7097, class7098, method12003(class7096).getOpposite());
    }
    
    public static boolean method12002(final Class1852 class1852, final BlockPos class1853, final Direction class1854) {
        final BlockPos method1149 = class1853.method1149(class1854);
        return class1852.getBlockState(method1149).isSolidSide(class1852, method1149, class1854.getOpposite());
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        for (final Direction class7075 : class7074.method21643()) {
            BlockState class7076;
            if (class7075.getAxis() != Axis.Y) {
                class7076 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.getDefaultState()).with(Class3902.field17618, Class107.field333)).with((IProperty<Comparable>)Class3902.field17564, class7075.getOpposite());
            }
            else {
                class7076 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.getDefaultState()).with(Class3902.field17618, (class7075 != Direction.UP) ? Class107.field332 : Class107.field334)).with((IProperty<Comparable>)Class3902.field17564, class7074.method21644());
            }
            if (class7076.method21752(class7074.method21654(), class7074.method21639())) {
                return class7076;
            }
        }
        return null;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (method12003(class7096).getOpposite() == class7097 && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    public static Direction method12003(final BlockState class7096) {
        switch (Class9247.field39656[class7096.get(Class3902.field17618).ordinal()]) {
            case 1: {
                return Direction.DOWN;
            }
            case 2: {
                return Direction.UP;
            }
            default: {
                return class7096.get((IProperty<Direction>)Class3902.field17564);
            }
        }
    }
    
    static {
        field17618 = Class8970.field37759;
    }
}
