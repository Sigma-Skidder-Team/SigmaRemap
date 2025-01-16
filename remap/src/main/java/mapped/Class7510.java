// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7510
{
    private static String[] field29111;
    
    public static Class5601 method23440(final String anObject, final Class5601[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class5601 class5601 = array[i];
                if (class5601.method16860().equals(anObject)) {
                    return class5601;
                }
            }
            return null;
        }
        return null;
    }
    
    public static Class9319 method23441(final Class9319[] array, final Class5601[] array2, final boolean b) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class9319 class9319 = array[i];
                if (method23442(class9319, array2, b)) {
                    return class9319;
                }
            }
            return null;
        }
        return null;
    }
    
    public static boolean method23442(final Class9319 class9319, final Class5601[] array, final boolean b) {
        if (class9319 == null) {
            return false;
        }
        if (array != null) {
            final String[] method34504 = class9319.method34504();
            for (int i = 0; i < method34504.length; ++i) {
                final String s = method34504[i];
                final Class5601 method34505 = method23440(s, array);
                if (method34505 != null && !Config.equals(b ? method34505.method16865() : method34505.method16863(), class9319.method34505(s))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
