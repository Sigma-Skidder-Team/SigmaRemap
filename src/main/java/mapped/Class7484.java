// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7484
{
    private static final String field28907;
    private static char[] field28908;
    private static byte[] field28909;
    
    public static String method23156(final String s) {
        return new String(method23159(s.getBytes()));
    }
    
    public static String method23157(final byte[] array) {
        return method23158(array, 0, array.length, 76, Class7484.field28907);
    }
    
    public static String method23158(final byte[] array, final int n, final int n2, final int n3, final String str) {
        final int b = n3 * 3 / 4;
        if (b > 0) {
            final StringBuilder sb = new StringBuilder((n2 + 2) / 3 * 4 + (n2 + b - 1) / b * str.length());
            int min;
            for (int i = 0; i < n2; i += min) {
                min = Math.min(n2 - i, b);
                sb.append(method23161(array, n + i, min));
                sb.append(str);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException();
    }
    
    public static char[] method23159(final byte[] array) {
        return method23161(array, 0, array.length);
    }
    
    public static char[] method23160(final byte[] array, final int n) {
        return method23161(array, 0, n);
    }
    
    public static char[] method23161(final byte[] array, final int n, final int n2) {
        final int n3 = (n2 * 4 + 2) / 3;
        final char[] array2 = new char[(n2 + 2) / 3 * 4];
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        for (int i = n, n4 = n + n2, n5 = 0; i < n4; n6 = (array[i++] & 0xFF), n7 = ((i >= n4) ? 0 : (array[i++] & 0xFF)), n8 = ((i >= n4) ? 0 : (array[i++] & 0xFF)), n9 = n6 >>> 2, n10 = ((n6 & 0x3) << 4 | n7 >>> 4), n11 = ((n7 & 0xF) << 2 | n8 >>> 6), n12 = (n8 & 0x3F), array2[n5++] = Class7484.field28908[n9], array2[n5++] = Class7484.field28908[n10], array2[n5] = ((n5 >= n3) ? '=' : Class7484.field28908[n11]), ++n5, array2[n5] = ((n5 >= n3) ? '=' : Class7484.field28908[n12]), ++n5) {}
        return array2;
    }
    
    public static String method23162(final String s) {
        return new String(method23164(s));
    }
    
    public static byte[] method23163(final String s) {
        final char[] array = new char[s.length()];
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 != ' ') {
                if (char1 != '\r') {
                    if (char1 != '\n') {
                        if (char1 != '\t') {
                            array[n++] = char1;
                        }
                    }
                }
            }
        }
        return method23166(array, 0, n);
    }
    
    public static byte[] method23164(final String s) {
        return method23165(s.toCharArray());
    }
    
    public static byte[] method23165(final char[] array) {
        return method23166(array, 0, array.length);
    }
    
    public static byte[] method23166(final char[] array, final int n, int n2) {
        if (n2 % 4 == 0) {
            while (n2 > 0 && array[n + n2 - 1] == '=') {
                --n2;
            }
            final int n3 = n2 * 3 / 4;
            final byte[] array2 = new byte[n3];
            int i = n;
            final int n4 = n + n2;
            int n5 = 0;
            while (i < n4) {
                final char c = array[i++];
                final char c2 = array[i++];
                final char c3 = (i >= n4) ? 'A' : array[i++];
                final char c4 = (i >= n4) ? 'A' : array[i++];
                if (c <= '\u007f') {
                    if (c2 <= '\u007f') {
                        if (c3 <= '\u007f') {
                            if (c4 <= '\u007f') {
                                final byte b = Class7484.field28909[c];
                                final byte b2 = Class7484.field28909[c2];
                                final byte b3 = Class7484.field28909[c3];
                                final byte b4 = Class7484.field28909[c4];
                                if (b >= 0) {
                                    if (b2 >= 0) {
                                        if (b3 >= 0) {
                                            if (b4 >= 0) {
                                                final int n6 = b << 2 | b2 >>> 4;
                                                final int n7 = (b2 & 0xF) << 4 | b3 >>> 2;
                                                final int n8 = (b3 & 0x3) << 6 | b4;
                                                array2[n5++] = (byte)n6;
                                                if (n5 < n3) {
                                                    array2[n5++] = (byte)n7;
                                                }
                                                if (n5 >= n3) {
                                                    continue;
                                                }
                                                array2[n5++] = (byte)n8;
                                                continue;
                                            }
                                        }
                                    }
                                }
                                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                            }
                        }
                    }
                }
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            return array2;
        }
        throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
    }
    
    private Class7484() {
    }
    
    static {
        field28907 = System.getProperty("line.separator");
        Class7484.field28908 = new char[64];
        int n = 0;
        for (char c = 'A'; c <= 'Z'; ++c) {
            Class7484.field28908[n++] = c;
        }
        for (char c2 = 'a'; c2 <= 'z'; ++c2) {
            Class7484.field28908[n++] = c2;
        }
        for (char c3 = '0'; c3 <= '9'; ++c3) {
            Class7484.field28908[n++] = c3;
        }
        Class7484.field28908[n++] = '+';
        Class7484.field28908[n++] = '/';
        Class7484.field28909 = new byte[128];
        for (int i = 0; i < Class7484.field28909.length; ++i) {
            Class7484.field28909[i] = -1;
        }
        for (int j = 0; j < 64; ++j) {
            Class7484.field28909[Class7484.field28908[j]] = (byte)j;
        }
    }
}
