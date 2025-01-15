// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7184 extends Class7183
{
    private static String[] field27863;
    public static final Class7184 field27864;
    public static final Class7184 field27865;
    public static final Class7184 field27866;
    public static final Class7184 field27867;
    
    public Class7184(final Class7183 class7183) {
        super(class7183);
    }
    
    public Class7184(final int n, final int n2) {
        super(n, n2);
    }
    
    public Class7184(final float n, final float n2) {
        super(n, n2);
    }
    
    public Class7184(final double n, final double n2) {
        super(n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class7183) {
            final Class7183 class7183 = (Class7183)o;
            return (int)class7183.field27861 == (int)this.field27861 && (int)class7183.field27862 == (int)this.field27862;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Integer.valueOf((int)this.field27861).hashCode() >> 13 ^ Integer.valueOf((int)this.field27862).hashCode();
    }
    
    @Override
    public Class7184 method22019() {
        return this;
    }
    
    static {
        field27864 = new Class7184(0, 0);
        field27865 = new Class7184(1, 0);
        field27866 = new Class7184(0, 1);
        field27867 = new Class7184(1, 1);
    }
}
