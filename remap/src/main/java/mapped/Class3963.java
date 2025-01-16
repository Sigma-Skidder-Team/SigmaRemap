// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

public class Class3963 extends Block
{
    private static String[] field17905;
    public static final Class7112 field17906;
    public static final VoxelShape[] field17907;
    
    public Class3963(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3963.field17906, 0));
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3963.field17907[class7096.method21772((IProperty<Integer>)Class3963.field17906)];
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (class7097.isRemote) {
            final ItemStack method2715 = class7099.method2715(class7100);
            if (this.method12092(class7097, class7098, class7096, class7099) == Class2201.field13400) {
                return Class2201.field13400;
            }
            if (method2715.method27620()) {
                return Class2201.field13401;
            }
        }
        return this.method12092(class7097, class7098, class7096, class7099);
    }
    
    private Class2201 method12092(final Class1851 class1851, final BlockPos class1852, final Class7096 class1853, final Class512 class1854) {
        if (class1854.method2878(false)) {
            class1854.method2857(Class8276.field34023);
            class1854.method2877().method33486(2, 0.1f);
            final int intValue = class1853.method21772((IProperty<Integer>)Class3963.field17906);
            if (intValue >= 6) {
                class1851.method6690(class1852, false);
            }
            else {
                class1851.setBlockState(class1852, (Class7096)((StateHolder<Object, Object>)class1853).with((IProperty<Comparable>)Class3963.field17906, intValue + 1), 3);
            }
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097 == Direction.DOWN && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return class7097.getBlockState(class7098.method1139()).getMaterial().method26439();
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3963.field17906);
    }
    
    @Override
    public int method11874(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        return (7 - class7096.method21772((IProperty<Integer>)Class3963.field17906)) * 2;
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17906 = Class8970.field37776;
        field17907 = new VoxelShape[] { Block.method11778(1.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.method11778(3.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.method11778(5.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.method11778(7.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.method11778(9.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.method11778(11.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.method11778(13.0, 0.0, 1.0, 15.0, 8.0, 15.0) };
    }
}
