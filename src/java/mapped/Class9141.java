// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class9141
{
    private static String[] field38724;
    public static final long field38725 = 65536L;
    public static Class9258 field38726;
    public static long field38727;
    
    private Class9141() {
    }
    
    public static Class9258 method33334() {
        synchronized (Class9141.class) {
            if (Class9141.field38726 != null) {
                final Class9258 field38726 = Class9141.field38726;
                Class9141.field38726 = field38726.field39718;
                field38726.field39718 = null;
                Class9141.field38727 -= 8192L;
                return field38726;
            }
        }
        return new Class9258();
    }
    
    public static void method33335(final Class9258 field38726) {
        if (field38726.field39718 != null || field38726.field39719 != null) {
            throw new IllegalArgumentException();
        }
        if (field38726.field39716) {
            return;
        }
        synchronized (Class9141.class) {
            if (Class9141.field38727 + 8192L > 65536L) {
                return;
            }
            Class9141.field38727 += 8192L;
            field38726.field39718 = Class9141.field38726;
            final int n = 0;
            field38726.field39715 = n;
            field38726.field39714 = n;
            Class9141.field38726 = field38726;
        }
    }
}
