// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Closeable;
import java.io.IOException;

public class Class1699 implements Class1682
{
    private final Class8020 field9572;
    private Class9414 field9573;
    private long field9574;
    public final /* synthetic */ Class8165 field9575;
    
    public Class1699(final Class8165 field9575) {
        this.field9575 = field9575;
        this.field9572 = new Class8020();
        this.field9573 = new Class9414(this.field9575.field33639.getChannel());
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long b) throws IOException {
        if (this.field9573 == null) {
            throw new IllegalStateException("closed");
        }
        long field33643 = 0L;
        int n = 0;
        Label_0203: {
            synchronized (this.field9575) {
                while (this.field9574 == (field33643 = this.field9575.field33643)) {
                    if (this.field9575.field33644) {
                        return -1L;
                    }
                    if (this.field9575.field33640 == null) {
                        this.field9575.field33640 = Thread.currentThread();
                        n = 1;
                        break Label_0203;
                    }
                    this.field9572.method26306(this.field9575);
                }
                final long n2 = field33643 - this.field9575.field33646.method5949();
                if (this.field9574 >= n2) {
                    final long min = Math.min(b, field33643 - this.field9574);
                    this.field9575.field33646.method5957(class1680, this.field9574 - n2, min);
                    this.field9574 += min;
                    return min;
                }
                n = 2;
            }
        }
        if (n == 2) {
            final long min2 = Math.min(b, field33643 - this.field9574);
            this.field9573.method35012(32L + this.field9574, class1680, min2);
            this.field9574 += min2;
            return min2;
        }
        try {
            final long method6014 = this.field9575.field33641.method6014(this.field9575.field33642, this.field9575.field33647);
            if (method6014 == -1L) {
                this.field9575.method26997(field33643);
                final long n3 = -1L;
                synchronized (this.field9575) {
                    this.field9575.field33640 = null;
                    this.field9575.notifyAll();
                }
                return n3;
            }
            final long min3 = Math.min(method6014, b);
            this.field9575.field33642.method5957(class1680, 0L, min3);
            this.field9574 += min3;
            this.field9573.method35011(32L + field33643, this.field9575.field33642.clone(), method6014);
            synchronized (this.field9575) {
                this.field9575.field33646.method5920(this.field9575.field33642, method6014);
                if (this.field9575.field33646.method5949() > this.field9575.field33647) {
                    this.field9575.field33646.method5995(this.field9575.field33646.method5949() - this.field9575.field33647);
                }
                final Class8165 field33644 = this.field9575;
                field33644.field33643 += method6014;
            }
            final long n4 = min3;
            synchronized (this.field9575) {
                this.field9575.field33640 = null;
                this.field9575.notifyAll();
            }
            return n4;
        }
        finally {
            synchronized (this.field9575) {
                this.field9575.field33640 = null;
                this.field9575.notifyAll();
            }
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9572;
    }
    
    @Override
    public void close() throws IOException {
        if (this.field9573 == null) {
            return;
        }
        this.field9573 = null;
        Closeable field33639 = null;
        synchronized (this.field9575) {
            final Class8165 field33640 = this.field9575;
            --field33640.field33648;
            if (this.field9575.field33648 == 0) {
                field33639 = this.field9575.field33639;
                this.field9575.field33639 = null;
            }
        }
        if (field33639 != null) {
            Class7690.method24432(field33639);
        }
    }
}
