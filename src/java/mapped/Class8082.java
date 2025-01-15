// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InterruptedIOException;
import java.util.Collection;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public final class Class8082
{
    public long field33277;
    public long field33278;
    public final int field33279;
    public final Class1758 field33280;
    private final List<Class8975> field33281;
    private List<Class8975> field33282;
    private boolean field33283;
    private final Class1689 field33284;
    public final Class1710 field33285;
    public final Class8024 field33286;
    public final Class8024 field33287;
    public Class2082 field33288;
    public static final /* synthetic */ boolean field33289;
    
    public Class8082(final int field33279, final Class1758 field33280, final boolean field33281, final boolean field33282, final List<Class8975> field33283) {
        this.field33277 = 0L;
        this.field33286 = new Class8024(this);
        this.field33287 = new Class8024(this);
        this.field33288 = null;
        if (field33280 == null) {
            throw new NullPointerException("connection == null");
        }
        if (field33283 != null) {
            this.field33279 = field33279;
            this.field33280 = field33280;
            this.field33278 = field33280.field9791.method29870();
            this.field33284 = new Class1689(this, field33280.field9789.method29870());
            this.field33285 = new Class1710(this);
            this.field33284.field9541 = field33282;
            this.field33285.field9604 = field33281;
            this.field33281 = field33283;
            return;
        }
        throw new NullPointerException("requestHeaders == null");
    }
    
    public int method26517() {
        return this.field33279;
    }
    
    public synchronized boolean method26518() {
        if (this.field33288 == null) {
            if (this.field33284.field9541 || this.field33284.field9540) {
                if (this.field33285.field9604 || this.field33285.field9603) {
                    if (this.field33283) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean method26519() {
        return this.field33280.field9776 == ((this.field33279 & 0x1) == 0x1);
    }
    
    public Class1758 method26520() {
        return this.field33280;
    }
    
    public List<Class8975> method26521() {
        return this.field33281;
    }
    
    public synchronized List<Class8975> method26522() throws IOException {
        if (!this.method26519()) {
            throw new IllegalStateException("servers cannot read response headers");
        }
        this.field33286.method26285();
        try {
            while (this.field33282 == null && this.field33288 == null) {
                this.method26539();
            }
        }
        finally {
            this.field33286.method26309();
        }
        final List<Class8975> field33282 = this.field33282;
        if (field33282 != null) {
            this.field33282 = null;
            return field33282;
        }
        throw new Class2353(this.field33288);
    }
    
    public synchronized Class2082 method26523() {
        return this.field33288;
    }
    
    public void method26524(final List<Class8975> list, final boolean b) throws IOException {
        if (!Class8082.field33289 && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (list == null) {
            throw new NullPointerException("responseHeaders == null");
        }
        boolean b2 = false;
        synchronized (this) {
            this.field33283 = true;
            if (!b) {
                this.field33285.field9604 = true;
                b2 = true;
            }
        }
        this.field33280.method6242(this.field33279, b2, list);
        if (b2) {
            this.field33280.method6252();
        }
    }
    
    public Class8020 method26525() {
        return this.field33286;
    }
    
    public Class8020 method26526() {
        return this.field33287;
    }
    
    public Class1682 method26527() {
        return this.field33284;
    }
    
    public Class1676 method26528() {
        synchronized (this) {
            if (!this.field33283 && !this.method26519()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.field33285;
    }
    
    public void method26529(final Class2082 class2082) throws IOException {
        if (this.method26531(class2082)) {
            this.field33280.method6246(this.field33279, class2082);
        }
    }
    
    public void method26530(final Class2082 class2082) {
        if (this.method26531(class2082)) {
            this.field33280.method6245(this.field33279, class2082);
        }
    }
    
    private boolean method26531(final Class2082 field33288) {
        if (!Class8082.field33289 && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.field33288 != null) {
                return false;
            }
            if (this.field33284.field9541 && this.field33285.field9604) {
                return false;
            }
            this.field33288 = field33288;
            this.notifyAll();
        }
        this.field33280.method6237(this.field33279);
        return true;
    }
    
    public void method26532(final List<Class8975> field33282) {
        if (!Class8082.field33289 && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        boolean method26518 = true;
        synchronized (this) {
            this.field33283 = true;
            if (this.field33282 == null) {
                this.field33282 = field33282;
                method26518 = this.method26518();
                this.notifyAll();
            }
            else {
                final ArrayList field33283 = new ArrayList();
                field33283.addAll(this.field33282);
                field33283.add(null);
                field33283.addAll(field33282);
                this.field33282 = field33283;
            }
        }
        if (!method26518) {
            this.field33280.method6237(this.field33279);
        }
    }
    
    public void method26533(final Class1681 class1681, final int n) throws IOException {
        if (!Class8082.field33289 && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.field33284.method6044(class1681, n);
    }
    
    public void method26534() {
        if (!Class8082.field33289 && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        final boolean method26518;
        synchronized (this) {
            this.field33284.field9541 = true;
            method26518 = this.method26518();
            this.notifyAll();
        }
        if (!method26518) {
            this.field33280.method6237(this.field33279);
        }
    }
    
    public synchronized void method26535(final Class2082 field33288) {
        if (this.field33288 == null) {
            this.field33288 = field33288;
            this.notifyAll();
        }
    }
    
    public void method26536() throws IOException {
        if (!Class8082.field33289 && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        final boolean b;
        final boolean method26518;
        synchronized (this) {
            b = (!this.field33284.field9541 && this.field33284.field9540 && (this.field33285.field9604 || this.field33285.field9603));
            method26518 = this.method26518();
        }
        if (b) {
            this.method26529(Class2082.field12044);
        }
        else if (!method26518) {
            this.field33280.method6237(this.field33279);
        }
    }
    
    public void method26537(final long n) {
        this.field33278 += n;
        if (n > 0L) {
            this.notifyAll();
        }
    }
    
    public void method26538() throws IOException {
        if (this.field33285.field9603) {
            throw new IOException("stream closed");
        }
        if (this.field33285.field9604) {
            throw new IOException("stream finished");
        }
        if (this.field33288 == null) {
            return;
        }
        throw new Class2353(this.field33288);
    }
    
    public void method26539() throws InterruptedIOException {
        try {
            this.wait();
        }
        catch (final InterruptedException ex) {
            throw new InterruptedIOException();
        }
    }
    
    static {
        field33289 = !Class8082.class.desiredAssertionStatus();
    }
}
