// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;

public class Class6901
{
    private static String[] field27053;
    private static final byte[] field27054;
    
    public static byte[] method21247(final byte[] buf) {
        final ByteArrayInputStream in = new ByteArrayInputStream(buf);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final PushbackInputStream pushbackInputStream = new PushbackInputStream(in);
        try {
            while (true) {
                int n;
                for (n = 0; n + 4 < 72; n += 4) {
                    method21248(pushbackInputStream, byteArrayOutputStream, 4);
                }
                if (n + 4 == 72) {
                    method21248(pushbackInputStream, byteArrayOutputStream, 4);
                }
                else {
                    method21248(pushbackInputStream, byteArrayOutputStream, 72 - n);
                }
            }
        }
        catch (final IOException ex) {
            return byteArrayOutputStream.toByteArray();
        }
    }
    
    private static void method21248(final InputStream inputStream, final OutputStream outputStream, int n) throws IOException {
        if (n < 2) {
            throw new IOException();
        }
        int read;
        do {
            read = inputStream.read();
            if (read == -1) {
                throw new IOException();
            }
        } while (read == 10 || read == 13);
        final byte[] array = new byte[4];
        array[0] = (byte)read;
        if (method21249(inputStream, array, 1, n - 1) == -1) {
            throw new IOException();
        }
        if (n > 3 && array[3] == 61) {
            n = 3;
        }
        if (n > 2 && array[2] == 61) {
            n = 2;
        }
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        int n5 = -1;
        switch (n) {
            case 4: {
                n5 = Class6901.field27054[array[3] & 0xFF];
            }
            case 3: {
                n4 = Class6901.field27054[array[2] & 0xFF];
            }
            case 2: {
                n3 = Class6901.field27054[array[1] & 0xFF];
                n2 = Class6901.field27054[array[0] & 0xFF];
                break;
            }
        }
        switch (n) {
            case 2: {
                outputStream.write((byte)((n2 << 2 & 0xFC) | (n3 >>> 4 & 0x3)));
                break;
            }
            case 3: {
                outputStream.write((byte)((n2 << 2 & 0xFC) | (n3 >>> 4 & 0x3)));
                outputStream.write((byte)((n3 << 4 & 0xF0) | (n4 >>> 2 & 0xF)));
                break;
            }
            case 4: {
                outputStream.write((byte)((n2 << 2 & 0xFC) | (n3 >>> 4 & 0x3)));
                outputStream.write((byte)((n3 << 4 & 0xF0) | (n4 >>> 2 & 0xF)));
                outputStream.write((byte)((n4 << 6 & 0xC0) | (n5 & 0x3F)));
                break;
            }
        }
    }
    
    private static int method21249(final InputStream inputStream, final byte[] array, final int n, final int n2) throws IOException {
        for (int i = 0; i < n2; ++i) {
            final int read = inputStream.read();
            if (read == -1) {
                return (i != 0) ? i : -1;
            }
            array[i + n] = (byte)read;
        }
        return n2;
    }
    
    static {
        field27054 = new byte[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 };
    }
}
