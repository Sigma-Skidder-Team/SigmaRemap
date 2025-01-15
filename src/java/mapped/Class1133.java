// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1133 implements Runnable
{
    private static String[] field6126;
    public final /* synthetic */ Class7479 field6127;
    
    public Class1133(final Class7479 field6127) {
        this.field6127 = field6127;
    }
    
    @Override
    public void run() {
        try {
            while (this.field6127.method23133()) {}
        }
        catch (final IOException ex) {
            this.field6127.method23135(ex, null);
        }
    }
}
