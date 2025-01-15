// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3930 extends Class3841
{
    private static String[] field17797;
    public static final Class7115 field17798;
    public static final Class7113 field17799;
    public static final Class7113 field17800;
    public static final Class7702 field17801;
    public static final Class7702 field17802;
    public static final Class7702 field17803;
    public static final Class7702 field17804;
    public static final Class7702 field17805;
    public static final Class7702 field17806;
    public static final Class7702 field17807;
    public static final Class7702 field17808;
    public static final Class7702 field17809;
    
    public Class3930(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3930.field17798, Direction.NORTH)).method21773((Class7111<Comparable>)Class3930.field17799, false)).method21773((Class7111<Comparable>)Class3930.field17800, false));
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public Class7702 method11810(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return Class3930.field17803;
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3930.field17798, class7074.method21644().getOpposite());
    }
    
    @Override
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3930.field17805;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        switch (Class8211.field33750[class7096.method21772((Class7111<Direction>)Class3930.field17798).ordinal()]) {
            case 1: {
                return Class3930.field17807;
            }
            case 2: {
                return Class3930.field17809;
            }
            case 3: {
                return Class3930.field17808;
            }
            case 4: {
                return Class3930.field17806;
            }
            default: {
                return Class3930.field17803;
            }
        }
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3930.field17798, class7097.method8142(class7096.method21772((Class7111<Direction>)Class3930.field17798)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Direction>)Class3930.field17798)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3930.field17798, Class3930.field17799, Class3930.field17800);
    }
    
    @Nullable
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class435();
    }
    
    public static boolean method12040(final World class1847, final BlockPos class1848, final Class7096 class1849, final ItemStack class1850) {
        if (class1849.method21772((Class7111<Boolean>)Class3930.field17800)) {
            return false;
        }
        if (!class1847.field10067) {
            method12041(class1847, class1848, class1849, class1850);
        }
        return true;
    }
    
    private static void method12041(final World class1847, final BlockPos class1848, final Class7096 class1849, final ItemStack class1850) {
        final Class436 method6727 = class1847.method6727(class1848);
        if (method6727 instanceof Class435) {
            ((Class435)method6727).method2170(class1850.method27621(1));
            method12042(class1847, class1848, class1849, true);
            class1847.method6705(null, class1848, Class8520.field35035, Class286.field1582, 1.0f, 1.0f);
        }
    }
    
    public static void method12042(final World class1847, final BlockPos class1848, final Class7096 class1849, final boolean b) {
        class1847.method6688(class1848, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)class1849).method21773((Class7111<Comparable>)Class3930.field17799, false)).method21773((Class7111<Comparable>)Class3930.field17800, b), 3);
        method12045(class1847, class1848, class1849);
    }
    
    public static void method12043(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        method12044(class1847, class1848, class1849, true);
        class1847.method6833().method21345(class1848, class1849.method21696(), 2);
        class1847.method6955(1043, class1848, 0);
    }
    
    private static void method12044(final World class1847, final BlockPos class1848, final Class7096 class1849, final boolean b) {
        class1847.method6688(class1848, ((Class7097<O, Class7096>)class1849).method21773((Class7111<Comparable>)Class3930.field17799, b), 3);
        method12045(class1847, class1848, class1849);
    }
    
    private static void method12045(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        class1847.method6696(class1848.method1139(), class1849.method21696());
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        method12044(class7097, class7098, class7096, false);
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            if (class7096.method21772((Class7111<Boolean>)Class3930.field17800)) {
                this.method12046(class7096, class7097, class7098);
            }
            if (class7096.method21772((Class7111<Boolean>)Class3930.field17799)) {
                class7097.method6696(class7098.method1139(), this);
            }
            super.method11829(class7096, class7097, class7098, class7099, b);
        }
    }
    
    private void method12046(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        final Class436 method6727 = class7097.method6727(class7098);
        if (method6727 instanceof Class435) {
            final Class435 class7099 = (Class435)method6727;
            final Direction class7100 = class7096.method21772((Class7111<Direction>)Class3930.field17798);
            final Class427 class7101 = new Class427(class7097, class7098.getX() + 0.5 + 0.25f * class7100.getXOffset(), class7098.getY() + 1, class7098.getZ() + 0.5 + 0.25f * class7100.getZOffset(), class7099.method2168().method27641());
            class7101.method2114();
            class7097.method6886(class7101);
            class7099.method2164();
        }
    }
    
    @Override
    public boolean method11849(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11848(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return class7096.method21772((Class7111<Boolean>)Class3930.field17799) ? 15 : 0;
    }
    
    @Override
    public int method11851(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return (class7099 == Direction.UP && class7096.method21772((Class7111<Boolean>)Class3930.field17799)) ? 15 : 0;
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        if (class7096.method21772((Class7111<Boolean>)Class3930.field17800)) {
            final Class436 method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class435) {
                return ((Class435)method6727).method2175();
            }
        }
        return 0;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7096.method21772((Class7111<Boolean>)Class3930.field17800)) {
            final ItemStack method2715 = class7099.method2715(class7100);
            return (!method2715.method27620() && !method2715.method27622().method11742(Class7855.field32277)) ? Class2201.field13401 : Class2201.field13402;
        }
        if (!class7097.field10067) {
            this.method12047(class7097, class7098, class7099);
        }
        return Class2201.field13400;
    }
    
    @Nullable
    @Override
    public Class434 method11827(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        return class7096.method21772((Class7111<Boolean>)Class3930.field17800) ? super.method11827(class7096, class7097, class7098) : null;
    }
    
    private void method12047(final World class1847, final BlockPos class1848, final Class512 class1849) {
        final Class436 method6727 = class1847.method6727(class1848);
        if (method6727 instanceof Class435) {
            class1849.method2833((Class434)method6727);
            class1849.method2857(Class8276.field34049);
        }
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17798 = Class3892.field17564;
        field17799 = Class8970.field37741;
        field17800 = Class8970.field37733;
        field17801 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
        field17802 = Class3833.method11778(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
        field17803 = Class7698.method24492(Class3930.field17801, Class3930.field17802);
        field17804 = Class3833.method11778(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
        field17805 = Class7698.method24492(Class3930.field17803, Class3930.field17804);
        field17806 = Class7698.method24493(Class3833.method11778(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), Class3833.method11778(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), Class3833.method11778(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), Class3930.field17803);
        field17807 = Class7698.method24493(Class3833.method11778(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), Class3833.method11778(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), Class3833.method11778(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), Class3930.field17803);
        field17808 = Class7698.method24493(Class3833.method11778(15.0, 10.0, 0.0, 10.666667, 14.0, 16.0), Class3833.method11778(10.666667, 12.0, 0.0, 6.333333, 16.0, 16.0), Class3833.method11778(6.333333, 14.0, 0.0, 2.0, 18.0, 16.0), Class3930.field17803);
        field17809 = Class7698.method24493(Class3833.method11778(0.0, 10.0, 15.0, 16.0, 14.0, 10.666667), Class3833.method11778(0.0, 12.0, 10.666667, 16.0, 16.0, 6.333333), Class3833.method11778(0.0, 14.0, 6.333333, 16.0, 18.0, 2.0), Class3930.field17803);
    }
}
