// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.IOException;

public class Class7447
{
    public static final int field28723 = 0;
    public static final int field28724 = 1;
    public static final int field28725 = 2;
    public static final int field28726 = 8;
    public static final int field28727 = 16;
    public static final int field28728 = 32;
    private static final int field28729 = 76;
    private static final byte field28730 = 61;
    private static final byte field28731 = 10;
    private static final String field28732 = "US-ASCII";
    private static final byte field28733 = -5;
    private static final byte[] field28734;
    private static final byte[] field28735;
    private static final byte[] field28736;
    private static final byte[] field28737;
    private static final byte[] field28738;
    private static final byte[] field28739;
    public static final /* synthetic */ boolean field28740;
    
    private static final byte[] method22899(final int n) {
        if ((n & 0x10) == 0x10) {
            return Class7447.field28736;
        }
        if ((n & 0x20) != 0x20) {
            return Class7447.field28734;
        }
        return Class7447.field28738;
    }
    
    private static final byte[] method22900(final int n) {
        if ((n & 0x10) == 0x10) {
            return Class7447.field28737;
        }
        if ((n & 0x20) != 0x20) {
            return Class7447.field28735;
        }
        return Class7447.field28739;
    }
    
    private Class7447() {
    }
    
    private static byte[] method22901(final byte[] array, final byte[] array2, final int n, final int n2) {
        method22902(array2, 0, n, array, 0, n2);
        return array;
    }
    
    private static byte[] method22902(final byte[] array, final int n, final int n2, final byte[] array2, final int n3, final int n4) {
        final byte[] method22899 = method22899(n4);
        final int n5 = ((n2 > 0) ? (array[n] << 24 >>> 8) : 0) | ((n2 > 1) ? (array[n + 1] << 24 >>> 16) : 0) | ((n2 > 2) ? (array[n + 2] << 24 >>> 24) : 0);
        switch (n2) {
            case 3: {
                array2[n3] = method22899[n5 >>> 18];
                array2[n3 + 1] = method22899[n5 >>> 12 & 0x3F];
                array2[n3 + 2] = method22899[n5 >>> 6 & 0x3F];
                array2[n3 + 3] = method22899[n5 & 0x3F];
                return array2;
            }
            case 2: {
                array2[n3] = method22899[n5 >>> 18];
                array2[n3 + 1] = method22899[n5 >>> 12 & 0x3F];
                array2[n3 + 2] = method22899[n5 >>> 6 & 0x3F];
                array2[n3 + 3] = 61;
                return array2;
            }
            case 1: {
                array2[n3] = method22899[n5 >>> 18];
                array2[n3 + 1] = method22899[n5 >>> 12 & 0x3F];
                array2[n3 + 3] = (array2[n3 + 2] = 61);
                return array2;
            }
            default: {
                return array2;
            }
        }
    }
    
    public static String method22903(final byte[] array) {
        String method22904 = null;
        try {
            method22904 = method22904(array, 0, array.length, 0);
        }
        catch (final IOException ex) {
            if (!Class7447.field28740) {
                throw new AssertionError((Object)ex.getMessage());
            }
        }
        if (!Class7447.field28740 && method22904 == null) {
            throw new AssertionError();
        }
        return method22904;
    }
    
    public static String method22904(final byte[] array, final int n, final int n2, final int n3) throws IOException {
        final byte[] method22905 = method22905(array, n, n2, n3);
        try {
            return new String(method22905, "US-ASCII");
        }
        catch (final UnsupportedEncodingException ex) {
            return new String(method22905);
        }
    }
    
    public static byte[] method22905(final byte[] buf, final int off, final int len, final int n) throws IOException {
        if (buf == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (off < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + off);
        }
        if (len < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + len);
        }
        if (off + len > buf.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", off, len, buf.length));
        }
        if ((n & 0x2) != 0x0) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            GZIPOutputStream gzipOutputStream = null;
            Class1718 out = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                out = new Class1718(byteArrayOutputStream, 0x1 | n);
                gzipOutputStream = new GZIPOutputStream(out);
                gzipOutputStream.write(buf, off, len);
                gzipOutputStream.close();
                try {
                    if (gzipOutputStream != null) {
                        gzipOutputStream.close();
                    }
                }
                catch (final Exception ex) {}
                try {
                    if (out != null) {
                        out.close();
                    }
                }
                catch (final Exception ex2) {}
                try {
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    return byteArrayOutputStream.toByteArray();
                }
                catch (final Exception ex3) {
                    return byteArrayOutputStream.toByteArray();
                }
            }
            catch (final IOException ex4) {
                throw ex4;
            }
            finally {
                try {
                    if (gzipOutputStream != null) {
                        gzipOutputStream.close();
                    }
                }
                catch (final Exception ex5) {}
                try {
                    if (out != null) {
                        out.close();
                    }
                }
                catch (final Exception ex6) {}
                try {
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                }
                catch (final Exception ex7) {}
            }
            return byteArrayOutputStream.toByteArray();
        }
        final boolean b = (n & 0x8) != 0x0;
        int n2 = len / 3 * 4 + ((len % 3 > 0) ? 4 : 0);
        if (b) {
            n2 += n2 / 76;
        }
        final byte[] array = new byte[n2];
        int i = 0;
        int n3 = 0;
        final int n4 = len - 2;
        int n5 = 0;
        while (i < n4) {
            method22902(buf, i + off, 3, array, n3, n);
            n5 += 4;
            if (b && n5 >= 76) {
                array[n3 + 4] = 10;
                ++n3;
                n5 = 0;
            }
            i += 3;
            n3 += 4;
        }
        if (i < len) {
            method22902(buf, i + off, len - i, array, n3, n);
            n3 += 4;
        }
        if (n3 <= array.length - 1) {
            final byte[] array2 = new byte[n3];
            System.arraycopy(array, 0, array2, 0, n3);
            return array2;
        }
        return array;
    }
    
    private static int method22906(final byte[] array, final int i, final byte[] array2, final int j, final int n) {
        if (array == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (array2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        }
        if (i < 0 || i + 3 >= array.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", array.length, i));
        }
        if (j < 0 || j + 2 >= array2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", array2.length, j));
        }
        final byte[] method22900 = method22900(n);
        if (array[i + 2] == 61) {
            array2[j] = (byte)(((method22900[array[i]] & 0xFF) << 18 | (method22900[array[i + 1]] & 0xFF) << 12) >>> 16);
            return 1;
        }
        if (array[i + 3] != 61) {
            final int n2 = (method22900[array[i]] & 0xFF) << 18 | (method22900[array[i + 1]] & 0xFF) << 12 | (method22900[array[i + 2]] & 0xFF) << 6 | (method22900[array[i + 3]] & 0xFF);
            array2[j] = (byte)(n2 >> 16);
            array2[j + 1] = (byte)(n2 >> 8);
            array2[j + 2] = (byte)n2;
            return 3;
        }
        final int n3 = (method22900[array[i]] & 0xFF) << 18 | (method22900[array[i + 1]] & 0xFF) << 12 | (method22900[array[i + 2]] & 0xFF) << 6;
        array2[j] = (byte)(n3 >>> 16);
        array2[j + 1] = (byte)(n3 >>> 8);
        return 2;
    }
    
    static {
        field28740 = !Class7447.class.desiredAssertionStatus();
        field28734 = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        field28735 = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
        field28736 = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
        field28737 = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
        field28738 = new byte[] { 45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };
        field28739 = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9 };
    }
}
