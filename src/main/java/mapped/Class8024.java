// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.SocketTimeoutException;
import java.io.IOException;

public class Class8024 extends Class8019
{
    public final /* synthetic */ Class8082 field33041;
    
    public Class8024(final Class8082 field33041) {
        this.field33041 = field33041;
    }
    
    @Override
    public void method26290() {
        this.field33041.method26530(Class2082.field12044);
    }
    
    @Override
    public IOException method26295(final IOException cause) {
        final SocketTimeoutException ex = new SocketTimeoutException("timeout");
        if (cause != null) {
            ex.initCause(cause);
        }
        return ex;
    }
    
    public void method26309() throws IOException {
        if (!this.method26287()) {
            return;
        }
        throw this.method26295(null);
    }
}
