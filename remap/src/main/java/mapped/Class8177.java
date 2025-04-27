// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Class8177 extends Class8178<Class8177>
{
    private final String field33684;
    
    public Class8177(final String s, final String field33684, final int n, final int n2) {
        super(s, n, n2);
        this.field33684 = field33684;
    }
    
    public Class8177 method27075() {
        try {
            if (this.field33684 != null) {
                this.field33685.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            }
            this.field33685.setDoOutput(true);
            this.field33685.setDoInput(true);
            this.field33685.setRequestMethod("PUT");
            final OutputStream outputStream = this.field33685.getOutputStream();
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
            outputStreamWriter.write(this.field33684);
            outputStreamWriter.close();
            outputStream.flush();
            return this;
        }
        catch (final Exception ex) {
            throw new Class2356(ex.getMessage(), ex);
        }
    }
}
