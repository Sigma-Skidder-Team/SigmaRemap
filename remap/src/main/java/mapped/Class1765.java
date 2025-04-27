// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.nio.charset.CodingErrorAction;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class Class1765 extends Reader
{
    private static final Charset field9821;
    private static final Charset field9822;
    private static final Charset field9823;
    public PushbackInputStream field9824;
    public InputStreamReader field9825;
    private static final int field9826 = 3;
    
    public Class1765(final InputStream in) {
        this.field9825 = null;
        this.field9824 = new PushbackInputStream(in, 3);
    }
    
    public String method6293() {
        return this.field9825.getEncoding();
    }
    
    public void method6294() throws IOException {
        if (this.field9825 == null) {
            final byte[] array = new byte[3];
            final int read = this.field9824.read(array, 0, array.length);
            Charset charset = null;
            int len = 0;
            Label_0150: {
                if (array[0] == -17) {
                    if (array[1] == -69) {
                        if (array[2] == -65) {
                            charset = Class1765.field9821;
                            len = read - 3;
                            break Label_0150;
                        }
                    }
                }
                if (array[0] == -2 && array[1] == -1) {
                    charset = Class1765.field9822;
                    len = read - 2;
                }
                else if (array[0] == -1 && array[1] == -2) {
                    charset = Class1765.field9823;
                    len = read - 2;
                }
                else {
                    charset = Class1765.field9821;
                    len = read;
                }
            }
            if (len > 0) {
                this.field9824.unread(array, read - len, len);
            }
            this.field9825 = new InputStreamReader(this.field9824, charset.newDecoder().onUnmappableCharacter(CodingErrorAction.REPORT));
        }
    }
    
    @Override
    public void close() throws IOException {
        this.method6294();
        this.field9825.close();
    }
    
    @Override
    public int read(final char[] cbuf, final int off, final int len) throws IOException {
        this.method6294();
        return this.field9825.read(cbuf, off, len);
    }
    
    static {
        field9821 = StandardCharsets.UTF_8;
        field9822 = StandardCharsets.UTF_16BE;
        field9823 = StandardCharsets.UTF_16LE;
    }
}
