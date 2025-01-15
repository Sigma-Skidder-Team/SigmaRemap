// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3940 extends Class3841
{
    private static String[] field17826;
    public static final Class7112 field17827;
    public static final Class7113 field17828;
    public static final Class7702 field17829;
    
    public Class3940(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3940.field17827, 0)).method21773((Class7111<Comparable>)Class3940.field17828, false));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3940.field17829;
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11848(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class179 class7099) {
        return class7096.method21772((Class7111<Integer>)Class3940.field17827);
    }
    
    public static void method12055(final Class7096 class7096, final Class1847 class7097, final Class354 class7098) {
        if (class7097.field10063.method20503()) {
            int round = class7097.method6992(Class237.field911, class7098) - class7097.method6785();
            final float method6713 = class7097.method6713(1.0f);
            if (!class7096.method21772((Class7111<Boolean>)Class3940.field17828)) {
                if (round > 0) {
                    round = Math.round(round * Class9546.method35639(method6713 + (((method6713 >= 3.1415927f) ? 6.2831855f : 0.0f) - method6713) * 0.2f));
                }
            }
            else {
                round = 15 - round;
            }
            final int method6714 = Class9546.method35651(round, 0, 15);
            if (class7096.method21772((Class7111<Integer>)Class3940.field17827) != method6714) {
                class7097.method6688(class7098, (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3940.field17827, method6714), 3);
            }
        }
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7099.method2880()) {
            return super.method11844(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        if (!class7097.field10067) {
            final Class7096 class7102 = ((Class7097<O, Class7096>)class7096).method21768((Class7111<Comparable>)Class3940.field17828);
            class7097.method6688(class7098, class7102, 4);
            method12055(class7102, class7097, class7098);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public boolean method11849(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class496();
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3940.field17827, Class3940.field17828);
    }
    
    static {
        field17827 = Class8970.field37790;
        field17828 = Class8970.field37734;
        field17829 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);
    }
}
