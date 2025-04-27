// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import java.util.Random;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3965 extends Block implements Class3966
{
    private static String[] field17914;
    public static final Class7112 field17915;
    public static final Object2FloatMap<Class3832> field17916;
    public static final VoxelShape field17917;
    private static final VoxelShape[] field17918;
    
    public static void method12094() {
        Class3965.field17916.defaultReturnValue(-1.0f);
        method12095(0.3f, Items.field30813);
        method12095(0.3f, Items.field30810);
        method12095(0.3f, Items.field30811);
        method12095(0.3f, Items.field30815);
        method12095(0.3f, Items.field30814);
        method12095(0.3f, Items.field30812);
        method12095(0.3f, Items.field30773);
        method12095(0.3f, Items.field30774);
        method12095(0.3f, Items.field30775);
        method12095(0.3f, Items.field30776);
        method12095(0.3f, Items.field30777);
        method12095(0.3f, Items.field30778);
        method12095(0.3f, Items.field31576);
        method12095(0.3f, Items.field31428);
        method12095(0.3f, Items.field30830);
        method12095(0.3f, Items.field31366);
        method12095(0.3f, Items.field31430);
        method12095(0.3f, Items.field31429);
        method12095(0.3f, Items.field30833);
        method12095(0.3f, Items.field31630);
        method12095(0.3f, Items.field31314);
        method12095(0.5f, Items.field31367);
        method12095(0.5f, Items.field31081);
        method12095(0.5f, Items.field30932);
        method12095(0.5f, Items.field31365);
        method12095(0.5f, Items.field30969);
        method12095(0.5f, Items.field31427);
        method12095(0.65f, Items.field30834);
        method12095(0.65f, Items.field30979);
        method12095(0.65f, Items.field30941);
        method12095(0.65f, Items.field30942);
        method12095(0.65f, Items.field30968);
        method12095(0.65f, Items.field31278);
        method12095(0.65f, Items.field31575);
        method12095(0.65f, Items.field31517);
        method12095(0.65f, Items.field31388);
        method12095(0.65f, Items.field31518);
        method12095(0.65f, Items.field31315);
        method12095(0.65f, Items.field30865);
        method12095(0.65f, Items.field30866);
        method12095(0.65f, Items.field30965);
        method12095(0.65f, Items.field30852);
        method12095(0.65f, Items.field30853);
        method12095(0.65f, Items.field30854);
        method12095(0.65f, Items.field30855);
        method12095(0.65f, Items.field30856);
        method12095(0.65f, Items.field30857);
        method12095(0.65f, Items.field30858);
        method12095(0.65f, Items.field30859);
        method12095(0.65f, Items.field30860);
        method12095(0.65f, Items.field30861);
        method12095(0.65f, Items.field30862);
        method12095(0.65f, Items.field30863);
        method12095(0.65f, Items.field30864);
        method12095(0.65f, Items.field30831);
        method12095(0.65f, Items.field31077);
        method12095(0.65f, Items.field31078);
        method12095(0.65f, Items.field31079);
        method12095(0.65f, Items.field31080);
        method12095(0.65f, Items.field31082);
        method12095(0.85f, Items.field31053);
        method12095(0.85f, Items.field30963);
        method12095(0.85f, Items.field30964);
        method12095(0.85f, Items.field31316);
        method12095(0.85f, Items.field31519);
        method12095(0.85f, Items.field31424);
        method12095(1.0f, Items.field31407);
        method12095(1.0f, Items.field31531);
    }
    
    private static void method12095(final float n, final Class3832 class3832) {
        Class3965.field17916.put((Object)class3832.method11704(), n);
    }
    
    public Class3965(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3965.field17915, 0));
    }
    
    public static void method12096(final World class1847, final BlockPos class1848, final boolean b) {
        final Class7096 method6701 = class1847.getBlockState(class1848);
        class1847.method6708(class1848.getX(), class1848.getY(), class1848.getZ(), b ? Class8520.field35088 : Class8520.field35087, Class286.field1582, 1.0f, 1.0f, false);
        final double n = method6701.method21725(class1847, class1848).method24547(Direction.Axis.Y, 0.5, 0.5) + 0.03125;
        final Random method6702 = class1847.method6790();
        for (int i = 0; i < 10; ++i) {
            class1847.addParticle(Class8432.field34626, class1848.getX() + 0.13124999403953552 + 0.737500011920929 * method6702.nextFloat(), class1848.getY() + n + method6702.nextFloat() * (1.0 - n), class1848.getZ() + 0.13124999403953552 + 0.737500011920929 * method6702.nextFloat(), method6702.nextGaussian() * 0.02, method6702.nextGaussian() * 0.02, method6702.nextGaussian() * 0.02);
        }
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3965.field17918[class7096.method21772((IProperty<Integer>)Class3965.field17915)];
    }
    
    @Override
    public VoxelShape method11811(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        return Class3965.field17917;
    }
    
    @Override
    public VoxelShape method11809(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3965.field17918[0];
    }
    
    @Override
    public void method11828(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21772((IProperty<Integer>)Class3965.field17915) == 7) {
            class7097.method6833().method21345(class7098, class7096.method21696(), 20);
        }
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        final int intValue = class7096.method21772((IProperty<Integer>)Class3965.field17915);
        final ItemStack method2715 = class7099.method2715(class7100);
        if (intValue < 8 && Class3965.field17916.containsKey(method2715.getItem())) {
            if (intValue < 7) {
                if (!class7097.isRemote) {
                    class7097.method6955(1500, class7098, method12098(class7096, class7097, class7098, method2715) ? 1 : 0);
                    if (!class7099.field3025.field27304) {
                        method2715.method27693(1);
                    }
                }
            }
            return Class2201.field13400;
        }
        if (intValue != 8) {
            return Class2201.field13402;
        }
        if (!class7097.isRemote) {
            final Class427 class7102 = new Class427(class7097, class7098.getX() + (class7097.rand.nextFloat() * 0.7f + 0.15000000596046448), class7098.getY() + (class7097.rand.nextFloat() * 0.7f + 0.06000000238418579 + 0.6), class7098.getZ() + (class7097.rand.nextFloat() * 0.7f + 0.15000000596046448), new ItemStack(Items.field31400));
            class7102.method2114();
            class7097.method6886(class7102);
        }
        method12097(class7096, class7097, class7098);
        class7097.method6705(null, class7098, Class8520.field35086, Class286.field1582, 1.0f, 1.0f);
        return Class2201.field13400;
    }
    
    private static void method12097(final Class7096 class7096, final Class1851 class7097, final BlockPos class7098) {
        class7097.setBlockState(class7098, ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3965.field17915, 0), 3);
    }
    
    private static boolean method12098(final Class7096 class7096, final Class1851 class7097, final BlockPos class7098, final ItemStack class7099) {
        final int intValue = class7096.method21772((IProperty<Integer>)Class3965.field17915);
        final float float1 = Class3965.field17916.getFloat(class7099.getItem());
        if (intValue != 0 || float1 <= 0.0f) {
            if (class7097.method6790().nextDouble() >= float1) {
                return false;
            }
        }
        final int i = intValue + 1;
        class7097.setBlockState(class7098, (Class7096)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3965.field17915, i), 3);
        if (i == 7) {
            class7097.method6833().method21345(class7098, class7096.method21696(), 20);
        }
        return true;
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21772((IProperty<Integer>)Class3965.field17915) == 7) {
            class7097.setBlockState(class7098, ((StateHolder<O, Class7096>)class7096).method21768((IProperty<Comparable>)Class3965.field17915), 3);
            class7097.method6705(null, class7098, Class8520.field35089, Class286.field1582, 1.0f, 1.0f);
        }
        super.method11822(class7096, class7097, class7098, random);
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        return class7096.method21772((IProperty<Integer>)Class3965.field17915);
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3965.field17915);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    @Override
    public Class441 method12099(final Class7096 class7096, final Class1851 class7097, final BlockPos class7098) {
        final int intValue = class7096.method21772((IProperty<Integer>)Class3965.field17915);
        if (intValue != 8) {
            return (intValue >= 7) ? new Class480() : new Class487(class7096, class7097, class7098);
        }
        return new Class442(class7096, class7097, class7098, new ItemStack(Items.field31400));
    }
    
    static {
        field17915 = Class8970.field37783;
        field17916 = (Object2FloatMap)new Object2FloatOpenHashMap();
        field17917 = VoxelShapes.fullCube();
        field17918 = Util.method27851(new VoxelShape[9], array -> {
            int i = 0;
            while (i < 8) {
                array[i] = VoxelShapes.method24494(Class3965.field17917, Block.method11778(2.0, Math.max(2, 1 + i * 2), 2.0, 14.0, 16.0, 14.0), IBooleanFunction.ONLY_FIRST);
                ++i;
            }
            array[8] = array[7];
        });
    }
}
