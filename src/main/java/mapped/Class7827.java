// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7827
{
    private static String[] field32050;
    
    public static int method25280(final int n, final float n2) {
        return 31 * method25286(n) + method25287(n2);
    }
    
    public static int method25281(final float n, final float n2) {
        return 31 * method25287(n) + method25287(n2);
    }
    
    public static int method25282(final boolean b, final boolean b2) {
        return 31 * method25288(b) + method25288(b2);
    }
    
    public static int method25283(final int n, final Object o) {
        return 31 * method25286(n) + method25289(o);
    }
    
    public static int method25284(final Object o, final boolean b) {
        return 31 * method25289(o) + method25288(b);
    }
    
    public static int method25285(final Object o, final Object o2) {
        return 31 * method25289(o) + method25289(o2);
    }
    
    public static int method25286(final int n) {
        return n;
    }
    
    public static int method25287(final float value) {
        return Float.hashCode(value);
    }
    
    public static int method25288(final boolean value) {
        return Boolean.hashCode(value);
    }
    
    public static int method25289(final Object o) {
        return (o != null) ? o.hashCode() : 0;
    }
}
