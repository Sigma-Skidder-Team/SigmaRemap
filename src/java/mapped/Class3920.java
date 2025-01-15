// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;

public class Class3920 extends Class3833 implements Class3856
{
    private static String[] field17768;
    private static final Class7702 field17769;
    private static final Class7702 field17770;
    private static final Class7702 field17771;
    private static final Class7702 field17772;
    public static final Class7112 field17773;
    public static final Class7113 field17774;
    public static final Class7113 field17775;
    
    public Class3920(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3920.field17773, 7)).method21773((Class7111<Comparable>)Class3920.field17774, false)).method21773((Class7111<Comparable>)Class3920.field17775, false));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3920.field17773, Class3920.field17774, Class3920.field17775);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        if (class7099.method23627(class7096.method21696().method11704())) {
            return Class7698.method24487();
        }
        return class7096.method21772((Class7111<Boolean>)Class3920.field17775) ? Class3920.field17770 : Class3920.field17769;
    }
    
    @Override
    public Class7702 method11811(final Class7096 class7096, final Class1855 class7097, final Class354 class7098) {
        return Class7698.method24487();
    }
    
    @Override
    public boolean method11798(final Class7096 class7096, final Class7074 class7097) {
        return class7097.method21651().method27622() == this.method11704();
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class354 method21639 = class7074.method21639();
        final Class1847 method21640 = class7074.method21654();
        final int method21641 = method12036(method21640, method21639);
        return (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3920.field17774, method21640.method6702(method21639).method21779() == Class7558.field29976)).method21773((Class7111<Comparable>)Class3920.field17773, method21641)).method21773((Class7111<Comparable>)Class3920.field17775, this.method12035(method21640, method21639, method21641));
    }
    
    @Override
    public void method11828(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class7096 class7099, final boolean b) {
        if (!class7097.field10067) {
            class7097.method6833().method21345(class7098, this, 1);
        }
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3920.field17774)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        if (!class7099.method6678()) {
            class7099.method6833().method21345(class7100, this, 1);
        }
        return class7096;
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final Class354 class7098, final Random random) {
        final int method12036 = method12036(class7097, class7098);
        final Class7096 class7099 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3920.field17773, method12036)).method21773((Class7111<Comparable>)Class3920.field17775, this.method12035(class7097, class7098, method12036));
        if (((Class7097<Object, Class7096>)class7099).method21772((Class7111<Integer>)Class3920.field17773) != 7) {
            if (class7096 != class7099) {
                class7097.method6688(class7098, class7099, 3);
            }
        }
        else if (class7096.method21772((Class7111<Integer>)Class3920.field17773) != 7) {
            class7097.method7149(class7098, true);
        }
        else {
            class7097.method6886(new Class424(class7097, class7098.method1074() + 0.5, class7098.method1075(), class7098.method1076() + 0.5, ((Class7097<Object, Class7096>)class7099).method21773((Class7111<Comparable>)Class3920.field17774, false)));
        }
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        return method12036(class7097, class7098) < 7;
    }
    
    @Override
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        if (class7099.method23626(Class7698.method24487(), class7098, true) && !class7099.method23628()) {
            return Class3920.field17769;
        }
        if (class7096.method21772((Class7111<Integer>)Class3920.field17773) != 0) {
            if (class7096.method21772((Class7111<Boolean>)Class3920.field17775)) {
                if (class7099.method23626(Class3920.field17772, class7098, true)) {
                    return Class3920.field17771;
                }
            }
        }
        return Class7698.method24486();
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3920.field17774) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    private boolean method12035(final Class1855 class1855, final Class354 class1856, final int n) {
        return n > 0 && class1855.method6701(class1856.method1139()).method21696() != this;
    }
    
    public static int method12036(final Class1855 class1855, final Class354 class1856) {
        final Class385 method1290 = new Class385(class1856).method1290(Class179.field511);
        final Class7096 method1291 = class1855.method6701(method1290);
        int a = 7;
        if (method1291.method21696() != Class7521.field29805) {
            if (method1291.method21761(class1855, method1290, Class179.field512)) {
                return 0;
            }
        }
        else {
            a = method1291.method21772((Class7111<Integer>)Class3920.field17773);
        }
        final Iterator<Class179> iterator = Class98.field268.iterator();
        while (iterator.hasNext()) {
            final Class7096 method1292 = class1855.method6701(method1290.method1287(class1856).method1290(iterator.next()));
            if (method1292.method21696() != Class7521.field29805) {
                continue;
            }
            a = Math.min(a, method1292.method21772((Class7111<Integer>)Class3920.field17773) + 1);
            if (a != 1) {
                continue;
            }
            break;
        }
        return a;
    }
    
    static {
        field17771 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
        field17772 = Class7698.method24487().method24541(0.0, -1.0, 0.0);
        field17773 = Class8970.field37792;
        field17774 = Class8970.field37747;
        field17775 = Class8970.field37720;
        field17769 = Class7698.method24493(Class3833.method11778(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 2.0, 16.0, 2.0), Class3833.method11778(14.0, 0.0, 0.0, 16.0, 16.0, 2.0), Class3833.method11778(0.0, 0.0, 14.0, 2.0, 16.0, 16.0), Class3833.method11778(14.0, 0.0, 14.0, 16.0, 16.0, 16.0));
        field17770 = Class7698.method24493(Class3920.field17771, Class3920.field17769, Class3833.method11778(14.0, 0.0, 0.0, 16.0, 2.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 2.0, 2.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 2.0), Class3833.method11778(0.0, 0.0, 14.0, 16.0, 2.0, 16.0));
    }
}
