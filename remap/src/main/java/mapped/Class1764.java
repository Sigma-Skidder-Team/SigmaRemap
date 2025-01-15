// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.Reader;

public final class Class1764 extends Reader
{
    private final Class1681 field9817;
    private final Charset field9818;
    private boolean field9819;
    private Reader field9820;
    
    public Class1764(final Class1681 field9817, final Charset field9818) {
        this.field9817 = field9817;
        this.field9818 = field9818;
    }
    
    @Override
    public int read(final char[] array, final int n, final int n2) throws IOException {
        if (!this.field9819) {
            Reader field9820 = this.field9820;
            if (field9820 == null) {
                final InputStreamReader field9821 = new InputStreamReader(this.field9817.method5954(), Class7690.method24457(this.field9817, this.field9818));
                this.field9820 = field9821;
                field9820 = field9821;
            }
            return field9820.read(array, n, n2);
        }
        throw new IOException("Stream closed");
    }
    
    @Override
    public void close() throws IOException {
        this.field9819 = true;
        if (this.field9820 == null) {
            this.field9817.close();
        }
        else {
            this.field9820.close();
        }
    }
}
