// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3894 extends Class3892 implements Class3856
{
    private static String[] field17566;
    public static final Class7113 field17567;
    public static final Class7114<Class109> field17568;
    public static final Class7113 field17569;
    public static final Class7113 field17570;
    public static final VoxelShape field17571;
    public static final VoxelShape field17572;
    public static final VoxelShape field17573;
    public static final VoxelShape field17574;
    public static final VoxelShape field17575;
    public static final VoxelShape field17576;
    
    public Class3894(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3894.field17564, Direction.NORTH)).with((IProperty<Comparable>)Class3894.field17567, false)).with(Class3894.field17568, Class109.field344)).with((IProperty<Comparable>)Class3894.field17569, false)).with((IProperty<Comparable>)Class3894.field17570, false));
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        if (!class7096.method21772((IProperty<Boolean>)Class3894.field17567)) {
            return (class7096.method21772(Class3894.field17568) == Class109.field343) ? Class3894.field17576 : Class3894.field17575;
        }
        switch (Class8899.field37409[class7096.method21772((IProperty<Direction>)Class3894.field17564).ordinal()]) {
            default: {
                return Class3894.field17574;
            }
            case 2: {
                return Class3894.field17573;
            }
            case 3: {
                return Class3894.field17572;
            }
            case 4: {
                return Class3894.field17571;
            }
        }
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        switch (Class8899.field37410[class7099.ordinal()]) {
            case 1: {
                return class7096.method21772((IProperty<Boolean>)Class3894.field17567);
            }
            case 2: {
                return class7096.method21772((IProperty<Boolean>)Class3894.field17570);
            }
            case 3: {
                return class7096.method21772((IProperty<Boolean>)Class3894.field17567);
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public Class2201 method11844(Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (this.field17401 != Material.IRON) {
            class7096 = ((StateHolder<O, Class7096>)class7096).method21768((IProperty<Comparable>)Class3894.field17567);
            class7097.setBlockState(class7098, class7096, 2);
            if (class7096.method21772((IProperty<Boolean>)Class3894.field17570)) {
                class7097.method6834().method21345(class7098, Class7558.field29976, Class7558.field29976.method22156(class7097));
            }
            this.method11965(class7099, class7097, class7098, class7096.method21772((IProperty<Boolean>)Class3894.field17567));
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    public void method11965(final PlayerEntity playerEntity, final World class513, final BlockPos class514, final boolean b) {
        if (!b) {
            class513.playEvent(playerEntity, (this.field17401 != Material.IRON) ? 1013 : 1036, class514, 0);
        }
        else {
            class513.playEvent(playerEntity, (this.field17401 != Material.IRON) ? 1007 : 1037, class514, 0);
        }
    }
    
    @Override
    public void method11825(Class7096 class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        if (!class7097.isRemote) {
            final boolean method6749 = class7097.method6749(class7098);
            if (method6749 != class7096.method21772((IProperty<Boolean>)Class3894.field17569)) {
                if (class7096.method21772((IProperty<Boolean>)Class3894.field17567) != method6749) {
                    class7096 = (Class7096)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3894.field17567, method6749);
                    this.method11965(null, class7097, class7098, method6749);
                }
                class7097.setBlockState(class7098, (Class7096)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3894.field17569, method6749), 2);
                if (class7096.method21772((IProperty<Boolean>)Class3894.field17570)) {
                    class7097.method6834().method21345(class7098, Class7558.field29976, Class7558.field29976.method22156(class7097));
                }
            }
        }
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7096 method11878 = this.getDefaultState();
        final IFluidState method11879 = class7074.method21654().getFluidState(class7074.method21639());
        final Direction method11880 = class7074.method21648();
        Class7096 class7075;
        if (!class7074.method21641() && method11880.getAxis().isHorizontal()) {
            class7075 = ((StateHolder<O, Class7096>)((StateHolder<Object, Class7096>)method11878).with((IProperty<Comparable>)Class3894.field17564, method11880)).with(Class3894.field17568, (class7074.method21649().y - class7074.method21639().getY() <= 0.5) ? Class109.field344 : Class109.field343);
        }
        else {
            class7075 = ((StateHolder<O, Class7096>)((StateHolder<Object, Class7096>)method11878).with((IProperty<Comparable>)Class3894.field17564, class7074.method21644().getOpposite())).with(Class3894.field17568, (method11880 != Direction.UP) ? Class109.field343 : Class109.field344);
        }
        if (class7074.method21654().method6749(class7074.method21639())) {
            class7075 = (Class7096)((StateHolder<Object, Object>)((StateHolder<Object, Class7096>)class7075).with((IProperty<Comparable>)Class3894.field17567, true)).with((IProperty<Comparable>)Class3894.field17569, true);
        }
        return ((StateHolder<Object, Class7096>)class7075).with((IProperty<Comparable>)Class3894.field17570, method11879.getFluid() == Class7558.field29976);
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3894.field17564, Class3894.field17567, Class3894.field17568, Class3894.field17569, Class3894.field17570);
    }
    
    @Override
    public IFluidState method11864(final Class7096 class7096) {
        return class7096.method21772((IProperty<Boolean>)Class3894.field17570) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21772((IProperty<Boolean>)Class3894.field17570)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11779(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final EntityType<?> class7099) {
        return false;
    }
    
    static {
        field17567 = Class8970.field37739;
        field17568 = Class8970.field37766;
        field17569 = Class8970.field37741;
        field17570 = Class8970.field37747;
        field17571 = Block.method11778(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
        field17572 = Block.method11778(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
        field17573 = Block.method11778(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
        field17574 = Block.method11778(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
        field17575 = Block.method11778(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
        field17576 = Block.method11778(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
    }
}
