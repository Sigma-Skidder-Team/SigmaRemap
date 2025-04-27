// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class Class9476
{
    public static final Charset field40748;
    
    private Class9476() {
    }
    
    public static void method35277(final long l, final long i, final long j) {
        if ((i | j) >= 0L) {
            if (i <= l) {
                if (l - i >= j) {
                    return;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", l, i, j));
    }
    
    public static short method35278(final short n) {
        final int n2 = n & 0xFFFF;
        return (short)((n2 & 0xFF00) >>> 8 | (n2 & 0xFF) << 8);
    }
    
    public static int method35279(final int n) {
        return (n & 0xFF000000) >>> 24 | (n & 0xFF0000) >>> 8 | (n & 0xFF00) << 8 | (n & 0xFF) << 24;
    }
    
    public static long method35280(final long n) {
        return (n & 0xFF00000000000000L) >>> 56 | (n & 0xFF000000000000L) >>> 40 | (n & 0xFF0000000000L) >>> 24 | (n & 0xFF00000000L) >>> 8 | (n & 0xFF000000L) << 8 | (n & 0xFF0000L) << 24 | (n & 0xFF00L) << 40 | (n & 0xFFL) << 56;
    }
    
    public static void method35281(final Throwable t) {
        method35282(t);
    }
    
    private static <T extends Throwable> void method35282(final Throwable t) throws Throwable {
        throw t;
    }
    
    public static boolean method35283(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        for (int i = 0; i < n3; ++i) {
            if (array[i + n] != array2[i + n2]) {
                return false;
            }
        }
        return true;
    }
    
    static {
        field40748 = StandardCharsets.UTF_8;
    }
}
