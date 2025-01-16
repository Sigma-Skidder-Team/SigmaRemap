// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class Class3897 extends Class3895
{
    private static String[] field17581;
    public static final Class7113 field17582;
    public static final Class7112 field17583;
    
    public Class3897(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3897.field17564, Direction.NORTH)).with((IProperty<Comparable>)Class3897.field17583, 1)).with((IProperty<Comparable>)Class3897.field17582, false)).with((IProperty<Comparable>)Class3897.field17578, false));
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final Class7005 class7101) {
        if (class7099.field3025.field27305) {
            class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)class7096).method21768((IProperty<Comparable>)Class3897.field17583), 3);
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    @Override
    public int method11977(final BlockState class7096) {
        return class7096.get((IProperty<Integer>)Class3897.field17583) * 2;
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final BlockState method11846 = super.method11846(class7074);
        return ((StateHolder<Object, BlockState>)method11846).with((IProperty<Comparable>)Class3897.field17582, this.method11967(class7074.method21654(), class7074.method21639(), method11846));
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (!class7099.isRemote() && class7097.getAxis() != class7096.get((IProperty<Direction>)Class3897.field17564).getAxis()) ? ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3897.field17582, this.method11967(class7099, class7100, class7096)) : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11967(final Class1852 class1852, final BlockPos class1853, final BlockState class1854) {
        return this.method11970(class1852, class1853, class1854) > 0;
    }
    
    @Override
    public boolean method11973(final BlockState class7096) {
        return Class3895.method11975(class7096);
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (class7096.get((IProperty<Boolean>)Class3897.field17578)) {
            final Direction class7099 = class7096.get((IProperty<Direction>)Class3897.field17564);
            final double n = class7098.getX() + 0.5f + (random.nextFloat() - 0.5f) * 0.2;
            final double n2 = class7098.getY() + 0.4f + (random.nextFloat() - 0.5f) * 0.2;
            final double n3 = class7098.getZ() + 0.5f + (random.nextFloat() - 0.5f) * 0.2;
            float n4 = -5.0f;
            if (random.nextBoolean()) {
                n4 = (float)(class7096.get((IProperty<Integer>)Class3897.field17583) * 2 - 1);
            }
            final float n5 = n4 / 16.0f;
            class7097.method6709(Class6912.field27101, n + n5 * class7099.getXOffset(), n2, n3 + n5 * class7099.getZOffset(), 0.0, 0.0, 0.0);
        }
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3897.field17564, Class3897.field17583, Class3897.field17582, Class3897.field17578);
    }
    
    static {
        field17582 = Class8970.field37737;
        field17583 = Class8970.field37777;
    }
}
