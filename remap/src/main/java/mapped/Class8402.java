// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8402
{
    public static final String field34431 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int field34432 = 128;
    public static final int field34433 = 64;
    public static final int field34434 = 32;
    public static final int field34435 = 16;
    public static final int field34436 = 15;
    public static final int field34437 = 8;
    public static final int field34438 = 128;
    public static final int field34439 = 127;
    public static final int field34440 = 0;
    public static final int field34441 = 1;
    public static final int field34442 = 2;
    public static final int field34443 = 8;
    public static final int field34444 = 9;
    public static final int field34445 = 10;
    public static final long field34446 = 125L;
    public static final long field34447 = 123L;
    public static final int field34448 = 126;
    public static final long field34449 = 65535L;
    public static final int field34450 = 127;
    public static final int field34451 = 1001;
    public static final int field34452 = 1002;
    public static final int field34453 = 1005;
    public static final int field34454 = 1006;
    
    public static void method28020(final byte[] array, final long n, final byte[] array2, long n2) {
        final int length = array2.length;
        for (int n3 = 0; n3 < n; ++n3, ++n2) {
            array[n3] ^= array2[(int)(n2 % length)];
        }
    }
    
    public static String method28021(final int n) {
        if (n < 1000 || n >= 5000) {
            return "Code must be in range [1000,5000): " + n;
        }
        if ((n < 1004 || n > 1006) && (n < 1012 || n > 2999)) {
            return null;
        }
        return "Code " + n + " is reserved and may not be used.";
    }
    
    public static void method28022(final int n) {
        final String method28021 = method28021(n);
        if (method28021 == null) {
            return;
        }
        throw new IllegalArgumentException(method28021);
    }
    
    public static String method28023(final String str) {
        return Class1929.method7741(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").method7747().method7745();
    }
    
    private Class8402() {
        throw new AssertionError("No instances.");
    }
}
