// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1702 implements Class1676
{
    public final /* synthetic */ Class1676 field9582;
    public final /* synthetic */ Class8019 field9583;
    
    public Class1702(final Class8019 field9583, final Class1676 field9584) {
        this.field9583 = field9583;
        this.field9582 = field9584;
    }
    
    @Override
    public void method5920(final Class1680 class1680, long n) throws IOException {
        Class9476.method35277(class1680.field9512, 0L, n);
        while (n > 0L) {
            long n2 = 0L;
            Class9258 class1681 = class1680.field9511;
            while (n2 < 65536L) {
                n2 += class1680.field9511.field39715 - class1680.field9511.field39714;
                if (n2 >= n) {
                    n2 = n;
                    break;
                }
                class1681 = class1681.field39718;
            }
            boolean b = false;
            this.field9583.method26285();
            try {
                this.field9582.method5920(class1680, n2);
                n -= n2;
                b = true;
            }
            catch (final IOException ex) {
                throw this.field9583.method26294(ex);
            }
            finally {
                this.field9583.method26293(b);
            }
        }
    }
    
    @Override
    public void flush() throws IOException {
        boolean b = false;
        this.field9583.method26285();
        try {
            this.field9582.flush();
            b = true;
        }
        catch (final IOException ex) {
            throw this.field9583.method26294(ex);
        }
        finally {
            this.field9583.method26293(b);
        }
    }
    
    @Override
    public void close() throws IOException {
        boolean b = false;
        this.field9583.method26285();
        try {
            this.field9582.close();
            b = true;
        }
        catch (final IOException ex) {
            throw this.field9583.method26294(ex);
        }
        finally {
            this.field9583.method26293(b);
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9583;
    }
    
    @Override
    public String toString() {
        return "AsyncTimeout.sink(" + this.field9582 + ")";
    }
}
