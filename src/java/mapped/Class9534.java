// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import org.apache.http.util.Args;
import java.io.OutputStream;
import java.io.InputStream;
import org.apache.http.entity.InputStreamEntity;

public class Class9534 extends InputStreamEntity
{
    private final long field41033;
    private final InputStream field41034;
    private final Class8908 field41035;
    
    public Class9534(final InputStream field41034, final long field41035, final Class8908 field41036) {
        super(field41034);
        this.field41034 = field41034;
        this.field41033 = field41035;
        this.field41035 = field41036;
    }
    
    public void writeTo(final OutputStream outputStream) throws IOException {
        Args.notNull((Object)outputStream, "Output stream");
        final InputStream field41034 = this.field41034;
        try {
            final byte[] array = new byte[4096];
            if (this.field41033 < 0L) {
                int read;
                while ((read = field41034.read(array)) != -1) {
                    outputStream.write(array, 0, read);
                    final Class8908 field41035 = this.field41035;
                    field41035.field37451 += (Long)read;
                }
            }
            else {
                long field41036 = this.field41033;
                while (field41036 > 0L) {
                    final int read2 = field41034.read(array, 0, (int)Math.min(4096L, field41036));
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(array, 0, read2);
                    final Class8908 field41037 = this.field41035;
                    field41037.field37451 += (Long)read2;
                    field41036 -= read2;
                    outputStream.flush();
                }
            }
        }
        finally {
            field41034.close();
        }
    }
}
