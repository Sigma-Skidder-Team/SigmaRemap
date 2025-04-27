// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;

public class Class901 extends Thread
{
    private static String[] field4850;
    private final InputStream field4851;
    private final StringBuffer field4852;
    
    public Class901(final StringBuffer field4852, final InputStream field4853) {
        this.field4851 = field4853;
        this.field4852 = field4852;
        this.start();
    }
    
    @Override
    public void run() {
        try {
            int read;
            while ((read = this.field4851.read()) != -1) {
                this.field4852.append((char)read);
            }
        }
        catch (final IOException ex) {}
    }
}
