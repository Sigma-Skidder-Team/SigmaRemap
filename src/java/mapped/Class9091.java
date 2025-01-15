// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import org.lwjgl.stb.STBIWriteCallback;

public class Class9091 extends STBIWriteCallback
{
    private static String[] field38497;
    private final WritableByteChannel field38498;
    private IOException field38499;
    
    private Class9091(final WritableByteChannel field38498) {
        this.field38498 = field38498;
    }
    
    public void invoke(final long n, final long n2, final int n3) {
        final ByteBuffer data = getData(n2, n3);
        try {
            this.field38498.write(data);
        }
        catch (final IOException field38499) {
            this.field38499 = field38499;
        }
    }
    
    public void method32842() throws IOException {
        if (this.field38499 == null) {
            return;
        }
        throw this.field38499;
    }
}
