// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public final class Class1698 implements Class1682
{
    public final Class8020 field9570;
    public final /* synthetic */ Class7998 field9571;
    
    public Class1698(final Class7998 field9571) {
        this.field9571 = field9571;
        this.field9570 = new Class8020();
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long n) throws IOException {
        synchronized (this.field9571.field32943) {
            if (this.field9571.field32945) {
                throw new IllegalStateException("closed");
            }
            while (this.field9571.field32943.method5949() == 0L) {
                if (this.field9571.field32944) {
                    return -1L;
                }
                this.field9570.method26306(this.field9571.field32943);
            }
            final long method6014 = this.field9571.field32943.method6014(class1680, n);
            this.field9571.field32943.notifyAll();
            return method6014;
        }
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this.field9571.field32943) {
            this.field9571.field32945 = true;
            this.field9571.field32943.notifyAll();
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9570;
    }
}
