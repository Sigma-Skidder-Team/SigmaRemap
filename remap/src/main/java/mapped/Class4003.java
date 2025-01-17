// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Map;

public class Class4003 extends Block
{
    private static String[] field18040;
    public static final Class7113 field18041;
    public static final Class7113 field18042;
    public static final Class7113 field18043;
    public static final Class7113 field18044;
    public static final Class7113 field18045;
    public static final Class7113 field18046;
    private static final Map<Direction, Class7113> field18047;
    
    public Class4003(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class4003.field18041, true)).with((IProperty<Comparable>)Class4003.field18042, true)).with((IProperty<Comparable>)Class4003.field18043, true)).with((IProperty<Comparable>)Class4003.field18044, true)).with((IProperty<Comparable>)Class4003.field18045, true)).with((IProperty<Comparable>)Class4003.field18046, true));
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final World method21654 = class7074.method21654();
        final BlockPos method21655 = class7074.method21639();
        return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class4003.field18046, this != method21654.getBlockState(method21655.method1139()).method21696())).with((IProperty<Comparable>)Class4003.field18045, this != method21654.getBlockState(method21655.method1137()).method21696())).with((IProperty<Comparable>)Class4003.field18041, this != method21654.getBlockState(method21655.method1141()).method21696())).with((IProperty<Comparable>)Class4003.field18042, this != method21654.getBlockState(method21655.method1147()).method21696())).with((IProperty<Comparable>)Class4003.field18043, this != method21654.getBlockState(method21655.method1143()).method21696())).with((IProperty<Comparable>)Class4003.field18044, this != method21654.getBlockState(method21655.method1145()).method21696());
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7098.getBlock() != this) ? super.method11789(class7096, class7097, class7098, class7099, class7100, class7101) : ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class4003.field18047.get(class7097), false);
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8142(Direction.NORTH)), (Comparable)class7096.get((IProperty<V>)Class4003.field18041))).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8142(Direction.SOUTH)), (Comparable)class7096.get((IProperty<V>)Class4003.field18043))).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8142(Direction.EAST)), (Comparable)class7096.get((IProperty<V>)Class4003.field18042))).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8142(Direction.WEST)), (Comparable)class7096.get((IProperty<V>)Class4003.field18044))).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8142(Direction.UP)), (Comparable)class7096.get((IProperty<V>)Class4003.field18045))).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8142(Direction.DOWN)), (Comparable)class7096.get((IProperty<V>)Class4003.field18046));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8345(Direction.NORTH)), (Comparable)class7096.get((IProperty<V>)Class4003.field18041))).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8345(Direction.SOUTH)), (Comparable)class7096.get((IProperty<V>)Class4003.field18043))).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8345(Direction.EAST)), (Comparable)class7096.get((IProperty<V>)Class4003.field18042))).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8345(Direction.WEST)), (Comparable)class7096.get((IProperty<V>)Class4003.field18044))).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8345(Direction.UP)), (Comparable)class7096.get((IProperty<V>)Class4003.field18045))).with((IProperty<Comparable>)Class4003.field18047.get(class7097.method8345(Direction.DOWN)), (Comparable)class7096.get((IProperty<V>)Class4003.field18046));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class4003.field18045, Class4003.field18046, Class4003.field18041, Class4003.field18042, Class4003.field18043, Class4003.field18044);
    }
    
    static {
        field18041 = Class3967.field17921;
        field18042 = Class3967.field17922;
        field18043 = Class3967.field17923;
        field18044 = Class3967.field17924;
        field18045 = Class3967.field17925;
        field18046 = Class3967.field17926;
        field18047 = Class3967.field17927;
    }
}
