// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import javax.annotation.Nullable;

public class Class3919 extends Class3841 implements Class3856
{
    private static String[] field17765;
    public static final Class7113 field17766;
    public static final Class7702 field17767;
    
    public Class3919(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3919.field17766, true));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3919.field17766);
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class492();
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12306;
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3919.field17766) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3919.field17766)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class3919.field17767;
    }
    
    @Override
    public void method11853(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849, final Class511 class1850, final Class8321 class1851) {
        if (class1851.method27667()) {
            final Class436 method6727 = class1847.method6727(class1848);
            if (method6727 instanceof Class490) {
                ((Class490)method6727).method2453(class1851.method27664());
            }
        }
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7099 method6702 = class7074.method21654().method6702(class7074.method21639());
        return (Class7096)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)Class3919.field17766, method6702.method21793(Class7324.field28319) && method6702.method21784() == 8);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17766 = Class8970.field37747;
        field17767 = Class3833.method11778(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);
    }
}
