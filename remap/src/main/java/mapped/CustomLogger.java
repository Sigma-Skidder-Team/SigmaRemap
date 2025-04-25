// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

import com.mentalfrostbyte.Client;
import org.apache.commons.io.IOUtils;
import java.io.OutputStream;

public class CustomLogger implements Logger
{
    public OutputStream info;
    public OutputStream warn;
    public OutputStream error;
    
    public CustomLogger(final OutputStream info, final OutputStream warn, final OutputStream error) {
        this.info = info;
        this.warn = warn;
        this.error = error;
    }
    
    @Override
    public void info(final String str) {
        try {
            IOUtils.write("Jello: INFO - " + str + "\n", this.info);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void warn(final String str) {
        try {
            IOUtils.write("Jello: WARNING - " + str + "\n", this.warn);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void error(final String str) {
        try {
            IOUtils.write("Jello: ERROR - " + str + "\n", this.error);
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
