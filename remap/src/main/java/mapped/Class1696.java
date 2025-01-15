// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1696 implements Class1682
{
    public final /* synthetic */ Class1682 field9562;
    public final /* synthetic */ Class8019 field9563;
    
    public Class1696(final Class8019 field9563, final Class1682 field9564) {
        this.field9563 = field9563;
        this.field9562 = field9564;
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long n) throws IOException {
        boolean b = false;
        this.field9563.method26285();
        try {
            final long method6014 = this.field9562.method6014(class1680, n);
            b = true;
            return method6014;
        }
        catch (final IOException ex) {
            throw this.field9563.method26294(ex);
        }
        finally {
            this.field9563.method26293(b);
        }
    }
    
    @Override
    public void close() throws IOException {
        boolean b = false;
        try {
            this.field9562.close();
            b = true;
        }
        catch (final IOException ex) {
            throw this.field9563.method26294(ex);
        }
        finally {
            this.field9563.method26293(b);
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9563;
    }
    
    @Override
    public String toString() {
        return "AsyncTimeout.source(" + this.field9562 + ")";
    }
}
