// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.LongFunction;

public class Class7983
{
    private static String[] field32845;
    public static final int field32846;
    public static final int field32847;
    public static final int field32848;
    public static final int field32849;
    public static final int field32850;
    public static final int field32851;
    public static final int field32852;
    public static final int field32853;
    public static final int field32854;
    public static final int field32855;
    
    private static <T extends Class6631, C extends Class6432<T>> Class7538<T> method26034(final long n, final Class194 class194, final Class7538<T> class195, final int n2, final LongFunction<C> longFunction) {
        Class7538<T> method836 = class195;
        for (int i = 0; i < n2; ++i) {
            method836 = class194.method836(longFunction.apply(n + i), method836);
        }
        return method836;
    }
    
    public static <T extends Class6631, C extends Class6432<T>> Class7538<T> method26035(final Class9505 class9505, final Class7068 class9506, final LongFunction<C> longFunction) {
        final Class7538<Class6631> method836 = Class221.field769.method836((Class6432<Class6631>)longFunction.apply(2L), Class212.field735.method836((Class6432<Class6631>)longFunction.apply(70L), Class212.field735.method836((Class6432<Class6631>)longFunction.apply(50L), Class212.field735.method836((Class6432<Class6631>)longFunction.apply(2L), Class213.field737.method836((Class6432<Class6631>)longFunction.apply(2001L), Class212.field735.method836((Class6432<Class6631>)longFunction.apply(1L), Class213.field738.method836((Class6432<Class6631>)longFunction.apply(2000L), (Class7538<Class6631>)Class291.field1671.method944((Class6432<R>)longFunction.apply(1L)))))))));
        final Class7538<R> method837 = method26034(2001L, Class213.field737, (Class7538<R>)Class293.field1673.method944(longFunction.apply(2L)), 6, longFunction);
        final Class7538<R> method838 = method26034(1000L, Class213.field737, (Class7538<R>)Class218.field747.method836(longFunction.apply(4L), Class211.field732.method836(longFunction.apply(5L), Class212.field735.method836(longFunction.apply(4L), Class213.field737.method836(longFunction.apply(2003L), Class213.field737.method836(longFunction.apply(2002L), Class203.field711.method836(longFunction.apply(3L), Class217.field745.method836(longFunction.apply(2L), Class219.field749.method836(longFunction.apply(2L), Class212.field735.method836(longFunction.apply(3L), Class208.field722.method836(longFunction.apply(2L), (Class7538<T>)method836)))))))))), 0, longFunction);
        final int n = (class9505 != Class9505.field40894) ? class9506.method21616() : 6;
        final int method839 = class9506.method21617();
        final Class7538<T> method840 = Class204.field713.method836(longFunction.apply(100L), (Class7538<T>)method26034(1000L, Class213.field737, method838, 0, longFunction));
        final Class7538<R> method841 = Class197.field656.method842((Class6432<R>)longFunction.apply(1000L), (Class7538<R>)Class220.field751.method836((Class6432<R>)longFunction.apply(1000L), (Class7538<R>)method26034(1000L, Class213.field737, (Class7538<R>)Class210.field728.method836(longFunction.apply(1001L), new Class202(class9505, class9506.method21618()).method836(longFunction.apply(200L), (Class7538<T>)method838)), 2, longFunction)), (Class7538<R>)method26034(1000L, Class213.field737, (Class7538<R>)method840, 2, longFunction));
        final Class7538<R> method842 = Class215.field740.method836((Class6432<R>)longFunction.apply(1000L), Class216.field742.method836((Class6432<R>)longFunction.apply(1L), (Class7538<R>)method26034(1000L, Class213.field737, method26034(1000L, Class213.field737, (Class7538<R>)method840, 2, longFunction), method839, longFunction)));
        Class7538<Class6631> class9507 = Class209.field724.method836((Class6432<Class6631>)longFunction.apply(1001L), (Class7538<Class6631>)method841);
        for (int i = 0; i < n; ++i) {
            class9507 = Class213.field737.method836((Class6432<Class6631>)longFunction.apply(1000 + i), class9507);
            if (i == 0) {
                class9507 = Class212.field735.method836((Class6432<Class6631>)longFunction.apply(3L), class9507);
            }
            if (i == 1 || n == 1) {
                class9507 = Class192.field632.method836((Class6432<Class6631>)longFunction.apply(1000L), class9507);
            }
        }
        return Class199.field685.method842(longFunction.apply(100L), Class206.field715.method842(longFunction.apply(100L), (Class7538<T>)Class215.field740.method836((Class6432<R>)longFunction.apply(1000L), (Class7538<R>)class9507), (Class7538<T>)method842), (Class7538<T>)method837);
    }
    
    public static Class8910 method26036(final long n, final Class9505 class9505, final Class7068 class9506) {
        return new Class8910(method26035(class9505, class9506, n4 -> new Class6431(25, n2, n4)));
    }
    
    public static boolean method26037(final int n, final int n2) {
        if (n == n2) {
            return true;
        }
        final Class3090 class3090 = Registry.field217.method499(n);
        final Class3090 class3091 = Registry.field217.method499(n2);
        if (class3090 == null || class3091 == null) {
            return false;
        }
        if (class3090 != Class7102.field27670 && class3090 != Class7102.field27671) {
            if (class3090.method9870() != Class2140.field12585) {
                if (class3091.method9870() != Class2140.field12585) {
                    if (class3090.method9870() == class3091.method9870()) {
                        return true;
                    }
                }
            }
            return class3090 == class3091;
        }
        return class3091 == Class7102.field27670 || class3091 == Class7102.field27671;
    }
    
    public static boolean method26038(final int n) {
        if (n != Class7983.field32846) {
            if (n != Class7983.field32847) {
                if (n != Class7983.field32848) {
                    if (n != Class7983.field32849) {
                        if (n != Class7983.field32850) {
                            if (n != Class7983.field32851) {
                                if (n != Class7983.field32852) {
                                    if (n != Class7983.field32853) {
                                        if (n != Class7983.field32854) {
                                            return n == Class7983.field32855;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean method26039(final int n) {
        if (n != Class7983.field32846) {
            if (n != Class7983.field32847) {
                if (n != Class7983.field32848) {
                    if (n != Class7983.field32849) {
                        return n == Class7983.field32850;
                    }
                }
            }
        }
        return true;
    }
    
    static {
        field32846 = Registry.field217.getId(Class7102.field27676);
        field32847 = Registry.field217.getId(Class7102.field27677);
        field32848 = Registry.field217.getId(Class7102.field27631);
        field32849 = Registry.field217.getId(Class7102.field27678);
        field32850 = Registry.field217.getId(Class7102.field27642);
        field32851 = Registry.field217.getId(Class7102.field27679);
        field32852 = Registry.field217.getId(Class7102.field27680);
        field32853 = Registry.field217.getId(Class7102.field27656);
        field32854 = Registry.field217.getId(Class7102.field27681);
        field32855 = Registry.field217.getId(Class7102.field27682);
    }
}
