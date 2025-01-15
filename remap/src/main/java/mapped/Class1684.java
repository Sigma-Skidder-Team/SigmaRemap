// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class Class1684 implements Class1682
{
    private static final byte field9515 = 1;
    private static final byte field9516 = 2;
    private static final byte field9517 = 3;
    private static final byte field9518 = 4;
    private static final byte field9519 = 0;
    private static final byte field9520 = 1;
    private static final byte field9521 = 2;
    private static final byte field9522 = 3;
    private int field9523;
    private final Class1681 field9524;
    private final Inflater field9525;
    private final Class1690 field9526;
    private final CRC32 field9527;
    
    public Class1684(final Class1682 class1682) {
        this.field9523 = 0;
        this.field9527 = new CRC32();
        if (class1682 != null) {
            this.field9525 = new Inflater(true);
            this.field9524 = Class8753.method30275(class1682);
            this.field9526 = new Class1690(this.field9524, this.field9525);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long lng) throws IOException {
        if (lng < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + lng);
        }
        if (lng != 0L) {
            if (this.field9523 == 0) {
                this.method6037();
                this.field9523 = 1;
            }
            if (this.field9523 == 1) {
                final long field9512 = class1680.field9512;
                final long method6014 = this.field9526.method6014(class1680, lng);
                if (method6014 != -1L) {
                    this.method6039(class1680, field9512, method6014);
                    return method6014;
                }
                this.field9523 = 2;
            }
            if (this.field9523 == 2) {
                this.method6038();
                this.field9523 = 3;
                if (!this.field9524.method5951()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        return 0L;
    }
    
    private void method6037() throws IOException {
        this.field9524.method5952(10L);
        final byte method5965 = this.field9524.method5926().method5965(3L);
        final boolean b = (method5965 >> 1 & 0x1) == 0x1;
        if (b) {
            this.method6039(this.field9524.method5926(), 0L, 10L);
        }
        this.method6040("ID1ID2", 8075, this.field9524.method5966());
        this.field9524.method5995(8L);
        if ((method5965 >> 2 & 0x1) == 0x1) {
            this.field9524.method5952(2L);
            if (b) {
                this.method6039(this.field9524.method5926(), 0L, 2L);
            }
            final short method5966 = this.field9524.method5926().method5969();
            this.field9524.method5952(method5966);
            if (b) {
                this.method6039(this.field9524.method5926(), 0L, method5966);
            }
            this.field9524.method5995(method5966);
        }
        if ((method5965 >> 3 & 0x1) == 0x1) {
            final long method5967 = this.field9524.method6015((byte)0);
            if (method5967 == -1L) {
                throw new EOFException();
            }
            if (b) {
                this.method6039(this.field9524.method5926(), 0L, method5967 + 1L);
            }
            this.field9524.method5995(method5967 + 1L);
        }
        if ((method5965 >> 4 & 0x1) == 0x1) {
            final long method5968 = this.field9524.method6015((byte)0);
            if (method5968 == -1L) {
                throw new EOFException();
            }
            if (b) {
                this.method6039(this.field9524.method5926(), 0L, method5968 + 1L);
            }
            this.field9524.method5995(method5968 + 1L);
        }
        if (b) {
            this.method6040("FHCRC", this.field9524.method5969(), (short)this.field9527.getValue());
            this.field9527.reset();
        }
    }
    
    private void method6038() throws IOException {
        this.method6040("CRC", this.field9524.method5970(), (int)this.field9527.getValue());
        this.method6040("ISIZE", this.field9524.method5970(), (int)this.field9525.getBytesWritten());
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9524.method5921();
    }
    
    @Override
    public void close() throws IOException {
        this.field9526.close();
    }
    
    private void method6039(final Class1680 class1680, long n, long b) {
        Class9258 class1681;
        for (class1681 = class1680.field9511; n >= class1681.field39715 - class1681.field39714; n -= class1681.field39715 - class1681.field39714, class1681 = class1681.field39718) {}
        while (b > 0L) {
            final int off = (int)(class1681.field39714 + n);
            final int len = (int)Math.min(class1681.field39715 - off, b);
            this.field9527.update(class1681.field39713, off, len);
            b -= len;
            n = 0L;
            class1681 = class1681.field39718;
        }
    }
    
    private void method6040(final String s, final int i, final int j) throws IOException {
        if (j == i) {
            return;
        }
        throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", s, j, i));
    }
}
