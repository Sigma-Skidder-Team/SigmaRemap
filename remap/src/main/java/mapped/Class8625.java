// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.Random;

public final class Class8625
{
    public final boolean field36195;
    public final Random field36196;
    public final Class1679 field36197;
    public boolean field36198;
    public final Class1680 field36199;
    public final Class1714 field36200;
    public boolean field36201;
    public final byte[] field36202;
    public final byte[] field36203;
    public static final /* synthetic */ boolean field36204;
    
    public Class8625(final boolean field36195, final Class1679 field36196, final Random field36197) {
        this.field36199 = new Class1680();
        this.field36200 = new Class1714(this);
        if (field36196 == null) {
            throw new NullPointerException("sink == null");
        }
        if (field36197 != null) {
            this.field36195 = field36195;
            this.field36197 = field36196;
            this.field36196 = field36197;
            this.field36202 = field36195 ? new byte[4] : null;
            this.field36203 = field36195 ? new byte[8192] : null;
            return;
        }
        throw new NullPointerException("random == null");
    }
    
    public void method29267(final Class1929 class1929) throws IOException {
        synchronized (this) {
            this.method29270(9, class1929);
        }
    }
    
    public void method29268(final Class1929 class1929) throws IOException {
        synchronized (this) {
            this.method29270(10, class1929);
        }
    }
    
    public void method29269(final int n, final Class1929 class1929) throws IOException {
        Class1929 class1930 = Class1929.field10532;
        if (n != 0 || class1929 != null) {
            if (n != 0) {
                Class8402.method28022(n);
            }
            final Class1680 class1931 = new Class1680();
            class1931.method6005(n);
            if (class1929 != null) {
                class1931.method5996(class1929);
            }
            class1930 = class1931.method5974();
        }
        synchronized (this) {
            try {
                this.method29270(8, class1930);
            }
            finally {
                this.field36198 = true;
            }
        }
    }
    
    private void method29270(final int n, final Class1929 class1929) throws IOException {
        if (!Class8625.field36204 && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (this.field36198) {
            throw new IOException("closed");
        }
        final int method7766 = class1929.method7766();
        if (method7766 <= 125L) {
            this.field36197.method5937(0x80 | n);
            final int n2 = method7766;
            if (!this.field36195) {
                this.field36197.method5937(n2);
                this.field36197.method5927(class1929);
            }
            else {
                this.field36197.method5937(n2 | 0x80);
                this.field36196.nextBytes(this.field36202);
                this.field36197.method5928(this.field36202);
                final byte[] method7767 = class1929.method7767();
                Class8402.method28020(method7767, method7767.length, this.field36202, 0L);
                this.field36197.method5928(method7767);
            }
            this.field36197.flush();
            return;
        }
        throw new IllegalArgumentException("Payload size must be less than or equal to 125");
    }
    
    public Class1676 method29271(final int field9616, final long field9617) {
        if (!this.field36201) {
            this.field36201 = true;
            this.field36200.field9616 = field9616;
            this.field36200.field9617 = field9617;
            this.field36200.field9618 = true;
            this.field36200.field9619 = false;
            return this.field36200;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }
    
    public void method29272(final int n, final long a, final boolean b, final boolean b2) throws IOException {
        if (!Class8625.field36204 && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.field36198) {
            int n2 = b ? n : 0;
            if (b2) {
                n2 |= 0x80;
            }
            this.field36197.method5937(n2);
            int n3 = 0;
            if (this.field36195) {
                n3 |= 0x80;
            }
            if (a > 125L) {
                if (a > 65535L) {
                    this.field36197.method5937(n3 | 0x7F);
                    this.field36197.method5942(a);
                }
                else {
                    this.field36197.method5937(n3 | 0x7E);
                    this.field36197.method5938((int)a);
                }
            }
            else {
                this.field36197.method5937(n3 | (int)a);
            }
            if (!this.field36195) {
                this.field36197.method5920(this.field36199, a);
            }
            else {
                this.field36196.nextBytes(this.field36202);
                this.field36197.method5928(this.field36202);
                int method5993;
                for (long n4 = 0L; n4 < a; n4 += method5993) {
                    method5993 = this.field36199.method5993(this.field36203, 0, (int)Math.min(a, this.field36203.length));
                    if (method5993 == -1) {
                        throw new AssertionError();
                    }
                    Class8402.method28020(this.field36203, method5993, this.field36202, n4);
                    this.field36197.method5929(this.field36203, 0, method5993);
                }
            }
            this.field36197.method5946();
            return;
        }
        throw new IOException("closed");
    }
    
    static {
        field36204 = !Class8625.class.desiredAssertionStatus();
    }
}
