// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3897 extends Class3895
{
    private static String[] field17581;
    public static final Class7113 field17582;
    public static final Class7112 field17583;
    
    public Class3897(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3897.field17564, Class179.field513)).method21773((Class7111<Comparable>)Class3897.field17583, 1)).method21773((Class7111<Comparable>)Class3897.field17582, false)).method21773((Class7111<Comparable>)Class3897.field17578, false));
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (class7099.field3025.field27305) {
            class7097.method6688(class7098, ((Class7097<O, Class7096>)class7096).method21768((Class7111<Comparable>)Class3897.field17583), 3);
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    @Override
    public int method11977(final Class7096 class7096) {
        return class7096.method21772((Class7111<Integer>)Class3897.field17583) * 2;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7096 method11846 = super.method11846(class7074);
        return ((Class7097<Object, Class7096>)method11846).method21773((Class7111<Comparable>)Class3897.field17582, this.method11967(class7074.method21654(), class7074.method21639(), method11846));
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        return (!class7099.method6678() && class7097.method790() != class7096.method21772((Class7111<Class179>)Class3897.field17564).method790()) ? ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3897.field17582, this.method11967(class7099, class7100, class7096)) : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11967(final Class1852 class1852, final Class354 class1853, final Class7096 class1854) {
        return this.method11970(class1852, class1853, class1854) > 0;
    }
    
    @Override
    public boolean method11973(final Class7096 class7096) {
        return Class3895.method11975(class7096);
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Random random) {
        if (class7096.method21772((Class7111<Boolean>)Class3897.field17578)) {
            final Class179 class7099 = class7096.method21772((Class7111<Class179>)Class3897.field17564);
            final double n = class7098.method1074() + 0.5f + (random.nextFloat() - 0.5f) * 0.2;
            final double n2 = class7098.method1075() + 0.4f + (random.nextFloat() - 0.5f) * 0.2;
            final double n3 = class7098.method1076() + 0.5f + (random.nextFloat() - 0.5f) * 0.2;
            float n4 = -5.0f;
            if (random.nextBoolean()) {
                n4 = (float)(class7096.method21772((Class7111<Integer>)Class3897.field17583) * 2 - 1);
            }
            final float n5 = n4 / 16.0f;
            class7097.method6709(Class6912.field27101, n + n5 * class7099.method785(), n2, n3 + n5 * class7099.method787(), 0.0, 0.0, 0.0);
        }
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3897.field17564, Class3897.field17583, Class3897.field17582, Class3897.field17578);
    }
    
    static {
        field17582 = Class8970.field37737;
        field17583 = Class8970.field37777;
    }
}
