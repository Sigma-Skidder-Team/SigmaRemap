// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public final class Class1677 implements Class1676
{
    public final Class8020 field9502;
    public final /* synthetic */ Class7998 field9503;
    
    public Class1677(final Class7998 field9503) {
        this.field9503 = field9503;
        this.field9502 = new Class8020();
    }
    
    @Override
    public void method5920(final Class1680 class1680, long b) throws IOException {
        synchronized (this.field9503.field32943) {
            if (this.field9503.field32944) {
                throw new IllegalStateException("closed");
            }
            while (b > 0L) {
                if (this.field9503.field32945) {
                    throw new IOException("source is closed");
                }
                final long a = this.field9503.field32942 - this.field9503.field32943.method5949();
                if (a == 0L) {
                    this.field9502.method26306(this.field9503.field32943);
                }
                else {
                    final long min = Math.min(a, b);
                    this.field9503.field32943.method5920(class1680, min);
                    b -= min;
                    this.field9503.field32943.notifyAll();
                }
            }
        }
    }
    
    @Override
    public void flush() throws IOException {
        synchronized (this.field9503.field32943) {
            if (this.field9503.field32944) {
                throw new IllegalStateException("closed");
            }
            if (this.field9503.field32945 && this.field9503.field32943.method5949() > 0L) {
                throw new IOException("source is closed");
            }
        }
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this.field9503.field32943) {
            if (this.field9503.field32944) {
                return;
            }
            if (this.field9503.field32945 && this.field9503.field32943.method5949() > 0L) {
                throw new IOException("source is closed");
            }
            this.field9503.field32944 = true;
            this.field9503.field32943.notifyAll();
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9502;
    }
}
