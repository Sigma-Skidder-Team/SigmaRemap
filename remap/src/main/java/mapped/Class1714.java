// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public final class Class1714 implements Class1676
{
    public int field9616;
    public long field9617;
    public boolean field9618;
    public boolean field9619;
    public final /* synthetic */ Class8625 field9620;
    
    public Class1714(final Class8625 field9620) {
        this.field9620 = field9620;
    }
    
    @Override
    public void method5920(final Class1680 class1680, final long n) throws IOException {
        if (this.field9619) {
            throw new IOException("closed");
        }
        this.field9620.field36199.method5920(class1680, n);
        final boolean b = this.field9618 && this.field9617 != -1L && this.field9620.field36199.method5949() > this.field9617 - 8192L;
        final long method5963 = this.field9620.field36199.method5963();
        if (method5963 > 0L && !b) {
            synchronized (this.field9620) {
                this.field9620.method29272(this.field9616, method5963, this.field9618, false);
            }
            this.field9618 = false;
        }
    }
    
    @Override
    public void flush() throws IOException {
        if (this.field9619) {
            throw new IOException("closed");
        }
        synchronized (this.field9620) {
            this.field9620.method29272(this.field9616, this.field9620.field36199.method5949(), this.field9618, false);
        }
        this.field9618 = false;
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9620.field36197.method5921();
    }
    
    @Override
    public void close() throws IOException {
        if (this.field9619) {
            throw new IOException("closed");
        }
        synchronized (this.field9620) {
            this.field9620.method29272(this.field9616, this.field9620.field36199.method5949(), this.field9618, true);
        }
        this.field9619 = true;
        this.field9620.field36201 = false;
    }
}
