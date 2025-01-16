// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

public class Class4012 extends Block
{
    private static String[] field18080;
    public static final Class7112 field18081;
    private static final VoxelShape field18082;
    public static final VoxelShape field18083;
    
    public Class4012(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class4012.field18081, 0));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class4012.field18083;
    }
    
    @Override
    public VoxelShape method11811(final BlockState class7096, final Class1855 class7097, final BlockPos class7098) {
        return Class4012.field18082;
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        final int intValue = class7096.get((IProperty<Integer>)Class4012.field18081);
        final float n = class7098.getY() + (6.0f + 3 * intValue) / 16.0f;
        if (!class7097.isRemote) {
            if (class7099.method1804()) {
                if (intValue > 0) {
                    if (class7099.getPosY() <= n) {
                        class7099.method1667();
                        this.method12195(class7097, class7098, class7096, intValue - 1);
                    }
                }
            }
        }
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final Class7005 class7101) {
        final ItemStack method2715 = class7099.method2715(class7100);
        if (method2715.method27620()) {
            return Class2201.field13402;
        }
        final int intValue = class7096.get((IProperty<Integer>)Class4012.field18081);
        final Item method2716 = method2715.getItem();
        if (method2716 == Items.field31350) {
            if (intValue < 3) {
                if (!class7097.isRemote) {
                    if (!class7099.field3025.field27304) {
                        class7099.method2716(class7100, new ItemStack(Items.field31349));
                    }
                    class7099.method2857(Class8276.field34024);
                    this.method12195(class7097, class7098, class7096, 3);
                    class7097.method6705(null, class7098, Class8520.field35049, Class286.field1582, 1.0f, 1.0f);
                }
            }
            return Class2201.field13400;
        }
        if (method2716 == Items.field31349) {
            if (intValue == 3) {
                if (!class7097.isRemote) {
                    if (!class7099.field3025.field27304) {
                        method2715.method27693(1);
                        if (!method2715.method27620()) {
                            if (!class7099.field3006.method2362(new ItemStack(Items.field31350))) {
                                class7099.method2822(new ItemStack(Items.field31350), false);
                            }
                        }
                        else {
                            class7099.method2716(class7100, new ItemStack(Items.field31350));
                        }
                    }
                    class7099.method2857(Class8276.field34025);
                    this.method12195(class7097, class7098, class7096, 0);
                    class7097.method6705(null, class7098, Class8520.field35052, Class286.field1582, 1.0f, 1.0f);
                }
            }
            return Class2201.field13400;
        }
        if (method2716 == Items.field31442) {
            if (intValue > 0) {
                if (!class7097.isRemote) {
                    if (!class7099.field3025.field27304) {
                        final ItemStack method2717 = Class5333.method16476(new ItemStack(Items.field31441), Class8644.field36251);
                        class7099.method2857(Class8276.field34025);
                        method2715.method27693(1);
                        if (!method2715.method27620()) {
                            if (class7099.field3006.method2362(method2717)) {
                                if (class7099 instanceof Class513) {
                                    ((Class513)class7099).method2929(class7099.field3008);
                                }
                            }
                            else {
                                class7099.method2822(method2717, false);
                            }
                        }
                        else {
                            class7099.method2716(class7100, method2717);
                        }
                    }
                    class7097.method6705(null, class7098, Class8520.field35041, Class286.field1582, 1.0f, 1.0f);
                    this.method12195(class7097, class7098, class7096, intValue - 1);
                }
            }
            return Class2201.field13400;
        }
        if (method2716 == Items.field31441 && Class5333.method16474(method2715) == Class8644.field36251) {
            if (intValue < 3) {
                if (!class7097.isRemote) {
                    if (!class7099.field3025.field27304) {
                        final ItemStack class7102 = new ItemStack(Items.field31442);
                        class7099.method2857(Class8276.field34025);
                        class7099.method2716(class7100, class7102);
                        if (class7099 instanceof Class513) {
                            ((Class513)class7099).method2929(class7099.field3008);
                        }
                    }
                    class7097.method6705(null, class7098, Class8520.field35040, Class286.field1582, 1.0f, 1.0f);
                    this.method12195(class7097, class7098, class7096, intValue + 1);
                }
            }
            return Class2201.field13400;
        }
        if (intValue > 0) {
            if (method2716 instanceof Class4053) {
                final Class4053 class7103 = (Class4053)method2716;
                if (class7103.method12251(method2715)) {
                    if (!class7097.isRemote) {
                        class7103.method12253(method2715);
                        this.method12195(class7097, class7098, class7096, intValue - 1);
                        class7099.method2857(Class8276.field34026);
                        return Class2201.field13400;
                    }
                }
            }
        }
        if (intValue > 0 && method2716 instanceof Class4044) {
            if (Class465.method2385(method2715) > 0) {
                if (!class7097.isRemote) {
                    final ItemStack method2718 = method2715.method27641();
                    method2718.method27691(1);
                    Class465.method2388(method2718);
                    class7099.method2857(Class8276.field34027);
                    if (!class7099.field3025.field27304) {
                        method2715.method27693(1);
                        this.method12195(class7097, class7098, class7096, intValue - 1);
                    }
                    if (!method2715.method27620()) {
                        if (class7099.field3006.method2362(method2718)) {
                            if (class7099 instanceof Class513) {
                                ((Class513)class7099).method2929(class7099.field3008);
                            }
                        }
                        else {
                            class7099.method2822(method2718, false);
                        }
                    }
                    else {
                        class7099.method2716(class7100, method2718);
                    }
                }
            }
            return Class2201.field13400;
        }
        if (intValue <= 0 || !(method2716 instanceof Class4036)) {
            return Class2201.field13402;
        }
        if (((Class4036)method2716).method12240() instanceof Class3942 && !class7097.isRemote()) {
            final ItemStack class7104 = new ItemStack(Class7521.field29648, 1);
            if (method2715.method27656()) {
                class7104.method27663(method2715.method27657().method333());
            }
            class7099.method2716(class7100, class7104);
            this.method12195(class7097, class7098, class7096, intValue - 1);
            class7099.method2857(Class8276.field34028);
            return Class2201.field13400;
        }
        return Class2201.field13401;
    }
    
    public void method12195(final World class1847, final BlockPos class1848, final BlockState class1849, final int n) {
        class1847.setBlockState(class1848, ((StateHolder<O, BlockState>)class1849).with((IProperty<Comparable>)Class4012.field18081, MathHelper.method35651(n, 0, 3)), 2);
        class1847.method6783(class1848, this);
    }
    
    @Override
    public void method11871(final World class1847, final BlockPos class1848) {
        if (class1847.rand.nextInt(20) == 1) {
            if (class1847.method6959(class1848).method9845(class1848) >= 0.15f) {
                final BlockState method6701 = class1847.getBlockState(class1848);
                if (((StateHolder<Object, BlockState>)method6701).get((IProperty<Integer>)Class4012.field18081) < 3) {
                    class1847.setBlockState(class1848, ((StateHolder<Object, BlockState>)method6701).method21768((IProperty<Comparable>)Class4012.field18081), 2);
                }
            }
        }
    }
    
    @Override
    public boolean method11873(final BlockState class7096) {
        return true;
    }
    
    @Override
    public int method11874(final BlockState class7096, final World class7097, final BlockPos class7098) {
        return class7096.get((IProperty<Integer>)Class4012.field18081);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class4012.field18081);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field18081 = Class8970.field37782;
        field18082 = Block.method11778(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
        field18083 = VoxelShapes.method24494(VoxelShapes.method24487(), VoxelShapes.method24493(Block.method11778(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), Block.method11778(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), Block.method11778(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), Class4012.field18082), Class9306.field39920);
    }
}
