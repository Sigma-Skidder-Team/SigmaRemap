// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3855 extends Class3854
{
    private static String[] field17464;
    public static final Class7113 field17474;
    private final Class7702[] field17475;
    private final Class7702[] field17476;
    
    public Class3855(final Class9288 class9288) {
        super(0.0f, 3.0f, 0.0f, 14.0f, 24.0f, class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3855.field17474, true)).method21773((Class7111<Comparable>)Class3855.field17465, false)).method21773((Class7111<Comparable>)Class3855.field17466, false)).method21773((Class7111<Comparable>)Class3855.field17467, false)).method21773((Class7111<Comparable>)Class3855.field17468, false)).method21773((Class7111<Comparable>)Class3855.field17469, false));
        this.field17475 = this.method11914(4.0f, 3.0f, 16.0f, 0.0f, 14.0f);
        this.field17476 = this.method11914(4.0f, 3.0f, 24.0f, 0.0f, 24.0f);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return class7096.method21772((Class7111<Boolean>)Class3855.field17474) ? this.field17475[this.method11916(class7096)] : super.method11808(class7096, class7097, class7098, class7099);
    }
    
    @Override
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return class7096.method21772((Class7111<Boolean>)Class3855.field17474) ? this.field17476[this.method11916(class7096)] : super.method11809(class7096, class7097, class7098, class7099);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class2084 class7099) {
        return false;
    }
    
    private boolean method11919(final Class7096 class7096, final boolean b, final Class179 class7097) {
        final Class3833 method21696 = class7096.method21696();
        final boolean b2 = method21696.method11785(Class7188.field27904) || (method21696 instanceof Class3898 && Class3898.method11983(class7096, class7097));
        return (!Class3833.method11792(method21696) && b) || b2;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class1847 method21654 = class7074.method21654();
        final Class354 method21655 = class7074.method21639();
        final Class7099 method21656 = class7074.method21654().method6702(class7074.method21639());
        final Class354 method21657 = method21655.method1141();
        final Class354 method21658 = method21655.method1147();
        final Class354 method21659 = method21655.method1143();
        final Class354 method21660 = method21655.method1145();
        final Class7096 method21661 = method21654.method6701(method21657);
        final Class7096 method21662 = method21654.method6701(method21658);
        final Class7096 method21663 = method21654.method6701(method21659);
        final Class7096 method21664 = method21654.method6701(method21660);
        final boolean method21665 = this.method11919(method21661, method21661.method21761(method21654, method21657, Class179.field514), Class179.field514);
        final boolean method21666 = this.method11919(method21662, method21662.method21761(method21654, method21658, Class179.field515), Class179.field515);
        final boolean method21667 = this.method11919(method21663, method21663.method21761(method21654, method21659, Class179.field513), Class179.field513);
        final boolean method21668 = this.method11919(method21664, method21664.method21761(method21654, method21660, Class179.field516), Class179.field516);
        Label_0227: {
            if (method21665) {
                if (!method21666) {
                    if (method21667) {
                        if (!method21668) {
                            break Label_0227;
                        }
                    }
                }
            }
            if (!method21665) {
                if (method21666) {
                    if (!method21667) {
                        if (method21668) {
                            break Label_0227;
                        }
                    }
                }
            }
            final boolean b = true;
            return (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)Class3855.field17474, b || !method21654.method6961(method21655.method1137()))).method21773((Class7111<Comparable>)Class3855.field17465, method21665)).method21773((Class7111<Comparable>)Class3855.field17466, method21666)).method21773((Class7111<Comparable>)Class3855.field17467, method21667)).method21773((Class7111<Comparable>)Class3855.field17468, method21668)).method21773((Class7111<Comparable>)Class3855.field17469, method21656.method21779() == Class7558.field29976);
        }
        final boolean b = false;
        return (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)Class3855.field17474, b || !method21654.method6961(method21655.method1137()))).method21773((Class7111<Comparable>)Class3855.field17465, method21665)).method21773((Class7111<Comparable>)Class3855.field17466, method21666)).method21773((Class7111<Comparable>)Class3855.field17467, method21667)).method21773((Class7111<Comparable>)Class3855.field17468, method21668)).method21773((Class7111<Comparable>)Class3855.field17469, method21656.method21779() == Class7558.field29976);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3855.field17469)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        if (class7097 != Class179.field511) {
            final Class179 method782 = class7097.method782();
            final boolean b = (class7097 != Class179.field513) ? class7096.method21772((Class7111<Boolean>)Class3855.field17465) : this.method11919(class7098, class7098.method21761(class7099, class7101, method782), method782);
            final boolean b2 = (class7097 != Class179.field516) ? class7096.method21772((Class7111<Boolean>)Class3855.field17466) : this.method11919(class7098, class7098.method21761(class7099, class7101, method782), method782);
            final boolean b3 = (class7097 != Class179.field514) ? class7096.method21772((Class7111<Boolean>)Class3855.field17467) : this.method11919(class7098, class7098.method21761(class7099, class7101, method782), method782);
            final boolean b4 = (class7097 != Class179.field515) ? class7096.method21772((Class7111<Boolean>)Class3855.field17468) : this.method11919(class7098, class7098.method21761(class7099, class7101, method782), method782);
            Label_0283: {
                if (b) {
                    if (!b2) {
                        if (b3) {
                            if (!b4) {
                                break Label_0283;
                            }
                        }
                    }
                }
                if (!b) {
                    if (b2) {
                        if (!b3) {
                            if (b4) {
                                break Label_0283;
                            }
                        }
                    }
                }
                final boolean b5 = true;
                return (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3855.field17474, b5 || !class7099.method6961(class7100.method1137()))).method21773((Class7111<Comparable>)Class3855.field17465, b)).method21773((Class7111<Comparable>)Class3855.field17466, b2)).method21773((Class7111<Comparable>)Class3855.field17467, b3)).method21773((Class7111<Comparable>)Class3855.field17468, b4);
            }
            final boolean b5 = false;
            return (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3855.field17474, b5 || !class7099.method6961(class7100.method1137()))).method21773((Class7111<Comparable>)Class3855.field17465, b)).method21773((Class7111<Comparable>)Class3855.field17466, b2)).method21773((Class7111<Comparable>)Class3855.field17467, b3)).method21773((Class7111<Comparable>)Class3855.field17468, b4);
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3855.field17474, Class3855.field17465, Class3855.field17466, Class3855.field17468, Class3855.field17467, Class3855.field17469);
    }
    
    static {
        field17474 = Class8970.field37750;
    }
}
