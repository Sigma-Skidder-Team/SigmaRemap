// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class216 implements Class193
{
    field742;
    
    public static final int field743;
    
    @Override
    public int method832(final Class6433 class6433, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int method847 = method847(n5);
        if (method847 == method847(n4)) {
            if (method847 == method847(n)) {
                if (method847 == method847(n2)) {
                    if (method847 == method847(n3)) {
                        return -1;
                    }
                }
            }
        }
        return Class216.field743;
    }
    
    private static int method847(final int n) {
        return (n < 2) ? n : (2 + (n & 0x1));
    }
    
    static {
        field743 = Class90.field217.method504(Class7102.field27639);
    }
}
