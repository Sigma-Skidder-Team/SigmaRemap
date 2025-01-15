// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Class3878 extends Class3874 implements Class3872
{
    private static String[] field17519;
    public static final Class7112 field17529;
    private static final Class7702[] field17530;
    
    public Class3878(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)this.method11952(), 0));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class3878.field17530[class7096.method21772((Class7111<Integer>)this.method11952())];
    }
    
    @Override
    public boolean method11943(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.method21696() == Class7521.field29298;
    }
    
    public Class7112 method11952() {
        return Class3878.field17529;
    }
    
    public int method11953() {
        return 7;
    }
    
    public int method11954(final Class7096 class7096) {
        return class7096.method21772((Class7111<Integer>)this.method11952());
    }
    
    public Class7096 method11955(final int i) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)this.method11952(), i);
    }
    
    public boolean method11956(final Class7096 class7096) {
        return class7096.method21772((Class7111<Integer>)this.method11952()) >= this.method11953();
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        super.method11822(class7096, class7097, class7098, random);
        if (class7097.method6993(class7098, 0) >= 9) {
            final int method11954 = this.method11954(class7096);
            if (method11954 < this.method11953()) {
                if (random.nextInt((int)(25.0f / method11959(this, class7097, class7098)) + 1) == 0) {
                    class7097.method6688(class7098, this.method11955(method11954 + 1), 2);
                }
            }
        }
    }
    
    public void method11957(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849) {
        int n = this.method11954(class1849) + this.method11958(class1847);
        final int method11953 = this.method11953();
        if (n > method11953) {
            n = method11953;
        }
        class1847.method6688(class1848, this.method11955(n), 2);
    }
    
    public int method11958(final Class1847 class1847) {
        return MathHelper.method35658(class1847.field10062, 2, 5);
    }
    
    public static float method11959(final Class3833 class3833, final Class1855 class3834, final BlockPos class3835) {
        float n = 1.0f;
        final BlockPos method1139 = class3835.method1139();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                float n2 = 0.0f;
                final Class7096 method1140 = class3834.method6701(method1139.method1134(i, 0, j));
                if (method1140.method21696() == Class7521.field29298) {
                    n2 = 1.0f;
                    if (method1140.method21772((Class7111<Integer>)Class4021.field18105) > 0) {
                        n2 = 3.0f;
                    }
                }
                if (i != 0 || j != 0) {
                    n2 /= 4.0f;
                }
                n += n2;
            }
        }
        final BlockPos method1141 = class3835.method1141();
        final BlockPos method1142 = class3835.method1143();
        final BlockPos method1143 = class3835.method1145();
        final BlockPos method1144 = class3835.method1147();
        final boolean b = class3833 == class3834.method6701(method1143).method21696() || class3833 == class3834.method6701(method1144).method21696();
        final boolean b2 = class3833 == class3834.method6701(method1141).method21696() || class3833 == class3834.method6701(method1142).method21696();
        if (b && b2) {
            n /= 2.0f;
        }
        else {
            boolean b3 = false;
            Label_0371: {
                if (class3833 != class3834.method6701(method1143.method1141()).method21696()) {
                    if (class3833 != class3834.method6701(method1144.method1141()).method21696()) {
                        if (class3833 != class3834.method6701(method1144.method1143()).method21696()) {
                            if (class3833 != class3834.method6701(method1143.method1143()).method21696()) {
                                b3 = false;
                                break Label_0371;
                            }
                        }
                    }
                }
                b3 = true;
            }
            if (b3) {
                n /= 2.0f;
            }
        }
        return n;
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        if (class7097.method6993(class7098, 0) >= 8 || class7097.method6994(class7098)) {
            if (super.method11843(class7096, class7097, class7098)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void method11850(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Entity class7099) {
        if (class7099 instanceof Class779) {
            if (class7097.method6765().method31216(Class8878.field37316)) {
                class7097.method6691(class7098, true, class7099);
            }
        }
        super.method11850(class7096, class7097, class7098, class7099);
    }
    
    public Class3832 method11960() {
        return Class7739.field31314;
    }
    
    @Override
    public ItemStack method11862(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857) {
        return new ItemStack(this.method11960());
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final boolean b) {
        return !this.method11956(class1857);
    }
    
    @Override
    public boolean method11946(final Class1847 class1847, final Random random, final BlockPos class1848, final Class7096 class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final Class7096 class1851) {
        this.method11957(class1849, class1850, class1851);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3878.field17529);
    }
    
    static {
        field17529 = Class8970.field37773;
        field17530 = new Class7702[] { Class3833.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 10.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 12.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 14.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 16.0, 16.0) };
    }
}
