// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3990 extends Class3986
{
    public static final Class7115 field18000;
    private static final VoxelShape field18001;
    private static final VoxelShape field18002;
    private static final VoxelShape field18003;
    private static final VoxelShape field18004;
    private static final VoxelShape field18005;
    private static final VoxelShape field18006;
    private static final VoxelShape field18007;
    private static final VoxelShape field18008;
    private static final VoxelShape field18009;
    private static final Class2259 field18010;
    
    public Class3990(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3990.field18000, Direction.NORTH));
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class3990.field18000, class7074.method21644().rotateY());
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.isRemote) {
            class7099.method2833(class7096.method21754(class7097, class7098));
            class7099.method2857(Class8276.field34057);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Nullable
    @Override
    public Class434 method11827(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        return new Class504((n, class1849, class1850) -> new Class3441(n, class1849, Class7318.method22434(class7097, class7098)), Class3990.field18010);
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return (class7096.method21772((IProperty<Direction>)Class3990.field18000).getAxis() != Axis.X) ? Class3990.field18009 : Class3990.field18008;
    }
    
    @Override
    public void method12130(final Class424 class424) {
        class424.method2070(true);
    }
    
    @Override
    public void method12132(final World class1847, final BlockPos class1848, final Class7096 class1849, final Class7096 class1850) {
        class1847.method6955(1031, class1848, 0);
    }
    
    @Override
    public void method12133(final World class1847, final BlockPos class1848) {
        class1847.method6955(1029, class1848, 0);
    }
    
    @Nullable
    public static Class7096 method12139(final Class7096 class7096) {
        final Block method21696 = class7096.method21696();
        if (method21696 != Class7521.field29465) {
            return (method21696 != Class7521.field29466) ? null : ((StateHolder<O, Class7096>)Class7521.field29467.getDefaultState()).with((IProperty<Comparable>)Class3990.field18000, (Comparable)class7096.method21772((IProperty<V>)Class3990.field18000));
        }
        return ((StateHolder<O, Class7096>)Class7521.field29466.getDefaultState()).with((IProperty<Comparable>)Class3990.field18000, (Comparable)class7096.method21772((IProperty<V>)Class3990.field18000));
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3990.field18000, class7097.method8142(class7096.method21772((IProperty<Direction>)Class3990.field18000)));
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3990.field18000);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field18000 = Class3892.field17564;
        field18001 = Block.method11778(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
        field18002 = Block.method11778(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
        field18003 = Block.method11778(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
        field18004 = Block.method11778(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
        field18005 = Block.method11778(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
        field18006 = Block.method11778(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
        field18007 = Block.method11778(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
        field18008 = VoxelShapes.method24493(Class3990.field18001, Class3990.field18002, Class3990.field18003, Class3990.field18004);
        field18009 = VoxelShapes.method24493(Class3990.field18001, Class3990.field18005, Class3990.field18006, Class3990.field18007);
        field18010 = new Class2259("container.repair", new Object[0]);
    }
}
