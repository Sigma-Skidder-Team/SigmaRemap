// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.Random;

public class Class3981 extends Block
{
    private static String[] field17977;
    public static final Class7112 field17978;
    public static final VoxelShape field17979;
    
    public Class3981(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3981.field17978, 0));
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3981.field17979;
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21752(class7097, class7098)) {
            if (class7097.method6961(class7098.method1137())) {
                int n;
                for (n = 1; class7097.getBlockState(class7098.method1140(n)).method21696() == this; ++n) {}
                if (n < 3) {
                    final int intValue = class7096.method21772((IProperty<Integer>)Class3981.field17978);
                    if (intValue != 15) {
                        class7097.setBlockState(class7098, (Class7096)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3981.field17978, intValue + 1), 4);
                    }
                    else {
                        class7097.method6692(class7098.method1137(), this.getDefaultState());
                        class7097.setBlockState(class7098, ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3981.field17978, 0), 4);
                    }
                }
            }
        }
        else {
            class7097.method7149(class7098, true);
        }
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (!class7096.method21752(class7099, class7100)) {
            class7099.method6833().method21345(class7100, this, 1);
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final Block method21696 = class7097.getBlockState(class7098.method1139()).getBlock();
        if (method21696 != this) {
            if (method21696 != Class7521.field29155) {
                if (method21696 != Class7521.field29156) {
                    if (method21696 != Class7521.field29157) {
                        if (method21696 != Class7521.field29158) {
                            if (method21696 != Class7521.field29175) {
                                if (method21696 != Class7521.field29176) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            final BlockPos method21697 = class7098.method1139();
            for (final Direction class7099 : Plane.HORIZONTAL) {
                final Class7096 method21698 = class7097.getBlockState(method21697.method1149(class7099));
                if (!class7097.getFluidState(method21697.method1149(class7099)).isTagged(Class7324.field28319) && method21698.method21696() != Class7521.field29641) {
                    continue;
                }
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3981.field17978);
    }
    
    static {
        field17978 = Class8970.field37774;
        field17979 = Block.method11778(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
    }
}
