// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.google.common.base.MoreObjects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3983 extends Block
{
    private static String[] field17982;
    public static final Class7115 field17983;
    public static final Class7113 field17984;
    public static final Class7113 field17985;
    public static final VoxelShape field17986;
    public static final VoxelShape field17987;
    public static final VoxelShape field17988;
    public static final VoxelShape field17989;
    
    public Class3983(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3983.field17983, Direction.NORTH)).with((IProperty<Comparable>)Class3983.field17984, false)).with((IProperty<Comparable>)Class3983.field17985, false));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        switch (Class8528.field35802[class7096.get((IProperty<Direction>)Class3983.field17983).ordinal()]) {
            default: {
                return Class3983.field17989;
            }
            case 2: {
                return Class3983.field17988;
            }
            case 3: {
                return Class3983.field17987;
            }
            case 4: {
                return Class3983.field17986;
            }
        }
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final Direction class7099 = class7096.get((IProperty<Direction>)Class3983.field17983);
        final BlockPos method1149 = class7098.method1149(class7099.getOpposite());
        final BlockState method1150 = class7097.getBlockState(method1149);
        if (class7099.getAxis().isHorizontal()) {
            if (method1150.isSolidSide(class7097, method1149, class7099)) {
                if (!method1150.method21714()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097.getOpposite() == class7096.get((IProperty<Direction>)Class3983.field17983) && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        BlockState class7075 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3983.field17984, false)).with((IProperty<Comparable>)Class3983.field17985, false);
        final World method21654 = class7074.method21654();
        final BlockPos method21655 = class7074.method21639();
        for (final Direction class7076 : class7074.method21643()) {
            if (class7076.getAxis().isHorizontal()) {
                class7075 = ((StateHolder<Object, BlockState>)class7075).with((IProperty<Comparable>)Class3983.field17983, class7076.getOpposite());
                if (class7075.method21752(method21654, method21655)) {
                    return class7075;
                }
            }
        }
        return null;
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
        this.method12126(class1847, class1848, class1849, false, false, -1, null);
    }
    
    public void method12126(final World class1847, final BlockPos class1848, final BlockState class1849, final boolean b, final boolean b2, final int n, final BlockState class1850) {
        final Direction class1851 = class1849.get((IProperty<Direction>)Class3983.field17983);
        final boolean booleanValue = class1849.get((IProperty<Boolean>)Class3983.field17985);
        final boolean booleanValue2 = class1849.get((IProperty<Boolean>)Class3983.field17984);
        boolean b3 = !b;
        boolean b4 = false;
        int n2 = 0;
        final BlockState[] array = new BlockState[42];
        int i = 1;
        while (i < 42) {
            BlockState method6701 = class1847.getBlockState(class1848.method1150(class1851, i));
            if (method6701.getBlock() != Class7521.field29410) {
                if (method6701.getBlock() != Class7521.field29411 && i != n) {
                    array[i] = null;
                    b3 = false;
                }
                else {
                    if (i == n) {
                        method6701 = (BlockState)MoreObjects.firstNonNull((Object)class1850, (Object)method6701);
                    }
                    final boolean b5 = !((StateHolder<Object, Object>)method6701).get((IProperty<Boolean>)Class3975.field17955);
                    final boolean booleanValue3 = ((StateHolder<Object, Object>)method6701).get((IProperty<Boolean>)Class3975.field17953);
                    b4 |= (b5 && booleanValue3);
                    array[i] = method6701;
                    if (i == n) {
                        class1847.method6833().method21345(class1848, this, this.method11826(class1847));
                        b3 &= b5;
                    }
                }
                ++i;
            }
            else {
                if (((StateHolder<Object, Object>)method6701).get((IProperty<Comparable>)Class3983.field17983) != class1851.getOpposite()) {
                    break;
                }
                n2 = i;
                break;
            }
        }
        final boolean b6 = b3 & n2 > 1;
        final boolean b7 = b4 & b6;
        final BlockState class1852 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3983.field17985, b6)).with((IProperty<Comparable>)Class3983.field17984, b7);
        if (n2 > 0) {
            final BlockPos method6702 = class1848.method1150(class1851, n2);
            final Direction method6703 = class1851.getOpposite();
            class1847.setBlockState(method6702, ((StateHolder<Object, BlockState>)class1852).with((IProperty<Comparable>)Class3983.field17983, method6703), 3);
            this.method12128(class1847, method6702, method6703);
            this.method12127(class1847, method6702, b6, b7, booleanValue, booleanValue2);
        }
        this.method12127(class1847, class1848, b6, b7, booleanValue, booleanValue2);
        if (!b) {
            class1847.setBlockState(class1848, ((StateHolder<Object, BlockState>)class1852).with((IProperty<Comparable>)Class3983.field17983, class1851), 3);
            if (b2) {
                this.method12128(class1847, class1848, class1851);
            }
        }
        if (booleanValue != b6) {
            for (int j = 1; j < n2; ++j) {
                final BlockPos method6704 = class1848.method1150(class1851, j);
                final Class7096 class1853 = array[j];
                if (class1853 != null) {
                    class1847.setBlockState(method6704, ((StateHolder<Object, Class7096>)class1853).with((IProperty<Comparable>)Class3983.field17985, b6), 3);
                    if (class1847.getBlockState(method6704).method21706()) {}
                }
            }
        }
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        this.method12126(class7097, class7098, class7096, false, true, -1, null);
    }
    
    private void method12127(final World class1847, final BlockPos class1848, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        if (b2 && !b4) {
            class1847.method6705(null, class1848, Class8520.field35644, Class286.field1582, 0.4f, 0.6f);
        }
        else if (!b2 && b4) {
            class1847.method6705(null, class1848, Class8520.field35643, Class286.field1582, 0.4f, 0.5f);
        }
        else if (b && !b3) {
            class1847.method6705(null, class1848, Class8520.field35642, Class286.field1582, 0.4f, 0.7f);
        }
        else if (!b) {
            if (b3) {
                class1847.method6705(null, class1848, Class8520.field35645, Class286.field1582, 0.4f, 1.2f / (class1847.rand.nextFloat() * 0.2f + 0.9f));
            }
        }
    }
    
    private void method12128(final World class1847, final BlockPos class1848, final Direction class1849) {
        class1847.method6696(class1848, this);
        class1847.method6696(class1848.method1149(class1849.getOpposite()), this);
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (!b) {
            if (class7096.method21696() != class7099.method21696()) {
                final boolean booleanValue = class7096.method21772((IProperty<Boolean>)Class3983.field17985);
                final boolean booleanValue2 = class7096.method21772((IProperty<Boolean>)Class3983.field17984);
                if (booleanValue || booleanValue2) {
                    this.method12126(class7097, class7098, class7096, true, false, -1, null);
                }
                if (booleanValue2) {
                    class7097.method6696(class7098, this);
                    class7097.method6696(class7098.method1149(class7096.method21772((IProperty<Direction>)Class3983.field17983).getOpposite()), this);
                }
                super.method11829(class7096, class7097, class7098, class7099, b);
            }
        }
    }
    
    @Override
    public int method11848(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return class7096.method21772((IProperty<Boolean>)Class3983.field17984) ? 15 : 0;
    }
    
    @Override
    public int method11851(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        if (class7096.method21772((IProperty<Boolean>)Class3983.field17984)) {
            return (class7096.method21772((IProperty<Comparable>)Class3983.field17983) != class7099) ? 0 : 15;
        }
        return 0;
    }
    
    @Override
    public boolean method11849(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3983.field17983, class7097.method8142(class7096.method21772((IProperty<Direction>)Class3983.field17983)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((IProperty<Direction>)Class3983.field17983)));
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3983.field17983, Class3983.field17984, Class3983.field17985);
    }
    
    static {
        field17983 = Class3892.field17564;
        field17984 = Class8970.field37741;
        field17985 = Class8970.field37719;
        field17986 = Block.method11778(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
        field17987 = Block.method11778(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
        field17988 = Block.method11778(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
        field17989 = Block.method11778(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);
    }
}
