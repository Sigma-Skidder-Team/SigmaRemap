// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

import com.mentalfrostbyte.Client;
import org.apache.commons.io.IOUtils;
import java.io.OutputStream;

public class Class6659 implements Class6658
{
    public OutputStream field26314;
    public OutputStream field26315;
    public OutputStream field26316;
    
    public Class6659(final OutputStream field26314, final OutputStream field26315, final OutputStream field26316) {
        this.field26314 = field26314;
        this.field26315 = field26315;
        this.field26316 = field26316;
    }
    
    @Override
    public void method20240(final String str) {
        try {
            IOUtils.write("Jello: INFO - " + str + "\n", this.field26314);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void method20241(final String str) {
        try {
            IOUtils.write("Jello: WARNING - " + str + "\n", this.field26315);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void method20242(final String str) {
        try {
            IOUtils.write("Jello: ERROR - " + str + "\n", this.field26316);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void method20243(final String s) {
        Client.getInstance();
    }
}
