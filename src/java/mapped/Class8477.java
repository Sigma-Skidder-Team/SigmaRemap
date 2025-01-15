// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8477
{
    public static String method28301(final Class1855 class1855, final Class354 class1856) {
        return method28302(class1855.method6727(class1856));
    }
    
    public static String method28302(final Class436 class436) {
        if (class436 instanceof Class462) {
            final Class462 class437 = (Class462)class436;
            method28303(class436);
            return class437.method1874() ? class437.method1873().method8459() : null;
        }
        return null;
    }
    
    public static void method28303(final Class436 class436) {
        final Class354 method2193 = class436.method2193();
        if (method28305(class436) == null) {
            Class2250 method2194 = method28304(method2193);
            if (method2194 == null) {
                method2194 = new Class2260("");
            }
            method28306(class436, method2194);
        }
    }
    
    public static Class2250 method28304(final Class354 class354) {
        final Class436 method31208 = Class8876.method31208(class354);
        if (method31208 != null) {
            return method28305(method31208);
        }
        return null;
    }
    
    public static Class2250 method28305(final Class436 class436) {
        if (!(class436 instanceof Class462)) {
            return (class436 instanceof Class490) ? ((Class2250)Class9570.method35828(class436, Class9570.field41591)) : null;
        }
        return ((Class462)class436).method1873();
    }
    
    public static boolean method28306(final Class436 class436, final Class2250 class437) {
        if (class436 instanceof Class460) {
            ((Class460)class436).method2335(class437);
            return true;
        }
        if (class436 instanceof Class465) {
            ((Class465)class436).method2384(class437);
            return true;
        }
        if (class436 instanceof Class463) {
            ((Class463)class436).method2344(class437);
            return true;
        }
        if (!(class436 instanceof Class490)) {
            return false;
        }
        ((Class490)class436).method2453(class437);
        return true;
    }
}
