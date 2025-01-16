// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.FilterInputStream;

public class Class1748 extends FilterInputStream
{
    private final String field9729;
    private boolean field9730;
    
    public Class1748(final InputStream in, final ResourceLocation obj, final String str) {
        super(in);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream(byteArrayOutputStream));
        this.field9729 = "Leaked resource: '" + obj + "' loaded from pack: '" + str + "'\n" + byteArrayOutputStream;
    }
    
    @Override
    public void close() throws IOException {
        super.close();
        this.field9730 = true;
    }
    
    public void finalize() throws Throwable {
        if (!this.field9730) {
            Class6583.method19944().warn(this.field9729);
        }
        super.finalize();
    }
}
