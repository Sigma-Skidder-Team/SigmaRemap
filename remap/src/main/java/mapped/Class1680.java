// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import java.nio.charset.Charset;
import java.io.IOException;
import java.io.InputStream;
import java.io.EOFException;
import java.io.OutputStream;

public final class Class1680 implements Class1681, Class1679, Cloneable
{
    private static final byte[] field9509;
    public static final int field9510 = 65533;
    public Class9258 field9511;
    public long field9512;
    
    public long method5949() {
        return this.field9512;
    }
    
    @Override
    public Class1680 method5926() {
        return this;
    }
    
    @Override
    public OutputStream method5948() {
        return new Class1717(this);
    }
    
    public Class1680 method5950() {
        return this;
    }
    
    @Override
    public Class1679 method5946() {
        return this;
    }
    
    @Override
    public boolean method5951() {
        return this.field9512 == 0L;
    }
    
    @Override
    public void method5952(final long n) throws EOFException {
        if (this.field9512 >= n) {
            return;
        }
        throw new EOFException();
    }
    
    @Override
    public boolean method5953(final long n) {
        return this.field9512 >= n;
    }
    
    @Override
    public InputStream method5954() {
        return new Class1751(this);
    }
    
    public Class1680 method5955(final OutputStream outputStream) throws IOException {
        return this.method5956(outputStream, 0L, this.field9512);
    }
    
