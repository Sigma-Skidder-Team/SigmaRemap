// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;
import java.net.SocketTimeoutException;
import java.io.IOException;
import java.net.Socket;

public final class Class8023 extends Class8019
{
    public final /* synthetic */ Socket field33040;
    
    public Class8023(final Socket field33040) {
        this.field33040 = field33040;
    }
    
    @Override
    public IOException method26295(final IOException cause) {
        final SocketTimeoutException ex = new SocketTimeoutException("timeout");
        if (cause != null) {
            ex.initCause(cause);
        }
        return ex;
    }
    
    @Override
    public void method26290() {
        try {
            this.field33040.close();
            return;
        }
        catch (final Exception thrown) {
            Class8753.field36764.log(Level.WARNING, "Failed to close timed out socket " + this.field33040, thrown);
            return;
        }
        catch (final AssertionError thrown2) {
            if (Class8753.method30290(thrown2)) {
                Class8753.field36764.log(Level.WARNING, "Failed to close timed out socket " + this.field33040, thrown2);
                return;
            }
        }
        throw;
    }
}
