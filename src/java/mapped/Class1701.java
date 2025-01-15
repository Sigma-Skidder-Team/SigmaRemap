// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.OutputStream;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.io.IOException;

public final class Class1701 implements Class1679
{
    public final Class1680 field9579;
    public final Class1676 field9580;
    public boolean field9581;
    
    public Class1701(final Class1676 field9580) {
        this.field9579 = new Class1680();
        if (field9580 != null) {
            this.field9580 = field9580;
            return;
        }
        throw new NullPointerException("sink == null");
    }
    
    @Override
    public Class1680 method5926() {
        return this.field9579;
    }
    
    @Override
    public void method5920(final Class1680 class1680, final long n) throws IOException {
        if (!this.field9581) {
            this.field9579.method5920(class1680, n);
            this.method5947();
            return;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5927(final Class1929 class1929) throws IOException {
        if (!this.field9581) {
            this.field9579.method5996(class1929);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5932(final String s) throws IOException {
        if (!this.field9581) {
            this.field9579.method5997(s);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5933(final String s, final int n, final int n2) throws IOException {
        if (!this.field9581) {
            this.field9579.method5998(s, n, n2);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5934(final int n) throws IOException {
        if (!this.field9581) {
            this.field9579.method5999(n);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5935(final String s, final Charset charset) throws IOException {
        if (!this.field9581) {
            this.field9579.method6000(s, charset);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5936(final String s, final int n, final int n2, final Charset charset) throws IOException {
        if (!this.field9581) {
            this.field9579.method6001(s, n, n2, charset);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5928(final byte[] array) throws IOException {
        if (!this.field9581) {
            this.field9579.method6002(array);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5929(final byte[] array, final int n, final int n2) throws IOException {
        if (!this.field9581) {
            this.field9579.method6003(array, n, n2);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public long method5930(final Class1682 class1682) throws IOException {
        if (class1682 != null) {
            long n = 0L;
            long method6014;
            while ((method6014 = class1682.method6014(this.field9579, 8192L)) != -1L) {
                n += method6014;
                this.method5947();
            }
            return n;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    @Override
    public Class1679 method5931(final Class1682 class1682, long n) throws IOException {
        while (n > 0L) {
            final long method6014 = class1682.method6014(this.field9579, n);
            if (method6014 == -1L) {
                throw new EOFException();
            }
            n -= method6014;
            this.method5947();
        }
        return this;
    }
    
    @Override
    public Class1679 method5937(final int n) throws IOException {
        if (!this.field9581) {
            this.field9579.method6004(n);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5938(final int n) throws IOException {
        if (!this.field9581) {
            this.field9579.method6005(n);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5939(final int n) throws IOException {
        if (!this.field9581) {
            this.field9579.method6006(n);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5940(final int n) throws IOException {
        if (!this.field9581) {
            this.field9579.method6007(n);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5941(final int n) throws IOException {
        if (!this.field9581) {
            this.field9579.method6008(n);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5942(final long n) throws IOException {
        if (!this.field9581) {
            this.field9579.method6009(n);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5943(final long n) throws IOException {
        if (!this.field9581) {
            this.field9579.method6010(n);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5944(final long n) throws IOException {
        if (!this.field9581) {
            this.field9579.method6011(n);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5945(final long n) throws IOException {
        if (!this.field9581) {
            this.field9579.method6012(n);
            return this.method5947();
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5947() throws IOException {
        if (!this.field9581) {
            final long method5963 = this.field9579.method5963();
            if (method5963 > 0L) {
                this.field9580.method5920(this.field9579, method5963);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public Class1679 method5946() throws IOException {
        if (!this.field9581) {
            final long method5949 = this.field9579.method5949();
            if (method5949 > 0L) {
                this.field9580.method5920(this.field9579, method5949);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public OutputStream method5948() {
        return new Class1716(this);
    }
    
    @Override
    public void flush() throws IOException {
        if (!this.field9581) {
            if (this.field9579.field9512 > 0L) {
                this.field9580.method5920(this.field9579, this.field9579.field9512);
            }
            this.field9580.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }
    
    @Override
    public void close() throws IOException {
        if (this.field9581) {
            return;
        }
        Throwable t = null;
        try {
            if (this.field9579.field9512 > 0L) {
                this.field9580.method5920(this.field9579, this.field9579.field9512);
            }
        }
        catch (final Throwable t2) {
            t = t2;
        }
        try {
            this.field9580.close();
        }
        catch (final Throwable t3) {
            if (t == null) {
                t = t3;
            }
        }
        this.field9581 = true;
        if (t != null) {
            Class9476.method35281(t);
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9580.method5921();
    }
    
    @Override
    public String toString() {
        return "buffer(" + this.field9580 + ")";
    }
}
