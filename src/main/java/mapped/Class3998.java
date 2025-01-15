// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.cache.LoadingCache;
import javax.annotation.Nullable;
import java.util.Random;

public class Class3998 extends Class3833
{
    private static String[] field18017;
    public static final Class7114<Class111> field18018;
    public static final Class7702 field18019;
    public static final Class7702 field18020;
    
    public Class3998(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773(Class3998.field18018, Class111.field351));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        switch (Class9275.field39763[class7096.method21772(Class3998.field18018).ordinal()]) {
            case 1: {
                return Class3998.field18020;
            }
            default: {
                return Class3998.field18019;
            }
        }
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, Class354 method1139, final Random random) {
        if (class7097.field10063.method20492()) {
            if (class7097.method6765().method31216(Class8878.field37318)) {
                if (random.nextInt(2000) < class7097.method6954().method8235()) {
                    while (class7097.method6701(method1139).method21696() == this) {
                        method1139 = method1139.method1139();
                    }
                    if (class7097.method6701(method1139).method21698(class7097, method1139, Class7499.field29014)) {
                        final Class828 method1140 = Class7499.field29014.method23357(class7097, null, null, null, method1139.method1137(), Class2101.field12177, false, false);
                        if (method1140 != null) {
                            method1140.field2449 = method1140.method1796();
                        }
                    }
                }
            }
        }
    }
    
    public boolean method12147(final Class1851 class1851, final Class354 class1852) {
        final Class8874 method12148 = this.method12148(class1851, class1852);
        if (method12148 == null) {
            return false;
        }
        method12148.method31196();
        return true;
    }
    
    @Nullable
    public Class8874 method12148(final Class1851 class1851, final Class354 class1852) {
        final Class8874 class1853 = new Class8874(class1851, class1852, Class111.field351);
        if (class1853.method31195() && Class8874.method31199(class1853) == 0) {
            return class1853;
        }
        final Class8874 class1854 = new Class8874(class1851, class1852, Class111.field353);
        return (class1854.method31195() && Class8874.method31199(class1854) == 0) ? class1854 : null;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        final Class111 method790 = class7097.method790();
        final Class111 class7102 = class7096.method21772(Class3998.field18018);
        if (class7102 == method790 || !method790.method601()) {
            if (class7098.method21696() != this) {
                if (!new Class8874(class7099, class7100, class7102).method31198()) {
                    return Class7521.field29147.method11878();
                }
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11850(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class399 class7099) {
        if (!class7099.method1805()) {
            if (!class7099.method1806()) {
                if (class7099.method1855()) {
                    class7099.method1794(class7098);
                }
            }
        }
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Random random) {
        if (random.nextInt(100) == 0) {
            class7097.method6708(class7098.method1074() + 0.5, class7098.method1075() + 0.5, class7098.method1076() + 0.5, Class8520.field35496, Class286.field1582, 0.5f, random.nextFloat() * 0.4f + 0.8f, false);
        }
        for (int i = 0; i < 4; ++i) {
            double n = class7098.method1074() + (double)random.nextFloat();
            final double n2 = class7098.method1075() + (double)random.nextFloat();
            double n3 = class7098.method1076() + (double)random.nextFloat();
            double n4 = (random.nextFloat() - 0.5) * 0.5;
            final double n5 = (random.nextFloat() - 0.5) * 0.5;
            double n6 = (random.nextFloat() - 0.5) * 0.5;
            final int n7 = random.nextInt(2) * 2 - 1;
            if (class7097.method6701(class7098.method1145()).method21696() != this && class7097.method6701(class7098.method1147()).method21696() != this) {
                n = class7098.method1074() + 0.5 + 0.25 * n7;
                n4 = random.nextFloat() * 2.0f * n7;
            }
            else {
                n3 = class7098.method1076() + 0.5 + 0.25 * n7;
                n6 = random.nextFloat() * 2.0f * n7;
            }
            class7097.method6709(Class8432.field34637, n, n2, n3, n4, n5, n6);
        }
    }
    
    @Override
    public Class8321 method11862(final Class1855 class1855, final Class354 class1856, final Class7096 class1857) {
        return Class8321.field34174;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        switch (Class9275.field39764[class7097.ordinal()]) {
            case 1:
            case 2: {
                switch (Class9275.field39763[class7096.method21772(Class3998.field18018).ordinal()]) {
                    case 1: {
                        return ((Class7097<O, Class7096>)class7096).method21773(Class3998.field18018, Class111.field351);
                    }
                    case 2: {
                        return ((Class7097<O, Class7096>)class7096).method21773(Class3998.field18018, Class111.field353);
                    }
                    default: {
                        return class7096;
                    }
                }
                break;
            }
            default: {
                return class7096;
            }
        }
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3998.field18018);
    }
    
    public static Class7820 method12149(final Class1851 class1851, final Class354 class1852) {
        Class111 class1853 = Class111.field353;
        Class8874 class1854 = new Class8874(class1851, class1852, Class111.field351);
        final LoadingCache<Class354, Class7990> method29797 = Class8691.method29797(class1851, true);
        if (!class1854.method31195()) {
            class1853 = Class111.field351;
            class1854 = new Class8874(class1851, class1852, Class111.field353);
        }
        if (class1854.method31195()) {
            final int[] array = new int[Class288.values().length];
            final Class179 method29798 = Class8874.method31200(class1854).method784();
            final Class354 method29799 = Class8874.method31201(class1854).method1138(class1854.method31191() - 1);
            for (final Class288 class1855 : Class288.values()) {
                final Class7820 class1856 = new Class7820((method29798.method781() != class1855) ? method29799.method1150(Class8874.method31200(class1854), class1854.method31192() - 1) : method29799, Class179.method801(class1855, class1853), Class179.field512, method29797, class1854.method31192(), class1854.method31191(), 1);
                for (int j = 0; j < class1854.method31192(); ++j) {
                    for (int k = 0; k < class1854.method31191(); ++k) {
                        if (!class1856.method25270(j, k, 1).method26065().method21706()) {
                            final int[] array2 = array;
                            final int ordinal = class1855.ordinal();
                            ++array2[ordinal];
                        }
                    }
                }
            }
            Class288 field1601 = Class288.field1601;
            for (final Class288 class1857 : Class288.values()) {
                if (array[class1857.ordinal()] < array[field1601.ordinal()]) {
                    field1601 = class1857;
                }
            }
            return new Class7820((method29798.method781() != field1601) ? method29799.method1150(Class8874.method31200(class1854), class1854.method31192() - 1) : method29799, Class179.method801(field1601, class1853), Class179.field512, method29797, class1854.method31192(), class1854.method31191(), 1);
        }
        return new Class7820(class1852, Class179.field513, Class179.field512, method29797, 1, 1, 1);
    }
    
    static {
        field18018 = Class8970.field37748;
        field18019 = Class3833.method11778(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
        field18020 = Class3833.method11778(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
    }
}
