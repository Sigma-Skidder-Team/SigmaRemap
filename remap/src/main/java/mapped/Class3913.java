// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3913 extends Block implements Class3872
{
    private static String[] field17719;
    public static final VoxelShape field17720;
    public static final VoxelShape field17721;
    public static final VoxelShape field17722;
    public static final Class7112 field17723;
    public static final Class7114<Class184> field17724;
    public static final Class7112 field17725;
    
    public Class3913(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3913.field17723, 0)).with(Class3913.field17724, Class184.field574)).with((IProperty<Comparable>)Class3913.field17725, 0));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3913.field17723, Class3913.field17724, Class3913.field17725);
    }
    
    @Override
    public Class2180 method11879() {
        return Class2180.field12914;
    }
    
    @Override
    public boolean propagatesSkylightDown(final BlockState class7096, final Class1855 class7097, final BlockPos class7098) {
        return true;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final VoxelShape class7100 = (class7096.get(Class3913.field17724) != Class184.field576) ? Class3913.field17720 : Class3913.field17721;
        final Vec3d method21732 = class7096.method21732(class7097, class7098);
        return class7100.method24541(method21732.x, method21732.y, method21732.z);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    @Override
    public VoxelShape method11809(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final Vec3d method21732 = class7096.method21732(class7097, class7098);
        return Class3913.field17722.method24541(method21732.x, method21732.y, method21732.z);
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        if (!class7074.method21654().method6702(class7074.method21639()).isEmpty()) {
            return null;
        }
        final BlockState method6701 = class7074.method21654().getBlockState(class7074.method21639().method1139());
        if (!method6701.method21755(Class7188.field27925)) {
            return null;
        }
        final Block method6702 = method6701.getBlock();
        if (method6702 == Class7521.field29760) {
            return ((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3913.field17723, 0);
        }
        if (method6702 != Class7521.field29761) {
            return Class7521.field29760.getDefaultState();
        }
        return (BlockState)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class3913.field17723, (method6701.get((IProperty<Integer>)Class3913.field17723) > 0) ? 1 : 0);
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21752(class7097, class7098)) {
            if (class7096.get((IProperty<Integer>)Class3913.field17725) == 0) {
                if (random.nextInt(3) == 0) {
                    if (class7097.method6961(class7098.method1137())) {
                        if (class7097.method6993(class7098.method1137(), 0) >= 9) {
                            final int n = this.method12019(class7097, class7098) + 1;
                            if (n < 16) {
                                this.method12017(class7096, class7097, class7098, random, n);
                            }
                        }
                    }
                }
            }
        }
        else {
            class7097.method7149(class7098, true);
        }
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        return class7097.getBlockState(class7098.method1139()).method21755(Class7188.field27925);
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (!class7096.method21752(class7099, class7100)) {
            class7099.method6833().method21345(class7100, this, 1);
        }
        if (class7097 == Direction.UP) {
            if (class7098.getBlock() == Class7521.field29761) {
                if (class7098.get((IProperty<Integer>)Class3913.field17723) > class7096.get((IProperty<Integer>)Class3913.field17723)) {
                    class7099.setBlockState(class7100, ((StateHolder<O, BlockState>)class7096).method21768((IProperty<Comparable>)Class3913.field17723), 2);
                }
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final BlockPos class1856, final BlockState class1857, final boolean b) {
        final int method12018 = this.method12018(class1855, class1856);
        return method12018 + this.method12019(class1855, class1856) + 1 < 16 && class1855.getBlockState(class1856.method1138(method12018)).get((IProperty<Integer>)Class3913.field17725) != 1;
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final BlockState class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final BlockState class1851) {
        int method12018 = this.method12018(class1849, class1850);
        int n = method12018 + this.method12019(class1849, class1850) + 1;
        final int n2 = 1 + random.nextInt(2);
        int i = 0;
        while (i < n2) {
            final BlockPos method12019 = class1850.method1138(method12018);
            final BlockState method12020 = class1849.getBlockState(method12019);
            if (n < 16) {
                if (method12020.get((IProperty<Integer>)Class3913.field17725) != 1) {
                    if (class1849.method6961(method12019.method1137())) {
                        this.method12017(method12020, class1849, method12019, random, n);
                        ++method12018;
                        ++n;
                        ++i;
                        continue;
                    }
                }
            }
        }
    }
    
    @Override
    public float method11830(final BlockState class7096, final PlayerEntity class7097, final Class1855 class7098, final BlockPos class7099) {
        return (class7097.getHeldItemMainhand().getItem() instanceof Class4077) ? 1.0f : super.method11830(class7096, class7097, class7098, class7099);
    }
    
    public void method12017(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random, final int n) {
        final BlockState method6701 = class7097.getBlockState(class7098.method1139());
        final BlockPos method6702 = class7098.method1140(2);
        final BlockState method6703 = class7097.getBlockState(method6702);
        Class184 class7099 = Class184.field574;
        if (n >= 1) {
            if (method6701.getBlock() == Class7521.field29761 && ((StateHolder<O, BlockState>)method6701).get(Class3913.field17724) != Class184.field574) {
                if (method6701.getBlock() == Class7521.field29761) {
                    if (((StateHolder<O, BlockState>)method6701).get(Class3913.field17724) != Class184.field574) {
                        class7099 = Class184.field576;
                        if (method6703.getBlock() == Class7521.field29761) {
                            class7097.setBlockState(class7098.method1139(), ((StateHolder<O, BlockState>)method6701).with(Class3913.field17724, Class184.field575), 3);
                            class7097.setBlockState(method6702, ((StateHolder<O, BlockState>)method6703).with(Class3913.field17724, Class184.field574), 3);
                        }
                    }
                }
            }
            else {
                class7099 = Class184.field575;
            }
        }
        final int i = (class7096.get((IProperty<Integer>)Class3913.field17723) == 1 || method6703.getBlock() == Class7521.field29761) ? 1 : 0;
        int j = 0;
        Label_0257: {
            if (n < 11 || random.nextFloat() >= 0.25f) {
                if (n != 15) {
                    j = 0;
                    break Label_0257;
                }
            }
            j = 1;
        }
        class7097.setBlockState(class7098.method1137(), (BlockState)((StateHolder<Object, Object>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3913.field17723, i)).with(Class3913.field17724, class7099)).with((IProperty<Comparable>)Class3913.field17725, j), 3);
    }
    
    public int method12018(final Class1855 class1855, final BlockPos class1856) {
        int n;
        for (n = 0; n < 16 && class1855.getBlockState(class1856.method1138(n + 1)).getBlock() == Class7521.field29761; ++n) {}
        return n;
    }
    
    public int method12019(final Class1855 class1855, final BlockPos class1856) {
        int n;
        for (n = 0; n < 16 && class1855.getBlockState(class1856.method1140(n + 1)).getBlock() == Class7521.field29761; ++n) {}
        return n;
    }
    
    static {
        field17720 = Block.method11778(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
        field17721 = Block.method11778(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
        field17722 = Block.method11778(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
        field17723 = Class8970.field37769;
        field17724 = Class8970.field37803;
        field17725 = Class8970.field37791;
    }
}
