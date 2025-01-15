// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;
import java.util.Iterator;

public class Class3938 extends Class3936
{
    private static Class8691 field17821;
    private static Class8691 field17822;
    
    public Class3938(final Class9288 class9288) {
        super(Class298.field1712, class9288);
    }
    
    @Override
    public void method11853(final Class1847 class1847, final Class354 class1848, final Class7096 class1849, final Class511 class1850, final Class8321 class1851) {
        super.method11853(class1847, class1848, class1849, class1850, class1851);
        final Class436 method6727 = class1847.method6727(class1848);
        if (method6727 instanceof Class493) {
            method12051(class1847, class1848, (Class493)method6727);
        }
    }
    
    public static void method12051(final Class1847 class1847, final Class354 class1848, final Class493 class1849) {
        if (!class1847.field10067) {
            final Class3833 method21696 = class1849.method2194().method21696();
            if (method21696 == Class7521.field29455 || method21696 == Class7521.field29456) {
                if (class1848.method1075() >= 2) {
                    if (class1847.method6954() != Class2113.field12290) {
                        final Class8691 method21697 = method12053();
                        final Class7820 method21698 = method21697.method29796(class1847, class1848);
                        if (method21698 != null) {
                            for (int i = 0; i < method21697.method29794(); ++i) {
                                for (int j = 0; j < method21697.method29793(); ++j) {
                                    final Class7990 method21699 = method21698.method25270(i, j, 0);
                                    class1847.method6688(method21699.method26068(), Class7521.field29147.method11878(), 2);
                                    class1847.method6955(2001, method21699.method26068(), Class3833.method11774(method21699.method26065()));
                                }
                            }
                            final Class767 class1850 = Class7499.field29048.method23371(class1847);
                            final Class354 method21700 = method21698.method25270(1, 2, 0).method26068();
                            class1850.method1730(method21700.method1074() + 0.5, method21700.method1075() + 0.55, method21700.method1076() + 0.5, (method21698.method25266().method790() != Class111.field351) ? 90.0f : 0.0f, 0.0f);
                            class1850.field2951 = ((method21698.method25266().method790() != Class111.field351) ? 90.0f : 0.0f);
                            class1850.method4245();
                            final Iterator<Class399> iterator = (Iterator<Class399>)class1847.method7128((Class<? extends Class513>)Class513.class, class1850.method1886().method18496(50.0)).iterator();
                            while (iterator.hasNext()) {
                                Class7770.field31788.method13788(iterator.next(), class1850);
                            }
                            class1847.method6886(class1850);
                            for (int k = 0; k < method21697.method29794(); ++k) {
                                for (int l = 0; l < method21697.method29793(); ++l) {
                                    class1847.method6694(method21698.method25270(k, l, 0).method26068(), Class7521.field29147);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static boolean method12052(final Class1847 class1847, final Class354 class1848, final Class8321 class1849) {
        if (class1849.method27622() == Class7739.field31524) {
            if (class1848.method1075() >= 2) {
                if (class1847.method6954() != Class2113.field12290) {
                    if (!class1847.field10067) {
                        return method12054().method29796(class1847, class1848) != null;
                    }
                }
            }
        }
        return false;
    }
    
    private static Class8691 method12053() {
        if (Class3938.field17821 == null) {
            Class3938.field17821 = Class9512.method35439().method35438("^^^", "###", "~#~").method35440('#', Class7990.method26069(Class169.method766(Class7521.field29339))).method35440('^', Class7990.method26069(Class169.method766(Class7521.field29455).or(Class169.method766(Class7521.field29456)))).method35440('~', Class7990.method26069(Class114.method607(Class8059.field33153))).method35441();
        }
        return Class3938.field17821;
    }
    
    private static Class8691 method12054() {
        if (Class3938.field17822 == null) {
            Class3938.field17822 = Class9512.method35439().method35438("   ", "###", "~#~").method35440('#', Class7990.method26069(Class169.method766(Class7521.field29339))).method35440('~', Class7990.method26069(Class114.method607(Class8059.field33153))).method35441();
        }
        return Class3938.field17822;
    }
}
