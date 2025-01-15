// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public final class Class1710 implements Class1676
{
    private static String[] field9600;
    private static final long field9601 = 16384L;
    private final Class1680 field9602;
    public boolean field9603;
    public boolean field9604;
    public static final /* synthetic */ boolean field9605;
    public final /* synthetic */ Class8082 field9606;
    
    public Class1710(final Class8082 field9606) {
        this.field9606 = field9606;
        this.field9602 = new Class1680();
    }
    
    @Override
    public void method5920(final Class1680 class1680, final long n) throws IOException {
        if (!Class1710.field9605 && Thread.holdsLock(this.field9606)) {
            throw new AssertionError();
        }
        this.field9602.method5920(class1680, n);
        while (this.field9602.method5949() >= 16384L) {
            this.method6068(false);
        }
    }
    
    private void method6068(final boolean b) throws IOException {
        final long min;
        synchronized (this.field9606) {
            this.field9606.field33287.method26285();
            try {
                while (this.field9606.field33278 <= 0L && !this.field9604 && !this.field9603 && this.field9606.field33288 == null) {
                    this.field9606.method26539();
                }
            }
            finally {
                this.field9606.field33287.method26309();
            }
            this.field9606.method26538();
            min = Math.min(this.field9606.field33278, this.field9602.method5949());
            final Class8082 field9606 = this.field9606;
            field9606.field33278 -= min;
        }
        this.field9606.field33287.method26285();
        try {
            this.field9606.field33280.method6243(this.field9606.field33279, b && min == this.field9602.method5949(), this.field9602, min);
        }
        finally {
            this.field9606.field33287.method26309();
        }
    }
    
    @Override
    public void flush() throws IOException {
        if (!Class1710.field9605 && Thread.holdsLock(this.field9606)) {
            throw new AssertionError();
        }
        synchronized (this.field9606) {
            this.field9606.method26538();
        }
        while (this.field9602.method5949() > 0L) {
            this.method6068(false);
            this.field9606.field33280.method6252();
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9606.field33287;
    }
    
    @Override
    public void close() throws IOException {
        if (!Class1710.field9605 && Thread.holdsLock(this.field9606)) {
            throw new AssertionError();
        }
        synchronized (this.field9606) {
            if (this.field9603) {
                return;
            }
        }
        if (!this.field9606.field33285.field9604) {
            if (this.field9602.method5949() > 0L) {
                while (this.field9602.method5949() > 0L) {
                    this.method6068(true);
                }
            }
            else {
                this.field9606.field33280.method6243(this.field9606.field33279, true, null, 0L);
            }
        }
        synchronized (this.field9606) {
            this.field9603 = true;
        }
        this.field9606.field33280.method6252();
        this.field9606.method26536();
    }
    
    static {
        field9605 = !Class8082.class.desiredAssertionStatus();
    }
}
