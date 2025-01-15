// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.Closeable;
import java.io.IOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Class8268
{
    public static final String field33948 = "publicsuffixes.gz";
    private static final byte[] field33949;
    private static final String[] field33950;
    private static final String[] field33951;
    private static final byte field33952 = 33;
    private static final Class8268 field33953;
    private final AtomicBoolean field33954;
    private final CountDownLatch field33955;
    private byte[] field33956;
    private byte[] field33957;
    
    public Class8268() {
        this.field33954 = new AtomicBoolean(false);
        this.field33955 = new CountDownLatch(1);
    }
    
    public static Class8268 method27453() {
        return Class8268.field33953;
    }
    
    public String method27454(final String input) {
        if (input == null) {
            throw new NullPointerException("domain == null");
        }
        final String[] split = IDN.toUnicode(input).split("\\.");
        final String[] method27455 = this.method27455(split);
        if (split.length == method27455.length && method27455[0].charAt(0) != '!') {
            return null;
        }
        int n;
        if (method27455[0].charAt(0) != '!') {
            n = split.length - (method27455.length + 1);
        }
        else {
            n = split.length - method27455.length;
        }
        final StringBuilder sb = new StringBuilder();
        final String[] split2 = input.split("\\.");
        for (int i = n; i < split2.length; ++i) {
            sb.append(split2[i]).append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
    private String[] method27455(final String[] array) {
        if (!this.field33954.get() && this.field33954.compareAndSet(false, true)) {
            this.method27457();
        }
        else {
            try {
                this.field33955.await();
            }
            catch (final InterruptedException ex) {}
        }
        synchronized (this) {
            if (this.field33956 == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        final byte[][] array2 = new byte[array.length][];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i].getBytes(Class7690.field30549);
        }
        String s = null;
        for (int j = 0; j < array2.length; ++j) {
            final String method27456 = method27456(this.field33956, array2, j);
            if (method27456 != null) {
                s = method27456;
                break;
            }
        }
        String s2 = null;
        if (array2.length > 1) {
            final byte[][] array3 = array2.clone();
            for (int k = 0; k < array3.length - 1; ++k) {
                array3[k] = Class8268.field33949;
                final String method27457 = method27456(this.field33956, array3, k);
                if (method27457 != null) {
                    s2 = method27457;
                    break;
                }
            }
        }
        String str = null;
        if (s2 != null) {
            for (int l = 0; l < array2.length - 1; ++l) {
                final String method27458 = method27456(this.field33957, array2, l);
                if (method27458 != null) {
                    str = method27458;
                    break;
                }
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (s == null && s2 == null) {
            return Class8268.field33951;
        }
        final String[] array4 = (s != null) ? s.split("\\.") : Class8268.field33950;
        final String[] array5 = (s2 != null) ? s2.split("\\.") : Class8268.field33950;
        return (array4.length > array5.length) ? array4 : array5;
    }
    
    private static String method27456(final byte[] bytes, final byte[][] array, final int n) {
        int i = 0;
        int length = bytes.length;
        String s = null;
        while (i < length) {
            int offset;
            for (offset = (i + length) / 2; offset > -1 && bytes[offset] != 10; --offset) {}
            ++offset;
            int n2;
            for (n2 = 1; bytes[offset + n2] != 10; ++n2) {}
            final int length2 = offset + n2 - offset;
            int n3 = n;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n8;
            while (true) {
                int n7;
                if (n6 == 0) {
                    n7 = (array[n3][n4] & 0xFF);
                }
                else {
                    n7 = 46;
                    n6 = 0;
                }
                n8 = n7 - (bytes[offset + n5] & 0xFF);
                if (n8 != 0) {
                    break;
                }
                ++n5;
                ++n4;
                if (n5 == length2) {
                    break;
                }
                if (array[n3].length != n4) {
                    continue;
                }
                if (n3 == array.length - 1) {
                    break;
                }
                ++n3;
                n4 = -1;
                n6 = 1;
            }
            if (n8 >= 0) {
                if (n8 <= 0) {
                    final int n9 = length2 - n5;
                    int n10 = array[n3].length - n4;
                    for (int j = n3 + 1; j < array.length; ++j) {
                        n10 += array[j].length;
                    }
                    if (n10 >= n9) {
                        if (n10 <= n9) {
                            s = new String(bytes, offset, length2, Class7690.field30549);
                            break;
                        }
                        i = offset + n2 + 1;
                    }
                    else {
                        length = offset - 1;
                    }
                }
                else {
                    i = offset + n2 + 1;
                }
            }
            else {
                length = offset - 1;
            }
        }
        return s;
    }
    
    private void method27457() {
        byte[] field33956 = null;
        byte[] field33957 = null;
        final InputStream resourceAsStream = Class8268.class.getClassLoader().getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            final Class1681 method30275 = Class8753.method30275(new Class1684(Class8753.method30280(resourceAsStream)));
            try {
                field33956 = new byte[method30275.method5967()];
                method30275.method5992(field33956);
                field33957 = new byte[method30275.method5967()];
                method30275.method5992(field33957);
            }
            catch (final IOException ex) {
                Class6550.method19842().method19846(5, "Failed to read public suffix list", ex);
                field33956 = null;
                field33957 = null;
            }
            finally {
                Class7690.method24432(method30275);
            }
        }
        synchronized (this) {
            this.field33956 = field33956;
            this.field33957 = field33957;
        }
        this.field33955.countDown();
    }
    
    public void method27458(final byte[] field33956, final byte[] field33957) {
        this.field33956 = field33956;
        this.field33957 = field33957;
        this.field33954.set(true);
        this.field33955.countDown();
    }
    
    static {
        field33949 = new byte[] { 42 };
        field33950 = new String[0];
        field33951 = new String[] { "*" };
        field33953 = new Class8268();
    }
}
