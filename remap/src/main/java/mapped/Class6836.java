// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6836 extends Class6835
{
    private static String[] field26845;
    
    public Class6836(final Class7795 class7795, final Class286 class7796, final float n, final float n2, final Class354 class7797) {
        this(class7795, class7796, n, n2, class7797.method1074() + 0.5f, class7797.method1075() + 0.5f, class7797.method1076() + 0.5f);
    }
    
    public static Class6836 method20933(final Class7795 class7795, final float n) {
        return method20934(class7795, n, 0.25f);
    }
    
    public static Class6836 method20934(final Class7795 class7795, final float n, final float n2) {
        return new Class6836(class7795.method25124(), Class286.field1578, n2, n, false, 0, Class229.field809, 0.0f, 0.0f, 0.0f, true);
    }
    
    public static Class6836 method20935(final Class7795 class7795) {
        return new Class6836(class7795.method25124(), Class286.field1579, 1.0f, 1.0f, false, 0, Class229.field809, 0.0f, 0.0f, 0.0f, true);
    }
    
    public static Class6836 method20936(final Class7795 class7795, final float n, final float n2, final float n3) {
        return new Class6836(class7795, Class286.field1580, 4.0f, 1.0f, false, 0, Class229.field810, n, n2, n3);
    }
    
    public Class6836(final Class7795 class7795, final Class286 class7796, final float n, final float n2, final float n3, final float n4, final float n5) {
        this(class7795, class7796, n, n2, false, 0, Class229.field810, n3, n4, n5);
    }
    
    private Class6836(final Class7795 class7795, final Class286 class7796, final float n, final float n2, final boolean b, final int n3, final Class229 class7797, final float n4, final float n5, final float n6) {
        this(class7795.method25124(), class7796, n, n2, b, n3, class7797, n4, n5, n6, false);
    }
    
    public Class6836(final Class1932 class1932, final Class286 class1933, final float field26835, final float field26836, final boolean field26837, final int field26838, final Class229 field26839, final float field26840, final float field26841, final float field26842, final boolean field26843) {
        super(class1932, class1933);
        this.field26835 = field26835;
        this.field26836 = field26836;
        this.field26837 = field26840;
        this.field26838 = field26841;
        this.field26839 = field26842;
        this.field26840 = field26837;
        this.field26841 = field26838;
        this.field26842 = field26839;
        this.field26844 = field26843;
    }
}
