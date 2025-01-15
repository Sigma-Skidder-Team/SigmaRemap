// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.EOFException;
import java.io.IOException;

public final class Class1689 implements Class1682
{
    private final Class1680 field9537;
    private final Class1680 field9538;
    private final long field9539;
    public boolean field9540;
    public boolean field9541;
    public static final /* synthetic */ boolean field9542;
    public final /* synthetic */ Class8082 field9543;
    
    public Class1689(final Class8082 field9543, final long field9544) {
        this.field9543 = field9543;
        this.field9537 = new Class1680();
        this.field9538 = new Class1680();
        this.field9539 = field9544;
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long n) throws IOException {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        final long method6014;
        synchronized (this.field9543) {
            this.method6043();
            this.method6045();
            if (this.field9538.method5949() == 0L) {
                return -1L;
            }
            method6014 = this.field9538.method6014(class1680, Math.min(n, this.field9538.method5949()));
            final Class8082 field9543 = this.field9543;
            field9543.field33277 += method6014;
            if (this.field9543.field33277 >= this.field9543.field33280.field9789.method29870() / 2) {
                this.field9543.field33280.method6247(this.field9543.field33279, this.field9543.field33277);
                this.field9543.field33277 = 0L;
            }
        }
        synchronized (this.field9543.field33280) {
            final Class1758 field9544 = this.field9543.field33280;
            field9544.field9787 += method6014;
            if (this.field9543.field33280.field9787 >= this.field9543.field33280.field9789.method29870() / 2) {
                this.field9543.field33280.method6247(0, this.field9543.field33280.field9787);
                this.field9543.field33280.field9787 = 0L;
            }
        }
        return method6014;
    }
    
    private void method6043() throws IOException {
        this.field9543.field33286.method26285();
        try {
            while (this.field9538.method5949() == 0L && !this.field9541 && !this.field9540 && this.field9543.field33288 == null) {
                this.field9543.method26539();
            }
        }
        finally {
            this.field9543.field33286.method26309();
        }
    }
    
    public void method6044(final Class1681 class1681, long n) throws IOException {
        if (!Class1689.field9542 && Thread.holdsLock(this.field9543)) {
            throw new AssertionError();
        }
        while (n > 0L) {
            final boolean field9541;
            final boolean b;
            synchronized (this.field9543) {
                field9541 = this.field9541;
                b = (n + this.field9538.method5949() > this.field9539);
            }
            if (b) {
                class1681.method5995(n);
                this.field9543.method26530(Class2082.field12042);
                return;
            }
            if (field9541) {
                class1681.method5995(n);
                return;
            }
            final long method6014 = class1681.method6014(this.field9537, n);
            if (method6014 == -1L) {
                throw new EOFException();
            }
            n -= method6014;
            synchronized (this.field9543) {
                final boolean b2 = this.field9538.method5949() == 0L;
                this.field9538.method5930(this.field9537);
                if (!b2) {
                    continue;
                }
                this.field9543.notifyAll();
            }
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9543.field33286;
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this.field9543) {
            this.field9540 = true;
            this.field9538.method5994();
            this.field9543.notifyAll();
        }
        this.field9543.method26536();
    }
    
    private void method6045() throws IOException {
        if (this.field9540) {
            throw new IOException("stream closed");
        }
        if (this.field9543.field33288 == null) {
            return;
        }
        throw new Class2353(this.field9543.field33288);
    }
    
    static {
        field9542 = !Class8082.class.desiredAssertionStatus();
    }
}
