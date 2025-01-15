// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import javax.annotation.Nullable;

public class Class3921 extends Class3833 implements Class3856
{
    private static String[] field17776;
    public static final Class7114<Class186> field17777;
    public static final Class7113 field17778;
    public static final Class7702 field17779;
    public static final Class7702 field17780;
    
    public Class3921(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.method11878()).method21773(Class3921.field17777, Class186.field599)).method21773((Class7111<Comparable>)Class3921.field17778, false));
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return class7096.method21772(Class3921.field17777) != Class186.field600;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3921.field17777, Class3921.field17778);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        switch (Class9296.field39868[class7096.method21772(Class3921.field17777).ordinal()]) {
            case 1: {
                return Class7698.method24487();
            }
            case 2: {
                return Class3921.field17780;
            }
            default: {
                return Class3921.field17779;
            }
        }
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final BlockPos method21639 = class7074.method21639();
        final Class7096 method21640 = class7074.method21654().method6701(method21639);
        if (method21640.method21696() != this) {
            final Class7096 class7075 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.method11878()).method21773(Class3921.field17777, Class186.field599)).method21773((Class7111<Comparable>)Class3921.field17778, class7074.method21654().method6702(method21639).method21779() == Class7558.field29976);
            final Direction method21641 = class7074.method21648();
            return (method21641 != Direction.DOWN && (method21641 == Direction.UP || class7074.method21649().y - method21639.getY() <= 0.5)) ? class7075 : ((Class7097<O, Class7096>)class7075).method21773(Class3921.field17777, Class186.field598);
        }
        return (Class7096)((Class7097<Object, Object>)((Class7097<O, Class7096>)method21640).method21773(Class3921.field17777, Class186.field600)).method21773((Class7111<Comparable>)Class3921.field17778, false);
    }
    
    @Override
    public boolean method11798(final Class7096 class7096, final Class7074 class7097) {
        final Class8321 method21651 = class7097.method21651();
        final Class186 class7098 = class7096.method21772(Class3921.field17777);
        if (class7098 == Class186.field600 || method21651.method27622() != this.method11704()) {
            return false;
        }
        if (!class7097.method21641()) {
            return true;
        }
        final boolean b = class7097.method21649().y - class7097.method21639().getY() > 0.5;
        final Direction method21652 = class7097.method21648();
        if (class7098 != Class186.field599) {
            return method21652 == Direction.DOWN || (!b && method21652.getAxis().isHorizontal());
        }
        return method21652 == Direction.UP || (b && method21652.getAxis().isHorizontal());
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3921.field17778) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public boolean method11921(final Class1851 class1851, final BlockPos class1852, final Class7096 class1853, final Class7099 class1854) {
        return class1853.method21772(Class3921.field17777) != Class186.field600 && super.method11921(class1851, class1852, class1853, class1854);
    }
    
    @Override
    public boolean method11920(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final Class7255 class1858) {
        return class1857.method21772(Class3921.field17777) != Class186.field600 && super.method11920(class1855, class1856, class1857, class1858);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3921.field17778)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        switch (Class9296.field39869[class7099.ordinal()]) {
            case 1: {
                return false;
            }
            case 2: {
                return class7097.method6702(class7098).method21793(Class7324.field28319);
            }
            case 3: {
                return false;
            }
            default: {
                return false;
            }
        }
    }
    
    static {
        field17777 = Class8970.field37800;
        field17778 = Class8970.field37747;
        field17779 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
        field17780 = Class3833.method11778(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);
    }
}
