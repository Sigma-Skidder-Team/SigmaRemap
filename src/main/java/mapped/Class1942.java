// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1942 extends Class1941
{
    private static String[] field10585;
    public static final Class1942 field10586;
    public static final Class1942 field10587;
    public static final Class1942 field10588;
    public static final Class1942 field10589;
    public static final Class1942 field10590;
    
    public Class1942(final Class1941 class1941) {
        super(class1941);
    }
    
    public Class1942(final int n, final int n2, final int n3) {
        super(n, n2, n3);
    }
    
    public Class1942(final float n, final float n2, final float n3) {
        super(n, n2, n3);
    }
    
    public Class1942(final double n, final double n2, final double n3) {
        super(n, n2, n3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class1941) {
            final Class1941 class1941 = (Class1941)o;
            if ((int)class1941.method7835() == (int)this.field10582) {
                if ((int)class1941.method7839() == (int)this.field10583) {
                    if ((int)class1941.method7843() == (int)this.field10584) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (int)this.field10582 << 19 ^ (int)this.field10583 << 12 ^ (int)this.field10584;
    }
    
    @Override
    public Class1942 method7888() {
        return this;
    }
    
    static {
        field10586 = new Class1942(0, 0, 0);
        field10587 = new Class1942(1, 0, 0);
        field10588 = new Class1942(0, 1, 0);
        field10589 = new Class1942(0, 0, 1);
        field10590 = new Class1942(1, 1, 1);
    }
}
