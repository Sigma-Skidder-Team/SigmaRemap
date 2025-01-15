// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

public class Class3898 extends Class3892
{
    private static String[] field17584;
    public static final Class7113 field17585;
    public static final Class7113 field17586;
    public static final Class7113 field17587;
    public static final VoxelShape field17588;
    public static final VoxelShape field17589;
    public static final VoxelShape field17590;
    public static final VoxelShape field17591;
    public static final VoxelShape field17592;
    public static final VoxelShape field17593;
    public static final VoxelShape field17594;
    public static final VoxelShape field17595;
    public static final VoxelShape field17596;
    public static final VoxelShape field17597;
    
    public Class3898(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, BlockState>)((Class7097<O, BlockState>)((Class7097<O, BlockState>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3898.field17585, false)).method21773((Class7111<Comparable>)Class3898.field17586, false)).method21773((Class7111<Comparable>)Class3898.field17587, false));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        if (!class7096.method21772((Class7111<Boolean>)Class3898.field17587)) {
            return (class7096.method21772((Class7111<Direction>)Class3898.field17564).getAxis() != Axis.X) ? Class3898.field17588 : Class3898.field17589;
        }
        return (class7096.method21772((Class7111<Direction>)Class3898.field17564).getAxis() != Axis.X) ? Class3898.field17590 : Class3898.field17591;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21772((Class7111<Direction>)Class3898.field17564).rotateY().getAxis() == class7097.getAxis()) {
            return ((Class7097<O, BlockState>)class7096).method21773((Class7111<Comparable>)Class3898.field17587, this.method11982(class7098) || this.method11982(class7099.method6701(class7100.method1149(class7097.getOpposite()))));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public VoxelShape method11809(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        if (!class7096.method21772((Class7111<Boolean>)Class3898.field17585)) {
            return (class7096.method21772((Class7111<Direction>)Class3898.field17564).getAxis() != Axis.Z) ? Class3898.field17593 : Class3898.field17592;
        }
        return Class7698.method24486();
    }
    
    @Override
    public VoxelShape method11810(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        if (!class7096.method21772((Class7111<Boolean>)Class3898.field17587)) {
            return (class7096.method21772((Class7111<Direction>)Class3898.field17564).getAxis() != Axis.X) ? Class3898.field17594 : Class3898.field17595;
        }
        return (class7096.method21772((Class7111<Direction>)Class3898.field17564).getAxis() != Axis.X) ? Class3898.field17596 : Class3898.field17597;
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        switch (Class9050.field38318[class7099.ordinal()]) {
            case 1: {
                return class7096.method21772((Class7111<Boolean>)Class3898.field17585);
            }
            case 2: {
                return false;
            }
            case 3: {
                return class7096.method21772((Class7111<Boolean>)Class3898.field17585);
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final World method21654 = class7074.method21654();
        final BlockPos method21655 = class7074.method21639();
        final boolean method21656 = method21654.method6749(method21655);
        final Direction method21657 = class7074.method21644();
        final Axis method21658 = method21657.getAxis();
        Label_0072: {
            if (method21658 == Axis.Z) {
                if (this.method11982(method21654.method6701(method21655.method1145()))) {
                    break Label_0072;
                }
                if (this.method11982(method21654.method6701(method21655.method1147()))) {
                    break Label_0072;
                }
            }
            if (method21658 == Axis.X) {
                if (this.method11982(method21654.method6701(method21655.method1141()))) {
                    break Label_0072;
                }
                if (this.method11982(method21654.method6701(method21655.method1143()))) {
                    break Label_0072;
                }
            }
            final boolean b = false;
            return (Class7096)((Class7097<Object, Object>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3898.field17564, method21657)).method21773((Class7111<Comparable>)Class3898.field17585, method21656)).method21773((Class7111<Comparable>)Class3898.field17586, method21656)).method21773((Class7111<Comparable>)Class3898.field17587, b);
        }
        final boolean b = true;
        return (Class7096)((Class7097<Object, Object>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3898.field17564, method21657)).method21773((Class7111<Comparable>)Class3898.field17585, method21656)).method21773((Class7111<Comparable>)Class3898.field17586, method21656)).method21773((Class7111<Comparable>)Class3898.field17587, b);
    }
    
    private boolean method11982(final Class7096 class7096) {
        return class7096.method21696().method11785(Class7188.field27904);
    }
    
    @Override
    public Class2201 method11844(Class7096 class7096, final World class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7096.method21772((Class7111<Boolean>)Class3898.field17585)) {
            final Direction method1882 = class7099.method1882();
            if (class7096.method21772((Class7111<Comparable>)Class3898.field17564) == method1882.getOpposite()) {
                class7096 = (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3898.field17564, method1882);
            }
            class7096 = ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3898.field17585, true);
            class7097.method6688(class7098, class7096, 10);
        }
        else {
            class7096 = ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3898.field17585, false);
            class7097.method6688(class7098, class7096, 10);
        }
        class7097.method6839(class7099, ((boolean)class7096.method21772((Class7111<Boolean>)Class3898.field17585)) ? 1008 : 1014, class7098, 0);
        return Class2201.field13400;
    }
    
    @Override
    public void method11825(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class3833 class7099, final BlockPos class7100, final boolean b) {
        if (!class7097.isRemote) {
            final boolean method6749 = class7097.method6749(class7098);
            if (class7096.method21772((Class7111<Boolean>)Class3898.field17586) != method6749) {
                class7097.method6688(class7098, (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3898.field17586, method6749)).method21773((Class7111<Comparable>)Class3898.field17585, method6749), 2);
                if (class7096.method21772((Class7111<Boolean>)Class3898.field17585) != method6749) {
                    class7097.method6839(null, method6749 ? 1008 : 1014, class7098, 0);
                }
            }
        }
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3898.field17564, Class3898.field17585, Class3898.field17586, Class3898.field17587);
    }
    
    public static boolean method11983(final Class7096 class7096, final Direction class7097) {
        return class7096.method21772((Class7111<Direction>)Class3898.field17564).getAxis() == class7097.rotateY().getAxis();
    }
    
    static {
        field17585 = Class8970.field37739;
        field17586 = Class8970.field37741;
        field17587 = Class8970.field37735;
        field17588 = Class3833.method11778(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
        field17589 = Class3833.method11778(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
        field17590 = Class3833.method11778(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
        field17591 = Class3833.method11778(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
        field17592 = Class3833.method11778(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
        field17593 = Class3833.method11778(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
        field17594 = Class7698.method24492(Class3833.method11778(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), Class3833.method11778(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
        field17595 = Class7698.method24492(Class3833.method11778(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), Class3833.method11778(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
        field17596 = Class7698.method24492(Class3833.method11778(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), Class3833.method11778(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
        field17597 = Class7698.method24492(Class3833.method11778(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), Class3833.method11778(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
    }
}
