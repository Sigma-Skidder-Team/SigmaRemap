// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8975
{
    public static final Class1929 field37834;
    public static final Class1929 field37835;
    public static final Class1929 field37836;
    public static final Class1929 field37837;
    public static final Class1929 field37838;
    public static final Class1929 field37839;
    public final Class1929 field37840;
    public final Class1929 field37841;
    public final int field37842;
    
    public Class8975(final String s, final String s2) {
        this(Class1929.method7741(s), Class1929.method7741(s2));
    }
    
    public Class8975(final Class1929 class1929, final String s) {
        this(class1929, Class1929.method7741(s));
    }
    
    public Class8975(final Class1929 field37840, final Class1929 field37841) {
        this.field37840 = field37840;
        this.field37841 = field37841;
        this.field37842 = 32 + field37840.method7766() + field37841.method7766();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class8975)) {
            return false;
        }
        final Class8975 class8975 = (Class8975)o;
        return this.field37840.equals(class8975.field37840) && this.field37841.equals(class8975.field37841);
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * 17 + this.field37840.hashCode()) + this.field37841.hashCode();
    }
    
    @Override
    public String toString() {
        return Class7690.method24456("%s: %s", this.field37840.method7743(), this.field37841.method7743());
    }
    
    static {
        field37834 = Class1929.method7741(":");
        field37835 = Class1929.method7741(":status");
        field37836 = Class1929.method7741(":method");
        field37837 = Class1929.method7741(":path");
        field37838 = Class1929.method7741(":scheme");
        field37839 = Class1929.method7741(":authority");
    }
}
