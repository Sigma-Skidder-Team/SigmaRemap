// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3915 extends Class3833 implements Class3867
{
    private static String[] field17728;
    public static final Class7112 field17729;
    public static final Class7702 field17730;
    
    public Class3915(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3915.field17729, 0));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3915.field17730;
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7099 method6702 = class7074.method21654().method6702(class7074.method21639());
        return (method6702.method21793(Class7324.field28319) && method6702.method21784() == 8) ? this.method12020(class7074.method21654()) : null;
    }
    
    public Class7096 method12020(final Class1851 class1851) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3915.field17729, class1851.method6790().nextInt(25));
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return Class7558.field29976.method22177(false);
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final Class354 class7098, final Random random) {
        if (class7096.method21752(class7097, class7098)) {
            final Class354 method1137 = class7098.method1137();
            if (class7097.method6701(method1137).method21696() == Class7521.field29173) {
                if (class7096.method21772((Class7111<Integer>)Class3915.field17729) < 25) {
                    if (random.nextDouble() < 0.14) {
                        class7097.method6692(method1137, ((Class7097<O, Class7096>)class7096).method21768((Class7111<Comparable>)Class3915.field17729));
                    }
                }
            }
        }
        else {
            class7097.method7149(class7098, true);
        }
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        final Class354 method1139 = class7098.method1139();
        final Class7096 method1140 = class7097.method6701(method1139);
        final Class3833 method1141 = method1140.method21696();
        if (method1141 != Class7521.field29642) {
            if (method1141 != this) {
                if (method1141 != Class7521.field29714) {
                    if (!method1140.method21761(class7097, method1139, Class179.field512)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (!class7096.method21752(class7099, class7100)) {
            if (class7097 == Class179.field511) {
                return Class7521.field29147.method11878();
            }
            class7099.method6833().method21345(class7100, this, 1);
        }
        if (class7097 == Class179.field512 && class7098.method21696() == this) {
            return Class7521.field29714.method11878();
        }
        class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3915.field17729);
    }
    
    @Override
    public boolean method11920(final Class1855 class1855, final Class354 class1856, final Class7096 class1857, final Class7255 class1858) {
        return false;
    }
    
    @Override
    public boolean method11921(final Class1851 class1851, final Class354 class1852, final Class7096 class1853, final Class7099 class1854) {
        return false;
    }
    
    static {
        field17729 = Class8970.field37775;
        field17730 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
    }
}
