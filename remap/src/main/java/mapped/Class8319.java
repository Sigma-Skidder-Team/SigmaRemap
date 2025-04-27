// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public final class Class8319
{
    private static final byte[] field34168;
    private static final byte[] field34169;
    
    private Class8319() {
    }
    
    public static byte[] method27613(final String s) {
        int i;
        for (i = s.length(); i > 0; --i) {
            final char char1 = s.charAt(i - 1);
            if (char1 != '=') {
                if (char1 != '\n') {
                    if (char1 != '\r') {
                        if (char1 != ' ') {
                            if (char1 != '\t') {
                                break;
                            }
                        }
                    }
                }
            }
        }
        final byte[] array = new byte[(int)(i * 6L / 8L)];
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int j = 0;
    Label_0319_Outer:
        while (j < i) {
            final char char2 = s.charAt(j);
            while (true) {
                int n4 = 0;
                Label_0366: {
                    if (char2 >= 'A' && char2 <= 'Z') {
                        n4 = char2 - 'A';
                        break Label_0366;
                    }
                    if (char2 >= 'a' && char2 <= 'z') {
                        n4 = char2 - 'G';
                        break Label_0366;
                    }
                    if (char2 >= '0' && char2 <= '9') {
                        n4 = char2 + '\u0004';
                        break Label_0366;
                    }
                    if (char2 == '+' || char2 == '-') {
                        n4 = 62;
                        break Label_0366;
                    }
                    if (char2 == '/' || char2 == '_') {
                        n4 = 63;
                        break Label_0366;
                    }
                    if (char2 != '\n') {
                        if (char2 != '\r') {
                            if (char2 != ' ') {
                                if (char2 != '\t') {
                                    return null;
                                }
                            }
                        }
                    }
                    ++j;
                    continue Label_0319_Outer;
                }
                n3 = (n3 << 6 | (byte)n4);
                if (++n2 % 4 != 0) {
                    continue;
                }
                array[n++] = (byte)(n3 >> 16);
                array[n++] = (byte)(n3 >> 8);
                array[n++] = (byte)n3;
                continue;
            }
        }
        final int n5 = n2 % 4;
        if (n5 == 1) {
            return null;
        }
        if (n5 != 2) {
            if (n5 == 3) {
                final int n6 = n3 << 6;
                array[n++] = (byte)(n6 >> 16);
                array[n++] = (byte)(n6 >> 8);
            }
        }
        else {
            array[n++] = (byte)(n3 << 12 >> 16);
        }
        if (n != array.length) {
            final byte[] array2 = new byte[n];
            System.arraycopy(array, 0, array2, 0, n);
            return array2;
        }
        return array;
    }
    
    public static String method27614(final byte[] array) {
        return method27616(array, Class8319.field34168);
    }
    
    public static String method27615(final byte[] array) {
        return method27616(array, Class8319.field34169);
    }
    
    private static String method27616(final byte[] array, final byte[] array2) {
        final byte[] bytes = new byte[(array.length + 2) / 3 * 4];
        int n = 0;
        final int n2 = array.length - array.length % 3;
        for (int i = 0; i < n2; i += 3) {
            bytes[n++] = array2[(array[i] & 0xFF) >> 2];
            bytes[n++] = array2[(array[i] & 0x3) << 4 | (array[i + 1] & 0xFF) >> 4];
            bytes[n++] = array2[(array[i + 1] & 0xF) << 2 | (array[i + 2] & 0xFF) >> 6];
            bytes[n++] = array2[array[i + 2] & 0x3F];
        }
        switch (array.length % 3) {
            case 1: {
                bytes[n++] = array2[(array[n2] & 0xFF) >> 2];
                bytes[n++] = array2[(array[n2] & 0x3) << 4];
                bytes[n++] = 61;
                bytes[n++] = 61;
                break;
            }
            case 2: {
                bytes[n++] = array2[(array[n2] & 0xFF) >> 2];
                bytes[n++] = array2[(array[n2] & 0x3) << 4 | (array[n2 + 1] & 0xFF) >> 4];
                bytes[n++] = array2[(array[n2 + 1] & 0xF) << 2];
                bytes[n++] = 61;
                break;
            }
        }
        return new String(bytes, StandardCharsets.US_ASCII);
    }
    
    static {
        field34168 = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        field34169 = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
    }
}
