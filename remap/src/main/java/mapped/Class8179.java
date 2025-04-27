// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Class8179 extends Class8178<Class8179>
{
    private final String field33688;
    
    public Class8179(final String s, final String field33688, final int n, final int n2) {
        super(s, n, n2);
        this.field33688 = field33688;
    }
    
    public Class8179 method27095() {
        try {
            if (this.field33688 != null) {
                this.field33685.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            }
            this.field33685.setDoInput(true);
            this.field33685.setDoOutput(true);
            this.field33685.setUseCaches(false);
            this.field33685.setRequestMethod("POST");
            final OutputStream outputStream = this.field33685.getOutputStream();
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
            outputStreamWriter.write(this.field33688);
            outputStreamWriter.close();
            outputStream.flush();
            return this;
        }
        catch (final Exception ex) {
            throw new Class2356(ex.getMessage(), ex);
        }
    }
}
