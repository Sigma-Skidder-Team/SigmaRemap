// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Random;

public class Class3858 extends Block implements Class3857
{
    private static String[] field17477;
    public static final Class7113 field17478;
    
    public Class3858(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3858.field17478, true));
    }
    
    @Override
    public void method11850(final Class7096 class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        if (!class7097.getBlockState(class7098.method1137()).method21706()) {
            class7099.onEnterBubbleColumn(class7096.method21772((IProperty<Boolean>)Class3858.field17478));
        }
        else {
            class7099.onEnterBubbleColumnWithAirAbove(class7096.method21772((IProperty<Boolean>)Class3858.field17478));
            if (!class7097.isRemote) {
                final Class1849 class7100 = (Class1849)class7097;
                for (int i = 0; i < 2; ++i) {
                    class7100.method6911(Class8432.field34646, class7098.getX() + class7097.rand.nextFloat(), class7098.getY() + 1, class7098.getZ() + class7097.rand.nextFloat(), 1, 0.0, 0.0, 0.0, 1.0);
                    class7100.method6911(Class8432.field34601, class7098.getX() + class7097.rand.nextFloat(), class7098.getY() + 1, class7098.getZ() + class7097.rand.nextFloat(), 1, 0.0, 0.01, 0.0, 0.2);
                }
            }
        }
    }
    
    @Override
    public void method11828(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        method11923(class7097, class7098.method1137(), method11925(class7097, class7098.method1139()));
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        method11923(class7097, class7098.method1137(), method11925(class7097, class7098));
    }
    
    @Override
    public IFluidState method11864(final Class7096 class7096) {
        return Class7558.field29976.method22177(false);
    }
    
    public static void method11923(final Class1851 class1851, final BlockPos class1852, final boolean b) {
        if (method11924(class1851, class1852)) {
            class1851.setBlockState(class1852, ((StateHolder<O, Class7096>)Class7521.field29765.getDefaultState()).with((IProperty<Comparable>)Class3858.field17478, b), 2);
        }
    }
    
    public static boolean method11924(final Class1851 class1851, final BlockPos class1852) {
        final IFluidState method6702 = class1851.method6702(class1852);
        if (class1851.getBlockState(class1852).getBlock() == Class7521.field29173) {
            if (method6702.method21784() >= 8) {
                if (method6702.method21780()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean method11925(final Class1855 class1855, final BlockPos class1856) {
        final Class7096 method6701 = class1855.getBlockState(class1856);
        final Block method6702 = method6701.method21696();
        if (method6702 != Class7521.field29765) {
            return method6702 != Class7521.field29339;
        }
        return method6701.method21772((IProperty<Boolean>)Class3858.field17478);
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 5;
    }
    
    @Override
    public void method11823(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random) {
        final double n = class7098.getX();
        final double n2 = class7098.getY();
        final double n3 = class7098.getZ();
        if (!class7096.method21772((IProperty<Boolean>)Class3858.field17478)) {
            class7097.method6711(Class8432.field34650, n + 0.5, n2, n3 + 0.5, 0.0, 0.04, 0.0);
            class7097.method6711(Class8432.field34650, n + random.nextFloat(), n2 + random.nextFloat(), n3 + random.nextFloat(), 0.0, 0.04, 0.0);
            if (random.nextInt(200) == 0) {
                class7097.method6708(n, n2, n3, Class8520.field35045, Class286.field1582, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
        else {
            class7097.method6711(Class8432.field34649, n + 0.5, n2 + 0.8, n3, 0.0, 0.0, 0.0);
            if (random.nextInt(200) == 0) {
                class7097.method6708(n, n2, n3, Class8520.field35047, Class286.field1582, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21752(class7099, class7100)) {
            if (class7097 != Direction.DOWN) {
                if (class7097 == Direction.UP) {
                    if (class7098.method21696() != Class7521.field29765) {
                        if (method11924(class7099, class7101)) {
                            class7099.method6833().method21345(class7100, this, this.method11826(class7099));
                        }
                    }
                }
            }
            else {
                class7099.setBlockState(class7100, ((StateHolder<O, Class7096>)Class7521.field29765.getDefaultState()).with((IProperty<Comparable>)Class3858.field17478, method11925(class7099, class7101)), 2);
            }
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
            return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        return Class7521.field29173.getDefaultState();
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final Block method21696 = class7097.getBlockState(class7098.method1139()).getBlock();
        if (method21696 != Class7521.field29765) {
            if (method21696 != Class7521.field29642) {
                if (method21696 != Class7521.field29339) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return VoxelShapes.method24486();
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12305;
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3858.field17478);
    }
    
    @Override
    public Fluid method11922(final Class1851 class1851, final BlockPos class1852, final Class7096 class1853) {
        class1851.setBlockState(class1852, Class7521.field29147.getDefaultState(), 11);
        return Class7558.field29976;
    }
    
    static {
        field17478 = Class8970.field37723;
    }
}
