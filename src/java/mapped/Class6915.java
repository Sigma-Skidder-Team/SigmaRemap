// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6915
{
    private final Class2237 field27109;
    
    public static Class6915 method21283(final Class3746 class3746) {
        Class6915 class3747 = null;
        if (class3746.method11498(1935894637L)) {
            if (((Class3774)class3746.method11499(1935894637L)).method11577() == Class188.method827(Class188.field606)) {
                class3747 = new Class6916(class3746);
            }
        }
        if (class3747 == null) {
            class3747 = new Class6914(class3746);
        }
        return class3747;
    }
    
    public Class6915(final Class3746 class3746) {
        final long method11574 = ((Class3769)class3746.method11499(1718775137L)).method11574();
        final Class2237 method11575;
        if ((method11575 = Class2236.method8442(method11574)).equals(Class2236.field13755)) {
            final Class2237 method11576;
            if ((method11576 = Class2238.method8443(method11574)).equals(Class2238.field13760)) {
                this.field27109 = null;
            }
            else {
                this.field27109 = method11576;
            }
        }
        else {
            this.field27109 = method11575;
        }
    }
    
    public Class2237 method21284() {
        return this.field27109;
    }
    
    public abstract Class188 method21282();
}
