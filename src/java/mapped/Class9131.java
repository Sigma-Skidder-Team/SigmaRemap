// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.nio.charset.Charset;
import java.io.IOException;
import java.io.EOFException;
import java.io.RandomAccessFile;
import java.io.InputStream;

public class Class9131
{
    public static final int field38695 = 255;
    public static final int field38696 = 65535;
    public static final String field38697 = "UTF-8";
    public static final String field38698 = "UTF-16";
    private static final int field38699 = 65279;
    private final InputStream field38700;
    private final RandomAccessFile field38701;
    private int field38702;
    private long field38703;
    
    public Class9131(final InputStream field38700) {
        this.field38700 = field38700;
        this.field38701 = null;
        this.field38702 = -1;
        this.field38703 = 0L;
    }
    
    public Class9131(final RandomAccessFile field38701) {
        this.field38701 = field38701;
        this.field38700 = null;
        this.field38702 = -1;
    }
    
    public int method33135() throws IOException {
        int n = 0;
        if (this.field38702 < 0) {
            if (this.field38700 == null) {
                if (this.field38701 != null) {
                    n = this.field38701.read();
                }
            }
            else {
                n = this.field38700.read();
            }
        }
        else {
            n = this.field38702;
            this.field38702 = -1;
        }
        if (n != -1) {
            if (this.field38700 != null) {
                ++this.field38703;
            }
            return n;
        }
        throw new EOFException();
    }
    
    public void method33136(final byte[] array, final int n, final int n2) throws IOException {
        int i = 0;
        int n3 = 0;
        if (this.field38702 >= 0) {
            if (n2 > 0) {
                array[n] = (byte)this.field38702;
                this.field38702 = -1;
                ++i;
            }
        }
        while (i < n2) {
            if (this.field38700 == null) {
                if (this.field38701 != null) {
                    n3 = this.field38701.read(array, n + i, n2 - i);
                }
            }
            else {
                n3 = this.field38700.read(array, n + i, n2 - i);
            }
            if (n3 < 0) {
                throw new EOFException();
            }
            i += n3;
        }
        this.field38703 += i;
    }
    
    public long method33137(final int i) throws IOException {
        if (i >= 1 && i <= 8) {
            final byte[] array = new byte[i];
            this.method33136(array, 0, i);
            long n = 0L;
            for (int j = 0; j < i; ++j) {
                n = (n << 8 | (long)(array[j] & 0xFF));
            }
            return n;
        }
        throw new IndexOutOfBoundsException("invalid number of bytes to read: " + i);
    }
    
    public void method33138(final byte[] array) throws IOException {
        this.method33136(array, 0, array.length);
    }
    
    public String method33139(final int n) throws IOException {
        int i = 0;
        final char[] value = new char[n];
        while (i < n) {
            value[i] = (char)this.method33135();
            ++i;
        }
        return new String(value, 0, i);
    }
    
    public String method33140(final int n, final String charsetName) throws IOException {
        return new String(this.method33142(n, 0), Charset.forName(charsetName));
    }
    
    public String method33141(final int n) throws IOException {
        final byte[] array = new byte[2];
        this.method33136(array, 0, 2);
        if (array[0] != 0 && array[1] != 0) {
            final int n2 = array[0] << 8 | array[1];
            final byte[] method33142 = this.method33142(n - 2, 0);
            final byte[] bytes = new byte[method33142.length + array.length];
            System.arraycopy(array, 0, bytes, 0, array.length);
            System.arraycopy(method33142, 0, bytes, array.length, method33142.length);
            return new String(bytes, Charset.forName((n2 != 65279) ? "UTF-8" : "UTF-16"));
        }
        return new String();
    }
    
    public byte[] method33142(final int n, final int n2) throws IOException {
        final byte[] original = new byte[n];
        int newLength = 0;
        int method33135 = 0;
        while (newLength < n && method33135 != -1) {
            method33135 = this.method33135();
            if (method33135 == -1) {
                continue;
            }
            original[newLength++] = (byte)method33135;
        }
        return Arrays.copyOf(original, newLength);
    }
    
    public double method33143(final int n, final int n2) throws IOException {
        final int n3 = n + n2;
        if (n3 % 8 == 0) {
            return this.method33137(n3 / 8) / Math.pow(2.0, n2);
        }
        throw new IllegalArgumentException("number of bits is not a multiple of 8: " + (n + n2));
    }
    
    public void method33144(final long n) throws IOException {
        long n2 = 0L;
        if (this.field38702 >= 0) {
            if (n > 0L) {
                this.field38702 = -1;
                ++n2;
            }
        }
        while (n2 < n) {
            if (this.field38700 == null) {
                if (this.field38701 == null) {
                    continue;
                }
                n2 += this.field38701.skipBytes((int)(n - n2));
            }
            else {
                n2 += this.field38700.skip(n - n2);
            }
        }
        this.field38703 += n2;
    }
    
    public long method33145() throws IOException {
        long n = -1L;
        if (this.field38700 == null) {
            if (this.field38701 != null) {
                n = this.field38701.getFilePointer();
            }
        }
        else {
            n = this.field38703;
        }
        return n;
    }
    
    public long method33146() {
        if (this.field38700 != null) {
            try {
                return this.field38700.available();
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        return 0L;
    }
    
    public void method33147(final long pos) throws IOException {
        if (this.field38701 == null) {
            throw new IOException("could not seek: no random access");
        }
        this.field38701.seek(pos);
    }
    
    public boolean method33148() {
        return this.field38701 != null;
    }
    
    public boolean method33149() throws IOException {
        boolean b;
        if (this.field38701 == null) {
            if (this.field38702 < 0) {
                final int read = this.field38700.read();
                b = (read != -1);
                if (b) {
                    this.field38702 = read;
                }
            }
            else {
                b = true;
            }
        }
        else {
            b = (this.field38701.getFilePointer() < this.field38701.length() - 1L);
        }
        return b;
    }
    
    public void method33150() throws IOException {
        this.field38702 = -1;
        if (this.field38700 == null) {
            if (this.field38701 != null) {
                this.field38701.close();
            }
        }
        else {
            this.field38700.close();
        }
    }
    
    public void method33151() {
        try {
            if (this.field38700 != null) {
                this.field38700.reset();
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        this.field38703 = 0L;
        this.field38702 = -1;
    }
}
