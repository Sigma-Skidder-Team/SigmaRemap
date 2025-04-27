// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.io.OutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import javax.annotation.Nullable;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import java.io.Serializable;

public class Class1929 implements Serializable, Comparable<Class1929>
{
    public static final char[] field10530;
    private static final long field10531 = 1L;
    public static final Class1929 field10532;
    public final byte[] field10533;
    public transient int field10534;
    public transient String field10535;
    
    public Class1929(final byte[] field10533) {
        this.field10533 = field10533;
    }
    
    public static Class1929 method7738(final byte... array) {
        if (array != null) {
            return new Class1929(array.clone());
        }
        throw new IllegalArgumentException("data == null");
    }
    
    public static Class1929 method7739(final byte[] array, final int n, final int n2) {
        if (array != null) {
            Class9476.method35277(array.length, n, n2);
            final byte[] array2 = new byte[n2];
            System.arraycopy(array, n, array2, 0, n2);
            return new Class1929(array2);
        }
        throw new IllegalArgumentException("data == null");
    }
    
    public static Class1929 method7740(final ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            final byte[] dst = new byte[byteBuffer.remaining()];
            byteBuffer.get(dst);
            return new Class1929(dst);
        }
        throw new IllegalArgumentException("data == null");
    }
    
    public static Class1929 method7741(final String field10535) {
        if (field10535 != null) {
            final Class1929 class1929 = new Class1929(field10535.getBytes(Class9476.field40748));
            class1929.field10535 = field10535;
            return class1929;
        }
        throw new IllegalArgumentException("s == null");
    }
    
    public static Class1929 method7742(final String s, final Charset charset) {
        if (s == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new Class1929(s.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }
    
    public String method7743() {
        final String field10535 = this.field10535;
        return (field10535 == null) ? (this.field10535 = new String(this.field10533, Class9476.field40748)) : field10535;
    }
    
    public String method7744(final Charset charset) {
        if (charset != null) {
            return new String(this.field10533, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }
    
    public String method7745() {
        return Class8319.method27614(this.field10533);
    }
    
    public Class1929 method7746() {
        return this.method7750("MD5");
    }
    
    public Class1929 method7747() {
        return this.method7750("SHA-1");
    }
    
    public Class1929 method7748() {
        return this.method7750("SHA-256");
    }
    
    public Class1929 method7749() {
        return this.method7750("SHA-512");
    }
    
    private Class1929 method7750(final String algorithm) {
        try {
            return method7738(MessageDigest.getInstance(algorithm).digest(this.field10533));
        }
        catch (final NoSuchAlgorithmException detailMessage) {
            throw new AssertionError(detailMessage);
        }
    }
    
    public Class1929 method7751(final Class1929 class1929) {
        return this.method7754("HmacSHA1", class1929);
    }
    
    public Class1929 method7752(final Class1929 class1929) {
        return this.method7754("HmacSHA256", class1929);
    }
    
    public Class1929 method7753(final Class1929 class1929) {
        return this.method7754("HmacSHA512", class1929);
    }
    
    private Class1929 method7754(final String s, final Class1929 class1929) {
        try {
            final Mac instance = Mac.getInstance(s);
            instance.init(new SecretKeySpec(class1929.method7767(), s));
            return method7738(instance.doFinal(this.field10533));
        }
        catch (final NoSuchAlgorithmException detailMessage) {
            throw new AssertionError(detailMessage);
        }
        catch (final InvalidKeyException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    public String method7755() {
        return Class8319.method27615(this.field10533);
    }
    
    @Nullable
    public static Class1929 method7756(final String s) {
        if (s != null) {
            final byte[] method27613 = Class8319.method27613(s);
            return (method27613 == null) ? null : new Class1929(method27613);
        }
        throw new IllegalArgumentException("base64 == null");
    }
    
    public String method7757() {
        final char[] value = new char[this.field10533.length * 2];
        int n = 0;
        for (final byte b : this.field10533) {
            value[n++] = Class1929.field10530[b >> 4 & 0xF];
            value[n++] = Class1929.field10530[b & 0xF];
        }
        return new String(value);
    }
    
    public static Class1929 method7758(final String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 == 0) {
            final byte[] array = new byte[str.length() / 2];
            for (int i = 0; i < array.length; ++i) {
                array[i] = (byte)((method7759(str.charAt(i * 2)) << 4) + method7759(str.charAt(i * 2 + 1)));
            }
            return method7738(array);
        }
        throw new IllegalArgumentException("Unexpected hex string: " + str);
    }
    
    private static int method7759(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        }
        if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }
    
    public static Class1929 method7760(final InputStream inputStream, final int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i >= 0) {
            final byte[] b = new byte[i];
            int read;
            for (int j = 0; j < i; j += read) {
                read = inputStream.read(b, j, i - j);
                if (read == -1) {
                    throw new EOFException();
                }
            }
            return new Class1929(b);
        }
        throw new IllegalArgumentException("byteCount < 0: " + i);
    }
    
    public Class1929 method7761() {
        for (int i = 0; i < this.field10533.length; ++i) {
            final byte b = this.field10533[i];
            if (b >= 65 && b <= 90) {
                final byte[] array = this.field10533.clone();
                array[i++] = (byte)(b + 32);
                while (i < array.length) {
                    final byte b2 = array[i];
                    if (b2 >= 65) {
                        if (b2 <= 90) {
                            array[i] = (byte)(b2 + 32);
                        }
                    }
                    ++i;
                }
                return new Class1929(array);
            }
        }
        return this;
    }
    
    public Class1929 method7762() {
        for (int i = 0; i < this.field10533.length; ++i) {
            final byte b = this.field10533[i];
            if (b >= 97 && b <= 122) {
                final byte[] array = this.field10533.clone();
                array[i++] = (byte)(b - 32);
                while (i < array.length) {
                    final byte b2 = array[i];
                    if (b2 >= 97) {
                        if (b2 <= 122) {
                            array[i] = (byte)(b2 - 32);
                        }
                    }
                    ++i;
                }
                return new Class1929(array);
            }
        }
        return this;
    }
    
    public Class1929 method7763(final int n) {
        return this.method7764(n, this.field10533.length);
    }
    
    public Class1929 method7764(final int n, final int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (n2 > this.field10533.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.field10533.length + ")");
        }
        final int n3 = n2 - n;
        if (n3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (n == 0 && n2 == this.field10533.length) {
            return this;
        }
        final byte[] array = new byte[n3];
        System.arraycopy(this.field10533, n, array, 0, n3);
        return new Class1929(array);
    }
    
    public byte method7765(final int n) {
        return this.field10533[n];
    }
    
    public int method7766() {
        return this.field10533.length;
    }
    
    public byte[] method7767() {
        return this.field10533.clone();
    }
    
    public byte[] method7768() {
        return this.field10533;
    }
    
    public ByteBuffer method7769() {
        return ByteBuffer.wrap(this.field10533).asReadOnlyBuffer();
    }
    
    public void method7770(final OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.field10533);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }
    
    public void method7771(final Class1680 class1680) {
        class1680.method6003(this.field10533, 0, this.field10533.length);
    }
    
    public boolean method7772(final int n, final Class1929 class1929, final int n2, final int n3) {
        return class1929.method7773(n2, this.field10533, n, n3);
    }
    
    public boolean method7773(final int n, final byte[] array, final int n2, final int n3) {
        if (n >= 0) {
            if (n <= this.field10533.length - n3) {
                if (n2 >= 0) {
                    if (n2 <= array.length - n3) {
                        return Class9476.method35283(this.field10533, n, array, n2, n3);
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean method7774(final Class1929 class1929) {
        return this.method7772(0, class1929, 0, class1929.method7766());
    }
    
    public final boolean method7775(final byte[] array) {
        return this.method7773(0, array, 0, array.length);
    }
    
    public final boolean method7776(final Class1929 class1929) {
        return this.method7772(this.method7766() - class1929.method7766(), class1929, 0, class1929.method7766());
    }
    
    public final boolean method7777(final byte[] array) {
        return this.method7773(this.method7766() - array.length, array, 0, array.length);
    }
    
    public final int method7778(final Class1929 class1929) {
        return this.method7781(class1929.method7768(), 0);
    }
    
    public final int method7779(final Class1929 class1929, final int n) {
        return this.method7781(class1929.method7768(), n);
    }
    
    public final int method7780(final byte[] array) {
        return this.method7781(array, 0);
    }
    
    public int method7781(final byte[] array, int a) {
        int i;
        for (a = (i = Math.max(a, 0)); i <= this.field10533.length - array.length; ++i) {
            if (Class9476.method35283(this.field10533, i, array, 0, array.length)) {
                return i;
            }
        }
        return -1;
    }
    
    public final int method7782(final Class1929 class1929) {
        return this.method7785(class1929.method7768(), this.method7766());
    }
    
    public final int method7783(final Class1929 class1929, final int n) {
        return this.method7785(class1929.method7768(), n);
    }
    
    public final int method7784(final byte[] array) {
        return this.method7785(array, this.method7766());
    }
    
    public int method7785(final byte[] array, int a) {
        int i;
        for (a = (i = Math.min(a, this.field10533.length - array.length)); i >= 0; --i) {
            if (Class9476.method35283(this.field10533, i, array, 0, array.length)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof Class1929) {
                if (((Class1929)o).method7766() == this.field10533.length) {
                    return ((Class1929) o).method7773(0, this.field10533, 0, this.field10533.length);
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int field10534 = this.field10534;
        return (field10534 == 0) ? (this.field10534 = Arrays.hashCode(this.field10533)) : field10534;
    }
    
    @Override
    public int compareTo(final Class1929 class1929) {
        final int method7766 = this.method7766();
        final int method7767 = class1929.method7766();
        for (int i = 0; i < Math.min(method7766, method7767); ++i) {
            final int n = this.method7765(i) & 0xFF;
            final int n2 = class1929.method7765(i) & 0xFF;
            if (n != n2) {
                return (n >= n2) ? 1 : -1;
            }
        }
        if (method7766 != method7767) {
            return (method7766 >= method7767) ? 1 : -1;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        if (this.field10533.length == 0) {
            return "[size=0]";
        }
        final String method7743 = this.method7743();
        final int method7744 = method7786(method7743, 64);
        if (method7744 != -1) {
            final String replace = method7743.substring(0, method7744).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            return (method7744 >= method7743.length()) ? ("[text=" + replace + "]") : ("[size=" + this.field10533.length + " text=" + replace + "\u2026]");
        }
        return (this.field10533.length > 64) ? ("[size=" + this.field10533.length + " hex=" + this.method7764(0, 64).method7757() + "\u2026]") : ("[hex=" + this.method7757() + "]");
    }
    
    public static int method7786(final String s, final int n) {
        int i = 0;
        int n2 = 0;
        while (i < s.length()) {
            if (n2 != n) {
                final int codePoint = s.codePointAt(i);
                if (Character.isISOControl(codePoint)) {
                    if (codePoint != 10) {
                        if (codePoint != 13) {
                            return -1;
                        }
                    }
                }
                if (codePoint != 65533) {
                    ++n2;
                    i += Character.charCount(codePoint);
                    continue;
                }
                return -1;
            }
            return i;
        }
        return s.length();
    }
    
    private void method7787(final ObjectInputStream objectInputStream) throws IOException {
        final Class1929 method7760 = method7760(objectInputStream, objectInputStream.readInt());
        try {
            final Field declaredField = Class1929.class.getDeclaredField("data");
            declaredField.setAccessible(true);
            declaredField.set(this, method7760.field10533);
        }
        catch (final NoSuchFieldException ex) {
            throw new AssertionError();
        }
        catch (final IllegalAccessException ex2) {
            throw new AssertionError();
        }
    }
    
    private void method7788(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.field10533.length);
        objectOutputStream.write(this.field10533);
    }
    
    static {
        field10530 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        field10532 = method7738();
    }
}
