// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7579
{
    private static String[] field30058;
    private static long field30059;
    
    private Class7579() {
    }
    
    public static long method23859() {
        return Class7579.field30059;
    }
    
    public static void method23860(final long n) {
        Class7579.field30059 += n;
    }
    
    public static void method23861(final long n) {
        Class7579.field30059 -= n;
        if (Class7579.field30059 < 0L) {
            Class7579.field30059 = 0L;
        }
    }
    
    static {
        Class7579.field30059 = 0L;
    }
}
