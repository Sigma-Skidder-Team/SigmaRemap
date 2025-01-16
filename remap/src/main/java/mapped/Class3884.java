// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Random;

public class Class3884 extends Class3874 implements Class3872
{
    private static String[] field17519;
    public static final Class7112 field17541;
    private static final VoxelShape field17542;
    private static final VoxelShape field17543;
    
    public Class3884(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3884.field17541, 0));
    }
    
    @Override
    public ItemStack method11862(final Class1855 class1855, final BlockPos class1856, final BlockState class1857) {
        return new ItemStack(Items.field31630);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        if (class7096.get((IProperty<Integer>)Class3884.field17541) != 0) {
            return (class7096.get((IProperty<Integer>)Class3884.field17541) >= 3) ? super.method11808(class7096, class7097, class7098, class7099) : Class3884.field17543;
        }
        return Class3884.field17542;
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        super.method11822(class7096, class7097, class7098, random);
        final int intValue = class7096.get((IProperty<Integer>)Class3884.field17541);
        if (intValue < 3) {
            if (random.nextInt(5) == 0) {
                if (class7097.method6993(class7098.method1137(), 0) >= 9) {
                    class7097.setBlockState(class7098, (BlockState)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3884.field17541, intValue + 1), 2);
                }
            }
        }
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        if (class7099 instanceof LivingEntity) {
            if (class7099.getType() != EntityType.field28985) {
                if (class7099.getType() != EntityType.field28961) {
                    class7099.setMotionMultiplier(class7096, new Vec3d(0.800000011920929, 0.75, 0.800000011920929));
                    if (!class7097.isRemote) {
                        if (class7096.get((IProperty<Integer>)Class3884.field17541) > 0) {
                            if (class7099.lastTickPosX != class7099.getPosX() || class7099.lastTickPosZ != class7099.getPosZ()) {
                                final double abs = Math.abs(class7099.getPosX() - class7099.lastTickPosX);
                                final double abs2 = Math.abs(class7099.getPosZ() - class7099.lastTickPosZ);
                                if (abs >= 0.003000000026077032 || abs2 >= 0.003000000026077032) {
                                    class7099.attackEntityFrom(DamageSource.field32583, 1.0f);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        final int intValue = class7096.get((IProperty<Integer>)Class3884.field17541);
        final int n = (intValue == 3) ? 1 : 0;
        if (n == 0 && class7099.method2715(class7100).getItem() == Items.field31400) {
            return Class2201.field13402;
        }
        if (intValue <= 1) {
            return super.method11844(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        Block.method11839(class7097, class7098, new ItemStack(Items.field31630, 1 + class7097.rand.nextInt(2) + n));
        class7097.method6705(null, class7098, Class8520.field35630, Class286.field1582, 1.0f, 0.8f + class7097.rand.nextFloat() * 0.4f);
        class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3884.field17541, 1), 2);
        return Class2201.field13400;
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3884.field17541);
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final BlockPos class1856, final BlockState class1857, final boolean b) {
        return class1857.get((IProperty<Integer>)Class3884.field17541) < 3;
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final BlockState class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final BlockState class1851) {
        class1849.setBlockState(class1850, ((StateHolder<O, BlockState>)class1851).with((IProperty<Comparable>)Class3884.field17541, Math.min(3, class1851.get((IProperty<Integer>)Class3884.field17541) + 1)), 2);
    }
    
    static {
        field17541 = Class8970.field37771;
        field17542 = Block.method11778(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
        field17543 = Block.method11778(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    }
}
