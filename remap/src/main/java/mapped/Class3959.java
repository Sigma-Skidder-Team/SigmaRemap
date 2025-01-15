// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;

public class Class3959 extends Class3841
{
    private static String[] field17880;
    public static final Class7115 field17881;
    public static final Class7113 field17882;
    private static final Class7702 field17883;
    private static final Class7702 field17884;
    private static final Class7702 field17885;
    private static final Class7702 field17886;
    private static final Class7702 field17887;
    private static final Class7702 field17888;
    private static final Class7702 field17889;
    private static final Class7702 field17890;
    private static final Class7702 field17891;
    private static final Class7702 field17892;
    private static final Class7702 field17893;
    private static final Class7702 field17894;
    private static final Class7702 field17895;
    private static final Class7702 field17896;
    
    public Class3959(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3959.field17881, Direction.DOWN)).method21773((Class7111<Comparable>)Class3959.field17882, true));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        switch (Class8077.field33268[class7096.method21772((Class7111<Direction>)Class3959.field17881).ordinal()]) {
            case 1: {
                return Class3959.field17887;
            }
            case 2: {
                return Class3959.field17889;
            }
            case 3: {
                return Class3959.field17890;
            }
            case 4: {
                return Class3959.field17891;
            }
            case 5: {
                return Class3959.field17888;
            }
            default: {
                return Class3959.field17886;
            }
        }
    }
    
    @Override
    public Class7702 method11811(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        switch (Class8077.field33268[class7096.method21772((Class7111<Direction>)Class3959.field17881).ordinal()]) {
            case 1: {
                return Class3959.field17892;
            }
            case 2: {
                return Class3959.field17894;
            }
            case 3: {
                return Class3959.field17895;
            }
            case 4: {
                return Class3959.field17896;
            }
            case 5: {
                return Class3959.field17893;
            }
            default: {
                return Class453.field2701;
            }
        }
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Direction method782 = class7074.method21648().getOpposite();
        return (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)Class3959.field17881, (method782.getAxis() != Axis.Y) ? method782 : Direction.DOWN)).method21773((Class7111<Comparable>)Class3959.field17882, true);
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class455();
    }
    
    @Override
    public void method11853(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849, final Class511 class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final Class436 method6727 = class1847.method6727(class1848);
            if (method6727 instanceof Class455) {
                ((Class455)method6727).method2335(class1851.method27664());
            }
        }
    }
    
    @Override
    public void method11828(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7099.method21696() != class7096.method21696()) {
            this.method12079(class7097, class7098, class7096);
        }
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.field10067) {
            final Class436 method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class455) {
                class7099.method2833((Class434)method6727);
                class7099.method2857(Class8276.field34032);
            }
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public void method11825(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class3833 class7099, final BlockPos class7100, final boolean b) {
        this.method12079(class7097, class7098, class7096);
    }
    
    private void method12079(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849) {
        final boolean b = !class1847.method6749(class1848);
        if (b != class1849.method21772((Class7111<Boolean>)Class3959.field17882)) {
            class1847.method6688(class1848, (Class7096)((Class7097<Object, Object>)class1849).method21773((Class7111<Comparable>)Class3959.field17882, b), 4);
        }
    }
    
    @Override
    public void method11829(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            final Class436 method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class455) {
                Class9193.method33638(class7097, class7098, (Class446)method6727);
                class7097.method6783(class7098, this);
            }
            super.method11829(class7096, class7097, class7098, class7099, b);
        }
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098) {
        return Class3418.method10897(class7097.method6727(class7098));
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3959.field17881, class7097.method8142(class7096.method21772((Class7111<Direction>)Class3959.field17881)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Direction>)Class3959.field17881)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3959.field17881, Class3959.field17882);
    }
    
    @Override
    public void method11850(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Entity class7099) {
        final Class436 method6727 = class7097.method6727(class7098);
        if (method6727 instanceof Class455) {
            ((Class455)method6727).method2316(class7099);
        }
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17881 = Class8970.field37757;
        field17882 = Class8970.field37724;
        field17883 = Class3833.method11778(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
        field17884 = Class3833.method11778(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
        field17885 = Class7698.method24492(Class3959.field17884, Class3959.field17883);
        field17886 = Class7698.method24494(Class3959.field17885, Class453.field2701, Class9306.field39920);
        field17887 = Class7698.method24492(Class3959.field17886, Class3833.method11778(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
        field17888 = Class7698.method24492(Class3959.field17886, Class3833.method11778(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
        field17889 = Class7698.method24492(Class3959.field17886, Class3833.method11778(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
        field17890 = Class7698.method24492(Class3959.field17886, Class3833.method11778(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
        field17891 = Class7698.method24492(Class3959.field17886, Class3833.method11778(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
        field17892 = Class453.field2701;
        field17893 = Class7698.method24492(Class453.field2701, Class3833.method11778(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
        field17894 = Class7698.method24492(Class453.field2701, Class3833.method11778(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
        field17895 = Class7698.method24492(Class453.field2701, Class3833.method11778(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
        field17896 = Class7698.method24492(Class453.field2701, Class3833.method11778(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));
    }
}