    public Class1680 method5956(final OutputStream outputStream, long n, long b) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        Class9476.method35277(this.field9512, n, b);
        if (b != 0L) {
            Class9258 class9258;
            for (class9258 = this.field9511; n >= class9258.field39715 - class9258.field39714; n -= class9258.field39715 - class9258.field39714, class9258 = class9258.field39718) {}
            while (b > 0L) {
                final int off = (int)(class9258.field39714 + n);
                final int len = (int)Math.min(class9258.field39715 - off, b);
                outputStream.write(class9258.field39713, off, len);
                b -= len;
                n = 0L;
                class9258 = class9258.field39718;
            }
            return this;
        }
        return this;
    }
    
    public Class1680 method5957(final Class1680 class1680, long n, long n2) {
        if (class1680 == null) {
            throw new IllegalArgumentException("out == null");
        }
        Class9476.method35277(this.field9512, n, n2);
        if (n2 != 0L) {
            class1680.field9512 += n2;
            Class9258 class1681;
            for (class1681 = this.field9511; n >= class1681.field39715 - class1681.field39714; n -= class1681.field39715 - class1681.field39714, class1681 = class1681.field39718) {}
            while (n2 > 0L) {
                final Class9258 class1683;
                final Class9258 class1682 = class1683 = new Class9258(class1681);
                class1683.field39714 += (int)n;
                class1682.field39715 = Math.min(class1682.field39714 + (int)n2, class1682.field39715);
                if (class1680.field9511 != null) {
                    class1680.field9511.field39719.method34163(class1682);
                }
                else {
                    final Class9258 class1684 = class1682;
                    final Class9258 class1685 = class1682;
                    final Class9258 field9511 = class1682;
                    class1685.field39719 = field9511;
                    class1684.field39718 = field9511;
                    class1680.field9511 = field9511;
                }
                n2 -= class1682.field39715 - class1682.field39714;
                n = 0L;
                class1681 = class1681.field39718;
            }
            return this;
        }
        return this;
    }
    
    public Class1680 method5958(final OutputStream outputStream) throws IOException {
        return this.method5959(outputStream, this.field9512);
    }
    
    public Class1680 method5959(final OutputStream outputStream, long a) throws IOException {
        if (outputStream != null) {
            Class9476.method35277(this.field9512, 0L, a);
            Class9258 field9511 = this.field9511;
            while (a > 0L) {
                final int len = (int)Math.min(a, field9511.field39715 - field9511.field39714);
                outputStream.write(field9511.field39713, field9511.field39714, len);
                final Class9258 class9258 = field9511;
                class9258.field39714 += len;
                this.field9512 -= len;
                a -= len;
                if (field9511.field39714 != field9511.field39715) {
                    continue;
                }
                final Class9258 class9259 = field9511;
                field9511 = (this.field9511 = class9259.method34162());
                Class9141.method33335(class9259);
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }
    
    public Class1680 method5960(final InputStream inputStream) throws IOException {
        this.method5962(inputStream, Long.MAX_VALUE, true);
        return this;
    }
    
    public Class1680 method5961(final InputStream inputStream, final long lng) throws IOException {
        if (lng >= 0L) {
            this.method5962(inputStream, lng, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: " + lng);
    }
    
    private void method5962(final InputStream inputStream, long a, final boolean b) throws IOException {
        if (inputStream != null) {
            while (a > 0L || b) {
                final Class9258 method6013 = this.method6013(1);
                final int read = inputStream.read(method6013.field39713, method6013.field39715, (int)Math.min(a, 8192 - method6013.field39715));
                if (read != -1) {
                    final Class9258 class9258 = method6013;
                    class9258.field39715 += read;
                    this.field9512 += read;
                    a -= read;
                }
                else if (!b) {
                    throw new EOFException();
                }
            }
            return;
        }
        throw new IllegalArgumentException("in == null");
    }
    
    public long method5963() {
        long field9512 = this.field9512;
        if (field9512 != 0L) {
            final Class9258 field9513 = this.field9511.field39719;
            if (field9513.field39715 < 8192) {
                if (field9513.field39717) {
                    field9512 -= field9513.field39715 - field9513.field39714;
                }
            }
            return field9512;
        }
        return 0L;
    }
    
    @Override
    public byte method5964() {
        if (this.field9512 != 0L) {
            final Class9258 field9511 = this.field9511;
            int field9512 = field9511.field39714;
            final int field9513 = field9511.field39715;
            final byte b = field9511.field39713[field9512++];
            --this.field9512;
            if (field9512 != field9513) {
                field9511.field39714 = field9512;
            }
            else {
                this.field9511 = field9511.method34162();
                Class9141.method33335(field9511);
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }
    
    public byte method5965(long n) {
        Class9476.method35277(this.field9512, n, 1L);
        Class9258 class9258 = this.field9511;
        while (true) {
            final int n2 = class9258.field39715 - class9258.field39714;
            if (n < n2) {
                break;
            }
            n -= n2;
            class9258 = class9258.field39718;
        }
        return class9258.field39713[class9258.field39714 + (int)n];
    }
    
    @Override
    public short method5966() {
        if (this.field9512 < 2L) {
            throw new IllegalStateException("size < 2: " + this.field9512);
        }
        final Class9258 field9511 = this.field9511;
        int field9512 = field9511.field39714;
        final int field9513 = field9511.field39715;
        if (field9513 - field9512 >= 2) {
            final byte[] field9514 = field9511.field39713;
            final int n = (field9514[field9512++] & 0xFF) << 8 | (field9514[field9512++] & 0xFF);
            this.field9512 -= 2L;
            if (field9512 != field9513) {
                field9511.field39714 = field9512;
            }
            else {
                this.field9511 = field9511.method34162();
                Class9141.method33335(field9511);
            }
            return (short)n;
        }
        return (short)((this.method5964() & 0xFF) << 8 | (this.method5964() & 0xFF));
    }
    
    @Override
    public int method5967() {
        if (this.field9512 < 4L) {
            throw new IllegalStateException("size < 4: " + this.field9512);
        }
        final Class9258 field9511 = this.field9511;
        int field9512 = field9511.field39714;
        final int field9513 = field9511.field39715;
        if (field9513 - field9512 >= 4) {
            final byte[] field9514 = field9511.field39713;
            final int n = (field9514[field9512++] & 0xFF) << 24 | (field9514[field9512++] & 0xFF) << 16 | (field9514[field9512++] & 0xFF) << 8 | (field9514[field9512++] & 0xFF);
            this.field9512 -= 4L;
            if (field9512 != field9513) {
                field9511.field39714 = field9512;
            }
            else {
                this.field9511 = field9511.method34162();
                Class9141.method33335(field9511);
            }
            return n;
        }
        return (this.method5964() & 0xFF) << 24 | (this.method5964() & 0xFF) << 16 | (this.method5964() & 0xFF) << 8 | (this.method5964() & 0xFF);
    }
    
    @Override
    public long method5968() {
        if (this.field9512 < 8L) {
            throw new IllegalStateException("size < 8: " + this.field9512);
        }
        final Class9258 field9511 = this.field9511;
        int field9512 = field9511.field39714;
        final int field9513 = field9511.field39715;
        if (field9513 - field9512 >= 8) {
            final byte[] field9514 = field9511.field39713;
            final long n = ((long)field9514[field9512++] & 0xFFL) << 56 | ((long)field9514[field9512++] & 0xFFL) << 48 | ((long)field9514[field9512++] & 0xFFL) << 40 | ((long)field9514[field9512++] & 0xFFL) << 32 | ((long)field9514[field9512++] & 0xFFL) << 24 | ((long)field9514[field9512++] & 0xFFL) << 16 | ((long)field9514[field9512++] & 0xFFL) << 8 | ((long)field9514[field9512++] & 0xFFL);
            this.field9512 -= 8L;
            if (field9512 != field9513) {
                field9511.field39714 = field9512;
            }
            else {
                this.field9511 = field9511.method34162();
                Class9141.method33335(field9511);
            }
            return n;
        }
        return ((long)this.method5967() & 0xFFFFFFFFL) << 32 | ((long)this.method5967() & 0xFFFFFFFFL);
    }
    
    @Override
    public short method5969() {
        return Class9476.method35278(this.method5966());
    }
    
    @Override
    public int method5970() {
        return Class9476.method35279(this.method5967());
    }
    
    @Override
    public long method5971() {
        return Class9476.method35280(this.method5968());
    }
    
    @Override
    public long method5972() {
        if (this.field9512 == 0L) {
            throw new IllegalStateException("size == 0");
        }
        long n = 0L;
        int n2 = 0;
        int n3 = 0;
        boolean b = false;
        final long n4 = -922337203685477580L;
        long n5 = -7L;
        while (true) {
            final Class9258 field9511 = this.field9511;
            final byte[] field9512 = field9511.field39713;
            int i;
            int field9513;
            for (i = field9511.field39714, field9513 = field9511.field39715; i < field9513; ++i, ++n2) {
                final byte j = field9512[i];
                if (j >= 48 && j <= 57) {
                    final int n6 = 48 - j;
                    if (n < n4 || (n == n4 && n6 < n5)) {
                        final Class1680 method6004 = new Class1680().method6011(n).method6004(j);
                        if (n3 == 0) {
                            method6004.method5964();
                        }
                        throw new NumberFormatException("Number too large: " + method6004.method5980());
                    }
                    n = n * 10L + n6;
                }
                else if (j == 45 && n2 == 0) {
                    n3 = 1;
                    --n5;
                }
                else {
                    if (n2 != 0) {
                        b = true;
                        break;
                    }
                    throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + Integer.toHexString(j));
                }
            }
            if (i != field9513) {
                field9511.field39714 = i;
            }
            else {
                this.field9511 = field9511.method34162();
                Class9141.method33335(field9511);
            }
            if (!b && this.field9511 != null) {
                continue;
            }
            this.field9512 -= n2;
            return (n3 == 0) ? (-n) : n;
        }
    }
    
    @Override
    public long method5973() {
        if (this.field9512 == 0L) {
            throw new IllegalStateException("size == 0");
        }
        long n = 0L;
        int n2 = 0;
        boolean b = false;
        while (true) {
            final Class9258 field9511 = this.field9511;
            final byte[] field9512 = field9511.field39713;
            int i;
            int field9513;
            for (i = field9511.field39714, field9513 = field9511.field39715; i < field9513; ++i, ++n2) {
                final byte j = field9512[i];
                int n3;
                if (j >= 48 && j <= 57) {
                    n3 = j - 48;
                }
                else if (j >= 97 && j <= 102) {
                    n3 = j - 97 + 10;
                }
                else if (j >= 65 && j <= 70) {
                    n3 = j - 65 + 10;
                }
                else {
                    if (n2 != 0) {
                        b = true;
                        break;
                    }
                    throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(j));
                }
                if ((n & 0xF000000000000000L) != 0x0L) {
                    throw new NumberFormatException("Number too large: " + new Class1680().method6012(n).method6004(j).method5980());
                }
                n = (n << 4 | (long)n3);
            }
            if (i != field9513) {
                field9511.field39714 = i;
            }
            else {
                this.field9511 = field9511.method34162();
                Class9141.method33335(field9511);
            }
            if (!b && this.field9511 != null) {
                continue;
            }
            this.field9512 -= n2;
            return n;
        }
    }
    
    @Override
    public Class1929 method5974() {
        return new Class1929(this.method5989());
    }
    
    @Override
    public Class1929 method5975(final long n) throws EOFException {
        return new Class1929(this.method5990(n));
    }
    
    @Override
    public int method5976(final Class54 class54) {
        final Class9258 field9511 = this.field9511;
        if (field9511 == null) {
            return class54.indexOf(Class1929.field10532);
        }
        final Class1929[] field9512 = class54.field135;
        for (int i = 0; i < field9512.length; ++i) {
            final Class1929 class55 = field9512[i];
            if (this.field9512 >= class55.method7766() && this.method6024(field9511, field9511.field39714, class55, 0, class55.method7766())) {
                try {
                    this.method5995(class55.method7766());
                    return i;
                }
                catch (final EOFException detailMessage) {
                    throw new AssertionError((Object)detailMessage);
                }
            }
        }
        return -1;
    }
    
    public int method5977(final Class54 class54) {
        final Class9258 field9511 = this.field9511;
        final Class1929[] field9512 = class54.field135;
        for (int i = 0; i < field9512.length; ++i) {
            final Class1929 class55 = field9512[i];
            final int n = (int)Math.min(this.field9512, class55.method7766());
            if (n == 0 || this.method6024(field9511, field9511.field39714, class55, 0, n)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public void method5978(final Class1680 class1680, final long n) throws EOFException {
        if (this.field9512 >= n) {
            class1680.method5920(this, n);
            return;
        }
        class1680.method5920(this, this.field9512);
        throw new EOFException();
    }
    
    @Override
    public long method5979(final Class1676 class1676) throws IOException {
        final long field9512 = this.field9512;
        if (field9512 > 0L) {
            class1676.method5920(this, field9512);
        }
        return field9512;
    }
    
    @Override
    public String method5980() {
        try {
            return this.method5983(this.field9512, Class9476.field40748);
        }
        catch (final EOFException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public String method5981(final long n) throws EOFException {
        return this.method5983(n, Class9476.field40748);
    }
    
    @Override
    public String method5982(final Charset charset) {
        try {
            return this.method5983(this.field9512, charset);
        }
        catch (final EOFException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public String method5983(final long lng, final Charset charset) throws EOFException {
        Class9476.method35277(this.field9512, 0L, lng);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (lng > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + lng);
        }
        if (lng == 0L) {
            return "";
        }
        final Class9258 field9511 = this.field9511;
        if (field9511.field39714 + lng <= field9511.field39715) {
            final String s = new String(field9511.field39713, field9511.field39714, (int)lng, charset);
            final Class9258 class9258 = field9511;
            class9258.field39714 += (int)lng;
            this.field9512 -= lng;
            if (field9511.field39714 == field9511.field39715) {
                this.field9511 = field9511.method34162();
                Class9141.method33335(field9511);
            }
            return s;
        }
        return new String(this.method5990(lng), charset);
    }
    
    @Nullable
    @Override
    public String method5984() throws EOFException {
        final long method6015 = this.method6015((byte)10);
        if (method6015 != -1L) {
            return this.method5987(method6015);
        }
        return (this.field9512 == 0L) ? null : this.method5981(this.field9512);
    }
    
    @Override
    public String method5985() throws EOFException {
        return this.method5986(Long.MAX_VALUE);
    }
    
    @Override
    public String method5986(final long n) throws EOFException {
        if (n < 0L) {
            throw new IllegalArgumentException("limit < 0: " + n);
        }
        final long n2 = (n != Long.MAX_VALUE) ? (n + 1L) : Long.MAX_VALUE;
        final long method6017 = this.method6017((byte)10, 0L, n2);
        if (method6017 == -1L) {
            if (n2 < this.method5949()) {
                if (this.method5965(n2 - 1L) == 13) {
                    if (this.method5965(n2) == 10) {
                        return this.method5987(n2);
                    }
                }
            }
            final Class1680 class1680 = new Class1680();
            this.method5957(class1680, 0L, Math.min(32L, this.method5949()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.method5949(), n) + " content=" + class1680.method5974().method7757() + '\u2026');
        }
        return this.method5987(method6017);
    }
    
    public String method5987(final long n) throws EOFException {
        if (n > 0L && this.method5965(n - 1L) == 13) {
            final String method5981 = this.method5981(n - 1L);
            this.method5995(2L);
            return method5981;
        }
        final String method5982 = this.method5981(n);
        this.method5995(1L);
        return method5982;
    }
    
    @Override
    public int method5988() throws EOFException {
        if (this.field9512 != 0L) {
            final byte method5965 = this.method5965(0L);
            int n = method5965 & 0x7F;
            final int i = 1;
            final int n2 = 0;
            final int n3;
            while ((n3 & 0x400000) == 0x0 || this.field9512 >= i) {
                if ((n3 & 0x10000) != 0x0) {
                    for (int j = 1; j < i; ++j) {
                        final byte method5966 = this.method5965(j);
                        if ((method5966 & 0xC0) != 0x80) {
                            this.method5995(j);
                            return 65533;
                        }
                        n = (n << 6 | (method5966 & 0x3F));
                    }
                    Label_0429_Outer:Label_0397_Outer:
                    while (true) {
                    Label_0397:
                        while (true) {
                            while (true) {
                                Label_0466: {
                                    if ((n3 & 0x800) == 0x0) {
                                        break Label_0466;
                                    }
                                    if ((n3 & 0x800) == 0x0) {
                                        break Label_0429;
                                    }
                                    if ((n3 & 0x10000) != 0x0) {
                                        this.method5995(i);
                                        if (n > 1114111) {
                                            return 65533;
                                        }
                                    }
                                    if ((n3 & 0x10000) == 0x0) {
                                        break Label_0466;
                                    }
                                    if ((n3 & 0x2000000) != 0x0) {
                                        if ((n3 & 0x80000) != 0x0) {
                                            continue Label_0429_Outer;
                                        }
                                        if (n >= 55296) {
                                            if (n <= 57343) {
                                                return 65533;
                                            }
                                        }
                                    }
                                    if ((n3 & 0x4) != 0x0) {
                                        if ((n3 & 0x800) == 0x0) {
                                            continue Label_0397;
                                        }
                                        if ((n3 & 0x800000) == 0x0) {
                                            continue Label_0429_Outer;
                                        }
                                        if (n < n2) {
                                            return 65533;
                                        }
                                    }
                                }
                                if ((n3 & Integer.MAX_VALUE) == 0x0) {
                                    continue Label_0397_Outer;
                                }
                                break;
                            }
                            if ((n3 & 0x200) != 0x0) {
                                continue Label_0397;
                            }
                            break;
                        }
                        if ((n3 & 0x40) != 0x0) {
                            return n;
                        }
                    }
                }
            }
            throw new EOFException("size < " + i + ": " + this.field9512 + " (to read code point prefixed 0x" + Integer.toHexString(method5965) + ")");
        }
        throw new EOFException();
    }
    
    @Override
    public byte[] method5989() {
        try {
            return this.method5990(this.field9512);
        }
        catch (final EOFException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public byte[] method5990(final long lng) throws EOFException {
        Class9476.method35277(this.field9512, 0L, lng);
        if (lng <= 2147483647L) {
            final byte[] array = new byte[(int)lng];
            this.method5992(array);
            return array;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + lng);
    }
    
    @Override
    public int method5991(final byte[] array) {
        return this.method5993(array, 0, array.length);
    }
    
    @Override
    public void method5992(final byte[] array) throws EOFException {
        int method5993;
        for (int i = 0; i < array.length; i += method5993) {
            method5993 = this.method5993(array, i, array.length - i);
            if (method5993 == -1) {
                throw new EOFException();
            }
        }
    }
    
    @Override
    public int method5993(final byte[] array, final int n, final int a) {
        Class9476.method35277(array.length, n, a);
        final Class9258 field9511 = this.field9511;
        if (field9511 != null) {
            final int min = Math.min(a, field9511.field39715 - field9511.field39714);
            System.arraycopy(field9511.field39713, field9511.field39714, array, n, min);
            final Class9258 class9258 = field9511;
            class9258.field39714 += min;
            this.field9512 -= min;
            if (field9511.field39714 == field9511.field39715) {
                this.field9511 = field9511.method34162();
                Class9141.method33335(field9511);
            }
            return min;
        }
        return -1;
    }
    
    public void method5994() {
        try {
            this.method5995(this.field9512);
        }
        catch (final EOFException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void method5995(long a) throws EOFException {
        while (a > 0L) {
            if (this.field9511 == null) {
                throw new EOFException();
            }
            final int n = (int)Math.min(a, this.field9511.field39715 - this.field9511.field39714);
            this.field9512 -= n;
            a -= n;
            final Class9258 field9511 = this.field9511;
            field9511.field39714 += n;
            if (this.field9511.field39714 != this.field9511.field39715) {
                continue;
            }
            final Class9258 field9512 = this.field9511;
            this.field9511 = field9512.method34162();
            Class9141.method33335(field9512);
        }
    }
    
    public Class1680 method5996(final Class1929 class1929) {
        if (class1929 != null) {
            class1929.method7771(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }
    
    public Class1680 method5997(final String s) {
        return this.method5998(s, 0, s.length());
    }
    
    public Class1680 method5998(final String s, final int n, final int i) {
        if (s == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (n < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + n);
        }
        if (i < n) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i + " < " + n);
        }
        if (i <= s.length()) {
            int j = n;
            while (j < i) {
                final char char1 = s.charAt(j);
                if (char1 >= '\u0080') {
                    if (char1 >= '\u0800') {
                        if (char1 >= '\ud800' && char1 <= '\udfff') {
                            final char c = (j + 1 >= i) ? '\0' : s.charAt(j + 1);
                            if (char1 <= '\udbff') {
                                if (c >= '\udc00') {
                                    if (c <= '\udfff') {
                                        final int n2 = 65536 + ((char1 & 0xFFFF27FF) << 10 | (c & 0xFFFF23FF));
                                        this.method6004(n2 >> 18 | 0xF0);
                                        this.method6004((n2 >> 12 & 0x3F) | 0x80);
                                        this.method6004((n2 >> 6 & 0x3F) | 0x80);
                                        this.method6004((n2 & 0x3F) | 0x80);
                                        j += 2;
                                        continue;
                                    }
                                }
                            }
                            this.method6004(63);
                            ++j;
                        }
                        else {
                            this.method6004(char1 >> 12 | 0xE0);
                            this.method6004((char1 >> 6 & 0x3F) | 0x80);
                            this.method6004((char1 & '?') | 0x80);
                            ++j;
                        }
                    }
                    else {
                        this.method6004(char1 >> 6 | 0xC0);
                        this.method6004((char1 & '?') | 0x80);
                        ++j;
                    }
                }
                else {
                    final Class9258 method6013 = this.method6013(1);
                    final byte[] field39713 = method6013.field39713;
                    final int n3 = method6013.field39715 - j;
                    final int min = Math.min(i, 8192 - n3);
                    field39713[n3 + j++] = (byte)char1;
                    while (j < min) {
                        final char char2 = s.charAt(j);
                        if (char2 >= '\u0080') {
                            break;
                        }
                        field39713[n3 + j++] = (byte)char2;
                    }
                    final int n4 = j + n3 - method6013.field39715;
                    final Class9258 class9258 = method6013;
                    class9258.field39715 += n4;
                    this.field9512 += n4;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex > string.length: " + i + " > " + s.length());
    }
    
    public Class1680 method5999(final int i) {
        if (i >= 128) {
            if (i >= 2048) {
                if (i >= 65536) {
                    if (i > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                    }
                    this.method6004(i >> 18 | 0xF0);
                    this.method6004((i >> 12 & 0x3F) | 0x80);
                    this.method6004((i >> 6 & 0x3F) | 0x80);
                    this.method6004((i & 0x3F) | 0x80);
                }
                else if (i >= 55296 && i <= 57343) {
                    this.method6004(63);
                }
                else {
                    this.method6004(i >> 12 | 0xE0);
                    this.method6004((i >> 6 & 0x3F) | 0x80);
                    this.method6004((i & 0x3F) | 0x80);
                }
            }
            else {
                this.method6004(i >> 6 | 0xC0);
                this.method6004((i & 0x3F) | 0x80);
            }
        }
        else {
            this.method6004(i);
        }
        return this;
    }
    
    public Class1680 method6000(final String s, final Charset charset) {
        return this.method6001(s, 0, s.length(), charset);
    }
    
    public Class1680 method6001(final String s, final int beginIndex, final int endIndex, final Charset charset) {
        if (s == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (beginIndex < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + beginIndex);
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + endIndex + " < " + beginIndex);
        }
        if (endIndex > s.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + endIndex + " > " + s.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (!charset.equals(Class9476.field40748)) {
            final byte[] bytes = s.substring(beginIndex, endIndex).getBytes(charset);
            return this.method6003(bytes, 0, bytes.length);
        }
        return this.method5998(s, beginIndex, endIndex);
    }
    
    public Class1680 method6002(final byte[] array) {
        if (array != null) {
            return this.method6003(array, 0, array.length);
        }
        throw new IllegalArgumentException("source == null");
    }
    
    public Class1680 method6003(final byte[] array, int i, final int n) {
        if (array != null) {
            Class9476.method35277(array.length, i, n);
            Class9258 method6013;
            int min;
            Class9258 class9258;
            for (int n2 = i + n; i < n2; i += min, class9258 = method6013, class9258.field39715 += min) {
                method6013 = this.method6013(1);
                min = Math.min(n2 - i, 8192 - method6013.field39715);
                System.arraycopy(array, i, method6013.field39713, method6013.field39715, min);
            }
            this.field9512 += n;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    @Override
    public long method5930(final Class1682 class1682) throws IOException {
        if (class1682 != null) {
            long n = 0L;
            long method6014;
            while ((method6014 = class1682.method6014(this, 8192L)) != -1L) {
                n += method6014;
            }
            return n;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    @Override
    public Class1679 method5931(final Class1682 class1682, long n) throws IOException {
        while (n > 0L) {
            final long method6014 = class1682.method6014(this, n);
            if (method6014 == -1L) {
                throw new EOFException();
            }
            n -= method6014;
        }
        return this;
    }
    
    public Class1680 method6004(final int n) {
        final Class9258 method6013 = this.method6013(1);
        method6013.field39713[method6013.field39715++] = (byte)n;
        ++this.field9512;
        return this;
    }
    
    public Class1680 method6005(final int n) {
        final Class9258 method6013 = this.method6013(2);
        final byte[] field39713 = method6013.field39713;
        int field39714 = method6013.field39715;
        field39713[field39714++] = (byte)(n >>> 8 & 0xFF);
        field39713[field39714++] = (byte)(n & 0xFF);
        method6013.field39715 = field39714;
        this.field9512 += 2L;
        return this;
    }
    
    public Class1680 method6006(final int n) {
        return this.method6005(Class9476.method35278((short)n));
    }
    
    public Class1680 method6007(final int n) {
        final Class9258 method6013 = this.method6013(4);
        final byte[] field39713 = method6013.field39713;
        int field39714 = method6013.field39715;
        field39713[field39714++] = (byte)(n >>> 24 & 0xFF);
        field39713[field39714++] = (byte)(n >>> 16 & 0xFF);
        field39713[field39714++] = (byte)(n >>> 8 & 0xFF);
        field39713[field39714++] = (byte)(n & 0xFF);
        method6013.field39715 = field39714;
        this.field9512 += 4L;
        return this;
    }
    
    public Class1680 method6008(final int n) {
        return this.method6007(Class9476.method35279(n));
    }
    
    public Class1680 method6009(final long n) {
        final Class9258 method6013 = this.method6013(8);
        final byte[] field39713 = method6013.field39713;
        int field39714 = method6013.field39715;
        field39713[field39714++] = (byte)(n >>> 56 & 0xFFL);
        field39713[field39714++] = (byte)(n >>> 48 & 0xFFL);
        field39713[field39714++] = (byte)(n >>> 40 & 0xFFL);
        field39713[field39714++] = (byte)(n >>> 32 & 0xFFL);
        field39713[field39714++] = (byte)(n >>> 24 & 0xFFL);
        field39713[field39714++] = (byte)(n >>> 16 & 0xFFL);
        field39713[field39714++] = (byte)(n >>> 8 & 0xFFL);
        field39713[field39714++] = (byte)(n & 0xFFL);
        method6013.field39715 = field39714;
        this.field9512 += 8L;
        return this;
    }
    
    public Class1680 method6010(final long n) {
        return this.method6009(Class9476.method35280(n));
    }
    
    public Class1680 method6011(long n) {
        if (n != 0L) {
            boolean b = false;
            if (n < 0L) {
                n = -n;
                if (n < 0L) {
                    return this.method5997("-9223372036854775808");
                }
                b = true;
            }
            int n2 = (n >= 100000000L) ? ((n >= 1000000000000L) ? ((n >= 1000000000000000L) ? ((n >= 100000000000000000L) ? ((n >= 1000000000000000000L) ? 19 : 18) : ((n >= 10000000000000000L) ? 17 : 16)) : ((n >= 10000000000000L) ? ((n >= 100000000000000L) ? 15 : 14) : 13)) : ((n >= 10000000000L) ? ((n >= 100000000000L) ? 12 : 11) : ((n >= 1000000000L) ? 10 : 9))) : ((n >= 10000L) ? ((n >= 1000000L) ? ((n >= 10000000L) ? 8 : 7) : ((n >= 100000L) ? 6 : 5)) : ((n >= 100L) ? ((n >= 1000L) ? 4 : 3) : ((n >= 10L) ? 2 : 1)));
            if (b) {
                ++n2;
            }
            final Class9258 method6013 = this.method6013(n2);
            final byte[] field39713 = method6013.field39713;
            int n3 = method6013.field39715 + n2;
            while (n != 0L) {
                field39713[--n3] = Class1680.field9509[(int)(n % 10L)];
                n /= 10L;
            }
            if (b) {
                field39713[--n3] = 45;
            }
            final Class9258 class9258 = method6013;
            class9258.field39715 += n2;
            this.field9512 += n2;
            return this;
        }
        return this.method6004(48);
    }
    
    public Class1680 method6012(long i) {
        if (i != 0L) {
            final int n = Long.numberOfTrailingZeros(Long.highestOneBit(i)) / 4 + 1;
            final Class9258 method6013 = this.method6013(n);
            final byte[] field39713 = method6013.field39713;
            for (int j = method6013.field39715 + n - 1; j >= method6013.field39715; --j) {
                field39713[j] = Class1680.field9509[(int)(i & 0xFL)];
                i >>>= 4;
            }
            final Class9258 class9258 = method6013;
            class9258.field39715 += n;
            this.field9512 += n;
            return this;
        }
        return this.method6004(48);
    }
    
    public Class9258 method6013(final int n) {
        if (n < 1 || n > 8192) {
            throw new IllegalArgumentException();
        }
        if (this.field9511 != null) {
            Class9258 class9258 = this.field9511.field39719;
            if (class9258.field39715 + n > 8192 || !class9258.field39717) {
                class9258 = class9258.method34163(Class9141.method33334());
            }
            return class9258;
        }
        this.field9511 = Class9141.method33334();
        final Class9258 field9511 = this.field9511;
        final Class9258 field9512 = this.field9511;
        final Class9258 field9513 = this.field9511;
        field9512.field39719 = field9513;
        return field9511.field39718 = field9513;
    }
    
    @Override
    public void method5920(final Class1680 class1680, long n) {
        if (class1680 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (class1680 != this) {
            Class9476.method35277(class1680.field9512, 0L, n);
            while (n > 0L) {
                if (n < class1680.field9511.field39715 - class1680.field9511.field39714) {
                    final Class9258 class1681 = (this.field9511 == null) ? null : this.field9511.field39719;
                    if (class1681 != null) {
                        if (class1681.field39717) {
                            if (n + class1681.field39715 - (class1681.field39716 ? 0 : class1681.field39714) <= 8192L) {
                                class1680.field9511.method34166(class1681, (int)n);
                                class1680.field9512 -= n;
                                this.field9512 += n;
                                return;
                            }
                        }
                    }
                    class1680.field9511 = class1680.field9511.method34164((int)n);
                }
                final Class9258 field9511 = class1680.field9511;
                final long n2 = field9511.field39715 - field9511.field39714;
                class1680.field9511 = field9511.method34162();
                if (this.field9511 != null) {
                    this.field9511.field39719.method34163(field9511).method34165();
                }
                else {
                    this.field9511 = field9511;
                    final Class9258 field9512 = this.field9511;
                    final Class9258 field9513 = this.field9511;
                    final Class9258 field9514 = this.field9511;
                    field9513.field39719 = field9514;
                    field9512.field39718 = field9514;
                }
                class1680.field9512 -= n2;
                this.field9512 += n2;
                n -= n2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
    
    @Override
    public long method6014(final Class1680 class1680, long field9512) {
        if (class1680 == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (field9512 < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + field9512);
        }
        if (this.field9512 != 0L) {
            if (field9512 > this.field9512) {
                field9512 = this.field9512;
            }
            class1680.method5920(this, field9512);
            return field9512;
        }
        return -1L;
    }
    
    @Override
    public long method6015(final byte b) {
        return this.method6017(b, 0L, Long.MAX_VALUE);
    }
    
    @Override
    public long method6016(final byte b, final long n) {
        return this.method6017(b, n, Long.MAX_VALUE);
    }
    
    @Override
    public long method6017(final byte b, long l, long field9512) {
        if (l < 0L || field9512 < l) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", this.field9512, l, field9512));
        }
        if (field9512 > this.field9512) {
            field9512 = this.field9512;
        }
        if (l == field9512) {
            return -1L;
        }
        Class9258 class9258 = this.field9511;
        if (class9258 != null) {
            long field9513;
            if (this.field9512 - l >= l) {
                long n;
                for (field9513 = 0L; (n = field9513 + (class9258.field39715 - class9258.field39714)) < l; class9258 = class9258.field39718, field9513 = n) {}
            }
            else {
                for (field9513 = this.field9512; field9513 > l; field9513 -= class9258.field39715 - class9258.field39714) {
                    class9258 = class9258.field39719;
                }
            }
            while (field9513 < field9512) {
                final byte[] field9514 = class9258.field39713;
                for (int n2 = (int)Math.min(class9258.field39715, class9258.field39714 + field9512 - field9513), i = (int)(class9258.field39714 + l - field9513); i < n2; ++i) {
                    if (field9514[i] == b) {
                        return i - class9258.field39714 + field9513;
                    }
                }
                field9513 = (l = field9513 + (class9258.field39715 - class9258.field39714));
                class9258 = class9258.field39718;
            }
            return -1L;
        }
        return -1L;
    }
    
    @Override
    public long method6018(final Class1929 class1929) throws IOException {
        return this.method6019(class1929, 0L);
    }
    
    @Override
    public long method6019(final Class1929 class1929, long n) throws IOException {
        if (class1929.method7766() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        if (n < 0L) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        Class9258 class1930 = this.field9511;
        if (class1930 != null) {
            long field9512;
            if (this.field9512 - n >= n) {
                long n2;
                for (field9512 = 0L; (n2 = field9512 + (class1930.field39715 - class1930.field39714)) < n; class1930 = class1930.field39718, field9512 = n2) {}
            }
            else {
                for (field9512 = this.field9512; field9512 > n; field9512 -= class1930.field39715 - class1930.field39714) {
                    class1930 = class1930.field39719;
                }
            }
            final byte method7765 = class1929.method7765(0);
            final int method7766 = class1929.method7766();
            for (long n3 = this.field9512 - method7766 + 1L; field9512 < n3; field9512 = (n = field9512 + (class1930.field39715 - class1930.field39714)), class1930 = class1930.field39718) {
                final byte[] field9513 = class1930.field39713;
                for (int n4 = (int)Math.min(class1930.field39715, class1930.field39714 + n3 - field9512), i = (int)(class1930.field39714 + n - field9512); i < n4; ++i) {
                    if (field9513[i] == method7765 && this.method6024(class1930, i + 1, class1929, 1, method7766)) {
                        return i - class1930.field39714 + field9512;
                    }
                }
            }
            return -1L;
        }
        return -1L;
    }
    
    @Override
    public long method6020(final Class1929 class1929) {
        return this.method6021(class1929, 0L);
    }
    
    @Override
    public long method6021(final Class1929 class1929, long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        Class9258 class1930 = this.field9511;
        if (class1930 != null) {
            long field9512;
            if (this.field9512 - n >= n) {
                long n2;
                for (field9512 = 0L; (n2 = field9512 + (class1930.field39715 - class1930.field39714)) < n; class1930 = class1930.field39718, field9512 = n2) {}
            }
            else {
                for (field9512 = this.field9512; field9512 > n; field9512 -= class1930.field39715 - class1930.field39714) {
                    class1930 = class1930.field39719;
                }
            }
            if (class1929.method7766() != 2) {
                final byte[] method7768 = class1929.method7768();
                while (field9512 < this.field9512) {
                    final byte[] field9513 = class1930.field39713;
                    for (int i = (int)(class1930.field39714 + n - field9512); i < class1930.field39715; ++i) {
                        final byte b = field9513[i];
                        final byte[] array = method7768;
                        for (int length = array.length, j = 0; j < length; ++j) {
                            if (b == array[j]) {
                                return i - class1930.field39714 + field9512;
                            }
                        }
                    }
                    field9512 = (n = field9512 + (class1930.field39715 - class1930.field39714));
                    class1930 = class1930.field39718;
                }
            }
            else {
                final byte method7769 = class1929.method7765(0);
                final byte method7770 = class1929.method7765(1);
                while (field9512 < this.field9512) {
                    final byte[] field9514 = class1930.field39713;
                    for (int k = (int)(class1930.field39714 + n - field9512); k < class1930.field39715; ++k) {
                        final byte b2 = field9514[k];
                        if (b2 == method7769 || b2 == method7770) {
                            return k - class1930.field39714 + field9512;
                        }
                    }
                    field9512 = (n = field9512 + (class1930.field39715 - class1930.field39714));
                    class1930 = class1930.field39718;
                }
            }
            return -1L;
        }
        return -1L;
    }
    
    @Override
    public boolean method6022(final long n, final Class1929 class1929) {
        return this.method6023(n, class1929, 0, class1929.method7766());
    }
    
    @Override
    public boolean method6023(final long n, final Class1929 class1929, final int n2, final int n3) {
        if (n >= 0L) {
            if (n2 >= 0) {
                if (n3 >= 0) {
                    if (this.field9512 - n >= n3) {
                        if (class1929.method7766() - n2 >= n3) {
                            for (int i = 0; i < n3; ++i) {
                                if (this.method5965(n + i) != class1929.method7765(n2 + i)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private boolean method6024(Class9258 field39718, int field39719, final Class1929 class1929, final int n, final int n2) {
        int n3 = field39718.field39715;
        byte[] array = field39718.field39713;
        for (int i = n; i < n2; ++i) {
            if (field39719 == n3) {
                field39718 = field39718.field39718;
                array = field39718.field39713;
                field39719 = field39718.field39714;
                n3 = field39718.field39715;
            }
            if (array[field39719] != class1929.method7765(i)) {
                return false;
            }
            ++field39719;
        }
        return true;
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public Class8020 method5921() {
        return Class8020.field33035;
    }
    
    public List<Integer> method6025() {
        if (this.field9511 != null) {
            final ArrayList list = new ArrayList();
            list.add(this.field9511.field39715 - this.field9511.field39714);
            for (Class9258 class9258 = this.field9511.field39718; class9258 != this.field9511; class9258 = class9258.field39718) {
                list.add(class9258.field39715 - class9258.field39714);
            }
            return list;
        }
        return Collections.emptyList();
    }
    
    public Class1929 method6026() {
        return this.method6030("MD5");
    }
    
    public Class1929 method6027() {
        return this.method6030("SHA-1");
    }
    
    public Class1929 method6028() {
        return this.method6030("SHA-256");
    }
    
    public Class1929 method6029() {
        return this.method6030("SHA-512");
    }
    
    private Class1929 method6030(final String algorithm) {
        try {
            final MessageDigest instance = MessageDigest.getInstance(algorithm);
            if (this.field9511 != null) {
                instance.update(this.field9511.field39713, this.field9511.field39714, this.field9511.field39715 - this.field9511.field39714);
                for (Class9258 class9258 = this.field9511.field39718; class9258 != this.field9511; class9258 = class9258.field39718) {
                    instance.update(class9258.field39713, class9258.field39714, class9258.field39715 - class9258.field39714);
                }
            }
            return Class1929.method7738(instance.digest());
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError();
        }
    }
    
    public Class1929 method6031(final Class1929 class1929) {
        return this.method6034("HmacSHA1", class1929);
    }
    
    public Class1929 method6032(final Class1929 class1929) {
        return this.method6034("HmacSHA256", class1929);
    }
    
    public Class1929 method6033(final Class1929 class1929) {
        return this.method6034("HmacSHA512", class1929);
    }
    
    private Class1929 method6034(final String s, final Class1929 class1929) {
        try {
            final Mac instance = Mac.getInstance(s);
            instance.init(new SecretKeySpec(class1929.method7767(), s));
            if (this.field9511 != null) {
                instance.update(this.field9511.field39713, this.field9511.field39714, this.field9511.field39715 - this.field9511.field39714);
                for (Class9258 class1930 = this.field9511.field39718; class1930 != this.field9511; class1930 = class1930.field39718) {
                    instance.update(class1930.field39713, class1930.field39714, class1930.field39715 - class1930.field39714);
                }
            }
            return Class1929.method7738(instance.doFinal());
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError();
        }
        catch (final InvalidKeyException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Class1680)) {
            return false;
        }
        final Class1680 class1680 = (Class1680)o;
        if (this.field9512 != class1680.field9512) {
            return false;
        }
        if (this.field9512 != 0L) {
            Class9258 class1681 = this.field9511;
            Class9258 class1682 = class1680.field9511;
            int n = class1681.field39714;
            int n2 = class1682.field39714;
            long n4;
            for (long n3 = 0L; n3 < this.field9512; n3 += n4) {
                n4 = Math.min(class1681.field39715 - n, class1682.field39715 - n2);
                for (int n5 = 0; n5 < n4; ++n5) {
                    if (class1681.field39713[n++] != class1682.field39713[n2++]) {
                        return false;
                    }
                }
                if (n == class1681.field39715) {
                    class1681 = class1681.field39718;
                    n = class1681.field39714;
                }
                if (n2 == class1682.field39715) {
                    class1682 = class1682.field39718;
                    n2 = class1682.field39714;
                }
            }
            return true;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        Class9258 class9258 = this.field9511;
        if (class9258 != null) {
            int n = 1;
            do {
                for (int i = class9258.field39714; i < class9258.field39715; ++i) {
                    n = 31 * n + class9258.field39713[i];
                }
                class9258 = class9258.field39718;
            } while (class9258 != this.field9511);
            return n;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return this.method6035().toString();
    }
    
    public Class1680 clone() {
        final Class1680 class1680 = new Class1680();
        if (this.field9512 != 0L) {
            class1680.field9511 = new Class9258(this.field9511);
            final Class9258 field9511 = class1680.field9511;
            final Class9258 field9512 = class1680.field9511;
            final Class9258 field9513 = class1680.field9511;
            field9512.field39719 = field9513;
            field9511.field39718 = field9513;
            for (Class9258 class1681 = this.field9511.field39718; class1681 != this.field9511; class1681 = class1681.field39718) {
                class1680.field9511.field39719.method34163(new Class9258(class1681));
            }
            class1680.field9512 = this.field9512;
            return class1680;
        }
        return class1680;
    }
    
    public Class1929 method6035() {
        if (this.field9512 <= 2147483647L) {
            return this.method6036((int)this.field9512);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.field9512);
    }
    
    public Class1929 method6036(final int n) {
        if (n != 0) {
            return new Class1930(this, n);
        }
        return Class1929.field10532;
    }
    
    static {
        field9509 = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    }
}
