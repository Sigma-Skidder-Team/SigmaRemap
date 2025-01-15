// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.StandardCharsets;

public class Class8277
{
    public static final char[] field34059;
    
    public static String method27512(final byte[] bytes, final int offset, final int n) {
        int n2;
        int n3;
        for (n2 = n - 1, n3 = ((offset <= n2) ? offset : n2); 0 != bytes[n3] && n3 < n2; ++n3) {}
        return new String(bytes, offset, n3 - offset, StandardCharsets.UTF_8);
    }
    
    public static int method27513(final byte[] array, final int n) {
        return method27514(array, n, array.length);
    }
    
    public static int method27514(final byte[] array, final int n, final int n2) {
        return (0 <= n2 - n - 4) ? (array[n + 3] << 24 | (array[n + 2] & 0xFF) << 16 | (array[n + 1] & 0xFF) << 8 | (array[n] & 0xFF)) : 0;
    }
    
    public static int method27515(final byte[] array, final int n, final int n2) {
        return (0 <= n2 - n - 4) ? (array[n] << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8 | (array[n + 3] & 0xFF)) : 0;
    }
    
    public static String method27516(final byte b) {
        return "" + Class8277.field34059[(b & 0xF0) >>> 4] + Class8277.field34059[b & 0xF];
    }
    
    static {
        field34059 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
}
