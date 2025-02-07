// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

import com.mentalfrostbyte.Client;
import org.apache.commons.io.IOUtils;
import java.io.OutputStream;

public class Class6657 implements Logger
{
    public OutputStream field26313;
    
    public Class6657(final OutputStream field26313) {
        this.field26313 = field26313;
    }
    
    public Class6657() {
    }
    
    @Override
    public void info(final String str) {
        try {
            IOUtils.write("Jello: INFO - " + str + "\n", this.field26313);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void warn(final String str) {
        try {
            IOUtils.write("Jello: WARNING - " + str + "\n", this.field26313);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void error(final String str) {
        try {
            IOUtils.write("Jello: ERROR - " + str + "\n", this.field26313);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void setThreadName(final String s) {
        Client.getInstance();
    }
}
