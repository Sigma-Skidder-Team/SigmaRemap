// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.Optional;

public class Class3918 extends Class3841 implements Class3856
{
    private static String[] field17758;
    public static final Class7702 field17759;
    public static final Class7113 field17760;
    public static final Class7113 field17761;
    public static final Class7113 field17762;
    public static final Class7115 field17763;
    private static final Class7702 field17764;
    
    public Class3918(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3918.field17760, true)).method21773((Class7111<Comparable>)Class3918.field17761, false)).method21773((Class7111<Comparable>)Class3918.field17762, false)).method21773((Class7111<Comparable>)Class3918.field17763, Class179.field513));
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3918.field17760)) {
            final Class436 method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class448) {
                final Class448 class7102 = (Class448)method6727;
                final Class8321 method6728 = class7099.method2715(class7100);
                final Optional<Class3682> method6729 = class7102.method2272(method6728);
                if (method6729.isPresent()) {
                    if (!class7097.field10067 && class7102.method2273(class7099.field3025.field27304 ? method6728.method27641() : method6728, method6729.get().method11329())) {
                        class7099.method2857(Class8276.field34050);
                        return Class2201.field13400;
                    }
                    return Class2201.field13401;
                }
            }
        }
        return Class2201.field13402;
    }
    
    @Override
    public void method11850(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class399 class7099) {
        if (!class7099.method1704()) {
            if (class7096.method21772((Class7111<Boolean>)Class3918.field17760)) {
                if (class7099 instanceof Class511) {
                    if (!Class8742.method30216((Class511)class7099)) {
                        class7099.method1740(Class7929.field32562, 1.0f);
                    }
                }
            }
        }
        super.method11850(class7096, class7097, class7098, class7099);
    }
    
    @Override
    public void method11829(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            final Class436 method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class448) {
                Class9193.method33641(class7097, class7098, ((Class448)method6727).method2270());
            }
            super.method11829(class7096, class7097, class7098, class7099, b);
        }
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class1847 method21654 = class7074.method21654();
        final Class354 method21655 = class7074.method21639();
        final boolean b = method21654.method6702(method21655).method21779() == Class7558.field29976;
        return (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)Class3918.field17762, b)).method21773((Class7111<Comparable>)Class3918.field17761, this.method12030(method21654.method6701(method21655.method1139())))).method21773((Class7111<Comparable>)Class3918.field17760, !b)).method21773((Class7111<Comparable>)Class3918.field17763, class7074.method21644());
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3918.field17762)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return (class7097 != Class179.field511) ? super.method11789(class7096, class7097, class7098, class7099, class7100, class7101) : ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3918.field17761, this.method12030(class7098));
    }
    
    private boolean method12030(final Class7096 class7096) {
        return class7096.method21696() == Class7521.field29529;
    }
    
    @Override
    public int method11781(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3918.field17760) ? super.method11781(class7096) : 0;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3918.field17759;
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Random random) {
        if (class7096.method21772((Class7111<Boolean>)Class3918.field17760)) {
            if (random.nextInt(10) == 0) {
                class7097.method6708(class7098.method1074() + 0.5f, class7098.method1075() + 0.5f, class7098.method1076() + 0.5f, Class8520.field35055, Class286.field1582, 0.5f + random.nextFloat(), random.nextFloat() * 0.7f + 0.6f, false);
            }
            if (random.nextInt(5) == 0) {
                for (int i = 0; i < random.nextInt(1) + 1; ++i) {
                    class7097.method6709(Class8432.field34633, class7098.method1074() + 0.5f, class7098.method1075() + 0.5f, class7098.method1076() + 0.5f, random.nextFloat() / 2.0f, 5.0E-5, random.nextFloat() / 2.0f);
                }
            }
        }
    }
    
    @Override
    public boolean method11921(final Class1851 class1851, final Class354 class1852, final Class7096 class1853, final Class7099 class1854) {
        if (!class1853.method21772((Class7111<Boolean>)Class8970.field37747) && class1854.method21779() == Class7558.field29976) {
            if (class1853.method21772((Class7111<Boolean>)Class3918.field17760)) {
                if (!class1851.method6678()) {
                    class1851.method6705(null, class1852, Class8520.field35219, Class286.field1582, 1.0f, 1.0f);
                }
                else {
                    for (int i = 0; i < 20; ++i) {
                        method12032(class1851.method6744(), class1852, class1853.method21772((Class7111<Boolean>)Class3918.field17761), true);
                    }
                }
                final Class436 method6727 = class1851.method6727(class1852);
                if (method6727 instanceof Class448) {
                    ((Class448)method6727).method2275();
                }
            }
            class1851.method6688(class1852, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)class1853).method21773((Class7111<Comparable>)Class3918.field17762, true)).method21773((Class7111<Comparable>)Class3918.field17760, false), 3);
            class1851.method6834().method21345(class1852, class1854.method21779(), class1854.method21779().method22156(class1851));
            return true;
        }
        return false;
    }
    
    @Nullable
    private Class399 method12031(final Class399 class399) {
        if (!(class399 instanceof Class416)) {
            return (class399 instanceof Class402) ? ((Class402)class399).method1973() : null;
        }
        return ((Class416)class399).field2527;
    }
    
    @Override
    public void method11869(final Class1847 class1847, final Class7096 class1848, final Class7005 class1849, final Class399 class1850) {
        if (!class1847.field10067) {
            if (class1850 instanceof Class416 || (class1850 instanceof Class402 && class1850.method1804())) {
                final Class399 method12031 = this.method12031(class1850);
                boolean b = false;
                Label_0114: {
                    if (method12031 != null) {
                        if (!(method12031 instanceof Class512)) {
                            if (!class1847.method6765().method31216(Class8878.field37316)) {
                                b = false;
                                break Label_0114;
                            }
                        }
                    }
                    b = true;
                }
                if (b) {
                    if (!class1848.method21772((Class7111<Boolean>)Class3918.field17760)) {
                        if (!class1848.method21772((Class7111<Boolean>)Class3918.field17762)) {
                            class1847.method6688(class1849.method21447(), ((Class7097<O, Class7096>)class1848).method21773((Class7111<Comparable>)Class8970.field37736, true), 11);
                        }
                    }
                }
            }
        }
    }
    
    public static void method12032(final Class1847 class1847, final Class354 class1848, final boolean b, final boolean b2) {
        final Random method6790 = class1847.method6790();
        class1847.method6712(b ? Class8432.field34654 : Class8432.field34653, true, class1848.method1074() + 0.5 + method6790.nextDouble() / 3.0 * (method6790.nextBoolean() ? 1 : -1), class1848.method1075() + method6790.nextDouble() + method6790.nextDouble(), class1848.method1076() + 0.5 + method6790.nextDouble() / 3.0 * (method6790.nextBoolean() ? 1 : -1), 0.0, 0.07, 0.0);
        if (b2) {
            class1847.method6709(Class8432.field34639, class1848.method1074() + 0.25 + method6790.nextDouble() / 2.0 * (method6790.nextBoolean() ? 1 : -1), class1848.method1075() + 0.4, class1848.method1076() + 0.25 + method6790.nextDouble() / 2.0 * (method6790.nextBoolean() ? 1 : -1), 0.0, 0.005, 0.0);
        }
    }
    
    public static boolean method12033(final Class1847 class1847, final Class354 class1848, final int n) {
        for (int i = 1; i <= n; ++i) {
            final Class354 method1140 = class1848.method1140(i);
            final Class7096 method1141 = class1847.method6701(method1140);
            if (method12034(method1141)) {
                return true;
            }
            if (Class7698.method24496(Class3918.field17764, method1141.method21728(class1847, class1848, Class7543.method23629()), Class9306.field39924)) {
                return method12034(class1847.method6701(method1140.method1139()));
            }
        }
        return false;
    }
    
    private static boolean method12034(final Class7096 class7096) {
        return class7096.method21696() == Class7521.field29818 && class7096.method21772((Class7111<Boolean>)Class3918.field17760);
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3918.field17762) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3918.field17763, class7097.method8142(class7096.method21772((Class7111<Class179>)Class3918.field17763)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Class179>)Class3918.field17763)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3918.field17760, Class3918.field17761, Class3918.field17762, Class3918.field17763);
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class448();
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17759 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
        field17760 = Class8970.field37736;
        field17761 = Class8970.field37743;
        field17762 = Class8970.field37747;
        field17763 = Class8970.field37758;
        field17764 = Class3833.method11778(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
    }
}
