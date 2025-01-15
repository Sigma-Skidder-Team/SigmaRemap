// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3873 extends Class3874 implements Class3872
{
    private static String[] field17515;
    public static final Class7112 field17516;
    public static final Class7702[] field17517;
    private final Class3993 field17518;
    
    public Class3873(final Class3993 field17518, final Class9288 class9288) {
        super(class9288);
        this.field17518 = field17518;
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3873.field17516, 0));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class3873.field17517[class7096.method21772((Class7111<Integer>)Class3873.field17516)];
    }
    
    @Override
    public boolean method11943(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.method21696() == Class7521.field29298;
    }
    
    @Override
    public void method11822(Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        super.method11822(class7096, class7097, class7098, random);
        if (class7097.method6993(class7098, 0) >= 9) {
            if (random.nextInt((int)(25.0f / Class3878.method11959(this, class7097, class7098)) + 1) == 0) {
                final int intValue = class7096.method21772((Class7111<Integer>)Class3873.field17516);
                if (intValue >= 7) {
                    final Direction method576 = Plane.HORIZONTAL.method576(random);
                    final BlockPos method577 = class7098.method1149(method576);
                    final Class3833 method578 = class7097.method6701(method577.method1139()).method21696();
                    if (class7097.method6701(method577).method21706()) {
                        if (method578 != Class7521.field29298) {
                            if (method578 != Class7521.field29156) {
                                if (method578 != Class7521.field29157) {
                                    if (method578 != Class7521.field29158) {
                                        if (method578 != Class7521.field29155) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        class7097.method6692(method577, this.field17518.method11878());
                        class7097.method6692(class7098, (Class7096)((Class7097<Object, Object>)this.field17518.method12143().method11878()).method21773((Class7111<Comparable>)Class3892.field17564, method576));
                    }
                }
                else {
                    class7096 = (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3873.field17516, intValue + 1);
                    class7097.method6688(class7098, class7096, 2);
                }
            }
        }
    }
    
    @Nullable
    public Class3820 method11948() {
        if (this.field17518 != Class7521.field29337) {
            return (this.field17518 != Class7521.field29383) ? null : Class7739.field31430;
        }
        return Class7739.field31429;
    }
    
    @Override
    public Class8321 method11862(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857) {
        final Class3820 method11948 = this.method11948();
        return (method11948 != null) ? new Class8321(method11948) : Class8321.field34174;
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final boolean b) {
        return class1857.method21772((Class7111<Integer>)Class3873.field17516) != 7;
    }
    
    @Override
    public boolean method11946(final Class1847 class1847, final Random random, final BlockPos class1848, final Class7096 class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final Class7096 class1851) {
        final int min = Math.min(7, class1851.method21772((Class7111<Integer>)Class3873.field17516) + MathHelper.method35658(class1849.field10062, 2, 5));
        final Class7096 class1852 = ((Class7097<O, Class7096>)class1851).method21773((Class7111<Comparable>)Class3873.field17516, min);
        class1849.method6688(class1850, class1852, 2);
        if (min == 7) {
            class1852.method21739(class1849, class1850, class1849.field10062);
        }
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3873.field17516);
    }
    
    public Class3993 method11949() {
        return this.field17518;
    }
    
    static {
        field17516 = Class8970.field37773;
        field17517 = new Class7702[] { Class3833.method11778(7.0, 0.0, 7.0, 9.0, 2.0, 9.0), Class3833.method11778(7.0, 0.0, 7.0, 9.0, 4.0, 9.0), Class3833.method11778(7.0, 0.0, 7.0, 9.0, 6.0, 9.0), Class3833.method11778(7.0, 0.0, 7.0, 9.0, 8.0, 9.0), Class3833.method11778(7.0, 0.0, 7.0, 9.0, 10.0, 9.0), Class3833.method11778(7.0, 0.0, 7.0, 9.0, 12.0, 9.0), Class3833.method11778(7.0, 0.0, 7.0, 9.0, 14.0, 9.0), Class3833.method11778(7.0, 0.0, 7.0, 9.0, 16.0, 9.0) };
    }
}
