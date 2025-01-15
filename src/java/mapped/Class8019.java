// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import java.io.InterruptedIOException;
import java.io.IOException;

public class Class8019 extends Class8020
{
    private static final int field33028 = 65536;
    private static final long field33029;
    private static final long field33030;
    public static Class8019 field33031;
    private boolean field33032;
    private Class8019 field33033;
    private long field33034;
    
    public final void method26285() {
        if (this.field33032) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        final long method26298 = this.method26298();
        final boolean method26299 = this.method26299();
        if (method26298 == 0L && !method26299) {
            return;
        }
        this.field33032 = true;
        method26286(this, method26298, method26299);
    }
    
    private static synchronized void method26286(final Class8019 field33033, final long a, final boolean b) {
        if (Class8019.field33031 == null) {
            Class8019.field33031 = new Class8019();
            new Class931().start();
        }
        final long nanoTime = System.nanoTime();
        if (a != 0L && b) {
            field33033.field33034 = nanoTime + Math.min(a, field33033.method26300() - nanoTime);
        }
        else if (a == 0L) {
            if (!b) {
                throw new AssertionError();
            }
            field33033.field33034 = field33033.method26300();
        }
        else {
            field33033.field33034 = nanoTime + a;
        }
        long method26289;
        Class8019 class8019;
        for (method26289 = field33033.method26289(nanoTime), class8019 = Class8019.field33031; class8019.field33033 != null && method26289 >= class8019.field33033.method26289(nanoTime); class8019 = class8019.field33033) {}
        field33033.field33033 = class8019.field33033;
        class8019.field33033 = field33033;
        if (class8019 == Class8019.field33031) {
            Class8019.class.notify();
        }
    }
    
    public final boolean method26287() {
        if (this.field33032) {
            this.field33032 = false;
            return method26288(this);
        }
        return false;
    }
    
    private static synchronized boolean method26288(final Class8019 class8019) {
        for (Class8019 class8020 = Class8019.field33031; class8020 != null; class8020 = class8020.field33033) {
            if (class8020.field33033 == class8019) {
                class8020.field33033 = class8019.field33033;
                class8019.field33033 = null;
                return false;
            }
        }
        return true;
    }
    
    private long method26289(final long n) {
        return this.field33034 - n;
    }
    
    public void method26290() {
    }
    
    public final Class1676 method26291(final Class1676 class1676) {
        return new Class1702(this, class1676);
    }
    
    public final Class1682 method26292(final Class1682 class1682) {
        return new Class1696(this, class1682);
    }
    
    public final void method26293(final boolean b) throws IOException {
        if (this.method26287() && b) {
            throw this.method26295(null);
        }
    }
    
    public final IOException method26294(final IOException ex) throws IOException {
        if (this.method26287()) {
            return this.method26295(ex);
        }
        return ex;
    }
    
    public IOException method26295(final IOException cause) {
        final InterruptedIOException ex = new InterruptedIOException("timeout");
        if (cause != null) {
            ex.initCause(cause);
        }
        return ex;
    }
    
    @Nullable
    public static Class8019 method26296() throws InterruptedException {
        final Class8019 field33033 = Class8019.field33031.field33033;
        if (field33033 == null) {
            final long nanoTime = System.nanoTime();
            Class8019.class.wait(Class8019.field33029);
            return (Class8019.field33031.field33033 == null && System.nanoTime() - nanoTime >= Class8019.field33030) ? Class8019.field33031 : null;
        }
        final long method26289 = field33033.method26289(System.nanoTime());
        if (method26289 <= 0L) {
            Class8019.field33031.field33033 = field33033.field33033;
            field33033.field33033 = null;
            return field33033;
        }
        final long timeoutMillis = method26289 / 1000000L;
        Class8019.class.wait(timeoutMillis, (int)(method26289 - timeoutMillis * 1000000L));
        return null;
    }
    
    static {
        field33029 = TimeUnit.SECONDS.toMillis(60L);
        field33030 = TimeUnit.MILLISECONDS.toNanos(Class8019.field33029);
    }
}
