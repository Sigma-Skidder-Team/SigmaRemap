// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class Class8020
{
    public static final Class8020 field33035;
    private boolean field33036;
    private long field33037;
    private long field33038;
    
    public Class8020 method26297(final long n, final TimeUnit timeUnit) {
        if (n < 0L) {
            throw new IllegalArgumentException("timeout < 0: " + n);
        }
        if (timeUnit != null) {
            this.field33038 = timeUnit.toNanos(n);
            return this;
        }
        throw new IllegalArgumentException("unit == null");
    }
    
    public long method26298() {
        return this.field33038;
    }
    
    public boolean method26299() {
        return this.field33036;
    }
    
    public long method26300() {
        if (this.field33036) {
            return this.field33037;
        }
        throw new IllegalStateException("No deadline");
    }
    
    public Class8020 method26301(final long field33037) {
        this.field33036 = true;
        this.field33037 = field33037;
        return this;
    }
    
    public final Class8020 method26302(final long n, final TimeUnit timeUnit) {
        if (n <= 0L) {
            throw new IllegalArgumentException("duration <= 0: " + n);
        }
        if (timeUnit != null) {
            return this.method26301(System.nanoTime() + timeUnit.toNanos(n));
        }
        throw new IllegalArgumentException("unit == null");
    }
    
    public Class8020 method26303() {
        this.field33038 = 0L;
        return this;
    }
    
    public Class8020 method26304() {
        this.field33036 = false;
        return this;
    }
    
    public void method26305() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.field33036 && this.field33037 - System.nanoTime() <= 0L) {
            throw new InterruptedIOException("deadline reached");
        }
    }
    
    public final void method26306(final Object o) throws InterruptedIOException {
        try {
            final boolean method26299 = this.method26299();
            final long method26300 = this.method26298();
            if (!method26299 && method26300 == 0L) {
                o.wait();
                return;
            }
            final long nanoTime = System.nanoTime();
            long min;
            if (method26299 && method26300 != 0L) {
                min = Math.min(method26300, this.method26300() - nanoTime);
            }
            else if (method26299) {
                min = this.method26300() - nanoTime;
            }
            else {
                min = method26300;
            }
            long n = 0L;
            if (min > 0L) {
                final long timeoutMillis = min / 1000000L;
                o.wait(timeoutMillis, (int)(min - timeoutMillis * 1000000L));
                n = System.nanoTime() - nanoTime;
            }
            if (n >= min) {
                throw new InterruptedIOException("timeout");
            }
        }
        catch (final InterruptedException ex) {
            throw new InterruptedIOException("interrupted");
        }
    }
    
    static {
        field33035 = new Class8021();
    }
}
