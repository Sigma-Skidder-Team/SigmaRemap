// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import javax.annotation.Nullable;
import java.nio.charset.Charset;
import java.io.EOFException;
import java.io.IOException;

public final class Class1700 implements Class1681
{
    public final Class1680 field9576;
    public final Class1682 field9577;
    public boolean field9578;
    
    public Class1700(final Class1682 field9577) {
        this.field9576 = new Class1680();
        if (field9577 != null) {
            this.field9577 = field9577;
            return;
        }
        throw new NullPointerException("source == null");
    }
    
    @Override
    public Class1680 method5926() {
        return this.field9576;
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long n) throws IOException {
        if (class1680 == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        if (this.field9578) {
            throw new IllegalStateException("closed");
        }
        if (this.field9576.field9512 == 0L && this.field9577.method6014(this.field9576, 8192L) == -1L) {
            return -1L;
        }
        return this.field9576.method6014(class1680, Math.min(n, this.field9576.field9512));
    }
    
    @Override
    public boolean method5951() throws IOException {
        if (!this.field9578) {
            return this.field9576.method5951() && this.field9577.method6014(this.field9576, 8192L) == -1L;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public void method5952(final long n) throws IOException {
        if (this.method5953(n)) {
            return;
        }
        throw new EOFException();
    }
    
    @Override
    public boolean method5953(final long lng) throws IOException {
        if (lng < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + lng);
        }
        if (!this.field9578) {
            while (this.field9576.field9512 < lng) {
                if (this.field9577.method6014(this.field9576, 8192L) != -1L) {
                    continue;
                }
                return false;
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public byte method5964() throws IOException {
        this.method5952(1L);
        return this.field9576.method5964();
    }
    
    @Override
    public Class1929 method5974() throws IOException {
        this.field9576.method5930(this.field9577);
        return this.field9576.method5974();
    }
    
    @Override
    public Class1929 method5975(final long n) throws IOException {
        this.method5952(n);
        return this.field9576.method5975(n);
    }
    
    @Override
    public int method5976(final Class54 class54) throws IOException {
        if (this.field9578) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            final int method5977 = this.field9576.method5977(class54);
            if (method5977 == -1) {
                return -1;
            }
            final int method5978 = class54.field135[method5977].method7766();
            if (method5978 <= this.field9576.field9512) {
                this.field9576.method5995(method5978);
                return method5977;
            }
            if (this.field9577.method6014(this.field9576, 8192L) != -1L) {
                continue;
            }
            return -1;
        }
    }
    
    @Override
    public byte[] method5989() throws IOException {
        this.field9576.method5930(this.field9577);
        return this.field9576.method5989();
    }
    
    @Override
    public byte[] method5990(final long n) throws IOException {
        this.method5952(n);
        return this.field9576.method5990(n);
    }
    
    @Override
    public int method5991(final byte[] array) throws IOException {
        return this.method5993(array, 0, array.length);
    }
    
    @Override
    public void method5992(final byte[] array) throws IOException {
        try {
            this.method5952(array.length);
        }
        catch (final EOFException ex) {
            int n = 0;
            while (this.field9576.field9512 > 0L) {
                final int method5993 = this.field9576.method5993(array, n, (int)this.field9576.field9512);
                if (method5993 == -1) {
                    throw new AssertionError();
                }
                n += method5993;
            }
            throw ex;
        }
        this.field9576.method5992(array);
    }
    
    @Override
    public int method5993(final byte[] array, final int n, final int n2) throws IOException {
        Class9476.method35277(array.length, n, n2);
        if (this.field9576.field9512 == 0L && this.field9577.method6014(this.field9576, 8192L) == -1L) {
            return -1;
        }
        return this.field9576.method5993(array, n, (int)Math.min(n2, this.field9576.field9512));
    }
    
    @Override
    public void method5978(final Class1680 class1680, final long n) throws IOException {
        try {
            this.method5952(n);
        }
        catch (final EOFException ex) {
            class1680.method5930(this.field9576);
            throw ex;
        }
        this.field9576.method5978(class1680, n);
    }
    
    @Override
    public long method5979(final Class1676 class1676) throws IOException {
        if (class1676 != null) {
            long n = 0L;
            while (this.field9577.method6014(this.field9576, 8192L) != -1L) {
                final long method5963 = this.field9576.method5963();
                if (method5963 <= 0L) {
                    continue;
                }
                n += method5963;
                class1676.method5920(this.field9576, method5963);
            }
            if (this.field9576.method5949() > 0L) {
                n += this.field9576.method5949();
                class1676.method5920(this.field9576, this.field9576.method5949());
            }
            return n;
        }
        throw new IllegalArgumentException("sink == null");
    }
    
    @Override
    public String method5980() throws IOException {
        this.field9576.method5930(this.field9577);
        return this.field9576.method5980();
    }
    
    @Override
    public String method5981(final long n) throws IOException {
        this.method5952(n);
        return this.field9576.method5981(n);
    }
    
    @Override
    public String method5982(final Charset charset) throws IOException {
        if (charset != null) {
            this.field9576.method5930(this.field9577);
            return this.field9576.method5982(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }
    
    @Override
    public String method5983(final long n, final Charset charset) throws IOException {
        this.method5952(n);
        if (charset != null) {
            return this.field9576.method5983(n, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }
    
    @Nullable
    @Override
    public String method5984() throws IOException {
        final long method6015 = this.method6015((byte)10);
        if (method6015 != -1L) {
            return this.field9576.method5987(method6015);
        }
        return (this.field9576.field9512 == 0L) ? null : this.method5981(this.field9576.field9512);
    }
    
    @Override
    public String method5985() throws IOException {
        return this.method5986(Long.MAX_VALUE);
    }
    
    @Override
    public String method5986(final long n) throws IOException {
        if (n < 0L) {
            throw new IllegalArgumentException("limit < 0: " + n);
        }
        final long n2 = (n != Long.MAX_VALUE) ? (n + 1L) : Long.MAX_VALUE;
        final long method6017 = this.method6017((byte)10, 0L, n2);
        if (method6017 == -1L) {
            if (n2 < Long.MAX_VALUE) {
                if (this.method5953(n2)) {
                    if (this.field9576.method5965(n2 - 1L) == 13) {
                        if (this.method5953(n2 + 1L)) {
                            if (this.field9576.method5965(n2) == 10) {
                                return this.field9576.method5987(n2);
                            }
                        }
                    }
                }
            }
            final Class1680 class1680 = new Class1680();
            this.field9576.method5957(class1680, 0L, Math.min(32L, this.field9576.method5949()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.field9576.method5949(), n) + " content=" + class1680.method5974().method7757() + '\u2026');
        }
        return this.field9576.method5987(method6017);
    }
    
    @Override
    public int method5988() throws IOException {
        this.method5952(1L);
        final byte method5965 = this.field9576.method5965(0L);
        if ((method5965 & 0xE0) != 0xC0) {
            if ((method5965 & 0xF0) != 0xE0) {
                if ((method5965 & 0xF8) == 0xF0) {
                    this.method5952(4L);
                }
            }
            else {
                this.method5952(3L);
            }
        }
        else {
            this.method5952(2L);
        }
        return this.field9576.method5988();
    }
    
    @Override
    public short method5966() throws IOException {
        this.method5952(2L);
        return this.field9576.method5966();
    }
    
    @Override
    public short method5969() throws IOException {
        this.method5952(2L);
        return this.field9576.method5969();
    }
    
    @Override
    public int method5967() throws IOException {
        this.method5952(4L);
        return this.field9576.method5967();
    }
    
    @Override
    public int method5970() throws IOException {
        this.method5952(4L);
        return this.field9576.method5970();
    }
    
    @Override
    public long method5968() throws IOException {
        this.method5952(8L);
        return this.field9576.method5968();
    }
    
    @Override
    public long method5971() throws IOException {
        this.method5952(8L);
        return this.field9576.method5971();
    }
    
    @Override
    public long method5972() throws IOException {
        this.method5952(1L);
        int n = 0;
        while (this.method5953(n + 1)) {
            final byte method5965 = this.field9576.method5965(n);
            if ((method5965 < 48 || method5965 > 57) && (n != 0 || method5965 != 45)) {
                if (n != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", method5965));
            }
            else {
                ++n;
            }
        }
        return this.field9576.method5972();
    }
    
    @Override
    public long method5973() throws IOException {
        this.method5952(1L);
        for (int n = 0; this.method5953(n + 1); ++n) {
            final byte method5965 = this.field9576.method5965(n);
            if (method5965 < 48 || method5965 > 57) {
                if (method5965 < 97 || method5965 > 102) {
                    if (method5965 < 65 || method5965 > 70) {
                        if (n != 0) {
                            break;
                        }
                        throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", method5965));
                    }
                }
            }
        }
        return this.field9576.method5973();
    }
    
    @Override
    public void method5995(long a) throws IOException {
        if (!this.field9578) {
            while (a > 0L) {
                if (this.field9576.field9512 == 0L && this.field9577.method6014(this.field9576, 8192L) == -1L) {
                    throw new EOFException();
                }
                final long min = Math.min(a, this.field9576.method5949());
                this.field9576.method5995(min);
                a -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public long method6015(final byte b) throws IOException {
        return this.method6017(b, 0L, Long.MAX_VALUE);
    }
    
    @Override
    public long method6016(final byte b, final long n) throws IOException {
        return this.method6017(b, n, Long.MAX_VALUE);
    }
    
    @Override
    public long method6017(final byte b, long max, final long l) throws IOException {
        if (this.field9578) {
            throw new IllegalStateException("closed");
        }
        if (max >= 0L && l >= max) {
            while (max < l) {
                final long method6017 = this.field9576.method6017(b, max, l);
                if (method6017 != -1L) {
                    return method6017;
                }
                final long field9512 = this.field9576.field9512;
                if (field9512 >= l || this.field9577.method6014(this.field9576, 8192L) == -1L) {
                    return -1L;
                }
                max = Math.max(max, field9512);
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", max, l));
    }
    
    @Override
    public long method6018(final Class1929 class1929) throws IOException {
        return this.method6019(class1929, 0L);
    }
    
    @Override
    public long method6019(final Class1929 class1929, long max) throws IOException {
        if (this.field9578) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            final long method6019 = this.field9576.method6019(class1929, max);
            if (method6019 != -1L) {
                return method6019;
            }
            final long field9512 = this.field9576.field9512;
            if (this.field9577.method6014(this.field9576, 8192L) == -1L) {
                return -1L;
            }
            max = Math.max(max, field9512 - class1929.method7766() + 1L);
        }
    }
    
    @Override
    public long method6020(final Class1929 class1929) throws IOException {
        return this.method6021(class1929, 0L);
    }
    
    @Override
    public long method6021(final Class1929 class1929, long max) throws IOException {
        if (this.field9578) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            final long method6021 = this.field9576.method6021(class1929, max);
            if (method6021 != -1L) {
                return method6021;
            }
            final long field9512 = this.field9576.field9512;
            if (this.field9577.method6014(this.field9576, 8192L) == -1L) {
                return -1L;
            }
            max = Math.max(max, field9512);
        }
    }
    
    @Override
    public boolean method6022(final long n, final Class1929 class1929) throws IOException {
        return this.method6023(n, class1929, 0, class1929.method7766());
    }
    
    @Override
    public boolean method6023(final long n, final Class1929 class1929, final int n2, final int n3) throws IOException {
        if (!this.field9578) {
            if (n >= 0L) {
                if (n2 >= 0) {
                    if (n3 >= 0) {
                        if (class1929.method7766() - n2 >= n3) {
                            for (int i = 0; i < n3; ++i) {
                                final long n4 = n + i;
                                if (!this.method5953(n4 + 1L)) {
                                    return false;
                                }
                                if (this.field9576.method5965(n4) != class1929.method7765(n2 + i)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public InputStream method5954() {
        return new Class1752(this);
    }
    
    @Override
    public void close() throws IOException {
        if (!this.field9578) {
            this.field9578 = true;
            this.field9577.close();
            this.field9576.method5994();
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9577.method5921();
    }
    
    @Override
    public String toString() {
        return "buffer(" + this.field9577 + ")";
    }
}
